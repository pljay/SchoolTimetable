package cn.wizool.schooltimetable.bean;
/**
 * 空白课表
 * 课时设置新增或修改后，自动生成课时明细，并根据课时明细生成空白课表
 * @author PLJay
 *
 */
public class BlankTable {

	/**
	 * 节次id
	 * 自动生成
	 */
	private String id;
	/**
	 * 学校id
	 * 自动填充
	 */
	private String schoolid;
	/**
	 * 任务id
	 * 自动填充
	 */
	private String taskid;
	/**
	 * 是否单双周
	 * 单/双(部分单双周时默认为单)
	 */
	private String isdoubleweek;
	/**
	 * 日期
	 * 周一到周日
	 */
	private String weekday;
	/**
	 * 时段
	 * 上午/下午/晚上
	 */
	private String period;
	/**
	 * 节次
	 * 第几节课
	 */
	private String section;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSchoolid() {
		return schoolid;
	}
	public void setSchoolid(String schoolid) {
		this.schoolid = schoolid;
	}
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	public String getIsdoubleweek() {
		return isdoubleweek;
	}
	public void setIsdoubleweek(String isdoubleweek) {
		this.isdoubleweek = isdoubleweek;
	}
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public BlankTable(String id, String schoolid, String taskid, String isdoubleweek, String weekday, String period,
			String section) {
		super();
		this.id = id;
		this.schoolid = schoolid;
		this.taskid = taskid;
		this.isdoubleweek = isdoubleweek;
		this.weekday = weekday;
		this.period = period;
		this.section = section;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isdoubleweek == null) ? 0 : isdoubleweek.hashCode());
		result = prime * result + ((period == null) ? 0 : period.hashCode());
		result = prime * result + ((schoolid == null) ? 0 : schoolid.hashCode());
		result = prime * result + ((section == null) ? 0 : section.hashCode());
		result = prime * result + ((taskid == null) ? 0 : taskid.hashCode());
		result = prime * result + ((weekday == null) ? 0 : weekday.hashCode());
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
		BlankTable other = (BlankTable) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isdoubleweek == null) {
			if (other.isdoubleweek != null)
				return false;
		} else if (!isdoubleweek.equals(other.isdoubleweek))
			return false;
		if (period == null) {
			if (other.period != null)
				return false;
		} else if (!period.equals(other.period))
			return false;
		if (schoolid == null) {
			if (other.schoolid != null)
				return false;
		} else if (!schoolid.equals(other.schoolid))
			return false;
		if (section == null) {
			if (other.section != null)
				return false;
		} else if (!section.equals(other.section))
			return false;
		if (taskid == null) {
			if (other.taskid != null)
				return false;
		} else if (!taskid.equals(other.taskid))
			return false;
		if (weekday == null) {
			if (other.weekday != null)
				return false;
		} else if (!weekday.equals(other.weekday))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BlankTable [id=" + id + ", schoolid=" + schoolid + ", taskid=" + taskid + ", isdoubleweek="
				+ isdoubleweek + ", weekday=" + weekday + ", period=" + period + ", section=" + section + "]";
	}
	
}
