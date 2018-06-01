package cn.wizool.schooltimetable.bean;
/**
 * 排课时间设置
 * 统一设置
 * @author PLJay
 *
 */
public class TimetableBan {

	/**
	 * 记录id
	 */
	private String id;
	/**
	 * 学校id
	 */
	private String schoolId="";
	/**
	 * 任务ID
	 */
	private String taskId="";
	/**
	 * 节次ID
	 */
	private String sectionId="";
	
	/**
	 * 周几，0-13，默认0，不能为其他值,8-13位双周的周一至周日
	 */
	private int weekDay=0;
	/**
	 * 当日第几节课
	 */
	private int classNum=1;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getSectionId() {
		return sectionId;
	}
	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}
	public int getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(int weekDay) {
		this.weekDay = weekDay;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
}

