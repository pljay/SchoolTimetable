package cn.wizool.schooltimetable.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author PLJay
 * 合并班级结果
 */
public class MergeClass {
	
	@JsonProperty("subjectid") 
	private String subjectid;
	/**
	 * 科目id
	 */
	@JsonProperty("subjectname") 
	private String subjectname;
	/**
	 * 
	 * 科目名称
	 */
	@JsonProperty("mergeclassids") 
	private String mergeclassids;
	/**
	 * 合并班级id
	 * 以英文;隔开
	 */

	@JsonProperty("mergeclassnames") 
	private String mergeclassnames;
	/**
	 * 合并班级名称
	 * 以英文;隔开
	 */
	@JsonProperty("teacherids") 
	private String teacherids;
	/**
	 * 
	 * 老师名称id
	 * 以英文;隔开
	 */
	@JsonProperty("teachernames") 
	private String teachernames;
	/**
	 * 
	 * 老师名称
	 * 以英文;隔开
	 */
	public String getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public String getMergeclassids() {
		return mergeclassids;
	}
	public void setMergeclassids(String mergeclassids) {
		this.mergeclassids = mergeclassids;
	}
	public String getMergeclassnames() {
		return mergeclassnames;
	}
	public void setMergeclassnames(String mergeclassnames) {
		this.mergeclassnames = mergeclassnames;
	}
	public String getTeacherids() {
		return teacherids;
	}
	public void setTeacherids(String teacherids) {
		this.teacherids = teacherids;
	}
	public String getTeachernames() {
		return teachernames;
	}
	public void setTeachernames(String teachernames) {
		this.teachernames = teachernames;
	}
	public MergeClass(String subjectid, String subjectname, String mergeclassids, String mergeclassnames,
			String teacherids, String teachernames) {
		super();
		this.subjectid = subjectid;
		this.subjectname = subjectname;
		this.mergeclassids = mergeclassids;
		this.mergeclassnames = mergeclassnames;
		this.teacherids = teacherids;
		this.teachernames = teachernames;
	}
	public MergeClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
