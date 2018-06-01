package cn.wizool.schooltimetable.Rules.SubjectRules;

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

import cn.wizool.schooltimetable.bean.Pages;
import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class SubjectInfoList
 */
@WebServlet(description = "下发科目列表", urlPatterns = { "/SubjectInfoList" })
public class SubjectInfoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Logger logger=Logger.getLogger(SubjectInfoList.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectInfoList() {
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
				"	a.ITEM_TASKID,\r\n" + 
				"	a.ITEM_SCHOOLID,\r\n" + 
				"	b.ID,\r\n" + 
				"	b.ITEM_SUBJECT,\r\n" + 
				"	a.ITEM_CLASSID,\r\n" + 
				"	a.ITEM_CLASSNAME,\r\n" + 
				"	a.ITEM_TEACHERID,\r\n" + 
				"	a.ITEM_TEACHERNAME\r\n" + 
				"FROM\r\n" + 
				"	`tlk_任课管理` AS a\r\n" + 
				"LEFT JOIN `tlk_科目管理` AS b ON a.ITEM_SUBJECTNAME = b.ID\r\n" + 
				"WHERE\r\n" + 
				"	a.ITEM_TASKID = '"+taskid+"'\r\n" + 
				"AND a.ITEM_SCHOOLID = '"+schoolid+"'"+
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
				map.put("subject_name",resultSet.getString("ITEM_SUBJECT"));
				map.put("classid",resultSet.getString("ITEM_CLASSID"));
				map.put("class_name",resultSet.getString("ITEM_CLASSNAME"));
				map.put("teacherid",resultSet.getString("ITEM_TEACHERID"));
				map.put("teacher_name",resultSet.getString("ITEM_TEACHERNAME"));
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
