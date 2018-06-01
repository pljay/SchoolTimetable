package cn.wizool.schooltimetable.Rules.UniformRules;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JieciTypeUtils;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class UniformRulesInfoList
 */
@WebServlet(description = "统一设置规则信息下发", urlPatterns = { "/UniformRulesInfoList" })
public class UniformRulesInfoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UniformRulesInfoList() {
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
		String sql="SELECT\r\n" + 
				"	*\r\n" + 
				"FROM\r\n" + 
				"	`时间统一设置`\r\n" + 
				"WHERE\r\n" + 
				"	task_id = '"+taskid+"'\r\n" + 
				"AND school_id = '"+schoolid+"'";
		Connection connection = Mysql.getInstance().getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery();
			List<Map<String, String>> list = new ArrayList<>();
			while(resultSet.next()) {
				Map<String, String> map=new LinkedHashMap<>();
				map.put("id",resultSet.getString("jieci_id"));
				map.put("classname",new JieciTypeUtils().GetCSSClassname(resultSet.getInt("type")));
				list.add(map);
			}
			resultSet.close();
			prepareStatement.close();
			ResponseUtils.renderJson(response, JsonUtils.objectToJson(list));
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
