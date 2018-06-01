package cn.wizool.schooltimetable.basicmanager.subject;

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
 * Servlet implementation class SubjectListServlet
 */
@WebServlet(description = "科目列表", urlPatterns = { "/SubjectListServlet" })
public class SubjectListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger(SubjectListServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SubjectListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*request.setAttribute("callback", request.getParameter("callback"));*/
		String taskid = request.getParameter("taskid");
		Integer pagenumber = Integer.parseInt(request.getParameter("pageNumber"));
		Integer pageSize = Integer.parseInt(request.getParameter("pageSize"));
		logger.info(taskid);
		String sql="SELECT\r\n" + 
				"	a.ITEM_TASKID,\r\n" + 
				"	b.ID,\r\n" + 
				"	b.ITEM_SUBJECT,\r\n"+
				"	b.ITEM_PRIORITY\r\n" + 
				"FROM\r\n" + 
				"	`tlk_任课管理` AS a\r\n" + 
				"LEFT JOIN `tlk_科目管理` AS b ON a.ITEM_SUBJECTNAME = b.ID\r\n" + 
				"WHERE\r\n" + 
				"	a.ITEM_TASKID = '"+taskid+"'\r\n"+
				"group by b.id\r\n" +
				"limit \r\n "+(pagenumber-1)*pageSize+","+pageSize;
		logger.info(sql);
		String sql2="SELECT COUNT(*) AS total "+
				"FROM\r\n" + 
				"	`tlk_任课管理` AS a\r\n" + 
				"LEFT JOIN `tlk_科目管理` AS b ON a.ITEM_SUBJECTNAME = b.ID\r\n" + 
				"WHERE\r\n" + 
				"	a.ITEM_TASKID = '"+taskid+"'\r\n"+
				"group by b.id\r\n" ;
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
				map.put("subject_name",resultSet.getString("ITEM_SUBJECT"));
				map.put("subject_priority",resultSet.getString("ITEM_PRIORITY"));
				list.add(map);
			}
			PreparedStatement prepareStatement2 = connection.prepareStatement(sql2);
			ResultSet resultSet2 = prepareStatement2.executeQuery();
			while(resultSet2.next()) {
				total=resultSet2.getInt("total");
			}
			prepareStatement.close();
			resultSet.close();
			prepareStatement.close();
			resultSet2.close();
			Pages pages = new Pages(total, pagenumber, pageSize, list);
			ResponseUtils.renderJson(response,  request.getParameter("callback")+"("+JsonUtils.objectToJsonNotNull(pages)+")");
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

}
