package cn.wizool.schooltimetable.Rules.ClassRules;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import cn.wizool.schooltimetable.bean.JieciCommon;
import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JieciTypeUtils;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class ClassRulesInfoList
 */
@WebServlet(description = "下发班级规则信息", urlPatterns = { "/ClassRulesInfoList" })
public class ClassRulesInfoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger(ClassRulesInfoList.class); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassRulesInfoList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		String taskid = request.getParameter("taskid");
		String schoolid = request.getParameter("schoolid");
		String sql="SELECT\r\n" + 
				"	*\r\n" + 
				"FROM\r\n" + 
				"	`时间班级设置`\r\n" + 
				"WHERE\r\n" + 
				"	taskid = '"+taskid+"'\r\n" + 
				"AND schoolid = '"+schoolid+"'";
		logger.info(sql);
		Connection connection = Mysql.getInstance().getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery();
			List<JieciCommon> list = new ArrayList<>();
			while(resultSet.next()) {
				new JieciCommon();
				JieciCommon jieciCommon = JieciCommon.classbuild(resultSet.getString("jieciid"),new JieciTypeUtils().GetCSSClassname(resultSet.getInt("type")), resultSet.getString("classname"), resultSet.getString("classid"));
				list.add(jieciCommon);
			}
			resultSet.close();
			prepareStatement.close();
			logger.info(JsonUtils.objectToJson(list));
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
