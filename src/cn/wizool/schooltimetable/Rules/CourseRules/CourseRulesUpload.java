package cn.wizool.schooltimetable.Rules.CourseRules;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
 * Servlet implementation class CourseRulesUpload
 */
@WebServlet(description = "课程结果上传", urlPatterns = { "/CourseRulesUpload" })
public class CourseRulesUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger(CourseRulesUpload.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseRulesUpload() {
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
					"	xiaoxuan.`时间课程设置`\r\n" + 
					"WHERE\r\n" + 
					"	xiaoxuan.`时间课程设置`.taskid = '"+common.getTaskid()+"'\r\n" + 
					"AND schoolid = '"+common.getSchoolid()+"'"+
					"AND classid = '"+common.getClassid()+"'";
			logger.info(sql1);
			PreparedStatement prepareStatement2 = connection.prepareStatement(sql1);
			prepareStatement2.execute();
			prepareStatement2.close();
			for (JieciCommon jieciCommon :common.getbanlist()) {
				String sql="INSERT INTO `xiaoxuan`.`时间课程设置` (\r\n" + 
						"	`taskid`,\r\n" + 
						"	`schoolid`,\r\n" + 
						"   `jieciid`,\r\n" +
						"   `classid`,\r\n" +
						"	`coursename`,\r\n" + 
						"	`courseid`,\r\n" + 
						"	`type`\r\n" + 
						")\r\n" + 
						"VALUES\r\n" + 
						"	(\r\n" + 
						"		'"+common.getTaskid()+"',\r\n" + 
						"		'"+common.getSchoolid()+"',\r\n" + 
						"		'"+jieciCommon.getId()+"',\r\n" + 
						"		'"+common.getClassid()+"',\r\n" + 
						"		'"+jieciCommon.getCoursename()+"',\r\n" + 
						"		'"+jieciCommon.getCourseid()+"',\r\n" + 
						"		"+new JieciTypeUtils().GetNumber(jieciCommon.getCoursetype())+"\r\n" + 
						"	);";
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
