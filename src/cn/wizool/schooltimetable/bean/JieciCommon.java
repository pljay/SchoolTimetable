package cn.wizool.schooltimetable.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author PLJay
 * 规则通用课程表数据
 */
public class JieciCommon {
	@JsonProperty("id") 
	private String id;
	/**
	 * 节次id
	 */
	@JsonProperty("coursename") 
	private String coursename;
	/**
	 * 
	 * 科目名称
	 */
	@JsonProperty("coursetype") 
	private String coursetype;
	/**
	 * 优先级名称
	 */
	@JsonProperty("courseid") 
	private String courseid;
	/**
	 * 科目id
	 */
	@JsonProperty("teachername") 
	private String teachername;
	/**
	 * 
	 * 老师名称
	 */
	@JsonProperty("teacherid") 
	private String teacherid;
	/**
	 * 老师id
	 */
	@JsonProperty("classname") 
	private String classname;
	/**
	 * 
	 * 班级名称
	 */
	@JsonProperty("classid") 
	private String classid;
	/**
	 * 班级id
	 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCoursetype() {
		return coursetype;
	}
	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}

	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public JieciCommon(String id, String coursename, String coursetype, String courseid, String teachername,
			String teacherid, String classname, String classid) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.coursetype = coursetype;
		this.courseid = courseid;
		this.teachername = teachername;
		this.teacherid = teacherid;
		this.classname = classname;
		this.classid = classid;
	}
	public static JieciCommon teacherbuild (String id, String coursetype, String teachername, String teacherid) {
		return new JieciCommon(id,"",coursetype,"",teachername,teacherid,"","");
		
	}
	public static JieciCommon subjectbuild (String id,  String coursename,String coursetype, String courseid) {
		return new JieciCommon(id,coursename,coursetype,courseid,"","","","");
		
	}
	
	public static JieciCommon classbuild(String id, String coursetype, String classname, String classid) {
		return new JieciCommon(id,"",coursetype,"","","",classname,classid);
	}
	public static JieciCommon coursebuild(String id, String coursename,String coursetype,String courseid) {
		return new JieciCommon(id,coursename,coursetype,courseid,"","","","");
	}
	public JieciCommon(String id, String coursename, String coursetype, String courseid) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.coursetype = coursetype;
		this.courseid = courseid;
	}
	public JieciCommon(String id, String coursetype) {
		super();
		this.id = id;
		this.coursetype = coursetype;
	}
	public JieciCommon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
