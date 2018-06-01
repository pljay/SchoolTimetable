package cn.wizool.schooltimetable.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 排课时间规则
 * 按课程设置
 * @author PLJay
 *
 */
public class CourseSettings {

	/**
	 * 记录id
	 */
	protected String id="";
	/**
	 * 学校id
	 */
	protected String schoolId="";
	/**
	 * 任务ID
	 */
	protected String taskId="";
	
	//------------以下为节次信息
	/**
	 * 单/双周，单1，双2，默认单
	 */
	public int isDoubleWeek=1;
	
	/**
	 * 周几，0-13，默认0，不能为其他值,表示单周1至双周日
	 */
	public int weekDay=0;
	
	/**
	 * 上课时间段，只能用上午、下午、晚上
	 * 貌似此变量在计算时无用
	 */
	public DayPart dayPart=DayPart.AM;
	
	/**
	 * 当日第几节课
	 */
	public int classNum=0;
	//------------以下为课程信息
	/**
	 * 课程id 
	 */
	protected String courseId="";
	/**
	 * 科目ID
	 */
	protected String subjectId="";
	/**
	 * 科目名称
	 */
	protected String subjectName="";
	/**
	 * 是否走班，1普通，2走班，默认1
	 */
	protected int classType=1;
	/**
	 * 年级ID
	 */
	protected String gradeID="";
	/**
	 * 班级ID
	 */
	protected String classId="";
	/**
	 * 课程名称
	 */
	protected String curriculumName="";
	/**
	 * 任课教师，允许多个
	 */
	protected List<String> teachers=new ArrayList<String>();
	/**
	 * 类型
	 * 正常/禁止/固定/优先/独占  
	 *  0  / 1  / 2 /  3 / 4
	 * 其中正常、禁止、固定可用。
	 */
	protected int type=0;
	
	
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
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
