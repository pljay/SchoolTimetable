package cn.wizool.schooltimetable.bean;

import java.util.Date;

/**
 * 排课任务
 * @author zl
 * 
 */
public class PlanTask {
	/**
	 * 任务ID
	 */
	private String taskId="";
	/**
	 * 任务名称
	 */
	private String taskName="";
	public int getClassType() {
		return classType;
	}

	public void setClassType(int classType) {
		this.classType = classType;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}



	/**
	 * 学校ID
	 */
	private String schoolId="";
	/**
	 * 任务创建时间，字符串，格式 yyyy-MM-dd HH:mm:型
	 */
	private String createDate="";
//	/**
//	 * 课表是否分单双周，默认不分
//	 */
//	private boolean isDoubleWeek=false;
	/**
	 * 排课类型:1普通，2走班，默认1
	 */
	private int classType=1;
	
	/**
	 * 状态 1未排 2 已排 
	 */
	private int status=1;
	/**
	 * 任务创建人，此处为ID
	 */
	private String creater="";
	
	public void test() {
		
		System.out.println(classType);
	}

	/**
	 * 检查任务数据有效性
	 * @param msg 传引用参数，用以输出错误信息
	 * @return
	 */
	public boolean check(StringBuffer msg)
	{
		//msg=new StringBuffer();
		msg.append("sss");
		return true;
	}
	
	public static void main(String args[])
	{
		PlanTask planTask=new PlanTask();
		StringBuffer s=new StringBuffer();
		planTask.check(s);
		System.out.println(s);
	}
	
	



	
	public String getTaskId() {
		return taskId;
	}



	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}



	public String getTaskName() {
		return taskName;
	}



	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}



	public String getSchoolId() {
		return schoolId;
	}



	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}



	public String getCreateDate() {
		return createDate;
	}



	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}



//	public boolean isDoubleWeek() {
//		return isDoubleWeek;
//	}
//
//
//
//	public void setDoubleWeek(boolean isDoubleWeek) {
//		this.isDoubleWeek = isDoubleWeek;
//	}



	public int getTaskType() {
		return classType;
	}



	public void setTaskType(int taskType) {
		this.classType = taskType;
	}
	
	
	
}
