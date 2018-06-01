package cn.wizool.schooltimetable.bean;
/**
 * <p>Title: CurriculumSettings</p> 
 * <p>Description:课程时间规则 </p>  
 * @author PLJay 
 * @date 2018年4月17日
 */
public class CurriculumSettings {
	/**
	 * 记录id
	 * 自动编号，不可见
	 */
	private String recordID="";
	/**
	 * 学校id
	 */
	private String schoolid="";
	/**
	 * 任务id
	 */
	private String taskid="";
	/**
	 * 节次id
	 */
	private String shiftsid="";
	/**
	 * 科目id
	 */
	private String subjectid="";
	/**
	 * 教师id
	 */
	private String teacherid="";
	/**
	 * 班级id
	 */
	private String classid="";
	/**
	 * 课程id
	 */
	private String courseid="";
	/**
	 * 类型：禁止/独占/固定/优先
	 * type:1/2/3/4
	 */
	private int type=0;
	public String getRecordID() {
		return recordID;
	}
	public void setRecordID(String recordID) {
		this.recordID = recordID;
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
	public String getShiftsid() {
		return shiftsid;
	}
	public void setShiftsid(String shiftsid) {
		this.shiftsid = shiftsid;
	}
	public String getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public CurriculumSettings(String recordID, String schoolid, String taskid, String shiftsid, String subjectid,
			String teacherid, String classid, String courseid, int type) {
		super();
		this.recordID = recordID;
		this.schoolid = schoolid;
		this.taskid = taskid;
		this.shiftsid = shiftsid;
		this.subjectid = subjectid;
		this.teacherid = teacherid;
		this.classid = classid;
		this.courseid = courseid;
		this.type = type;
	}
	/**
	 * 
	 * @param recordID
	 * @param schoolid
	 * @param taskid
	 * @param shiftsid
	 * @param subjectid
	 * @param courseid
	 * @param type
	 * 按科目设置
	 */
	public CurriculumSettings curriculumSettingssubject(String recordID, String schoolid, String taskid, String shiftsid, String subjectid,
			int type) {
		return new CurriculumSettings(recordID,schoolid ,taskid , shiftsid,subjectid,"","","" ,type);
	}
	/**
	 * 
	 * @param recordID
	 * @param schoolid
	 * @param taskid
	 * @param shiftsid
	 * @param teacherid
	 * @param type
	 * 按教师设置
	 */
	public CurriculumSettings curriculumSettingsteacher(String recordID, String schoolid, String taskid, String shiftsid, String teacherid,
			int type) {
		return new CurriculumSettings(recordID,schoolid ,taskid , shiftsid,"",teacherid,"","" ,type);
	}
	/**
	 * 
	 * @param recordID
	 * @param schoolid
	 * @param taskid
	 * @param shiftsid
	 * @param classid
	 * @param type
	 * 按班级设置
	 */
	public CurriculumSettings curriculumSettingsclass(String recordID, String schoolid, String taskid, String shiftsid, String classid,
			int type) {
		return new CurriculumSettings(recordID,schoolid ,taskid , shiftsid,"","",classid,"" ,type);
	}
	/**
	 * 
	 * @param recordID
	 * @param schoolid
	 * @param taskid
	 * @param shiftsid
	 * @param courseid
	 * @param type
	 * 按课程设置
	 */
	public CurriculumSettings curriculumSettingscourse(String recordID, String schoolid, String taskid, String shiftsid, String courseid,
			int type) {
		return new CurriculumSettings(recordID,schoolid ,taskid , shiftsid,"","","",courseid ,type);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classid == null) ? 0 : classid.hashCode());
		result = prime * result + ((courseid == null) ? 0 : courseid.hashCode());
		result = prime * result + ((recordID == null) ? 0 : recordID.hashCode());
		result = prime * result + ((schoolid == null) ? 0 : schoolid.hashCode());
		result = prime * result + ((shiftsid == null) ? 0 : shiftsid.hashCode());
		result = prime * result + ((subjectid == null) ? 0 : subjectid.hashCode());
		result = prime * result + ((taskid == null) ? 0 : taskid.hashCode());
		result = prime * result + ((teacherid == null) ? 0 : teacherid.hashCode());
		result = prime * result + type;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurriculumSettings other = (CurriculumSettings) obj;
		if (classid == null) {
			if (other.classid != null)
				return false;
		} else if (!classid.equals(other.classid))
			return false;
		if (courseid == null) {
			if (other.courseid != null)
				return false;
		} else if (!courseid.equals(other.courseid))
			return false;
		if (recordID == null) {
			if (other.recordID != null)
				return false;
		} else if (!recordID.equals(other.recordID))
			return false;
		if (schoolid == null) {
			if (other.schoolid != null)
				return false;
		} else if (!schoolid.equals(other.schoolid))
			return false;
		if (shiftsid == null) {
			if (other.shiftsid != null)
				return false;
		} else if (!shiftsid.equals(other.shiftsid))
			return false;
		if (subjectid == null) {
			if (other.subjectid != null)
				return false;
		} else if (!subjectid.equals(other.subjectid))
			return false;
		if (taskid == null) {
			if (other.taskid != null)
				return false;
		} else if (!taskid.equals(other.taskid))
			return false;
		if (teacherid == null) {
			if (other.teacherid != null)
				return false;
		} else if (!teacherid.equals(other.teacherid))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CurriculumSettings [recordID=" + recordID + ", schoolid=" + schoolid + ", taskid=" + taskid
				+ ", shiftsid=" + shiftsid + ", subjectid=" + subjectid + ", teacherid=" + teacherid + ", classid="
				+ classid + ", courseid=" + courseid + ", type=" + type + "]";
	}
	


	
}
