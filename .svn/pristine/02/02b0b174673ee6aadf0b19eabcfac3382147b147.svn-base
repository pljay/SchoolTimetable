package cn.wizool.schooltimetable.basicmanager.grade;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class AddGradeServlet
 */
@WebServlet(description = "添加年级", urlPatterns = { "/AddGradeServlet" })
public class AddGradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGradeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String school_id = request.getParameter("school_id");
		String grade_name = request.getParameter("grade_name");
		String sql="INSERT INTO grade (school_id, grade_name)\r\n" + 
				"VALUES\r\n" + 
				"	(\r\n" + 
				"		'"+school_id+"',\r\n" + 
				"		'"+grade_name+"'\r\n" + 
				"	)";
		Connection connection = Mysql.getInstance().getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.executeUpdate();
			prepareStatement.close();
			ResponseUtils.renderJson(response, JsonUtils.objectToJsonNotNull("sussess"));
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
