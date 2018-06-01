package cn.wizool.schooltimetable.validation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import cn.wizool.schooltimetable.bean.Validation;
import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.JsonUtils;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class AccountValidation
 */
@WebServlet(description = "账户验证", urlPatterns = { "/AccountValidation" })
public class AccountValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Logger logger=Logger.getLogger(AccountValidation.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String account = request.getParameter("account");
		logger.info("account==="+account);
		String sql="SELECT\r\n" + 
				"	*\r\n" + 
				"FROM\r\n" + 
				"	obpm_dian.`t_user`\r\n" + 
				"WHERE\r\n" + 
				"	`LOGINNO` = '"+account+"'";
		logger.info(sql);
		Connection connection = Mysql.getInstance().getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery();
			Validation validation;
			if(resultSet.next()) {
				validation = new Validation(false);
			}else {
				validation = new Validation(true);
			}
			ResponseUtils.renderJson(response, JsonUtils.objectToJsonNotNull(validation));
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

}
