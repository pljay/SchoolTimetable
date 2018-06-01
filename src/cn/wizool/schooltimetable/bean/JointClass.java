package cn.wizool.schooltimetable.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 合并上课规则
 * 
 * @author PLJay
 *
 */
public class JointClass {
	/**
	 * 学校id
	 */
	private String schoolId = "";
	/**
	 * 任务id
	 */
	private String taskId = "";
	/**
	 * 合班id
	 */
	private String jointId = "";
	/**
	 * 合班科目名称
	 */
	private String jointSubject = "";
	/**
	 * 合班科目Id
	 */
	private String jointSubjectId = "";
	
	public String getJointSubjectId() {
		return jointSubjectId;
	}

	public void setJointSubjectId(String jointSubjectId) {
		this.jointSubjectId = jointSubjectId;
	}

	/**
	 * 合班班级ID列表
	 */
	private List<String> jointClassId = new ArrayList<String>();
	/**
	 * 合班教师ID，列表。因允许一个班一门课多个教师带课，所以有可能不一一对应。
	 */
	private List<String> jointTearcherId = new ArrayList<String>();

	
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

	public String getJointId() {
		return jointId;
	}

	public void setJointId(String jointId) {
		this.jointId = jointId;
	}

	public String getJointSubject() {
		return jointSubject;
	}

	public void setJointSubject(String jointSubject) {
		this.jointSubject = jointSubject;
	}

	public List<String> getJointClassId() {
		return jointClassId;
	}

	public void setJointClassId(List<String> jointClassId) {
		this.jointClassId = jointClassId;
	}

	public List<String> getJointTearcherId() {
		return jointTearcherId;
	}

	public void setJointTearcherId(List<String> jointTearcherId) {
		this.jointTearcherId = jointTearcherId;
	}

	

	

}
