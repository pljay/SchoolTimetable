package cn.wizool.schooltimetable.Rules.CourseRules;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class CourseRulesInfo
 */
@WebServlet(description = "按课程设置信息下发", urlPatterns = { "/CourseRulesInfo" })
public class CourseRulesInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger(CourseRulesInfo.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseRulesInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String jsonp = request.getParameter("callback"); 
		String taskid = request.getParameter("taskid");
	   String sql1="SELECT\r\n" + 
				"	a.ITEM_TASKID,\r\n" + 
				"	b.ITEM_SCHOOLID,\r\n" + 
				"	b.ID AS gradeid ,\r\n" + 
				"	b.ITEM_CURRENTNAME AS gradename\r\n" + 
				"FROM\r\n" + 
				"	`tlk_任课管理` AS a\r\n" + 
				"LEFT JOIN `tlk_年级管理` AS b ON a.ITEM_GRADEID LIKE concat('%', b.ID, '%')\r\n" + 
				"WHERE\r\n" + 
				"	a.ITEM_TASKID = '"+taskid+"'"+
				"GROUP BY b.ID";
	   String sql2="SELECT\r\n" + 
	   		"	a.ITEM_TASKID,\r\n" + 
	   		"	a.ITEM_SCHOOLID,\r\n" + 
	   		"	b.ID AS gradeid ,\r\n" + 
	   		"	c.ID AS ITEM_CLASSID,\r\n" + 
	   		"	c.ITEM_NAME\r\n" + 
	   		"FROM\r\n" + 
	   		"	`tlk_任课管理` AS a\r\n" + 
	   		"LEFT JOIN `tlk_年级管理` AS b ON a.ITEM_GRADEID LIKE concat('%', b.ID, '%')\r\n" + 
	   		"LEFT JOIN `tlk_班级管理` AS c ON c.ITEM_GRADEID = b.ID\r\n" + 
	   		"AND a.ITEM_CLASSID LIKE concat('%', c.ID, '%')\r\n" + 
	   		"WHERE\r\n" + 
	   		"	a.ITEM_TASKID = '"+taskid+"'\r\n" + 
	   		"GROUP BY c.ID";
	   String sql3="SELECT\r\n" + 
	   		"	a.ITEM_TASKID,\r\n" + 
	   		"	a.ITEM_SCHOOLID,\r\n" + 
	   		"	c.ID AS ITEM_CLASSID,\r\n" + 
	   		"	d.ID AS ITEM_SUBJECTID,\r\n" + 
	   		"	d.ITEM_SUBJECT\r\n" + 
	   		"FROM\r\n" + 
	   		"	`tlk_任课管理` AS a\r\n" + 
	   		"LEFT JOIN `tlk_年级管理` AS b ON a.ITEM_GRADEID LIKE concat('%', b.ID, '%')\r\n" + 
	   		"LEFT JOIN `tlk_班级管理` AS c ON c.ITEM_GRADEID = b.ID\r\n" + 
	   		"AND a.ITEM_CLASSID LIKE concat('%', c.ID, '%')\r\n" + 
	   		"LEFT JOIN `tlk_科目管理` AS d ON a.ITEM_SUBJECTNAME = d.ID\r\n" + 
	   		"WHERE\r\n" + 
	   		"	a.ITEM_TASKID = '"+taskid+"'\r\n";
		Connection connection = Mysql.getInstance().getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql1);
			ResultSet resultSet = prepareStatement.executeQuery();
			List<Map<String, String>> courselist=new ArrayList<>();
			while(resultSet.next()) {
				Map map = new HashMap<>();
				map.put("taskid", resultSet.getString("ITEM_TASKID"));
				map.put("schoolid", resultSet.getString("ITEM_SCHOOLID"));
				map.put("id", resultSet.getString("gradeid"));
				map.put("name", resultSet.getString("gradename"));
				map.put("pid", 0);
				courselist.add(map);
			}
			resultSet.close();
			prepareStatement.close();
			PreparedStatement prepareStatement2 = connection.prepareStatement(sql2);
			ResultSet resultSet2 = prepareStatement2.executeQuery();
			while(resultSet2.next()) {
				Map map = new HashMap<>();
				map.put("taskid", resultSet2.getString("ITEM_TASKID"));
				map.put("schoolid", resultSet2.getString("ITEM_SCHOOLID"));
				map.put("id", resultSet2.getString("ITEM_CLASSID"));
				map.put("name", resultSet2.getString("ITEM_NAME"));
				map.put("pid",  resultSet2.getString("gradeid"));
				courselist.add(map);
			}
			resultSet2.close();
			prepareStatement2.close();
			PreparedStatement prepareStatement21 = connection.prepareStatement(sql3);
			ResultSet resultSet21 = prepareStatement21.executeQuery();
			while(resultSet21.next()) {
				Map map = new HashMap<>();
				map.put("taskid", resultSet21.getString("ITEM_TASKID"));
				map.put("schoolid", resultSet21.getString("ITEM_SCHOOLID"));
				map.put("id", resultSet21.getString("ITEM_SUBJECTID"));
				map.put("name", "<span id='"+resultSet21.getString("ITEM_SUBJECTID")+"'>"+resultSet21.getString("ITEM_SUBJECT")+"</span>");
				map.put("pid",  resultSet21.getString("ITEM_CLASSID"));
				courselist.add(map);
			}
			resultSet21.close();
			prepareStatement21.close();
			logger.info( JsonUtils.objectToJsonNotNull(courselist));
			ResponseUtils.renderJson(response, jsonp+"("+JsonUtils.objectToJsonNotNull(courselist)+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
