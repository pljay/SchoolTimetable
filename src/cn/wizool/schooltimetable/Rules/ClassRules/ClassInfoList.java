package cn.wizool.schooltimetable.Rules.ClassRules;

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
 * Servlet implementation class ClassInfoList
 */
@WebServlet(description = "下发班级列表", urlPatterns = { "/ClassInfoList" })
public class ClassInfoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger(ClassInfoList.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassInfoList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String taskid = request.getParameter("taskid");
		String schoolid = request.getParameter("schoolid");
		logger.info(taskid);
		String sql="SELECT\r\n" + 
				"	b.ID,\r\n" + 
				"	b.ITEM_GRADENAME,\r\n" + 
				"	b.ITEM_NAME,\r\n" + 
				"	a.ITEM_SCHOOLID,\r\n" + 
				"	a.ITEM_TASKID\r\n" + 
				"FROM\r\n" + 
				"	`tlk_任课管理` AS a\r\n" + 
				"LEFT JOIN `tlk_班级管理` AS b ON a.ITEM_CLASSID LIKE concat('%', b.ID, '%')\r\n" + 
				"WHERE\r\n" + 
				"a.ITEM_TASKID = '"+taskid+"' \r\n"+
				"group by b.id\r\n" ;
		logger.info(sql);
		Connection connection = Mysql.getInstance().getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery();
			List list=new ArrayList<>();
			Integer total=0;
			while(resultSet.next()) {
				Map map=new HashMap<>();
				map.put("ID",resultSet.getString("id"));
				map.put("taskid",resultSet.getString("ITEM_TASKID"));
				map.put("schoolid",resultSet.getString("ITEM_SCHOOLID"));
				map.put("name",resultSet.getString("ITEM_GRADENAME")+resultSet.getString("ITEM_NAME"));
				list.add(map);
			}
			prepareStatement.close();
			resultSet.close();
			ResponseUtils.renderJson(response,  JsonUtils.objectToJsonNotNull(list));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
