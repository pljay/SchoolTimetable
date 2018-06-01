package cn.wizool.schooltimetable.Rules.MergeClass;

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

import cn.wizool.schooltimetable.bean.MergeClass;
import cn.wizool.schooltimetable.bean.MergeClassRulesCommon;
import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class MergeClassRulesInfoList
 */
@WebServlet(description = "合班上课规则结果下发", urlPatterns = { "/MergeClassRulesInfoList" })
public class MergeClassRulesInfoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Logger logger=Logger.getLogger(MergeClassRulesInfoList.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MergeClassRulesInfoList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String taskid = request.getParameter("taskid");
		String schoolid=request.getParameter("schoolid");
		String sql="SELECT\r\n" + 
				"	taskid,\r\n" + 
				"	schoolid,\r\n" + 
				"	subjectid,\r\n" + 
				"	subjectname,\r\n" + 
				"	mergeclassids,\r\n" + 
				"	mergeclassnames,\r\n" + 
				"	teacherid,\r\n" + 
				"	teachername\r\n" + 
				"FROM\r\n" + 
				"	`合班上课规则`\r\n" + 
				"WHERE\r\n" + 
				"	taskid = '"+taskid+"'\r\n" + 
				"AND schoolid ='"+schoolid+"'";
		Connection connection = Mysql.getInstance().getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet executeQuery = prepareStatement.executeQuery();
			List<MergeClass> list=new ArrayList<>();
			
			while(executeQuery.next()) {
				MergeClass mergeClass = new MergeClass(executeQuery.getString("subjectid"), executeQuery.getString("subjectname"),executeQuery.getString("mergeclassids") , executeQuery.getString("mergeclassnames") , executeQuery.getString("teacherid") ,executeQuery.getString("teachername") );
				list.add(mergeClass);
			}
			MergeClassRulesCommon mergeClassRulesCommon=new MergeClassRulesCommon(taskid,schoolid,list);
			ResponseUtils.renderJson(response, JsonUtils.objectToJsonNotNull(mergeClassRulesCommon));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
