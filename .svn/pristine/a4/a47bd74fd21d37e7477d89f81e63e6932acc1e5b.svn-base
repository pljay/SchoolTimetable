package cn.wizool.schooltimetable.basicmanager.teacher;

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

import org.apache.log4j.Logger;

import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class TearcherRulesUpload
 */
@WebServlet(description = "教师排课规则上传", urlPatterns = { "/TearcherRulesUpload" })
public class TearcherRulesUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger(TearcherRulesUpload.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TearcherRulesUpload() {
        super();
        // TODO Auto-generated constructor stub 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String jsonp = request.getParameter("callback"); 
		logger.info(request.getParameter("strJson"));

		Map map = JsonUtils.jsonToPojo(request.getParameter("strJson"), Map.class);
		
		String sql="UPDATE `xiaoxuan`.`tlk_教师管理`\r\n" + 
				"SET \r\n" + 
				" `ITEM_PRIORITY` = '"+map.get("priority")+"',\r\n" + 
				" `ITEM_ZDKESHI` = '"+map.get("zdkeshi")+"',\r\n" + 
				" `ITEM_ZXKESHI` = '"+map.get("zxkeshi")+"',\r\n" + 
				" `ITEM_ZNCD` = '"+map.get("zncd")+"',\r\n" + 
				" `ITEM_RNCD` = '"+map.get("rncd")+"'\r\n" + 
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
