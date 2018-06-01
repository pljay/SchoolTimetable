package cn.wizool.schooltimetable.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.wizool.schooltimetable.bean.CommonPlanResult;

/**
 * 普通课表V2,类编码1000
 * 
 * @author zl
 *
 */
public class CommonTable {

	/**
	 * 用于暂存错误信息
	 */
	private String msg = new String();
	/**
	 * 本次排课任务
	 */
	private PlanTask planTask;

	/**
	 * 课程教师关系
	 */
	// private List<ClassTeacher> classTeacherList;
	private ClassTeacher[] classTeacher;


	/**
	 * 课程教师关系List，用于计算。
	 */
	// private List<ClassTeacher> classTeacherList;
	private List<ClassTeacher> classTeacherList;
	
	/**
	 * 课程教室关系
	 */
	// private List<ClassAndRoom> classAndRoomList;
	private ClassAndRoom[] classAndRoom;

	/**
	 * 课时明细
	 */
	private TimeSet[] timeSet;
	// private List<TimeSet> timeSetList;

	/**
	 * 课时设置
	 */
	private LessonSet lessonSet=new LessonSet();
	/**
	 * 科目信息，含优先级排序
	 */
	private Subject[] subject;
	/**
	 * 存储科目及优先级顺序，便于使用。
	 */
	private Map<String,Integer> subPriority=new HashMap();

	/**
	 * 教师信息，含优先级排序
	 */
	private Teacher[] teacher;

	/**
	 * 合班上课设置信息
	 */
	private JointClass[] jointClass;
	/**
	 * 合班上课设置快查Map，首层key：科目ID，二层key班级ID，二层value：合班明细
	 */
	private HashMap<String,HashMap<String,JointClass>> jointClassMap;
	
	/**
	 * 通用设置，此类不用校验。
	 */
	private CommonSettings commonSettings=null;

	/**
	 * 排课时间规则-统一设置数据
	 */
	private TimetableBan[] timetableBan;
	
	/**
	 * 排课时间规则-按科目设置数据
	 */
	private SubjectSettings[] subjectSettings;
	
	/**
	 * 排课时间规则-按教师设置数据
	 */
	private TeacherSettings[] teacherSettings;
	
	/**
	 * 排课时间规则-按班级设置数据
	 */
	private ClassSettings[] classSettings;
	
	/**
	 * 排课时间规则-按课程设置数据
	 */
	private CourseSettings[] courseSettings;
	
	/**
	 * 课表单元格数组，第一维为日期，如单周周1至双周周日，第二维为节次
	 */
//	private ClassTableCell[][] classTableCell;
	/**
	 * 单周待排课明细
	 */
	List<CommonClass> classListS=new ArrayList<CommonClass>();
	/**
	 * 双周待排课明细
	 */
	List<CommonClass> classListD=new ArrayList<CommonClass>();
	
	/**
	 * 排课结果		 
	 */
	private CommonPlanResult cpr =new CommonPlanResult();
	/**
	 * 初始化
	 * @param p_planTask
	 * @param p_classNumber
	 * @param p_subject
	 * @param p_classTeacher
	 * @param p_jointClass
	 * @param p_commonSettings
	 * @param p_timetableBan
	 * @param p_subjectSettings
	 * @param p_teacherSettings
	 * @param p_classSettings
	 * @param p_courseSettings
	 * @return
	 */
	public int tableInit(PlanTask p_planTask,TimeSet[] p_timeSet,Teacher[] p_teacher,ClassAndRoom[] p_classAndRoom,
			LessonSet p_lessonSet,Subject[] p_subject, ClassTeacher[] p_classTeacher,
			JointClass[] p_jointClass,CommonSettings p_commonSettings,
			TimetableBan[] p_timetableBan,SubjectSettings[] p_subjectSettings,
			TeacherSettings[] p_teacherSettings,ClassSettings[] p_classSettings,
			CourseSettings[] p_courseSettings) {
		int rvl = planTaskInit(p_planTask);
		if (rvl > 0) {
			return rvl;
		}
		rvl = classNumberInit(p_lessonSet);
		if (rvl > 0) {
			return rvl;
		}
		rvl = subjectInit(p_subject);
		if (rvl > 0) {
			return rvl;
		}
		rvl = classTeacherInit(p_classTeacher);
		if (rvl > 0) {
			return rvl;
		}
		rvl = jointClassInit(p_jointClass);
		if (rvl > 0) {
			return rvl;
		}
		this.commonSettings = p_commonSettings;
		rvl = timetableBanInit(p_timetableBan);
		if (rvl > 0) {
			return rvl;
		}
		
		rvl = teacherInit(p_teacher);
		if (rvl > 0) {
			return rvl;
		}
		
		rvl = teacherSettingsInit(p_teacherSettings);
		if (rvl > 0) {
			return rvl;
		}
		rvl = subjectSettingsInit(p_subjectSettings);
		if (rvl > 0) {
			return rvl;
		}
		rvl = classSettingsInit(p_classSettings);
		if (rvl > 0) {
			return rvl;
		}
		rvl = courseSettingsInit(p_courseSettings);
		if (rvl > 0) {
			return rvl;
		}
		rvl = timeSetInit(p_timeSet);
		if (rvl > 0) {
			return rvl;
		}
		rvl = classAndRoomInit(p_classAndRoom);
		if (rvl > 0) {
			return rvl;
		}
		return 0;
	}

