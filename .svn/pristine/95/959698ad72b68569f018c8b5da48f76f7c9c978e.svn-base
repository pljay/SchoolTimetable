package cn.wizool.schooltimetable.basicmanager.grade;

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

import cn.wizool.schooltimetable.bean.Pages;
import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet(description = "年级列表", urlPatterns = { "/GradelistServlet" })
public class GradelistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GradelistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer pagenumber = Integer.parseInt(request.getParameter("pageNumber"));
		Integer pageSize = Integer.parseInt(request.getParameter("pageSize"));
		String sql="SELECT\r\n" + 
				"	a.id,\r\n" + 
				"	b.ITEM_CAMPUSNAME,\r\n" + 
				"	grade_name\r\n" + 
				"FROM\r\n" + 
				"	grade AS a\r\n" + 
				"LEFT JOIN `tlk_校园信息` AS b ON a.school_id = b.ID \r\n"+
				"limit \r\n "+(pagenumber-1)*pageSize+","+pageSize;
		System.out.println(sql);
		String sql2="SELECT COUNT(*) AS total "+
				"FROM\r\n" + 
				"	grade AS a\r\n" + 
				"LEFT JOIN `tlk_校园信息` AS b ON a.school_id = b.ID" ;	
		Connection connection = Mysql.getInstance().getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery();
			List list=new ArrayList<>();
			Integer total=0;
			while(resultSet.next()) {
				Map map=new HashMap<>();
				map.put("ID", resultSet.getInt("ID"));
				map.put("ITEM_CAMPUSNAME", resultSet.getString("ITEM_CAMPUSNAME"));
				map.put("grade_name", resultSet.getString("grade_name"));
				list.add(map);
			}
			PreparedStatement prepareStatement2 = connection.prepareStatement(sql2);
			ResultSet resultSet2 = prepareStatement2.executeQuery();
			while(resultSet2.next()) {
				total=resultSet2.getInt("total");
			}
			prepareStatement.close();
			resultSet.close();
			Pages pages = new Pages(total, pagenumber, pageSize, list);
			ResponseUtils.renderJson(response, JsonUtils.objectToJsonNotNull(pages));
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
