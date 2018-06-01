package cn.wizool.schooltimetable.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 任课信息
 * @author zl
 *
 */
public class ClassTeacher {

	/**
	 * 记录ID
	 */
	private String recordId="";
	/**
	 * 科目ID
	 */
	private String subjectId="";
	/**
	 * 科目名称
	 */
	private String subjectName="";
	/**
	 * 是否走班，1普通，2走班，默认1
	 */
	private int classType=1;
	/**
	 * 年级ID
	 */
	private String gradeID="";
	/**
	 * 班级ID
	 */
	private String classId="";
	/**
	 * 课程名称
	 */
	private String curriculumName="";
	/**
	 * 任课教师，允许多个
	 */
	private List<String> teachers=new ArrayList<String>();
	/**
	 * 课表是否分单双周，默认不分
	 */
	private boolean isDoubleWeek=false;
	
	/**
	 * 单节上课次数
	 * 分单双周时为单周数据，不分单双周时为默认数据
	 */
	private int singleClassTimes=0;
	/**
	 * 2节次连堂上课次数
	 * 分单双周时为单周数据，不分单双周时为默认数据
	 */
	private int doubleClassTimes=0;
	/**
	 * 总节次数
	 * 分单双周时为单周数据，不分单双周时为默认数据
	 */
	private int classCount=0;
	/**
	 * 早自习次数
	 * 分单双周时为单周数据，不分单双周时为默认数据
	 */
	private int morningSlef=0;
	/**
	 * 晚自习次数
	 * 分单双周时为单周数据，不分单双周时为默认数据
	 */
	private int nightSlef=0;
	/**
	 * 早自习次数
	 * 分单双周时为双周数据，不分单双周时无效
	 */
	private int dMorningSlef=0;
	/**
	 * 晚自习次数
	 * 分单双周时为双周数据，不分单双周时无效
	 */
	private int dNightSlef=0;
	
