package cn.wizool.schooltimetable.bean;
/**
 * 排课时间规则
 * 按科目设置
 * @author PLJay
 *
 */
public class SubjectSettings {

	/**
	 * 记录id
	 */
	public String id;
	/**
	 * 学校id
	 */
	public String schoolId="";
	/**
	 * 任务id
	 */
	public String taskId="";
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	/**
	 * 科目id
	 * 
	 */
	public String subjectId="";
	/**
	 * 类型
	 * 正常/禁止/优先: 0/1/3
	 */
	public int type=0;
	
	// ------------以下为节次信息
		/**
		 * 单/双周，单1，双2，默认单
		 */
		public int isDoubleWeek = 1;

		/**
		 * 周几，0-13，默认0，不能为其他值,表示单周1至双周日
		 */
		public int weekDay = 0;

		/**
		 * 上课时间段，只能用上午、下午、晚上 貌似此变量在计算时无用
		 */
		public DayPart dayPart = DayPart.AM;

		/**
		 * 当日第几节课
		 */
		public int classNum = 0;
	/**
	 * 	固定/优先排课与统一设置冲突。
		一个教师带多个班同一科目，固定上课时间冲突(已合班的除外)。
		独占、固定、优先设置不能与统一禁止设置冲突
		同一班级多个科目，优先排课节次重叠。此情况不算绝对冲突，但需提醒，并设置科目优先级。
		与按班级设置、按课程设置的规则冲突，发生此冲突时提醒，但可不改，冲突规则按教师、班级、课程的顺序满足，满足不了的抛弃。

	 */
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
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

	
	
	
}