	/**
	 * 排课规则初始化,专门用于规则校验
	 * 
	 * @return
	 */
	public int ruleInit(PlanTask p_planTask,TimeSet[] p_timeSet,ClassAndRoom[] p_classAndRoom,
			LessonSet p_lessonSet,Subject[] p_subject, ClassTeacher[] p_classTeacher,
			JointClass[] p_jointClass,CommonSettings p_commonSettings,
			TimetableBan[] p_timetableBan,SubjectSettings[] p_subjectSettings,
			TeacherSettings[] p_teacherSettings,ClassSettings[] p_classSettings,
			CourseSettings[] p_courseSettings) {
		int rvl = planTaskInit(p_planTask);
		if (rvl > 0) {
			return rvl;
		}
		rvl = classNumberInit(p_lessonSet);
		if (rvl > 0) {
			return rvl;
		}
		rvl = subjectInit(p_subject);
		if (rvl > 0) {
			return rvl;
		}
		rvl = classTeacherInit(p_classTeacher);
		if (rvl > 0) {
			return rvl;
		}
		rvl = jointClassInit(p_jointClass);
		if (rvl > 0) {
			return rvl;
		}
		this.commonSettings = p_commonSettings;
		rvl = timetableBanInit(p_timetableBan);
		if (rvl > 0) {
			return rvl;
		}
		rvl = teacherSettingsInit(p_teacherSettings);
		if (rvl > 0) {
			return rvl;
		}
		rvl = subjectSettingsInit(p_subjectSettings);
		if (rvl > 0) {
			return rvl;
		}
		rvl = classSettingsInit(p_classSettings);
		if (rvl > 0) {
			return rvl;
		}
		rvl = courseSettingsInit(p_courseSettings);
		if (rvl > 0) {
			return rvl;
		}
		rvl = timeSetInit(p_timeSet);
		if (rvl > 0) {
			return rvl;
		}
		rvl = classAndRoomInit(p_classAndRoom);
		if (rvl > 0) {
			return rvl;
		}
		return 0;
	}
	
