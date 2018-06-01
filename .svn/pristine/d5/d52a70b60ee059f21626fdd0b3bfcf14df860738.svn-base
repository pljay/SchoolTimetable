package cn.wizool.schooltimetable.bean;
/**
 * 上课时间安排(节次安排)
 * @author zl
 *
 */
public class TimeSet {

	/**
	 * 记录ID
	 */
	private String recordID="";
	/**
	 * 单/双周，单1，双2，默认单
	 */
	private int isDoubleWeek=1;
	
	/**
	 * 周几，1-7，默认1，不能为其他值
	 */
	private int weekDay=1;
	
	/**
	 * 上课时间段，只能用上午、下午、晚上
	 * 貌似此变量在计算时无用
	 */
	private DayPart dayPart=DayPart.AM;
	
	/**
	 * 当日第几节课
	 */
	private int classNum=1;
	
	/**
	 * 任务ID
	 */
	private String taskId="";
	/**
	 * 学校ID
	 */
	private String schoolId="";
	public String getRecordID() {
		return recordID;
	}
	public void setRecordID(String recordID) {
		this.recordID = recordID;
	}
	public int getIsDoubleWeek() {
		return isDoubleWeek;
	}
	public void setIsDoubleWeek(int isDoubleWeek) {
		this.isDoubleWeek = isDoubleWeek;
	}
	public int getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(int weekDay) {
		this.weekDay = weekDay;
	}
	public DayPart getDayPart() {
		return dayPart;
	}
	public void setDayPart(DayPart dayPart) {
		this.dayPart = dayPart;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
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
		return "TimeSet [recordID=" + recordID + ", isDoubleWeek=" + isDoubleWeek + ", weekDay=" + weekDay
				+ ", dayPart=" + dayPart + ", classNum=" + classNum + ", taskId=" + taskId + ", schoolId=" + schoolId
				+ "]";
	}
	public TimeSet(String recordID, int isDoubleWeek, int weekDay, DayPart dayPart, int classNum, String taskId,
			String schoolId) {
		super();
		this.recordID = recordID;
		this.isDoubleWeek = isDoubleWeek;
		this.weekDay = weekDay;
		this.dayPart = dayPart;
		this.classNum = classNum;
		this.taskId = taskId;
		this.schoolId = schoolId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classNum;
		result = prime * result + ((dayPart == null) ? 0 : dayPart.hashCode());
		result = prime * result + isDoubleWeek;
		result = prime * result + ((recordID == null) ? 0 : recordID.hashCode());
		result = prime * result + ((schoolId == null) ? 0 : schoolId.hashCode());
		result = prime * result + ((taskId == null) ? 0 : taskId.hashCode());
		result = prime * result + weekDay;
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
		TimeSet other = (TimeSet) obj;
		if (classNum != other.classNum)
			return false;
		if (dayPart != other.dayPart)
			return false;
		if (isDoubleWeek != other.isDoubleWeek)
			return false;
		if (recordID == null) {
			if (other.recordID != null)
				return false;
		} else if (!recordID.equals(other.recordID))
			return false;
		if (schoolId == null) {
			if (other.schoolId != null)
				return false;
		} else if (!schoolId.equals(other.schoolId))
			return false;
		if (taskId == null) {
			if (other.taskId != null)
				return false;
		} else if (!taskId.equals(other.taskId))
			return false;
		if (weekDay != other.weekDay)
			return false;
		return true;
	}
	
}
