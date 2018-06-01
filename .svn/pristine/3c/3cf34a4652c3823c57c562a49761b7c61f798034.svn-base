package cn.wizool.schooltimetable.bean;

/**
 * 教师排课规则
 * 
 * @author PLJay
 *
 */
public class TeacherPriority {// extends Teacher {

	// public TeacherPriority(String id, String schoolid, String name) {
	// super(id, schoolid, name);
	// // TODO Auto-generated constructor stub
	// }
	
	
	
	public TeacherPriority() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public TeacherPriority(String taskId, String schoolId, int priority, int dayMax, int dayMin, int weekDensity,
		int dayDensity) {
	super();
	this.taskId = taskId;
	this.schoolId = schoolId;
	this.priority = priority;
	this.dayMax = dayMax;
	this.dayMin = dayMin;
	this.weekDensity = weekDensity;
	this.dayDensity = dayDensity;
}

	/**
	 * 任务ID
	 */
	private String taskId = "";
	/**
	 * 学校id 自动填充，用户不可见	 * 
	 */
	private String schoolId = "";	

	/**
	 * 优先级 列出本任务涉及的所有教师，按默认按录入顺序设定优先级，可修改。优先级即序号，越小越高。可不设,默认99999。
	 */
	private int priority = 99999;
	/**
	 * 每日最大课时数(默认0，即不限)
	 */
	private int dayMax=0;
	/**
	 * 每日最小课时数(默认0，即不限)
	 */
	private int dayMin=0;
	/**
	 * 周内离散1/集中2（默认离散）
	 */
	private int weekDensity=1;

	/**
	 * 日内离散1/集中2（默认集中）
	 */
	private int dayDensity=2;
	

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public int getDayMax() {
		return dayMax;
	}

	public void setDayMax(int dayMax) {
		this.dayMax = dayMax;
	}

	public int getDayMin() {
		return dayMin;
	}

	public void setDayMin(int dayMin) {
		this.dayMin = dayMin;
	}

	public int getWeekDensity() {
		return weekDensity;
	}

	public void setWeekDensity(int weekDensity) {
		this.weekDensity = weekDensity;
	}

	public int getDayDensity() {
		return dayDensity;
	}

	public void setDayDensity(int dayDensity) {
		this.dayDensity = dayDensity;
	}









}
