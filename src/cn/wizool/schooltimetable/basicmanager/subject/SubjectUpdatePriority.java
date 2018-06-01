package cn.wizool.schooltimetable.basicmanager.subject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class SubjectUpdatePriority
 */
@WebServlet(description = "更改科目优先级", urlPatterns = { "/SubjectUpdatePriority" })
public class SubjectUpdatePriority extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectUpdatePriority() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jsonp = request.getParameter("callback"); 
		Map map = JsonUtils.jsonToPojo(request.getParameter("strJson"), Map.class);
		map.get("subject_name");
		map.get("ID");
		map.get("subject_priority");
		String sql="UPDATE `xiaoxuan`.`tlk_科目管理`\r\n" + 
				"SET \r\n" + 
				" `ITEM_PRIORITY` = '"+map.get("subject_priority")+"'\r\n" + 
				"WHERE\r\n" + 
				"	(\r\n" + 
				"		`ID` = '"+map.get("ID")+"'\r\n" + 
				"	);";
		Connection connection = Mysql.getInstance().getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.executeUpdate();
			ResponseUtils.renderJson(response,jsonp+"({\"status\":\"success\"})");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
