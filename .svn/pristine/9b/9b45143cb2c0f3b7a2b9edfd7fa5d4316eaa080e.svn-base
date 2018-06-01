package cn.wizool.schooltimetable.bean;

import java.util.ArrayList;

import java.util.List;

import org.apache.poi.ss.formula.functions.T;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Common {

	@JsonProperty("taskid") private String taskid;
	@JsonProperty("schoolid") private String schoolid;
	@JsonProperty("classid") private String classid;
	@JsonProperty("banlist") List<JieciCommon> banlist;
	public List<JieciCommon> getbanlist() {
		return banlist;
	}
	public void setbanlist(List<JieciCommon> banlist) {
		this.banlist = banlist;
	}
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	
	public String getSchoolid() {
		return schoolid;
	}
	public void setSchoolid(String schoolid) {
		this.schoolid = schoolid;
	}
	
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public  Common(String taskid, String schoolid, List<JieciCommon> banlist) {
		super();
		this.taskid = taskid;
		this.schoolid = schoolid;
		this.banlist = banlist;
	}
	
	public Common(String taskid, String schoolid, String classid, List<JieciCommon> banlist) {
		super();
		this.taskid = taskid;
		this.schoolid = schoolid;
		this.classid = classid;
		this.banlist = banlist;
	}
	public Common() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
