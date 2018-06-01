package cn.wizool.schooltimetable.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 完整课表中的单元格，含每节次所有的上课安排
 * @author zl
 *
 */
public class ClassTableCell {

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
	public int classNum=1;
	
	/**
	 * 任务ID
	 */
	public String taskId="";
	/**
	 * 学校ID
	 */
	public String schoolId=""; 
	/**
	 * 是否可用，默认可用
	 */
	boolean canUsed=true;
	/**
	 * 已排课课程列表
	 */
	public List<CommonCellPlan> coursePlanList=new ArrayList<CommonCellPlan>();
	
	/**
	 * 禁止排课课程
	 */
	public List<CommonCellPlan> banCoursePlanList=new ArrayList<CommonCellPlan>();
	
	/**
	 * 优先排课课程
	 */
	public List<CommonCellPlan> priorityCoursePlanList=new ArrayList<CommonCellPlan>();
}
