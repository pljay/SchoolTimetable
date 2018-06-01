package cn.wizool.schooltimetable.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import cn.wizool.schooltimetable.jdbc.Mysql;



public class PrimaryGenerater {
	private static PrimaryGenerater primaryGenerater = null;
	private static Logger logger=Logger.getLogger(PrimaryGenerater.class);
	public PrimaryGenerater() {

	}
	/**
	 * 查询数据库学校编号
	 */
	public String QueryCode(String prefix) {

		String generaterNextNumber="";
		Connection connection = Mysql.getInstance().getConnection();
		String sql="SELECT\r\n" + 
				"	item_schoolid\r\n" + 
				"FROM\r\n" + 
				"	xiaoxuan.`tlk_校园信息`\r\n" + 
				"WHERE\r\n" + 
				"	CREATED = (\r\n" + 
				"		SELECT\r\n" + 
				"			MAX(CREATED)\r\n" + 
				"		FROM\r\n" + 
				"			xiaoxuan.`tlk_校园信息`\r\n" + 
				"	)";
		logger.info(sql);
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet executeQuery = prepareStatement.executeQuery();
			String code="";
			while(executeQuery.next()) {
				code = executeQuery.getString("item_schoolid");
				logger.info(code);
			}
			executeQuery.close();
			prepareStatement.close();
			generaterNextNumber = PrimaryGenerater.getInstance().generaterNextNumber(code, prefix);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return generaterNextNumber;

	}
	/**
	 * 取得PrimaryGenerater的单例实现
	 *
	 * @return
	 */


	public static PrimaryGenerater getInstance() {
		if (primaryGenerater == null) {
			synchronized (PrimaryGenerater.class) {
				if (primaryGenerater == null) {
					primaryGenerater = new PrimaryGenerater();
				}
			}
		}
		return primaryGenerater;
	}

	/**
	 *  生成下一个编号
	 * @param sno    传最大的编号，才能返回累加后的!
	 * @param prefix 生成的编号前缀
	 * @return
	 */
	public synchronized String generaterNextNumber(String sno,String prefix) {
		String id = null;
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		if (sno.equals("")) {
			sno = prefix+"2018000";// 第一次初始化编号
		}
		DecimalFormat df = new DecimalFormat("000");
		id = prefix+formatter.format(date)+ df.format(1 + Integer.parseInt(sno.substring(7, sno.length())));
		logger.info(df.format(1 + Integer.parseInt(sno.substring(7, sno.length()))));
		return id;
	}
	public synchronized String SchoolNextNumber(String sno) {
		String id = null;
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		if (sno.equals("")) {
			sno = "2018000";// 第一次初始化编号
		}
		DecimalFormat df = new DecimalFormat("000");
		id = formatter.format(date)+ df.format(1 + Integer.parseInt(sno.substring(4, sno.length())));
		logger.info(df.format(1 + Integer.parseInt(sno.substring(4, sno.length()))));
		return id;
	}
	public synchronized String TaskNextNumber(String sno) {
		String id = null;
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		if (sno.equals("")) {
			sno = "20180000000";// 第一次初始化编号
		}
		DecimalFormat df = new DecimalFormat("0000");
		id = formatter.format(date)+sno.substring(4,7)+df.format(1 + Integer.parseInt(sno.substring(7, sno.length())));
		logger.info(df.format(1 + Integer.parseInt(sno.substring(7, sno.length()))));
		return id;
	}
	public static void main(String[] args) {
		System.out.println("学校编号："+primaryGenerater.getInstance().generaterNextNumber("PKU2000000","PKU"));
		System.out.println("任务id："+primaryGenerater.TaskNextNumber("20170010000"));
		System.out.println("学校id："+primaryGenerater.SchoolNextNumber("2017000"));
	}
}
