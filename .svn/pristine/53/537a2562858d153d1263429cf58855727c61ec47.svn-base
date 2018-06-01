package cn.wizool.schooltimetable.Rules.MergeClass;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.mchange.util.impl.LinkedListIntChecklistImpl;

import cn.wizool.schooltimetable.bean.Pages;
import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class MergeClassInfoList
 */
@WebServlet(description = "合班上课信息下发", urlPatterns = { "/MergeClassInfoList" })
public class MergeClassInfoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger(MergeClassInfoList.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MergeClassInfoList() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jsonp = request.getParameter("callback"); 
		String taskid = request.getParameter("taskid");
		String sql="SELECT\r\n" + 
				"	a.ITEM_TASKID,\r\n" + 
				"	b.ITEM_SCHOOLID,\r\n" + 
				"	b.ITEM_CURRENTNAME,\r\n" + 
				"	c.ID AS ITEM_CLASSID,\r\n" + 
				"	c.ITEM_NAME,\r\n" + 
				"	d.ID AS ITEM_SUBJECTID,\r\n" + 
				"	d.ITEM_SUBJECT,\r\n" + 
				"	a.ITEM_TEACHERID,\r\n" + 
				"	a.ITEM_TEACHERNAME,\r\n" + 
				"	e.id as mergeclassid\r\n" + 
				"FROM\r\n" + 
				"	`tlk_任课管理` AS a\r\n" + 
				"LEFT JOIN `tlk_年级管理` AS b ON a.ITEM_GRADEID LIKE concat('%', b.ID, '%')\r\n" + 
				"LEFT JOIN `tlk_班级管理` AS c ON c.ITEM_GRADEID = b.ID\r\n" + 
				"AND a.ITEM_CLASSID LIKE concat('%', c.ID, '%')\r\n" + 
				"LEFT JOIN `tlk_科目管理` AS d ON a.ITEM_SUBJECTNAME = d.ID\r\n" + 
				"LEFT JOIN `合班上课规则` AS e ON e.mergeclassids LIKE concat('%', c.ID, '%')\r\n" + 
				"AND e.subjectid = d.ID\r\n" + 
				"WHERE\r\n" + 
				"	a.ITEM_TASKID = '"+taskid+"'";
		logger.info(sql);
		Connection connection = Mysql.getInstance().getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery();
			List<Map<String, String>> list=new ArrayList<>();
			while(resultSet.next()) {
				Map<String, String> map=new LinkedHashMap<>();
				map.put("taskid", resultSet.getString("item_taskID"));
				map.put("schoolid", resultSet.getString("ITEM_SCHOOLID"));
				map.put("subjectid", resultSet.getString("ITEM_SUBJECTID"));
				map.put("subjectname", resultSet.getString("ITEM_SUBJECT"));
				map.put("teacherid", resultSet.getString("ITEM_TEACHERID"));
				map.put("teachername", resultSet.getString("ITEM_TEACHERNAME"));
				map.put("classid", resultSet.getString("ITEM_CLASSID"));
				map.put("classname",resultSet.getString("ITEM_CURRENTNAME")+resultSet.getString("ITEM_NAME"));
				map.put("mergeclassid",resultSet.getString("mergeclassid"));
				list.add(map);
			}
			resultSet.close();
			prepareStatement.close();
			ResponseUtils.renderJson(response,  request.getParameter("callback")+"("+JsonUtils.objectToJsonNotNull(list)+")");
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
