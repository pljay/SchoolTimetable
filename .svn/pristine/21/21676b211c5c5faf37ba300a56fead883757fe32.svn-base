package cn.wizool.schooltimetable.Rules.GeneralRules;

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

import cn.wizool.schooltimetable.bean.Common;
import cn.wizool.schooltimetable.bean.JieciCommon;
import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JieciTypeUtils;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class GeneralRulesInfoUpload
 */
@WebServlet(description = "通用设置规则上传", urlPatterns = { "/GeneralRulesInfoUpload" })
public class GeneralRulesInfoUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger(GeneralRulesInfoUpload.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeneralRulesInfoUpload() {
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
		Map map = JsonUtils.jsonToPojo(request.getParameter("strJson"), Map.class);
		String sql="UPDATE `xiaoxuan`.`tlk_创建任务`\r\n" + 
				"SET \r\n" + 
				" `ITEM_ZDLTS` = '"+map.get("ITEM_ZDLTS")+"',\r\n" + 
				" `ITEM_ZXLTS` = '"+map.get("ITEM_ZXLTS")+"',\r\n" + 
				" `ITEM_KKSDLT` = '"+map.get("ITEM_KKSDLT")+"',\r\n" + 
				" `ITEM_JAQP` = '"+map.get("ITEM_JAQP")+"'\r\n" + 
				"WHERE\r\n" + 
				"	(\r\n" + 
				"		`ITEM_TASKID` = '"+map.get("id")+"'\r\n" + 
				"	)";
		logger.info(sql);
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