	/**
	 * 初始化任务信息，方法编码01
	 * 
	 * @param p_planTask
	 * @return 有错返回错误码，无错返回0
	 */
	private int planTaskInit(PlanTask p_planTask) {
		try {
			this.planTask = p_planTask;
			if (planTask == null) {
				return 10000101;// 任务信息不合法
			}
			if (planTask.getTaskId() == null || planTask.getTaskId().equals("")) {
				return 10000102;// 任务ID不合法
			}
			if (planTask.getSchoolId() == null || planTask.getSchoolId().equals("")) {
				return 10000103;// 学校ID不合法
			}
			if (planTask.getClassType() != 1) {
				return 10000104;// 此运算只能处理普通排课任务
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 10000100;
		}
		return 0;
	}

	/**
	 * 初始化任务信息，方法编码12
	 * @param p_classNumber
	 * @return 有错返回错误码，无错返回0
	 */
	private int classNumberInit(LessonSet p_lessonSet) {
		try {
			this.lessonSet = p_lessonSet;
			if (lessonSet == null) {
				return 10001201;// 任务信息不合法
			}
			if (lessonSet.getTaskId() == null || lessonSet.getTaskId().equals("")) {
				return 10001202;// 任务ID不合法
			}
			if (lessonSet.getSchoolId() == null || lessonSet.getSchoolId().equals("")) {
				return 10001203;// 学校ID不合法
			}
//			//创建空白课表
//			if(classNumber.isDoubleWeek())//双周需创建双倍课表
//			{
//				classTableCell=new ClassTableCell[classNumber.getDayCount()*2][classNumber.getAM()+classNumber.getPM()+classNumber.getEvening()];
//			}
//			else
//			{
//				classTableCell=new ClassTableCell[classNumber.getDayCount()][classNumber.getAM()+classNumber.getPM()+classNumber.getEvening()];
//			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 10001200;
		}
		return 0;
	}
	
	/**
	 * 科目信息(含排序)初始化，方法编码03
	 * @param p_subject
	 * @return
	 */
	private int subjectInit(Subject[] p_subject) {
		try {
			subject = p_subject;
			if (subject == null || subject.length <= 0) {
				return 10000301;// 科目信息为空或无数据
			}
			for (int i = 0; i < subject.length; i++)// 检验数据有效性
			{
				Subject temp = subject[i];
				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
					return 10000302;// 科目信息与学校不符
				}
				if (temp.getTaskId() == null || temp.getTaskId().equals("")
						|| !temp.getTaskId().equals(planTask.getTaskId())) {
					return 10000303;// 科目信息与任务不符
				}
				if(temp.getSubject_code()==null || temp.getSubject_code().equals("")  )
				{
					return 10000304;// 科目编码无效
				}				
				//将科目ID及其优先级数据填入Map，便于排课时调用。
				subPriority.put(temp.getSubject_code(), temp.getPriority());
			}
			for (int i = 0; i < subject.length; i++)// 倒序排序
			{
				for (int j = 0; j < subject.length - 1; j++) {
					if (subject[j].getPriority() < subject[j + 1].getPriority()) {
						Subject temp = subject[j];
						subject[j] = subject[j + 1];
						subject[j + 1] = temp;
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			return 10000300;
		}
		return 0;
	}

	/**
	 * 教师信息(含优先级及排序)初始化，方法编码04
	 * 
	 * @param p_subject
	 * @return
	 */
	private int teacherInit(Teacher[] p_teacher) {
		try {
			teacher = p_teacher;
			if (teacher == null || teacher.length <= 0) {
				return 10000401;// 教师信息为空或无数据
			}
			for (int i = 0; i < teacher.length; i++)// 检验数据有效性
			{
				Teacher temp = teacher[i];
				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
					return 10000402;// 教师信息与学校不符
				}
				if (temp.getPriority() == null || temp.getPriority().getTaskId() == null
						|| !temp.getPriority().getTaskId().equals(planTask.getTaskId())) {
					return 10000403;// 教师优先级信息与任务不符
				}
			}
			for (int i = 0; i < teacher.length; i++)// 正序排序
			{
				for (int j = 0; j < teacher.length - 1; j++) {
					if (teacher[j].getPriority().getPriority() > teacher[j + 1].getPriority().getPriority()) {
						Teacher temp = teacher[j];
						teacher[j] = teacher[j + 1];
						teacher[j + 1] = temp;
					}
				}
			}

		} catch (Exception e) {
			System.out.println(e);
			return 10000400;
		}
		return 0;
	}

	/**
	 * 合班设置信息初始化，方法编码05
	 * 
	 * @param p_jointClass
	 * @return
	 */
	private int jointClassInit(JointClass[] p_jointClass) {
		try {
			jointClass = p_jointClass;
			if (jointClass == null || jointClass.length <= 0) {
				return 0;// 没有合班数据不是错
			}
			for (int i = 0; i < jointClass.length; i++)// 检验数据有效性
			{
				JointClass temp = jointClass[i];
				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
					return 10000501;// 合班信息与学校不符
				}
				if (temp.getTaskId() == null || temp.getTaskId().equals("")
						|| !temp.getTaskId().equals(planTask.getTaskId())) {
					return 10000502;// 合班信息与任务不符
				}
				if (temp.getJointClassId() == null || temp.getJointClassId().size() <= 0) {
					return 10000503;// 合班班级信息有误
				}
				if (temp.getJointTearcherId() == null || temp.getJointTearcherId().size() <= 0) {
					return 10000504;// 合班教师信息有误
				}
			}
			// 组装合班信息
			jointClassMap = new HashMap<String, HashMap<String, JointClass>>();
			for (int i = 0; jointClass != null && i < jointClass.length; i++) {// 逐个取出合班信息，封装为
				JointClass JCtemp = jointClass[i];
				String subId = JCtemp.getJointSubjectId();
				HashMap<String, JointClass> tempMap = jointClassMap.get(subId);
				if (tempMap == null)// 1级map中还没有该科目的数据,则初始化之
				{
					tempMap = new HashMap<String, JointClass>();
					jointClassMap.put(subId, tempMap);
				}
				for (int j = 0; JCtemp.getJointClassId() != null && j < JCtemp.getJointClassId().size(); j++) {
					// 检查该科目下，该班级的合班信息是否已加入map
					JointClass jc = tempMap.get(JCtemp.getJointClassId().get(j));
					if (jc == null)
					{// 如果没有,将当前班级的ID和合班信息作为K-V对放入map
						tempMap.put(JCtemp.getJointClassId().get(j), JCtemp);
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			return 10000500;
		}
		return 0;
	}

	/**
	 * 排课时间-统一设置信息初始化，编码06
	 * @param p_timetableBan
	 * @return
	 */
	private int timetableBanInit(TimetableBan[] p_timetableBan)
	{
		try {
			timetableBan = p_timetableBan;
			if (timetableBan == null || timetableBan.length <= 0) {
				return 0;// 没有设置数据不是错
			}
			for (int i = 0; i < timetableBan.length; i++)// 检验数据有效性
			{
				TimetableBan temp = timetableBan[i];
				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
					return 10000601;// 设置信息与学校不符
				}
				if (temp.getTaskId() == null || temp.getTaskId().equals("")
						|| !temp.getTaskId().equals(planTask.getTaskId())) {
					return 10000602;// 设置信息与任务不符
				}
				
			}
		} catch (Exception e) {
			System.out.println(e);
			return 10000600;
		}
		return 0;
	}
	
	/**
	 * 排课时间规则-按科目设置信息初始化，编码07
	 * @param p_subjectSettings
	 * @return
	 */
	private int subjectSettingsInit(SubjectSettings[] p_subjectSettings)
	{
		try {
			subjectSettings = p_subjectSettings;
			if (subjectSettings == null || subjectSettings.length <= 0) {
				return 0;// 没有设置数据不是错
			}
			for (int i = 0; i < subjectSettings.length; i++)// 检验数据有效性
			{
				SubjectSettings temp = subjectSettings[i];
				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
					return 10000701;// 设置信息与学校不符
				}
				if (temp.getTaskId() == null || temp.getTaskId().equals("")
						|| !temp.getTaskId().equals(planTask.getTaskId())) {
					return 10000702;// 设置信息与任务不符
				}
				
			}
		} catch (Exception e) {
			System.out.println(e);
			return 10000700;
		}
		return 0;
	}
	
	/**
	 * 排课时间规则-按教师设置信息初始化，编码08
	 * @param p_teacherSettings
	 * @return
	 */
	private int teacherSettingsInit(TeacherSettings[] p_teacherSettings)
	{								
		try {
			teacherSettings = p_teacherSettings;
			if (teacherSettings == null || teacherSettings.length <= 0) {
				return 0;// 没有设置数据不是错
			}
			for (int i = 0; i < teacherSettings.length; i++)// 检验数据有效性
			{
				TeacherSettings temp = teacherSettings[i];
				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
					return 10000801;// 设置信息与学校不符
				}
				if (temp.getTaskId() == null || temp.getTaskId().equals("")
						|| !temp.getTaskId().equals(planTask.getTaskId())) {
					return 10000802;// 设置信息与任务不符
				}
				
			}
		} catch (Exception e) {
			System.out.println(e);
			return 10000800;
		}
		return 0;
	}
	
	/**
	 * 排课时间规则-按班级设置信息初始化，编码09
	 * @param p_classSettings
	 * @return
	 */
	private int classSettingsInit(ClassSettings[] p_classSettings)
	{								
		try {
			classSettings = p_classSettings;
			if (classSettings == null || classSettings.length <= 0) {
				return 0;// 没有设置数据不是错
			}
			for (int i = 0; i < classSettings.length; i++)// 检验数据有效性
			{
				ClassSettings temp = classSettings[i];
				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
					return 10000901;// 设置信息与学校不符
				}
				if (temp.getTaskId() == null || temp.getTaskId().equals("")
						|| !temp.getTaskId().equals(planTask.getTaskId())) {
					return 10000902;// 设置信息与任务不符
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			return 10000900;
		}
		return 0;
	}
	
	/**
	 * 排课时间规则-按课程设置信息初始化，编码10
	 * @param p_classSettings
	 * @return
	 */
	private int courseSettingsInit(CourseSettings[] p_courseSettings) {
		try {
			courseSettings = p_courseSettings;
			if (courseSettings == null || courseSettings.length <= 0) {
				return 0;// 没有设置数据不是错
			}
			for (int i = 0; i < courseSettings.length; i++)// 检验数据有效性
			{
				CourseSettings temp = courseSettings[i];
				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
					return 10001001;// 设置信息与学校不符
				}
				if (temp.getTaskId() == null || temp.getTaskId().equals("")
						|| !temp.getTaskId().equals(planTask.getTaskId())) {
					return 10001002;// 设置信息与任务不符
				}
			}
			//检查有没有
			
		} catch (Exception e) {
			System.out.println(e);
			return 10001000;
		}
		return 0;
	}
	
	/**
	 * 空白课表节次设置信息初始化，编码13
	 * @param p_classSettings
	 * @return
	 */
	private int timeSetInit(TimeSet[] p_timeSet) {
		try {
			timeSet = p_timeSet;
			if (timeSet == null || timeSet.length <= 0) {
				return 0;// 没有设置数据不是错
			}
			for (int i = 0; i < timeSet.length; i++)// 检验数据有效性
			{
				TimeSet temp = timeSet[i];
				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
					return 10001301;// 设置信息与学校不符
				}
				if (temp.getTaskId() == null || temp.getTaskId().equals("")
						|| !temp.getTaskId().equals(planTask.getTaskId())) {
					return 10001302;// 设置信息与任务不符
				}
				if(temp.getWeekDay()>7 ||temp.getWeekDay()<1 )
				{
					return 10001303;// 日期数据不合法。	
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			return 10001300;
		}
		return 0;
	}
	
	/**
	 * 教室绑定设置信息初始化，编码14
	 * @param p_classSettings
	 * @return
	 */
	private int classAndRoomInit(ClassAndRoom[] p_classAndRoom) {
		try {
			classAndRoom = p_classAndRoom;
			if (classAndRoom == null || classAndRoom.length <= 0) {
				return 0;// 没有设置数据不是错
			}
			for (int i = 0; i < classAndRoom.length; i++)// 检验数据有效性
			{
				ClassAndRoom temp = classAndRoom[i];
				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
					return 10001401;// 设置信息与学校不符
				}
				if (temp.getTaskId() == null || temp.getTaskId().equals("")
						|| !temp.getTaskId().equals(planTask.getTaskId())) {
					return 10001402;// 设置信息与任务不符
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			return 10001400;
		}
		return 0;
	}
	
	/**
	 * 排课规则校验，要求必须初始化所有规则数据,不检查教师任课数据有效性。
	 * @return
	 */
	public int ruleCheck()
	{
		try
		{
			//检查数据有效性，完成计算后再做。
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 10001100;
		}

		return 0;
	}
	
	
	/**
	 * 教师任课信息初始化，方法编码02
	 * @param p_ClassTeacher
	 * @return
	 */
	public int classTeacherInit(ClassTeacher[] p_ClassTeacher) {
		try {
			classTeacher = p_ClassTeacher;
			if (classTeacher == null || classTeacher.length <= 0) {
				return 10000201;// 教师任课信息为空或无数据
			}
			for (int i = 0; i < classTeacher.length; i++) {
				ClassTeacher temp = classTeacher[i];
				if (temp.getSchoolId() == null || !temp.getSchoolId().equals(planTask.getSchoolId())) {
					return 10000202;// 教师任课信息与学校不符
				}
				if (temp.getTaskId() == null || !temp.getTaskId().equals(planTask.getTaskId())) {
					return 10000203;// 教师任课信息与任务不符
				}
				if (temp.getClassType() != 1) {
					return 10000204;// 此运算只能处理普通排课任务
				}
			}
			this.classTeacherList=new ArrayList<ClassTeacher>();
//			for()

			// 检查总节次数是否≤课表节次数
			// 检查早自习节次数是否超限
			// 检查科目是否在科目排序中
			// 检查教师是否在教师排序中
			// 检查
		} catch (Exception e) {
			System.out.println(e);
			return 1000200;
		}
		return 0;
	}

	/**
	 * 课表运算,方法编码15
	 * @return
	 */
	public synchronized  CommonPlanResult plan()
	{
		//检查所有数据，下述操作默认为为数据已无问题。
		int error=0;
		try
		{
			//课表总天数
			int dayCount=lessonSet.getDayCount();
			//课表每天总课时数
			int classCount=lessonSet.getClassCount();
			//step1：创建空白课表
			cpr.classtable=new ClassTableCell[dayCount][classCount];	
			
			//step2：根据教师任课数据生成所有待安排课程集合，分单双周两个列表。
			//待安排课程内容为：年级、班级、科目、教师、教室、连堂数、单堂数、上课总节次数、动态生成的识别码等。
			error = createClassList();
			if( error >0)
			{
				cpr.errorCode=error;
				cpr.errorMainMsg="生成排课明细出错";
				return cpr;
			}			
			//将上述组装为可快速提取的集合(MAP)，如何组织，待定。
			
			//step3：根据合班上课规则生成合班课程集合。可按任意一个班级、科目信息查找对应的合班信息。
			//此步骤已迁移至合班信息初始化方法中实现。
			//步骤4：使用：排课时间——统一设置 的数据，在空白课表中逐个标记不可用节次，此为优先级最高，必须满足的规则
			for(int i=0;i<timetableBan.length;i++)
			{
				TimetableBan temp=timetableBan[i];
				int weekDay=temp.getWeekDay();
				int classNum=temp.getClassNum();
				if(weekDay>=0 && weekDay<dayCount && classNum>=0 && classNum<classCount)
				{
					ClassTableCell cell = cpr.classtable[temp.getWeekDay()][temp.getClassNum()];
					cell.canUsed=false;
				}				
			}
			//执行算法逻辑第5-11步。向空白课表中添加禁止排课信息。
			error = this.addBanCoursePlanList();
			if(error>0)
			{
				cpr.errorCode=error;
				cpr.errorMainMsg="处理禁止排课数据出错";
				return cpr;
			}
			error = this.addPriorityCoursePlanList();
			if(error>0)
			{
				cpr.errorCode=error;
				cpr.errorMainMsg="处理禁止排课数据出错";
				return cpr;
			}
			
			//第13步：根据排课时间规则——按课程设置，首先完成固定排课设置的安排，即找到所有已明确的课程固定排课时间，在空白课表中对应的单元格添加已安排的课程，
			
			
			//步骤1，优先按科目排课
			//步骤1.1 科目信息在初始化时已按优先级排序,逐个取出
			for(int i=0;i<this.subject.length;i++)
			{
				Subject subTemp=subject[i];
				//步骤1.2 取出带该科目的所有任课信息
				
				
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			cpr.errorCode=10001500;
			cpr.errorMainMsg="发生未知错误";
			cpr.errorMsg=e.getStackTrace();
		}		
		return cpr;
	}
	
	/**
	 * 将任课数据拆分成待排课列表，方法编码16
	 * 要求所需参数都已检验过
	 * @return
	 */
	private int createClassList()
	{
		try
		{
			if(classTeacherList==null || classTeacherList.size()<=0)
			{
				//"任课数据无效";
				return 10001601;
			}
			//待安排课程明细的虚拟ID
			int commonClassId=0;
			//逐条拆解任课信息，生成待排课明细
			for(int i=0 ;i<classTeacherList.size();i++)
			{
				//先生成单周
				ClassTeacher ctTemp=classTeacherList.get(i);
				CommonClass ccTemp=new CommonClass();
				ccTemp.recordId=ctTemp.getRecordId();
				ccTemp.classCount=ctTemp.getSingleClassTimes()+ctTemp.getDoubleClassTimes()*2;
				ccTemp.classId=ctTemp.getClassId();
				ccTemp.classType=ctTemp.getClassType();
				ccTemp.curriculumName=ctTemp.getCurriculumName();
				ccTemp.doubleClassTimes=ctTemp.getDoubleClassTimes();
				ccTemp.singleClassTimes=ctTemp.getSingleClassTimes();
				ccTemp.gradeID=ctTemp.getGradeID();
				ccTemp.morningSlef=ctTemp.getMorningSlef();
				ccTemp.nightSlef=ctTemp.getNightSlef();
				ccTemp.schoolId=ctTemp.getSchoolId();
				ccTemp.subjectId=ctTemp.getSubjectId();
				ccTemp.subjectName=ctTemp.getSubjectName();
				ccTemp.taskId=ctTemp.getTaskId();
				ccTemp.teachers=ctTemp.getTeachers();
				ccTemp.VirtualId=commonClassId++;
				ccTemp.Week=1;
				this.classListS.add(ccTemp);
				//后生成双周数据，若课时安排中设为不分单双周，则有双周设置也被抛弃。
				if(this.lessonSet.isDoubleWeek())
				{
					ccTemp=new CommonClass();
					ccTemp.recordId=ctTemp.getRecordId();
					ccTemp.classCount=ctTemp.getdSingleClassTimes()+ctTemp.getdDoubleClassTimes()*2;
					ccTemp.classId=ctTemp.getClassId();
					ccTemp.classType=ctTemp.getClassType();
					ccTemp.curriculumName=ctTemp.getCurriculumName();
					ccTemp.doubleClassTimes=ctTemp.getdDoubleClassTimes();
					ccTemp.singleClassTimes=ctTemp.getdSingleClassTimes();
					ccTemp.gradeID=ctTemp.getGradeID();
					ccTemp.morningSlef=ctTemp.getMorningSlef();
					ccTemp.nightSlef=ctTemp.getNightSlef();
					ccTemp.schoolId=ctTemp.getSchoolId();
					ccTemp.subjectId=ctTemp.getSubjectId();
					ccTemp.subjectName=ctTemp.getSubjectName();
					ccTemp.taskId=ctTemp.getTaskId();
					ccTemp.teachers=ctTemp.getTeachers();
					ccTemp.VirtualId=commonClassId++;
					ccTemp.Week=2;
					this.classListD.add(ccTemp);
				}
			}
			return 0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 10001600;
		}
	}
	
	/**
	 * 向空白课表中添加禁止排课数据，方法编码17
	 * 要求所需参数都已检验过
	 * @return
	 */
	private int addBanCoursePlanList()
	{
		try
		{			
			//步骤5：检查所有排课时间规则——按课程设置的规则项，检查内部否存在互斥或重叠，并检查是否与统一设置冲突。
			//此步暂不编码，可考虑移至 排课时间规则——按课程设置 初始化中完成，或单独写校验方法。
						
			//步骤6：根据排课时间规则——按课程设置，找到所有禁止排课的设置，在课表对应的单元格中添加禁止排课的课程
			// 同时向该课程的禁止排课节次中添加此单元格对应的节次（第二部分暂缓，是否有用需确认）
			for(int i=0;i<courseSettings.length;i++)//逐个落实按课程设置的规则。
			{
				//逐条取出按课程设置的规则
				CourseSettings ruletemp=courseSettings[i];
				if(ruletemp.type==1)//如果是禁止排课，向单元格加入标识
				{					
					//找到该设置对应的课表单元格
					ClassTableCell cellTemp = cpr.classtable[ruletemp.weekDay][ruletemp.classNum];
					//取得该课程的详细信息放入临时变量
					CommonCellPlan planTemp=new CommonCellPlan();
					planTemp.classId=ruletemp.classId;
					planTemp.weekDay=ruletemp.weekDay;
					planTemp.classNum = ruletemp.classNum;
					planTemp.curriculumName=ruletemp.curriculumName;
					planTemp.gradeID=ruletemp.gradeID;
					planTemp.subjectId=ruletemp.subjectId;
					planTemp.teachers=ruletemp.teachers;
					planTemp.courseId=ruletemp.courseId;
					planTemp.timeRuleType = TimeRuleType.forCourse;
					cellTemp.banCoursePlanList.add(planTemp);
				}
				//先处理完所有禁止设置，再处理固定。
			}
			//步骤7：按课程设置优先排课规则，已取消
			//步骤8：根据排课时间规则——按班级设置，找到所有禁止排课的设置，在课表对应的单元格中添加禁止排课的班级
			//同时向该班级的禁止排课节次中添加此单元格对应的节次（第二部分暂缓，是否有用需确认）
			for(int i=0;i<classSettings.length;i++)//逐个落实按班级设置的禁排规则。
			{
				//逐条取出按课程设置的规则
				ClassSettings ruletemp=classSettings[i];				
				if(ruletemp.type==1)//如果是禁止排课，向单元格加入标识
				{					
					//找到该设置对应的课表单元格
					ClassTableCell cellTemp = cpr.classtable[ruletemp.weekDay][ruletemp.classNum];
					//取得该课程的详细信息放入临时变量
					CommonCellPlan planTemp=new CommonCellPlan();
					planTemp.classId=ruletemp.classId;
					planTemp.weekDay=ruletemp.weekDay;
					planTemp.classNum = ruletemp.classNum;
//					planTemp.curriculumName=Coursetemp.curriculumName;
//					planTemp.gradeID=Coursetemp.gradeID;
//					planTemp.subjectId=Coursetemp.subjectId;
//					planTemp.teachers=Coursetemp.teachers;
//					planTemp.courseId=Coursetemp.courseId;
					planTemp.timeRuleType = TimeRuleType.forClass;
					cellTemp.banCoursePlanList.add(planTemp);
				}
				//先处理完所有禁止设置，再处理固定。
			}
			
			//步骤9：根据排课时间规则——按教师设置，找到所有禁止排课的设置，在课表对应的单元格中添加禁止排课的班级
			//同时向该班级的禁止排课节次中添加此单元格对应的节次（第二部分暂缓，是否有用需确认）
			for(int i=0;i<teacherSettings.length;i++)//逐个落实按教师设置的禁排规则。
			{
				//逐条取出规则
				TeacherSettings ruletemp=teacherSettings[i];				
				if(ruletemp.type==1)//如果是禁止排课，向单元格加入标识
				{					
					//找到该设置对应的课表单元格
					ClassTableCell cellTemp = cpr.classtable[ruletemp.weekDay][ruletemp.classNum];
					//取得该课程的详细信息放入临时变量
					CommonCellPlan planTemp=new CommonCellPlan();
//					planTemp.classId=ruletemp.classId;
					planTemp.weekDay=ruletemp.weekDay;
					planTemp.classNum = ruletemp.classNum;
//					planTemp.curriculumName=Coursetemp.curriculumName;
//					planTemp.gradeID=Coursetemp.gradeID;
//					planTemp.subjectId=Coursetemp.subjectId;
					if(planTemp.teachers==null)
					{
						planTemp.teachers=new ArrayList<String>();
					}
					planTemp.teachers.add(ruletemp.teacherId);
//					planTemp.courseId=Coursetemp.courseId;
					planTemp.timeRuleType = TimeRuleType.forTeacher;
					cellTemp.banCoursePlanList.add(planTemp);
				}
			}
			//步骤10：处理教师优先排课，此设置已取消
			
			//步骤11：根据排课时间规则——按科目设置，找到所有禁止排课的设置，在课表对应的单元格中添加禁止排课的班级
			//同时向该班级的禁止排课节次中添加此单元格对应的节次（第二部分暂缓，是否有用需确认）
			for(int i=0;i<subjectSettings.length;i++)//逐个落实按教师设置的禁排规则。
			{
				//逐条取出规则
				SubjectSettings ruletemp=subjectSettings[i];				
				if(ruletemp.type==1)//如果是禁止排课，向单元格加入标识
				{					
					//找到该设置对应的课表单元格
					ClassTableCell cellTemp = cpr.classtable[ruletemp.weekDay][ruletemp.classNum];
					//取得该课程的详细信息放入临时变量
					CommonCellPlan planTemp=new CommonCellPlan();
//					planTemp.classId=ruletemp.classId;
					planTemp.weekDay=ruletemp.weekDay;
					planTemp.classNum = ruletemp.classNum;
//					planTemp.curriculumName=ruletemp.curriculumName;
//					planTemp.gradeID=ruletemp.gradeID;
					planTemp.subjectId=ruletemp.subjectId;
//					planTemp.courseId=ruletemp.courseId;
					planTemp.timeRuleType = TimeRuleType.forSubject;
					cellTemp.banCoursePlanList.add(planTemp);
				}
			}
			return 0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 10001700;
		}
	}
	/**
	 * 向空白课表中添加优先排课数据，目前仅按科目设置可设置优先。方法编码18
	 * 要求所需参数都已检验过
	 * @return
	 */
	private int addPriorityCoursePlanList()
	{
		try
		{	
			//步骤12：根据排课时间规则——按科目设置，找到所有优先排课的设置，在课表对应的单元格中添加优先排课的课程
			// 同时向该课程的优先排课节次中添加此单元格对应的节次（第二部分暂缓，是否有用需确认）
			for(int i=0;i<subjectSettings.length;i++)//逐个落实按科目设置的禁排规则。
			{
				//逐条取出规则
				SubjectSettings ruletemp=subjectSettings[i];				
				if(ruletemp.type==3)//如果是优先排课，向单元格加入标识
				{					
					//找到该设置对应的课表单元格
					ClassTableCell cellTemp = cpr.classtable[ruletemp.weekDay][ruletemp.classNum];
					//取得该课程的详细信息放入临时变量
					CommonCellPlan planTemp=new CommonCellPlan();
//					planTemp.classId=ruletemp.classId;
					planTemp.weekDay=ruletemp.weekDay;
					planTemp.classNum = ruletemp.classNum;
//					planTemp.curriculumName=ruletemp.curriculumName;
//					planTemp.gradeID=ruletemp.gradeID;
					planTemp.subjectId=ruletemp.subjectId;
//					planTemp.courseId=ruletemp.courseId;
					planTemp.timeRuleType = TimeRuleType.forSubject;
					cellTemp.priorityCoursePlanList.add(planTemp);
				}
			}
			return 0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 10001800;
		}
	}
	/**
	 * 向空白课表中添加固定排课数据，目前仅按课程可设置固定上课时间。方法编码19
	 * 要求所需参数都已检验过
	 * @return
	 */
	private int addFixedCoursePlanList()
	{
		try
		{	
			//第13步：根据排课时间规则——按课程设置，首先完成固定排课设置的安排，即找到所有已明确的课程固定排课时间，在空白课表中对应的单元格添加已安排的课程
			for(int i=0;i<courseSettings.length;i++)//逐个落实按课程设置的规则。
			{
				//逐条取出按课程设置的规则
				CourseSettings ruletemp=courseSettings[i];
				if(ruletemp.type==2)//如果是禁止排课，向单元格加入标识
				{					
					//找到该设置对应的课表单元格
					ClassTableCell cellTemp = cpr.classtable[ruletemp.weekDay][ruletemp.classNum];
					//取得该课程的详细信息放入临时变量
					CommonCellPlan planTemp=new CommonCellPlan();
					planTemp.classId=ruletemp.classId;
					planTemp.weekDay=ruletemp.weekDay;
					planTemp.classNum = ruletemp.classNum;
					planTemp.curriculumName=ruletemp.curriculumName;
					planTemp.gradeID=ruletemp.gradeID;
					planTemp.subjectId=ruletemp.subjectId;
					planTemp.teachers=ruletemp.teachers;
					planTemp.courseId=ruletemp.courseId;
					planTemp.timeRuleType = TimeRuleType.forCourse;
					cellTemp.banCoursePlanList.add(planTemp);
				}
				//先处理完所有禁止设置，再处理固定。
			}
			return 0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 10001800;
		}
	}
}
