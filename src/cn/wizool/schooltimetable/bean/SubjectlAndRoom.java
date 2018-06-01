package cn.wizool.schooltimetable.bean;
/**
 * 科目专用教室设置
 * @author zl
 *
 */
public class SubjectlAndRoom {
	/**
	 * 记录ID
	 */
	private String recordID="";
	
	/**
	 * 科目ID
	 */
	private String subjectID="";
	/**
	 * 科目名称
	 */
	private String subjectName="";
	/**
	 * 教室ID
	 */
	private String roomID="";
	/**
	 * 教室名称
	 */
	private String roomName="";	
	/**
	 * 同时最大开班数
	 */
	private int maxClass=0; 
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
	public String getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getMaxClass() {
		return maxClass;
	}
	public void setMaxClass(int maxClass) {
		this.maxClass = maxClass;
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
	public SubjectlAndRoom(String recordID, String subjectID, String subjectName, String roomID, String roomName,
			int maxClass, String taskId, String schoolId) {
		super();
		this.recordID = recordID;
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.roomID = roomID;
		this.roomName = roomName;
		this.maxClass = maxClass;
		this.taskId = taskId;
		this.schoolId = schoolId;
	}
	@Override
	public String toString() {
		return "SubjectlAndRoom [recordID=" + recordID + ", subjectID=" + subjectID + ", subjectName=" + subjectName
				+ ", roomID=" + roomID + ", roomName=" + roomName + ", maxClass=" + maxClass + ", taskId=" + taskId
				+ ", schoolId=" + schoolId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxClass;
		result = prime * result + ((recordID == null) ? 0 : recordID.hashCode());
		result = prime * result + ((roomID == null) ? 0 : roomID.hashCode());
		result = prime * result + ((roomName == null) ? 0 : roomName.hashCode());
		result = prime * result + ((schoolId == null) ? 0 : schoolId.hashCode());
		result = prime * result + ((subjectID == null) ? 0 : subjectID.hashCode());
		result = prime * result + ((subjectName == null) ? 0 : subjectName.hashCode());
		result = prime * result + ((taskId == null) ? 0 : taskId.hashCode());
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
		SubjectlAndRoom other = (SubjectlAndRoom) obj;
		if (maxClass != other.maxClass)
			return false;
		if (recordID == null) {
			if (other.recordID != null)
				return false;
		} else if (!recordID.equals(other.recordID))
			return false;
		if (roomID == null) {
			if (other.roomID != null)
				return false;
		} else if (!roomID.equals(other.roomID))
			return false;
		if (roomName == null) {
			if (other.roomName != null)
				return false;
		} else if (!roomName.equals(other.roomName))
			return false;
		if (schoolId == null) {
			if (other.schoolId != null)
				return false;
		} else if (!schoolId.equals(other.schoolId))
			return false;
		if (subjectID == null) {
			if (other.subjectID != null)
				return false;
		} else if (!subjectID.equals(other.subjectID))
			return false;
		if (subjectName == null) {
			if (other.subjectName != null)
				return false;
		} else if (!subjectName.equals(other.subjectName))
			return false;
		if (taskId == null) {
			if (other.taskId != null)
				return false;
		} else if (!taskId.equals(other.taskId))
			return false;
		return true;
	}
	
}
