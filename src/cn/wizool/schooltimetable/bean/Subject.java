package cn.wizool.schooltimetable.bean;

/**
 * 科目管理
 * 
 * @author PLJay
 *
 */
public class Subject {

	/**
	 * 科目id 系统分配，用户不可见
	 */
	private String id;
	/**
	 * 学校id 自动填充，用户不可见
	 * 
	 */
	private String schoolId;
	/**
	 * 科目名称 唯一，不可重复
	 */
	private String name;
	/**
	 * 科目编号
	 */
	private String subject_code;
	/**
	 * 是否必修 必/选。默认必
	 */
	private String iscompulsory;
	/**
	 * 是否主课 主/副。(必修也分主副)，默认主
	 */
	private String ismainclass;
	/**
	 * 是否可用 必选择可用状态，不可用的科目在系统选择时不可见。默认可用。
	 */
	private String isavailable;
	/**
	 * 状态 正常/禁用。禁用的在其他业务模块中不可见。默认正常
	 */
	private String state;
	/**
	 * 删除标志 此模块为逻辑删除。默认N，删除后为Y。删除后不可见。
	 */
	private String flag;

	/**
	 * 优先级 优先级分5级高、较高、中、较低、低，编码为5-1，越大越高。可不设。默认优先级为中，值为3。
	 * 此属性是科目优先级设定的从数据，不是科目自身属性，为方便使用合并至此。
	 */
	private int priority;

	/**
	 * 任务ID
	 */
	private String taskId="";
	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject_code() {
		return subject_code;
	}

	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}

	public String getIscompulsory() {
		return iscompulsory;
	}

	public void setIscompulsory(String iscompulsory) {
		this.iscompulsory = iscompulsory;
	}

	public String getIsmainclass() {
		return ismainclass;
	}

	public void setIsmainclass(String ismainclass) {
		this.ismainclass = ismainclass;
	}

	public String getIsavailable() {
		return isavailable;
	}

	public void setIsavailable(String isavailable) {
		this.isavailable = isavailable;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Subject(String id, String schoolid, String name, String subject_code, String iscompulsory,
			String ismainclass, String isavailable, String state, String flag) {
		super();
		this.id = id;
		this.schoolId = schoolid;
		this.name = name;
		this.subject_code = subject_code;
		this.iscompulsory = iscompulsory;
		this.ismainclass = ismainclass;
		this.isavailable = isavailable;
		this.state = state;
		this.flag = flag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flag == null) ? 0 : flag.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isavailable == null) ? 0 : isavailable.hashCode());
		result = prime * result + ((iscompulsory == null) ? 0 : iscompulsory.hashCode());
		result = prime * result + ((ismainclass == null) ? 0 : ismainclass.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schoolId == null) ? 0 : schoolId.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((subject_code == null) ? 0 : subject_code.hashCode());
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
		Subject other = (Subject) obj;
		if (flag == null) {
			if (other.flag != null)
				return false;
		} else if (!flag.equals(other.flag))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isavailable == null) {
			if (other.isavailable != null)
				return false;
		} else if (!isavailable.equals(other.isavailable))
			return false;
		if (iscompulsory == null) {
			if (other.iscompulsory != null)
				return false;
		} else if (!iscompulsory.equals(other.iscompulsory))
			return false;
		if (ismainclass == null) {
			if (other.ismainclass != null)
				return false;
		} else if (!ismainclass.equals(other.ismainclass))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolId == null) {
			if (other.schoolId != null)
				return false;
		} else if (!schoolId.equals(other.schoolId))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (subject_code == null) {
			if (other.subject_code != null)
				return false;
		} else if (!subject_code.equals(other.subject_code))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", schoolId=" + schoolId + ", name=" + name + ", subject_code=" + subject_code
				+ ", iscompulsory=" + iscompulsory + ", ismainclass=" + ismainclass + ", isavailable=" + isavailable
				+ ", state=" + state + ", flag=" + flag + "]";
	}

}
