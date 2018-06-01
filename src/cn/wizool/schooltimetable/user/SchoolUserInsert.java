package cn.wizool.schooltimetable.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;

import cn.myapps.util.Security;
import cn.wizool.schooltimetable.jdbc.Mysql;
import cn.wizool.schooltimetable.utils.PrimaryGenerater;
import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class SchoolUserInsert
 */
@WebServlet(description = "创建学校用户", urlPatterns = { "/SchoolUserInsert" })
public class SchoolUserInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Logger logger=Logger.getLogger(SchoolUserInsert.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchoolUserInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf8");
		String schoolname = request.getParameter("schoolname");
		String abbreviation = request.getParameter("abbreviation");
		String campustra = request.getParameter("campustra");
		String serialnumber = new PrimaryGenerater().QueryCode("PKU");
		String WeChatid = request.getParameter("WeChatid");
		String place = request.getParameter("place");
		String address = request.getParameter("address");
		String zipCode = request.getParameter("zipCode");
		String tel_man = request.getParameter("tel_man");
		String phoneNumberCN = request.getParameter("phoneNumberCN");
		String QQ = request.getParameter("QQ");
		String email = request.getParameter("email");
		String school_type = request.getParameter("school_type");
		String username = request.getParameter("username");
		String account = request.getParameter("account");
		String userpassword = request.getParameter("password");
		logger.info(serialnumber);
		logger.info(userpassword);
		UUID schoolID=UUID.randomUUID();
		UUID userID=UUID.randomUUID();
		logger.info(school_type); 
		logger.info(place); 
		String sql="INSERT INTO `xiaoxuan`.`tlk_校园信息` (\r\n" + 
				"	`PARENT`,\r\n" + 
				"	`LASTMODIFIED`,\r\n" + 
				"	`FORMNAME`,\r\n" + 
				"	`STATE`,\r\n" + 
				"	`AUDITUSER`,\r\n" + 
				"	`AUDITDATE`,\r\n" + 
				"	`AUTHOR`,\r\n" + 
				"	`AUTHOR_DEPT_INDEX`,\r\n" + 
				"	`CREATED`,\r\n" + 
				"	`FORMID`,\r\n" + 
				"	`ISTMP`,\r\n" + 
				"	`VERSIONS`,\r\n" + 
				"	`APPLICATIONID`,\r\n" + 
				"	`STATEINT`,\r\n" + 
				"	`STATELABEL`,\r\n" + 
				"	`AUDITORNAMES`,\r\n" + 
				"	`LASTFLOWOPERATION`,\r\n" + 
				"	`LASTMODIFIER`,\r\n" + 
				"	`DOMAINID`,\r\n" + 
				"	`AUDITORLIST`,\r\n" + 
				"	`STATELABELINFO`,\r\n" + 
				"	`PREVAUDITNODE`,\r\n" + 
				"	`PREVAUDITUSER`,\r\n" + 
				"	`OPTIONITEM`,\r\n" + 
				"	`SIGN`,\r\n" + 
				"	`ID`,\r\n" + 
				"	`ITEM_CAMPUSNAME`,\r\n" + 
				"	`ITEM_CAMPUSTRA`,\r\n" + 
				"	`BUMENID`,\r\n" + 
				"	`ITEM_WEIXINID`,\r\n" + 
				"	`ITEM_SCHOOLID`,\r\n" + 
				"	`ITEM_Abbreviation`,\r\n" + 
				"	`ITEM_Location`,\r\n" + 
				"	`ITEM_Address`,\r\n" + 
				"	`ITEM_ZipCode`,\r\n" + 
				"	`ITEM_Contacts`,\r\n" + 
				"	`ITEM_Contacts_tel`,\r\n" + 
				"	`ITEM_Contacts_qq`,\r\n" + 
				"	`ITEM_Contacts_mail`,\r\n" + 
				"	`ITEM_School_type`\r\n" + 
				")\r\n" + 
				"VALUES\r\n" + 
				"	(\r\n" + 
				"		NULL,\r\n" + 
				"		NOW(),\r\n" + 
				"		'智校通/校宣管理系统/校园信息',\r\n" + 
				"		'',\r\n" + 			
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'11e6-b052-9fa869f7-b160-b54b43a1b70f',\r\n" + 
				"		now(),\r\n" + 
				"		'11e7-201c-7ae3ec10-a365-838f52f9c2a3',\r\n" + 
				"		'',\r\n" + 
				"		'19',\r\n" + 
				"		'11e6-b051-0f2f0d26-b160-b54b43a1b70f',\r\n" + 
				"		'0',\r\n" + 
				"		NULL,\r\n" + 
				"		'',\r\n" + 
				"		NULL,\r\n" + 
				"		'11e8-062f-d16fe1ce-85fb-25f307ac0600',\r\n" + 
				"		'11e6-b052-9fa5d1e6-b160-b54b43a1b70f',\r\n" + 
				"		'{}',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'',\r\n" + 
				"		'"+schoolID+"',\r\n" + 
				"		'"+schoolname+"',\r\n" + 
				"		'',\r\n" + 
				"		'',\r\n" + 
				"		'',\r\n" + 
				"		'"+serialnumber+"',\r\n" + 
				"		'',\r\n" + 
				"		'',\r\n" +  
				"		'',\r\n" + 
				"		'',\r\n" + 
				"		'',\r\n" + 
				"		'',\r\n" + 
				"		'',\r\n" + 
				"		'',\r\n" + 
				"		'"+school_type+"'\r\n" + 
				"	)";
		String sql2="INSERT INTO `xiaoxuan`.`t_document` (\r\n" + 
				"	`ID`,\r\n" + 
				"	`LASTMODIFIED`,\r\n" + 
				"	`FORMNAME`,\r\n" + 
				"	`AUDITDATE`,\r\n" + 
				"	`AUTHOR`,\r\n" + 
				"	`AUTHOR_DEPT_INDEX`,\r\n" + 
				"	`CREATED`,\r\n" + 
				"	`FORMID`,\r\n" + 
				"	`ISTMP`,\r\n" + 
				"	`VERSIONS`,\r\n" + 
				"	`SORTID`,\r\n" + 
				"	`APPLICATIONID`,\r\n" + 
				"	`STATELABEL`,\r\n" + 
				"	`INITIATOR`,\r\n" + 
				"	`AUDITUSER`,\r\n" + 
				"	`AUDITORNAMES`,\r\n" + 
				"	`LASTFLOWOPERATION`,\r\n" + 
				"	`PARENT`,\r\n" + 
				"	`STATE`,\r\n" + 
				"	`STATEINT`,\r\n" + 
				"	`LASTMODIFIER`,\r\n" + 
				"	`DOMAINID`,\r\n" + 
				"	`AUDITORLIST`,\r\n" + 
				"	`STATELABELINFO`,\r\n" + 
				"	`PREVAUDITNODE`,\r\n" + 
				"	`PREVAUDITUSER`,\r\n" + 
				"	`OPTIONITEM`,\r\n" + 
				"	`SIGN`,\r\n" + 
				"	`MAPPINGID`\r\n" + 
				")\r\n" + 
				"VALUES\r\n" + 
				"	(\r\n" + 
				"		'"+schoolID+"',\r\n" + 
				"		NOW(),\r\n" + 
				"		'智校通/校宣管理系统/校园信息',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'11e6-b052-9fa869f7-b160-b54b43a1b70f',\r\n" + 
				"		NOW(),\r\n" + 
				"		'11e7-201c-7ae3ec10-a365-838f52f9c2a3',\r\n" + 
				"		'',\r\n" + 
				"		'19',\r\n" + 
				"		NULL,\r\n" + 
				"		'11e6-b051-0f2f0d26-b160-b54b43a1b70f',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'',\r\n" + 
				"		'0',\r\n" + 
				"		'11e8-062f-d16fe1ce-85fb-25f307ac0600',\r\n" + 
				"		'11e6-b052-9fa5d1e6-b160-b54b43a1b70f',\r\n" + 
				"		'{}',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'',\r\n" + 
				"		'"+schoolID+"'\r\n" + 
				"	);\r\n" ;
		String sql3="INSERT INTO `xiaoxuan`.`tlk_账户管理` (\r\n" + 
				"	`PARENT`,\r\n" + 
				"	`LASTMODIFIED`,\r\n" + 
				"	`FORMNAME`,\r\n" + 
				"	`STATE`,\r\n" + 
				"	`AUDITUSER`,\r\n" + 
				"	`AUDITDATE`,\r\n" + 
				"	`AUTHOR`,\r\n" + 
				"	`AUTHOR_DEPT_INDEX`,\r\n" + 
				"	`CREATED`,\r\n" + 
				"	`FORMID`,\r\n" + 
				"	`ISTMP`,\r\n" + 
				"	`VERSIONS`,\r\n" + 
				"	`APPLICATIONID`,\r\n" + 
				"	`STATEINT`,\r\n" + 
				"	`STATELABEL`,\r\n" + 
				"	`AUDITORNAMES`,\r\n" + 
				"	`LASTFLOWOPERATION`,\r\n" + 
				"	`LASTMODIFIER`,\r\n" + 
				"	`DOMAINID`,\r\n" + 
				"	`AUDITORLIST`,\r\n" + 
				"	`STATELABELINFO`,\r\n" + 
				"	`PREVAUDITNODE`,\r\n" + 
				"	`PREVAUDITUSER`,\r\n" + 
				"	`OPTIONITEM`,\r\n" + 
				"	`SIGN`,\r\n" + 
				"	`ID`,\r\n" + 
				"	`ITEM_NAME`,\r\n" + 
				"	`ITEM_PHONE`,\r\n" + 
				"	`ITEM_EMAIL`,\r\n" + 
				"	`ITEM_JUESE`,\r\n" + 
				"	`ITEM_ACCOUNT`,\r\n" + 
				"	`ITEM_PASS`,\r\n" + 
				"	`ITEM_CLASSID`,\r\n" + 
				"	`ITEM_TEACHERID`,\r\n" + 
				"	`ITEM_SCHOOLID`,\r\n" + 
				"	`ITEM_CLASSROOMID`,\r\n" + 
				"	`ITEM_AVAILABILITY`,\r\n" + 
				"	`ITEM_ORGID`,\r\n" + 
				"	`ITEM_ORGNAME`\r\n" + 
				")\r\n" + 
				"VALUES\r\n" + 
				"	(\r\n" + 
				"		NULL,\r\n" + 
				"		now(),\r\n" + 
				"		'智校通/校宣管理系统/账户管理',\r\n" + 
				"		'',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		now(),\r\n" + 
				"		'11e6-b7aa-a30dc2e5-bf33-2375fa2ef1bf',\r\n" + 
				"		'',\r\n" + 
				"		'4',\r\n" + 
				"		'11e6-b051-0f2f0d26-b160-b54b43a1b70f',\r\n" + 
				"		'1',\r\n" + 
				"		NULL,\r\n" + 
				"		'',\r\n" + 
				"		NULL,\r\n" + 
				"		'11e7-b089-92f24b54-92a7-5d524d868211',\r\n" + 
				"		'11e6-b052-9fa5d1e6-b160-b54b43a1b70f',\r\n" + 
				"		'{}',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'',\r\n" + 
				"		'"+userID+"',\r\n" + 
				"		'"+username+"',\r\n" + 
				"		'',\r\n" + 
				"		'',\r\n" + 
				"		'平台管理员',\r\n" + 
				"		'"+account+"',\r\n" + 
				"		'"+userpassword+"',\r\n" + 
				"		'',\r\n" + 
				"		'',\r\n" + 
				"		'"+schoolID+"',\r\n" + 
				"		'',\r\n" + 
				"		'1',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL\r\n" + 
				"	);";
		String sql4="INSERT INTO `xiaoxuan`.`t_document` (\r\n" + 
				"	`ID`,\r\n" + 
				"	`LASTMODIFIED`,\r\n" + 
				"	`FORMNAME`,\r\n" + 
				"	`AUDITDATE`,\r\n" + 
				"	`AUTHOR`,\r\n" + 
				"	`AUTHOR_DEPT_INDEX`,\r\n" + 
				"	`CREATED`,\r\n" + 
				"	`FORMID`,\r\n" + 
				"	`ISTMP`,\r\n" + 
				"	`VERSIONS`,\r\n" + 
				"	`SORTID`,\r\n" + 
				"	`APPLICATIONID`,\r\n" + 
				"	`STATELABEL`,\r\n" + 
				"	`INITIATOR`,\r\n" + 
				"	`AUDITUSER`,\r\n" + 
				"	`AUDITORNAMES`,\r\n" + 
				"	`LASTFLOWOPERATION`,\r\n" + 
				"	`PARENT`,\r\n" + 
				"	`STATE`,\r\n" + 
				"	`STATEINT`,\r\n" + 
				"	`LASTMODIFIER`,\r\n" + 
				"	`DOMAINID`,\r\n" + 
				"	`AUDITORLIST`,\r\n" + 
				"	`STATELABELINFO`,\r\n" + 
				"	`PREVAUDITNODE`,\r\n" + 
				"	`PREVAUDITUSER`,\r\n" + 
				"	`OPTIONITEM`,\r\n" + 
				"	`SIGN`,\r\n" + 
				"	`MAPPINGID`\r\n" + 
				")\r\n" + 
				"VALUES\r\n" + 
				"	(\r\n" + 
				"		'"+userID+"',\r\n" + 
				"		now(),\r\n" + 
				"		'智校通/校宣管理系统/账户管理',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		now(),\r\n" + 
				"		'11e6-b7aa-a30dc2e5-bf33-2375fa2ef1bf',\r\n" + 
				"		'',\r\n" + 
				"		'4',\r\n" + 
				"		NULL,\r\n" + 
				"		'11e6-b051-0f2f0d26-b160-b54b43a1b70f',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'',\r\n" + 
				"		'1',\r\n" + 
				"		'11e7-b089-92f24b54-92a7-5d524d868211',\r\n" + 
				"		'11e6-b052-9fa5d1e6-b160-b54b43a1b70f',\r\n" + 
				"		'{}',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'',\r\n" + 
				"		'"+userID+"'\r\n" + 
				"	)";
		String sql5="INSERT INTO `obpm_dian`.`t_user` (\r\n" + 
				"	`ID`,\r\n" + 
				"	`CALENDAR`,\r\n" + 
				"	`LEVELS`,\r\n" + 
				"	`REMARKS`,\r\n" + 
				"	`SUPERIOR`,\r\n" + 
				"	`PROXYUSER`,\r\n" + 
				"	`DEFAULTDEPARTMENT`,\r\n" + 
				"	`DEFAULTAPPLICATION`,\r\n" + 
				"	`EMAIL`,\r\n" + 
				"	`LOGINNO`,\r\n" + 
				"	`LOGINPWD`,\r\n" + 
				"	`NAME`,\r\n" + 
				"	`NAME_LETTER`,\r\n" + 
				"	`TELEPHONE`,\r\n" + 
				"	`STATUS`,\r\n" + 
				"	`DOMAINID`,\r\n" + 
				"	`ISDOMAINUSER`,\r\n" + 
				"	`STARTPROXYTIME`,\r\n" + 
				"	`ENDPROXYTIME`,\r\n" + 
				"	`USEIM`,\r\n" + 
				"	`ORDERBYNO`,\r\n" + 
				"	`LASTMODIFYPASSWORDTIME`,\r\n" + 
				"	`PASSWORDARRAY`,\r\n" + 
				"	`LOCKFLAG`,\r\n" + 
				"	`PUBLICKEY`,\r\n" + 
				"	`DIMISSION`,\r\n" + 
				"	`AVATAR`,\r\n" + 
				"	`FAVORITE_CONTACTS`,\r\n" + 
				"	`PERMISSION_TYPE`,\r\n" + 
				"	`LIAISON_OFFICER`,\r\n" + 
				"	`TELEPHONE2`,\r\n" + 
				"	`TELEPHONEPUBLIC`,\r\n" + 
				"	`TELEPHONEPUBLIC2`,\r\n" + 
				"	`EMAILPUBLIC`,\r\n" + 
				"	`USERINFOPUBLIC`,\r\n" + 
				"	`SIGNS`,\r\n" + 
				"	`FIELD1`,\r\n" + 
				"	`FIELD2`,\r\n" + 
				"	`FIELD3`,\r\n" + 
				"	`FIELD4`,\r\n" + 
				"	`FIELD5`,\r\n" + 
				"	`FIELD6`,\r\n" + 
				"	`FIELD7`,\r\n" + 
				"	`FIELD8`,\r\n" + 
				"	`FIELD9`,\r\n" + 
				"	`FIELD10`\r\n" + 
				")\r\n" + 
				"VALUES\r\n" + 
				"	(\r\n" + 
				"		'"+userID+"',\r\n" + 
				"		'11e6-b052-9fab0208-b160-b54b43a1b70f',\r\n" + 
				"		'0',\r\n" + 
				"		'',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'11e7-b089-1ae62dd1-92a7-5d524d868211',\r\n" + 
				"		'',\r\n" + 
				"		'',\r\n" + 
				"		'"+account+"',\r\n" + 
				"		'"+Security.encryptPassword(userpassword)+"',\r\n" + 
				"		'"+username+"',\r\n" + 
				"		'"+account+"',\r\n" + 
				"		'',\r\n" + 
				"		'1',\r\n" + 
				"		'11e6-b052-9fa5d1e6-b160-b54b43a1b70f',\r\n" + 
				"		'false',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'',\r\n" + 
				"		'0',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		'1',\r\n" + 
				"		NULL,\r\n" + 
				"		'1',\r\n" + 
				"		'',\r\n" + 
				"		'',\r\n" + 
				"		'public',\r\n" + 
				"		'',\r\n" + 
				"		'1',\r\n" + 
				"		1,\r\n" + 
				"		1,\r\n" + 
				"		1,\r\n" + 
				"		1,\r\n" + 
				"		'',\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL,\r\n" + 
				"		NULL\r\n" + 
				"	)";
		String sql6="INSERT INTO `obpm_dian`.`t_user_department_set` (\r\n" + 
				"	`ID`,\r\n" + 
				"	`DEPARTMENTID`,\r\n" + 
				"	`USERID`\r\n" + 
				")\r\n" + 
				"VALUES\r\n" + 
				"	(\r\n" + 
				"		'"+UUID.randomUUID()+"',\r\n" + 
				"		'11e7-b089-1ae62dd1-92a7-5d524d868211',\r\n" + 
				"		'"+userID+"'\r\n" + 
				"	)";
		String sql7="INSERT INTO `obpm_dian`.`t_user_role_set` (`ID`, `ROLEID`, `USERID`)\r\n" + 
				"VALUES\r\n" + 
				"	(\r\n" + 
				"		'"+UUID.randomUUID()+"',\r\n" + 
				"		'11e8-4ebb-8811aad9-8a58-572be8c0b9b7',\r\n" + 
				"		'"+userID+"'\r\n" + 
				"	)";
		Connection connection = Mysql.getInstance().getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.execute();
			prepareStatement.close();
			PreparedStatement prepareStatement1 = connection.prepareStatement(sql2);
			prepareStatement1.execute();
			prepareStatement1.close();
			PreparedStatement prepareStatement2 = connection.prepareStatement(sql3);
			prepareStatement2.execute();
			prepareStatement2.close();
			PreparedStatement prepareStatement3 = connection.prepareStatement(sql4);
			prepareStatement3.execute();
			prepareStatement3.close();
			PreparedStatement prepareStatement4 = connection.prepareStatement(sql5);
			prepareStatement4.execute();
			prepareStatement4.close();
			PreparedStatement prepareStatement5 = connection.prepareStatement(sql6);
			prepareStatement5.execute();
			prepareStatement5.close();
			PreparedStatement prepareStatement6 = connection.prepareStatement(sql7);
			prepareStatement6.execute();
			prepareStatement6.close();
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResponseUtils.renderJson(response, "fail");
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
