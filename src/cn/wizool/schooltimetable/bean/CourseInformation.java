package cn.wizool.schooltimetable.bean;

/**

 * <p>Title: CourseInformation</p> 
 
 * <p>Description:任课管理</p>  

 * @author PLJay 

 * @date 2018年4月17日 
 
*/
public class CourseInformation {

	private String id="";
	/**
	 * 课程id
	 */
	private String sujectname="";
	/**
	 * 科目名称
	 */
	private String subjectnumber="";
	/**
	 * 科目编号
	 */
	private String iswalkclasss="否";
	/**
	 * 是否走班
	 */
	private String gradeid="";
	/**
	 * 开课年级
	 */
	private String classid="";
	/**
	 * 开课班级
	 */
	private String coursename="";
	/**
	 * 课程名称
	 */
	private String tearcherid="";
	/**
	 * 任课老师
	 */
	private String isdoubleweek="否";
	/**
	 * 是否区分单双周：是/否，必填，默认否。
	 */
	private int aString=0;
	/**
	 * 单周课时安排：不区分单双周时，做通用的“周课时安排”使用。
	 * 含三部分，单节课时次数，2节连堂课时次数，必填，默认0。自动计算第三项数据：单周课时总数。
	 */
	private int bString=0;
	/**
	 * 双周课时安排：区分单双周时使用。
	 * 含三部分，单节课时次数，2节连堂课时次数，必填，默认0。自动计算第三项数据：双周课时总数。
	 */
	private int amselfstudycounts=0;
	/**
	 * 单周早自习节数：不区分单双周时，做通用的“周课时安排”使用默认0。
	 */
	private int bmselfstudycounts=0;
	/**
	 * 双周早自习节数：区分单双周时使用，默认0。
	 */
	private int aeselfstudycounts=0;
	/**
	 * 单周晚自习节数：不区分单双周时，做通用的“周课时安排”使用默认0。
	 */
	private int beselfstudycounts=0;
	/**
	 * 双周晚自习节数：区分单双周时使用，默认0。
	 */
	private String schoolid="";
	/**
	 * 学校id
	 */
	private String taskid="";
	/**
	 * 任务id
	 */
	//走班排课字段属性暂不添加
	/*
	总课时数：该课程在当前学期需达到的课时数。
	周课时数：该课程在一学周内的课时数。
	是否分层：走班且分层选课时有效，设置本课程是否分层(同年级、同科目课程，此自动数据一致)。
	分层级别：从数据，分层为“是”时有效。分层方式为分数时，此处填下限。否则填字母级别。
	人数上限：整数，必填。该课程人数上限。必填。默认0。
	学生人数：实际学生人数。可为0，必填。教学班人数在分班后确定。
	学生名单：走班时生效，从表，存储该课程走班学生明细(学生ID即可)。
	 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSujectname() {
		return sujectname;
	}
	public void setSujectname(String sujectname) {
		this.sujectname = sujectname;
	}
	public String getSubjectnumber() {
		return subjectnumber;
	}
	public void setSubjectnumber(String subjectnumber) {
		this.subjectnumber = subjectnumber;
	}
	public String getIswalkclasss() {
		return iswalkclasss;
	}
	public void setIswalkclasss(String iswalkclasss) {
		this.iswalkclasss = iswalkclasss;
	}
	public String getGradeid() {
		return gradeid;
	}
	public void setGradeid(String gradeid) {
		this.gradeid = gradeid;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getTearcherid() {
		return tearcherid;
	}
	public void setTearcherid(String tearcherid) {
		this.tearcherid = tearcherid;
	}
	public String getIsdoubleweek() {
		return isdoubleweek;
	}
	public void setIsdoubleweek(String isdoubleweek) {
		this.isdoubleweek = isdoubleweek;
	}
	public int getaString() {
		return aString;
	}
	public void setaString(int aString) {
		this.aString = aString;
	}
	public int getbString() {
		return bString;
	}
	public void setbString(int bString) {
		this.bString = bString;
	}
	public int getAmselfstudycounts() {
		return amselfstudycounts;
	}
	public void setAmselfstudycounts(int amselfstudycounts) {
		this.amselfstudycounts = amselfstudycounts;
	}
	public int getBmselfstudycounts() {
		return bmselfstudycounts;
	}
	public void setBmselfstudycounts(int bmselfstudycounts) {
		this.bmselfstudycounts = bmselfstudycounts;
	}
	public int getAeselfstudycounts() {
		return aeselfstudycounts;
	}
	public void setAeselfstudycounts(int aeselfstudycounts) {
		this.aeselfstudycounts = aeselfstudycounts;
	}
	public int getBeselfstudycounts() {
		return beselfstudycounts;
	}
	public void setBeselfstudycounts(int beselfstudycounts) {
		this.beselfstudycounts = beselfstudycounts;
	}
	public String getSchoolid() {
		return schoolid;
	}
	public void setSchoolid(String schoolid) {
		this.schoolid = schoolid;
	}
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	
}
