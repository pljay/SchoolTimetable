package cn.wizool.schooltimetable.Rules.UniformRules;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import cn.wizool.schooltimetable.bean.Common;
import cn.wizool.schooltimetable.bean.JieciCommon;
import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JieciTypeUtils;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class UniformRulesInfo
 */
@WebServlet(description = "统一设置规则", urlPatterns = { "/UniformRulesInfo" })
public class UniformRulesInfoUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger(UniformRulesInfoUpload.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UniformRulesInfoUpload() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info(request.getParameter("strJson"));
		Common common= JsonUtils.jsonToPojo(request.getParameter("strJson"), Common.class);
		logger.info(common.getSchoolid()+"\r"+common.getTaskid());
		Connection connection = Mysql.getInstance().getConnection();
		try {
			String sql1="DELETE \r\n" + 
					"FROM\r\n" +  
					"	xiaoxuan.`时间统一设置`\r\n" + 
					"WHERE\r\n" + 
					"	xiaoxuan.`时间统一设置`.task_id = '"+common.getTaskid()+"'\r\n" + 
					"AND school_id = '"+common.getSchoolid()+"'";
			logger.info(sql1);
			PreparedStatement prepareStatement2 = connection.prepareStatement(sql1);
			prepareStatement2.execute();
			prepareStatement2.close();
			for (JieciCommon jieciCommon :common.getbanlist()) {
				String sql="INSERT INTO `xiaoxuan`.`时间统一设置` (\r\n" + 
						"	`school_id`,\r\n" + 
						"	`task_id`,\r\n" + 
						"	`jieci_id`,\r\n" + 
						"	`type`\r\n" + 
						")\r\n" + 
						"VALUES\r\n" + 
						"	( '"+common.getSchoolid()+"', '"+common.getTaskid()+"', '"+jieciCommon.getId()+"', '"+new JieciTypeUtils().GetNumber(jieciCommon.getCoursetype())+"')";

				logger.info(sql);
				PreparedStatement prepareStatement = connection.prepareStatement(sql);
				prepareStatement.execute();
				prepareStatement.close();
			}
			ResponseUtils.renderJson(response, "success");
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
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
 
}
