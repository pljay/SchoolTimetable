package cn.wizool.schooltimetable.Rules.MergeClass;

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

import cn.wizool.schooltimetable.bean.MergeClass;
import cn.wizool.schooltimetable.bean.MergeClassRulesCommon;
import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class MergeClassRulesUpload
 */
@WebServlet(description = "合并上课规则上传", urlPatterns = { "/MergeClassRulesUpload" })
public class MergeClassRulesUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger(MergeClassRulesUpload.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MergeClassRulesUpload() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		MergeClassRulesCommon mergeClassRulesCommon = JsonUtils.jsonToPojo(request.getParameter("strJson"), MergeClassRulesCommon.class);
		String taskid=mergeClassRulesCommon.getTaskid();
		String schoolid=mergeClassRulesCommon.getSchoolid();
		Connection connection = Mysql.getInstance().getConnection();
		try {
			String sql1="DELETE \r\n" + 
					"FROM\r\n" +  
					"	xiaoxuan.`合班上课规则`\r\n" + 
					"WHERE\r\n" + 
					"	xiaoxuan.`合班上课规则`.taskid = '"+taskid+"'\r\n" + 
					"AND schoolid = '"+schoolid+"'";
			logger.info(sql1);
			PreparedStatement prepareStatement = connection.prepareStatement(sql1);
			prepareStatement.execute();
			prepareStatement.close();
			PreparedStatement prepareStatement2 =null;
			for (MergeClass mergeClass : mergeClassRulesCommon.getMergeclasslist()) {
				String sql="INSERT INTO `xiaoxuan`.`合班上课规则` (\r\n" + 
						"	`taskid`,\r\n" + 
						"	`schoolid`,\r\n" + 
						"	`subjectid`,\r\n" + 
						"	`subjectname`,\r\n" + 
						"	`mergeclassids`,\r\n" + 
						"	`mergeclassnames`,\r\n" + 
						"	`teacherid`,\r\n" + 
						"	`teachername`\r\n" + 
						")\r\n" + 
						"VALUES\r\n" + 
						"	(\r\n" + 
						"		'"+taskid+"',\r\n" + 
						"		'"+schoolid+"',\r\n" + 
						"		'"+mergeClass.getSubjectid()+"',\r\n" + 
						"		'"+mergeClass.getSubjectname()+"',\r\n" + 
						"		'"+mergeClass.getMergeclassids()+"',\r\n" + 
						"		'"+mergeClass.getMergeclassnames()+"',\r\n" + 
						"		'"+mergeClass.getTeacherids()+"',\r\n" + 
						"		'"+mergeClass.getTeachernames()+"'\r\n" + 
						"	)\r\n";
				logger.info(sql);
				prepareStatement2 = connection.prepareStatement(sql);
				prepareStatement2.execute();
			}
			prepareStatement2.close();
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
