package cn.wizool.schooltimetable.bean;
/**
 * 课时数量设置
 * @author zl
 *
 */
public class LessonSet {

	/**
	 * 记录ID
	 */
	private String recordID="";
	/**
	 * 上午课时数
	 */
	private int AM=0;
	/**
	 * 下午课时数
	 */
	private int PM=0;
	
	/**
	 * 晚上课时数
	 */
	private int Evening=0;	
	/**
	 * 每周上课天数
	 */
	private int days=0;
	/**
	 * 课表是否分单双周，默认不分
	 */
	private boolean isDoubleWeek=false;
	
	/**
	 * 课表上课总天数
	 */
	private int dayCount=0;
	/**
	 * 课表每天总课时数
	 */
	private int classCount = 0;//;
	
	public boolean isDoubleWeek() {
		return isDoubleWeek;
	}
	public void setDoubleWeek(boolean isDoubleWeek) {
		this.isDoubleWeek = isDoubleWeek;
	}
	/**
	 * 任务ID
	 */
	private String taskId="";
	/**
	 * 学校ID
	 */
	private String schoolId="";
	public String getRecordID() {
		return recordID;
	}
	public void setRecordID(String recordID) {
		this.recordID = recordID;
	}
	public int getAM() {
		return AM;
	}
	public void setAM(int aM) {
		AM = aM;
	}
	public int getPM() {
		return PM;
	}
	public void setPM(int pM) {
		PM = pM;
	}
	public int getEvening() {
		return Evening;
	}
	public void setEvening(int evening) {
		Evening = evening;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	/**
	 * 获取课表总天数，分单双周的天数为每周上课天数的2倍。
	 * @return
	 */
	public int getDayCount() {
		if(isDoubleWeek)//双周天数加倍
		{
			return days*2;
		}
		else
		{
			return days;
		}
	}
	/**
	 * 获取每天总课时数
	 * @return
	 */
	public int getClassCount() {
		return AM+PM+Evening;
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
	public LessonSet(String recordID, int aM, int pM, int evening, int days, String taskId, String schoolId) {
		super();
		this.recordID = recordID;
		AM = aM;
		PM = pM;
		Evening = evening;
		this.days = days;
		this.taskId = taskId;
		this.schoolId = schoolId;
	}
	public LessonSet() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	
}
