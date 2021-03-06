package cn.wizool.schooltimetable.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 普通排课运算结果
 * @author zl
 *
 */
public class CommonPlanResult {

	/**
	 * 排课结果，第一维长度，单周为0-6，双周为为0-13。
	 * 第二维为当日所有节次，元素为list，内容为该节次所有上课的科目、教师、班级、地点
	 * 具体内容待定
	 */
	public ClassTableCell[][] classtable;
	
	/**
	 * 排课错误码，0为无错，有错返回错误码
	 */
	public int errorCode=0;
	/**
	 * 错误信息主信息
	 */
	public String errorMainMsg=""; 
	/**
	 * 抛出Exception时，返回错误数据
	 */
	public StackTraceElement[] errorMsg;
	/**
	 * 排课过程中提出的警告提醒，非错误
	 */
	public List<String> alertMsg =new ArrayList<String>();
	/**
	 * 未满足的普通规则。
	 */
	public List<String> inconformityRule=new ArrayList<String>();
	/**
	 * 未满足的必选规则
	 */
	public  List<String>  inconformityNecessaryRule=new ArrayList<String>();
}
