package cn.wizool.schooltimetable.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 完整课表中单元格中，每节次课程安排的明细
 * @author zl
 *
 */
public class CommonCellPlan {

	/**
	 * 任务ID
	 */
	public String taskId="";
	/**
	 * 课程id 
	 */
	protected String courseId="";
	/**
	 * 学校ID
	 */
	public String schoolId=""; 
	
	/** 科目ID
	 */
	public String subjectId="";
	/**
	 * 科目名称
	 */
	public String subjectName="";
	/**
	 * 是否走班，1普通，2走班，默认1
	 */
	public int classType=1;
	/**
	 * 年级ID
	 */
	public String gradeID="";
	/**
	 * 班级ID
	 */
	public String classId="";
	/**
	 * 课程名称
	 */
	public String curriculumName="";
	/**
	 * 任课教师，允许多个
	 */
	public List<String> teachers=new ArrayList<String>();
	
	/**
	 * 教室ID
	 */
	public String roomID="";
	/**
	 * 教室名称
	 */
	public String roomName="";	
	
	
	public TimeRuleType timeRuleType=TimeRuleType.forAll;
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
}