	/**
	 * 单节上课次数
	 * 分单双周时为双周数据，不分单双周时无效
	 */
	private int dSingleClassTimes=0;
	/**
	 * 2节次连堂上课次数
	 * 分单双周时为双周数据，不分单双周时无效
	 */
	private int dDoubleClassTimes=0;
	/**
	 * 总节次数
	 * 分单双周时为双周数据，不分单双周时无效
	 */
	private int dClassCount=0;
	/**
	 * 任务ID
	 */
	private String taskId="";
	/**
	 * 学校ID
	 */
	private String schoolId="";
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getClassType() {
		return classType;
	}
	public void setClassType(int classType) {
		this.classType = classType;
	}
	public String getGradeID() {
		return gradeID;
	}
	public void setGradeID(String gradeID) {
		this.gradeID = gradeID;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getCurriculumName() {
		return curriculumName;
	}
	public void setCurriculumName(String curriculumName) {
		this.curriculumName = curriculumName;
	}
	public List<String> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<String> teachers) {
		this.teachers = teachers;
	}
	public boolean isDoubleWeek() {
		return isDoubleWeek;
	}
	public void setDoubleWeek(boolean isDoubleWeek) {
		this.isDoubleWeek = isDoubleWeek;
	}
	public int getSingleClassTimes() {
		return singleClassTimes;
	}
	public void setSingleClassTimes(int singleClassTimes) {
		this.singleClassTimes = singleClassTimes;
	}
	public int getDoubleClassTimes() {
		return doubleClassTimes;
	}
	public void setDoubleClassTimes(int doubleClassTimes) {
		this.doubleClassTimes = doubleClassTimes;
	}
	public int getClassCount() {
		return classCount;
	}
	public void setClassCount(int classCount) {
		this.classCount = classCount;
	}
	public int getMorningSlef() {
		return morningSlef;
	}
	public void setMorningSlef(int morningSlef) {
		this.morningSlef = morningSlef;
	}
	public int getNightSlef() {
		return nightSlef;
	}
	public void setNightSlef(int nightSlef) {
		this.nightSlef = nightSlef;
	}
	public int getdMorningSlef() {
		return dMorningSlef;
	}
	public void setdMorningSlef(int dMorningSlef) {
		this.dMorningSlef = dMorningSlef;
	}
	public int getdNightSlef() {
		return dNightSlef;
	}
	public void setdNightSlef(int dNightSlef) {
		this.dNightSlef = dNightSlef;
	}
	public int getdSingleClassTimes() {
		return dSingleClassTimes;
	}
	public void setdSingleClassTimes(int dSingleClassTimes) {
		this.dSingleClassTimes = dSingleClassTimes;
	}
	public int getdDoubleClassTimes() {
		return dDoubleClassTimes;
	}
	public void setdDoubleClassTimes(int dDoubleClassTimes) {
		this.dDoubleClassTimes = dDoubleClassTimes;
	}
	public int getdClassCount() {
		return dClassCount;
	}
	public void setdClassCount(int dClassCount) {
		this.dClassCount = dClassCount;
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
	@Override
	public String toString() {
		return "ClassTeacher [recordId=" + recordId + ", subjectId=" + subjectId + ", subjectName=" + subjectName
				+ ", classType=" + classType + ", gradeID=" + gradeID + ", classId=" + classId + ", curriculumName="
				+ curriculumName + ", teachers=" + teachers + ", isDoubleWeek=" + isDoubleWeek + ", singleClassTimes="
				+ singleClassTimes + ", doubleClassTimes=" + doubleClassTimes + ", classCount=" + classCount
				+ ", morningSlef=" + morningSlef + ", nightSlef=" + nightSlef + ", dMorningSlef=" + dMorningSlef
				+ ", dNightSlef=" + dNightSlef + ", dSingleClassTimes=" + dSingleClassTimes + ", dDoubleClassTimes="
				+ dDoubleClassTimes + ", dClassCount=" + dClassCount + ", taskId=" + taskId + ", schoolId=" + schoolId
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classCount;
		result = prime * result + ((classId == null) ? 0 : classId.hashCode());
		result = prime * result + classType;
		result = prime * result + ((curriculumName == null) ? 0 : curriculumName.hashCode());
		result = prime * result + dClassCount;
		result = prime * result + dDoubleClassTimes;
		result = prime * result + dMorningSlef;
		result = prime * result + dNightSlef;
		result = prime * result + dSingleClassTimes;
		result = prime * result + doubleClassTimes;
		result = prime * result + ((gradeID == null) ? 0 : gradeID.hashCode());
		result = prime * result + (isDoubleWeek ? 1231 : 1237);
		result = prime * result + morningSlef;
		result = prime * result + nightSlef;
		result = prime * result + ((recordId == null) ? 0 : recordId.hashCode());
		result = prime * result + ((schoolId == null) ? 0 : schoolId.hashCode());
		result = prime * result + singleClassTimes;
		result = prime * result + ((subjectId == null) ? 0 : subjectId.hashCode());
		result = prime * result + ((subjectName == null) ? 0 : subjectName.hashCode());
		result = prime * result + ((taskId == null) ? 0 : taskId.hashCode());
		result = prime * result + ((teachers == null) ? 0 : teachers.hashCode());
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
		ClassTeacher other = (ClassTeacher) obj;
		if (classCount != other.classCount)
			return false;
		if (classId == null) {
			if (other.classId != null)
				return false;
		} else if (!classId.equals(other.classId))
			return false;
		if (classType != other.classType)
			return false;
		if (curriculumName == null) {
			if (other.curriculumName != null)
				return false;
		} else if (!curriculumName.equals(other.curriculumName))
			return false;
		if (dClassCount != other.dClassCount)
			return false;
		if (dDoubleClassTimes != other.dDoubleClassTimes)
			return false;
		if (dMorningSlef != other.dMorningSlef)
			return false;
		if (dNightSlef != other.dNightSlef)
			return false;
		if (dSingleClassTimes != other.dSingleClassTimes)
			return false;
		if (doubleClassTimes != other.doubleClassTimes)
			return false;
		if (gradeID == null) {
			if (other.gradeID != null)
				return false;
		} else if (!gradeID.equals(other.gradeID))
			return false;
		if (isDoubleWeek != other.isDoubleWeek)
			return false;
		if (morningSlef != other.morningSlef)
			return false;
		if (nightSlef != other.nightSlef)
			return false;
		if (recordId == null) {
			if (other.recordId != null)
				return false;
		} else if (!recordId.equals(other.recordId))
			return false;
		if (schoolId == null) {
			if (other.schoolId != null)
				return false;
		} else if (!schoolId.equals(other.schoolId))
			return false;
		if (singleClassTimes != other.singleClassTimes)
			return false;
		if (subjectId == null) {
			if (other.subjectId != null)
				return false;
		} else if (!subjectId.equals(other.subjectId))
			return false;
		if (subjectName == null) {
			if (other.subjectName != null)
				return false;
		} else if (!subjectName.equals(other.subjectName))
			return false;
		if (taskId == null) {
			if (other.taskId != null)
				return false;
		} else if (!taskId.equals(other.taskId))
			return false;
		if (teachers == null) {
			if (other.teachers != null)
				return false;
		} else if (!teachers.equals(other.teachers))
			return false;
		return true;
	}

}
