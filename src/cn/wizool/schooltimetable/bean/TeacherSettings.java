package cn.wizool.schooltimetable.bean;

/**
 * 排课时间安规则 按教师设置
 * 
 * @author PLJay
 *
 */
public class TeacherSettings {
	/**
	 * 记录id
	 */
	public String id = "";
	/**
	 * 学校id
	 */
	public String schoolId = "";
	/**
	 * 任务id
	 */
	public String taskId = "";

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

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
	 * 老师id
	 * 
	 */
	public String teacherId = "";
	/**
	 * 类型 禁止/正常 1/0
	 */
	public int type = 0;

	/**
	 * 校验可能存在的冲突： 固定/优先或禁止排课与统一设置的相反设置冲突。 多个教师教同一班级不同科目，教师固定上课时间冲突。
	 * 多个教师教同一班级，优先排课节次重叠。此情况不算绝对冲突，需设置教师优先级。
	 * 与按班级设置、按课程设置的规则冲突，发生此冲突时提醒，但可不改，冲突规则按教师、班级、课程优先级满足，满足不了的抛弃。
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

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
