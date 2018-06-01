package cn.wizool.schooltimetable.Rules.Common;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class IsDoubleweek
 */
@WebServlet(description = "判断是否是单双周", urlPatterns = { "/IsDoubleweek" })
public class IsDoubleweek extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Logger logger=Logger.getLogger(IsDoubleweek.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IsDoubleweek() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jsonp = request.getParameter("callback"); 
		String taskid=request.getParameter("taskid");
		String sql="SELECT\r\n" + 
				"a.ITEM_TASKID,\r\n" + 
				"b.ITEM_ISDOUBLEWEEK,\r\n" + 
				"a.ITEM_TYPE,\r\n" + 
				"a.ITEM_SCHOOLID,\r\n" + 
				"b.ITEM_AM,\r\n" + 
				"b.ITEM_PM,\r\n" + 
				"b.ITEM_EN,\r\n"+
				"b.ITEM_WEEKDAYS\r\n" + 
				"FROM\r\n" + 
				"`tlk_创建任务` AS a LEFT JOIN `tlk_课时设置` AS b ON a.ITEM_TASKID=b.ITEM_TASKID\r\n" + 
				"WHERE\r\n" + 
				"	a.ITEM_TASKID ='"+taskid+"'";
		logger.info(sql);
		Connection connection = Mysql.getInstance().getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet executeQuery = prepareStatement.executeQuery();
			Map map=new HashMap<>();
			while(executeQuery.next()) {		
				map.put("amount", executeQuery.getInt("ITEM_AM")+executeQuery.getInt("ITEM_PM")+executeQuery.getInt("ITEM_EN"));
				map.put("weeks", executeQuery.getInt("ITEM_WEEKDAYS"));
				map.put("type", executeQuery.getString("ITEM_ISDOUBLEWEEK"));
				map.put("taskid", executeQuery.getString("ITEM_TASKID"));
				map.put("schoolid", executeQuery.getString("ITEM_SCHOOLID"));
			}
			ResponseUtils.renderJson(response,jsonp+"("+JsonUtils.objectToJsonNotNull(map)+")" ); 
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
