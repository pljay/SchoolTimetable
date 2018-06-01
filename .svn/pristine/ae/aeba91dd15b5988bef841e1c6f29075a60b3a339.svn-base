package cn.wizool.schooltimetable.bean;
/**
 * 创建任务
 * @author PLJay
 *
 */
public class CreateTask {

	/**
	 * 任务id
	 * 自动编码(顺序号)，用户不可见；
	 */
	private String id;
	/**
	 * 任务名称
	 * 100字符
	 */
	private String name;
	/**
	 * 是否区分单双周
	 * 是/否，默认否
	 */
	private String isdoubleweek;
	/**
	 * 学校id
	 * 自动填写，用户不可见
	 */
	private String schoolid;
	/**
	 * 创建时间
	 * 自动填写，列表中倒序排列
	 */
	private String createtime;
	/**
	 * 类型
	 * 普通排课，自动填写
	 */
	private String type;
	/**
	 * 创建人
	 * 当前用户，自动填写
	 */
	private String creator;
	/**
	 * 状态
	 * 已排/未排
	 */
	private String state;
	/**
	 * 类型
	 * 存码
	 */
	private String type_code;
	/**
	 * 注1：原则上一个学校同一学期的课程在一个任务中排课。
	 * 注2：同一学校可创建多个任务，对应不同的学年、学期或年级等。但同一学期有多个任务时，各任务中的教师、班级、教室不能有交叉，
	 * 应尽量归入1个任务，否则排课结果大概率出现冲突情况。特殊情况必须交叉的，则应先排一个，然后在第二个任务中，将前一任务排课结果的交叉部分设为禁止排课。
	 * 例：两个任务为同一学期的排课，均存在教师张三。则第二个任务需将张三上课的时间设为此教师任课课程的禁止排课时间。
	 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsdoubleweek() {
		return isdoubleweek;
	}
	public void setIsdoubleweek(String isdoubleweek) {
		this.isdoubleweek = isdoubleweek;
	}
	public String getSchoolid() {
		return schoolid;
	}
	public void setSchoolid(String schoolid) {
		this.schoolid = schoolid;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType_code() {
		return type_code;
	}
	public void setType_code(String type_code) {
		this.type_code = type_code;
	}
	public CreateTask(String id, String name, String isdoubleweek, String schoolid, String createtime, String type,
			String creator, String state, String type_code) {
		super();
		this.id = id;
		this.name = name;
		this.isdoubleweek = isdoubleweek;
		this.schoolid = schoolid;
		this.createtime = createtime;
		this.type = type;
		this.creator = creator;
		this.state = state;
		this.type_code = type_code;
	}
	@Override
	public String toString() {
		return "CreateTask [id=" + id + ", name=" + name + ", isdoubleweek=" + isdoubleweek + ", schoolid=" + schoolid
				+ ", createtime=" + createtime + ", type=" + type + ", creator=" + creator + ", state=" + state
				+ ", type_code=" + type_code + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createtime == null) ? 0 : createtime.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isdoubleweek == null) ? 0 : isdoubleweek.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schoolid == null) ? 0 : schoolid.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((type_code == null) ? 0 : type_code.hashCode());
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
		CreateTask other = (CreateTask) obj;
		if (createtime == null) {
			if (other.createtime != null)
				return false;
		} else if (!createtime.equals(other.createtime))
			return false;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolid == null) {
			if (other.schoolid != null)
				return false;
		} else if (!schoolid.equals(other.schoolid))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (type_code == null) {
			if (other.type_code != null)
				return false;
		} else if (!type_code.equals(other.type_code))
			return false;
		return true;
	}
	
	
}
