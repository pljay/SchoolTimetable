package cn.wizool.schooltimetable.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.wizool.schooltimetable.bean.CommonPlanResult;

/**
 * 普通课表,类编码1000
 * 由于前期逻辑分析不准确，代码不合理，此版本需进行大幅改动，特此备份。
 * 2018-05-22备份
 * @author zl
 *
 */
public class CommonTableV1 {

//	/**
//	 * 用于暂存错误信息
//	 */
//	private String msg = new String();
//	/**
//	 * 本次排课任务
//	 */
//	private PlanTask planTask;
//
//	/**
//	 * 课程教师关系
//	 */
//	// private List<ClassTeacher> classTeacherList;
//	private ClassTeacher[] classTeacher;
//
//
//	/**
//	 * 课程教师关系List，用于计算。
//	 */
//	// private List<ClassTeacher> classTeacherList;
//	private List<ClassTeacher> classTeacherList;
//	
//	/**
//	 * 课程教室关系
//	 */
//	// private List<ClassAndRoom> classAndRoomList;
//	private ClassAndRoom[] classAndRoom;
//
//	/**
//	 * 课时明细
//	 */
//	private TimeSet[] timeSet;
//	// private List<TimeSet> timeSetList;
//
//	/**
//	 * 课时设置
//	 */
//	private LessonSet classNumber=new LessonSet();
//	/**
//	 * 科目信息，含优先级排序
//	 */
//	private Subject[] subject;
//	/**
//	 * 存储科目及优先级顺序，便于使用。
//	 */
//	private Map<String,Integer> subPriority=new HashMap();
//
//	/**
//	 * 教师信息，含优先级排序
//	 */
//	private Teacher[] teacher;
//
//	/**
//	 * 合班上课设置信息
//	 */
//	private JointClass[] jointClass;
//	
//	/**
//	 * 通用设置，此类不用校验。
//	 */
//	private CommonSettings commonSettings=null;
//
//	/**
//	 * 排课时间规则-统一设置数据
//	 */
//	private TimetableBan[] timetableBan;
//	
//	/**
//	 * 排课时间规则-按科目设置数据
//	 */
//	private SubjectSettings[] subjectSettings;
//	
//	/**
//	 * 排课时间规则-按教师设置数据
//	 */
//	private TeacherSettings[] teacherSettings;
//	
//	/**
//	 * 排课时间规则-按班级设置数据
//	 */
//	private ClassSettings[] classSettings;
//	
//	/**
//	 * 排课时间规则-按课程设置数据
//	 */
//	private CourseSettings[] courseSettings;
//	
//	/**
//	 * 课表单元格数组，第一维为日期，如单周周1至双周周日，第二维为节次
//	 */
////	private ClassTableCell[][] classTableCell;
//	
//	/**
//	 * 排课结果		 
//	 */
//	private CommonPlanResult cpr =new CommonPlanResult();
//	/**
//	 * 初始化
//	 * @param p_planTask
//	 * @param p_classNumber
//	 * @param p_subject
//	 * @param p_classTeacher
//	 * @param p_jointClass
//	 * @param p_commonSettings
//	 * @param p_timetableBan
//	 * @param p_subjectSettings
//	 * @param p_teacherSettings
//	 * @param p_classSettings
//	 * @param p_courseSettings
//	 * @return
//	 */
//	public int tableInit(PlanTask p_planTask,TimeSet[] p_timeSet,Teacher[] p_teacher,ClassAndRoom[] p_classAndRoom,
//			LessonSet p_classNumber,Subject[] p_subject, ClassTeacher[] p_classTeacher,
//			JointClass[] p_jointClass,CommonSettings p_commonSettings,
//			TimetableBan[] p_timetableBan,SubjectSettings[] p_subjectSettings,
//			TeacherSettings[] p_teacherSettings,ClassSettings[] p_classSettings,
//			CourseSettings[] p_courseSettings) {
//		int rvl = planTaskInit(p_planTask);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = classNumberInit(p_classNumber);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = subjectInit(p_subject);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = classTeacherInit(p_classTeacher);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = jointClassInit(p_jointClass);
//		if (rvl > 0) {
//			return rvl;
//		}
//		this.commonSettings = p_commonSettings;
//		rvl = timetableBanInit(p_timetableBan);
//		if (rvl > 0) {
//			return rvl;
//		}
//		
//		rvl = teacherInit(p_teacher);
//		if (rvl > 0) {
//			return rvl;
//		}
//		
//		rvl = teacherSettingsInit(p_teacherSettings);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = subjectSettingsInit(p_subjectSettings);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = classSettingsInit(p_classSettings);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = courseSettingsInit(p_courseSettings);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = timeSetInit(p_timeSet);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = classAndRoomInit(p_classAndRoom);
//		if (rvl > 0) {
//			return rvl;
//		}
//		return 0;
//	}
//
//	/**
//	 * 排课规则初始化,专门用于规则校验
//	 * 
//	 * @return
//	 */
//	public int ruleInit(PlanTask p_planTask,TimeSet[] p_timeSet,ClassAndRoom[] p_classAndRoom,
//			LessonSet p_classNumber,Subject[] p_subject, ClassTeacher[] p_classTeacher,
//			JointClass[] p_jointClass,CommonSettings p_commonSettings,
//			TimetableBan[] p_timetableBan,SubjectSettings[] p_subjectSettings,
//			TeacherSettings[] p_teacherSettings,ClassSettings[] p_classSettings,
//			CourseSettings[] p_courseSettings) {
//		int rvl = planTaskInit(p_planTask);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = classNumberInit(p_classNumber);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = subjectInit(p_subject);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = classTeacherInit(p_classTeacher);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = jointClassInit(p_jointClass);
//		if (rvl > 0) {
//			return rvl;
//		}
//		this.commonSettings = p_commonSettings;
//		rvl = timetableBanInit(p_timetableBan);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = teacherSettingsInit(p_teacherSettings);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = subjectSettingsInit(p_subjectSettings);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = classSettingsInit(p_classSettings);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = courseSettingsInit(p_courseSettings);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = timeSetInit(p_timeSet);
//		if (rvl > 0) {
//			return rvl;
//		}
//		rvl = classAndRoomInit(p_classAndRoom);
//		if (rvl > 0) {
//			return rvl;
//		}
//		return 0;
//	}
//	
//	/**
//	 * 初始化任务信息，方法编码01
//	 * 
//	 * @param p_planTask
//	 * @return 有错返回错误码，无错返回0
//	 */
//	private int planTaskInit(PlanTask p_planTask) {
//		try {
//			this.planTask = p_planTask;
//			if (planTask == null) {
//				return 10000101;// 任务信息不合法
//			}
//			if (planTask.getTaskId() == null || planTask.getTaskId().equals("")) {
//				return 10000102;// 任务ID不合法
//			}
//			if (planTask.getSchoolId() == null || planTask.getSchoolId().equals("")) {
//				return 10000103;// 学校ID不合法
//			}
//			if (planTask.getClassType() != 1) {
//				return 10000104;// 此运算只能处理普通排课任务
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			return 10000100;
//		}
//		return 0;
//	}
//
//	/**
//	 * 初始化任务信息，方法编码12
//	 * @param p_classNumber
//	 * @return 有错返回错误码，无错返回0
//	 */
//	private int classNumberInit(LessonSet p_classNumber) {
//		try {
//			this.classNumber = p_classNumber;
//			if (classNumber == null) {
//				return 10001201;// 任务信息不合法
//			}
//			if (classNumber.getTaskId() == null || classNumber.getTaskId().equals("")) {
//				return 10001202;// 任务ID不合法
//			}
//			if (classNumber.getSchoolId() == null || classNumber.getSchoolId().equals("")) {
//				return 10001203;// 学校ID不合法
//			}
////			//创建空白课表
////			if(classNumber.isDoubleWeek())//双周需创建双倍课表
////			{
////				classTableCell=new ClassTableCell[classNumber.getDayCount()*2][classNumber.getAM()+classNumber.getPM()+classNumber.getEvening()];
////			}
////			else
////			{
////				classTableCell=new ClassTableCell[classNumber.getDayCount()][classNumber.getAM()+classNumber.getPM()+classNumber.getEvening()];
////			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			return 10001200;
//		}
//		return 0;
//	}
//	
//	/**
//	 * 科目信息(含排序)初始化，方法编码03
//	 * @param p_subject
//	 * @return
//	 */
//	private int subjectInit(Subject[] p_subject) {
//		try {
//			subject = p_subject;
//			if (subject == null || subject.length <= 0) {
//				return 10000301;// 科目信息为空或无数据
//			}
//			for (int i = 0; i < subject.length; i++)// 检验数据有效性
//			{
//				Subject temp = subject[i];
//				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
//						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
//					return 10000302;// 科目信息与学校不符
//				}
//				if (temp.getTaskId() == null || temp.getTaskId().equals("")
//						|| !temp.getTaskId().equals(planTask.getTaskId())) {
//					return 10000303;// 科目信息与任务不符
//				}
//				if(temp.getSubject_code()==null || temp.getSubject_code().equals("")  )
//				{
//					return 10000304;// 科目编码无效
//				}				
//				//将科目ID及其优先级数据填入Map，便于排课时调用。
//				subPriority.put(temp.getSubject_code(), temp.getPriority());
//			}
//			for (int i = 0; i < subject.length; i++)// 倒序排序
//			{
//				for (int j = 0; j < subject.length - 1; j++) {
//					if (subject[j].getPriority() < subject[j + 1].getPriority()) {
//						Subject temp = subject[j];
//						subject[j] = subject[j + 1];
//						subject[j + 1] = temp;
//					}
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//			return 10000300;
//		}
//		return 0;
//	}
//
//	/**
//	 * 教师信息(含优先级及排序)初始化，方法编码04
//	 * 
//	 * @param p_subject
//	 * @return
//	 */
//	private int teacherInit(Teacher[] p_teacher) {
//		try {
//			teacher = p_teacher;
//			if (teacher == null || teacher.length <= 0) {
//				return 10000401;// 教师信息为空或无数据
//			}
//			for (int i = 0; i < teacher.length; i++)// 检验数据有效性
//			{
//				Teacher temp = teacher[i];
//				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
//						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
//					return 10000402;// 教师信息与学校不符
//				}
//				if (temp.getPriority() == null || temp.getPriority().getTaskId() == null
//						|| !temp.getPriority().getTaskId().equals(planTask.getTaskId())) {
//					return 10000403;// 教师优先级信息与任务不符
//				}
//			}
//			for (int i = 0; i < teacher.length; i++)// 正序排序
//			{
//				for (int j = 0; j < teacher.length - 1; j++) {
//					if (teacher[j].getPriority().getPriority() > teacher[j + 1].getPriority().getPriority()) {
//						Teacher temp = teacher[j];
//						teacher[j] = teacher[j + 1];
//						teacher[j + 1] = temp;
//					}
//				}
//			}
//
//		} catch (Exception e) {
//			System.out.println(e);
//			return 10000400;
//		}
//		return 0;
//	}
//
//	/**
//	 * 合班设置信息初始化，方法编码05
//	 * 
//	 * @param p_jointClass
//	 * @return
//	 */
//	private int jointClassInit(JointClass[] p_jointClass) {
//		try {
//			jointClass = p_jointClass;
//			if (jointClass == null || jointClass.length <= 0) {
//				return 0;// 没有合班数据不是错
//			}
//			for (int i = 0; i < jointClass.length; i++)// 检验数据有效性
//			{
//				JointClass temp = jointClass[i];
//				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
//						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
//					return 10000501;// 合班信息与学校不符
//				}
//				if (temp.getTaskId() == null || temp.getTaskId().equals("")
//						|| !temp.getTaskId().equals(planTask.getTaskId())) {
//					return 10000502;// 合班信息与任务不符
//				}
//				if (temp.getJointClassId() == null || temp.getJointClassId().length <= 0) {
//					return 10000503;// 合班班级信息有误
//				}
//				if (temp.getJointTearcherId() == null || temp.getJointTearcherId().length <= 0) {
//					return 10000504;// 合班教师信息有误
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//			return 10000500;
//		}
//		return 0;
//	}
//
//	/**
//	 * 排课时间-统一设置信息初始化，编码06
//	 * @param p_timetableBan
//	 * @return
//	 */
//	private int timetableBanInit(TimetableBan[] p_timetableBan)
//	{
//		try {
//			timetableBan = p_timetableBan;
//			if (timetableBan == null || timetableBan.length <= 0) {
//				return 0;// 没有设置数据不是错
//			}
//			for (int i = 0; i < timetableBan.length; i++)// 检验数据有效性
//			{
//				TimetableBan temp = timetableBan[i];
//				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
//						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
//					return 10000601;// 设置信息与学校不符
//				}
//				if (temp.getTaskId() == null || temp.getTaskId().equals("")
//						|| !temp.getTaskId().equals(planTask.getTaskId())) {
//					return 10000602;// 设置信息与任务不符
//				}
//				
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//			return 10000600;
//		}
//		return 0;
//	}
//	
//	/**
//	 * 排课时间规则-按科目设置信息初始化，编码07
//	 * @param p_subjectSettings
//	 * @return
//	 */
//	private int subjectSettingsInit(SubjectSettings[] p_subjectSettings)
//	{
//		try {
//			subjectSettings = p_subjectSettings;
//			if (subjectSettings == null || subjectSettings.length <= 0) {
//				return 0;// 没有设置数据不是错
//			}
//			for (int i = 0; i < subjectSettings.length; i++)// 检验数据有效性
//			{
//				SubjectSettings temp = subjectSettings[i];
//				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
//						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
//					return 10000701;// 设置信息与学校不符
//				}
//				if (temp.getTaskId() == null || temp.getTaskId().equals("")
//						|| !temp.getTaskId().equals(planTask.getTaskId())) {
//					return 10000702;// 设置信息与任务不符
//				}
//				
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//			return 10000700;
//		}
//		return 0;
//	}
//	
//	/**
//	 * 排课时间规则-按教师设置信息初始化，编码08
//	 * @param p_teacherSettings
//	 * @return
//	 */
//	private int teacherSettingsInit(TeacherSettings[] p_teacherSettings)
//	{								
//		try {
//			teacherSettings = p_teacherSettings;
//			if (teacherSettings == null || teacherSettings.length <= 0) {
//				return 0;// 没有设置数据不是错
//			}
//			for (int i = 0; i < teacherSettings.length; i++)// 检验数据有效性
//			{
//				TeacherSettings temp = teacherSettings[i];
//				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
//						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
//					return 10000801;// 设置信息与学校不符
//				}
//				if (temp.getTaskId() == null || temp.getTaskId().equals("")
//						|| !temp.getTaskId().equals(planTask.getTaskId())) {
//					return 10000802;// 设置信息与任务不符
//				}
//				
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//			return 10000800;
//		}
//		return 0;
//	}
//	
//	/**
//	 * 排课时间规则-按班级设置信息初始化，编码09
//	 * @param p_classSettings
//	 * @return
//	 */
//	private int classSettingsInit(ClassSettings[] p_classSettings)
//	{								
//		try {
//			classSettings = p_classSettings;
//			if (classSettings == null || classSettings.length <= 0) {
//				return 0;// 没有设置数据不是错
//			}
//			for (int i = 0; i < classSettings.length; i++)// 检验数据有效性
//			{
//				ClassSettings temp = classSettings[i];
//				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
//						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
//					return 10000901;// 设置信息与学校不符
//				}
//				if (temp.getTaskId() == null || temp.getTaskId().equals("")
//						|| !temp.getTaskId().equals(planTask.getTaskId())) {
//					return 10000902;// 设置信息与任务不符
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//			return 10000900;
//		}
//		return 0;
//	}
//	
//		/**
//	 * 排课时间规则-按课程设置信息初始化，编码10
//	 * @param p_classSettings
//	 * @return
//	 */
//	private int courseSettingsInit(CourseSettings[] p_courseSettings) {
//		try {
//			courseSettings = p_courseSettings;
//			if (courseSettings == null || courseSettings.length <= 0) {
//				return 0;// 没有设置数据不是错
//			}
//			for (int i = 0; i < courseSettings.length; i++)// 检验数据有效性
//			{
//				CourseSettings temp = courseSettings[i];
//				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
//						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
//					return 10001001;// 设置信息与学校不符
//				}
//				if (temp.getTaskId() == null || temp.getTaskId().equals("")
//						|| !temp.getTaskId().equals(planTask.getTaskId())) {
//					return 10001002;// 设置信息与任务不符
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//			return 10001000;
//		}
//		return 0;
//	}
//	
//	/**
//	 * 空白课表节次设置信息初始化，编码13
//	 * @param p_classSettings
//	 * @return
//	 */
//	private int timeSetInit(TimeSet[] p_timeSet) {
//		try {
//			timeSet = p_timeSet;
//			if (timeSet == null || timeSet.length <= 0) {
//				return 0;// 没有设置数据不是错
//			}
//			for (int i = 0; i < timeSet.length; i++)// 检验数据有效性
//			{
//				TimeSet temp = timeSet[i];
//				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
//						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
//					return 10001301;// 设置信息与学校不符
//				}
//				if (temp.getTaskId() == null || temp.getTaskId().equals("")
//						|| !temp.getTaskId().equals(planTask.getTaskId())) {
//					return 10001302;// 设置信息与任务不符
//				}
//				if(temp.getWeekDay()>7 ||temp.getWeekDay()<1 )
//				{
//					return 10001303;// 日期数据不合法。	
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//			return 10001300;
//		}
//		return 0;
//	}
//	
//	/**
//	 * 教室绑定设置信息初始化，编码14
//	 * @param p_classSettings
//	 * @return
//	 */
//	private int classAndRoomInit(ClassAndRoom[] p_classAndRoom) {
//		try {
//			classAndRoom = p_classAndRoom;
//			if (classAndRoom == null || classAndRoom.length <= 0) {
//				return 0;// 没有设置数据不是错
//			}
//			for (int i = 0; i < classAndRoom.length; i++)// 检验数据有效性
//			{
//				ClassAndRoom temp = classAndRoom[i];
//				if (temp.getSchoolId() == null || temp.getSchoolId().equals("")
//						|| !temp.getSchoolId().equals(planTask.getSchoolId())) {
//					return 10001401;// 设置信息与学校不符
//				}
//				if (temp.getTaskId() == null || temp.getTaskId().equals("")
//						|| !temp.getTaskId().equals(planTask.getTaskId())) {
//					return 10001402;// 设置信息与任务不符
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//			return 10001400;
//		}
//		return 0;
//	}
//	
//	/**
//	 * 排课规则校验，要求必须初始化所有规则数据,不检查教师任课数据有效性。
//	 * @return
//	 */
//	public int ruleCheck()
//	{
//		try
//		{
//			//检查数据有效性，完成计算后再做。
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			return 10001100;
//		}
//
//		return 0;
//	}
//	
//	
//	/**
//	 * 教师任课信息初始化，方法编码02
//	 * @param p_ClassTeacher
//	 * @return
//	 */
//	public int classTeacherInit(ClassTeacher[] p_ClassTeacher) {
//		try {
//			classTeacher = p_ClassTeacher;
//			if (classTeacher == null || classTeacher.length <= 0) {
//				return 10000201;// 教师任课信息为空或无数据
//			}
//			for (int i = 0; i < classTeacher.length; i++) {
//				ClassTeacher temp = classTeacher[i];
//				if (temp.getSchoolId() == null || !temp.getSchoolId().equals(planTask.getSchoolId())) {
//					return 10000202;// 教师任课信息与学校不符
//				}
//				if (temp.getTaskId() == null || !temp.getTaskId().equals(planTask.getTaskId())) {
//					return 10000203;// 教师任课信息与任务不符
//				}
//				if (temp.getClassType() != 1) {
//					return 10000204;// 此运算只能处理普通排课任务
//				}
//			}
//			this.classTeacherList=new ArrayList<ClassTeacher>();
////			for()
//
//			// 检查总节次数是否≤课表节次数
//			// 检查早自习节次数是否超限
//			// 检查科目是否在科目排序中
//			// 检查教师是否在教师排序中
//			// 检查
//		} catch (Exception e) {
//			System.out.println(e);
//			return 1000200;
//		}
//		return 0;
//	}
//
//	/**
//	 * 课表运算,方法编码15
//	 * @return
//	 */
//	public synchronized  CommonPlanResult plan()
//	{
//		//检查所有数据，下述操作默认为为数据已无问题。
//		
//		try
//		{
//			//课表总天数
//			int dayCount=0;
//			//课表每天总课时数
//			int classCount=classNumber.getAM()+classNumber.getPM()+classNumber.getEvening();
//			//创建空白课表
//			if(classNumber.isDoubleWeek())//双周需创建双倍课表
//			{
//				dayCount = classNumber.getDayCount()*2;
//			}
//			else
//			{
//				dayCount = classNumber.getDayCount();
//			}
//			cpr.classtable=new ClassTableCell[dayCount][classCount];
//			
//			//步骤1：使用：排课时间——统一设置 的数据，在空白课表中逐个标记不可用节次，此为优先级最高，必须满足的规则
//			for(int i=0;i<timetableBan.length;i++)
//			{
//				TimetableBan temp=timetableBan[i];
//				int weekDay=temp.getWeekDay();
//				int classNum=temp.getClassNum();
//				if(weekDay>=0 && weekDay<dayCount && classNum>=0 && classNum<classCount)
//				{
//					ClassTableCell cell = cpr.classtable[temp.getWeekDay()][temp.getClassNum()];
//					cell.canUsed=false;
//				}				
//			}
//			//步骤2：使用排课时间——按课程设置 的数据，在空白课表中添加预排课信息，确定课程的禁止、固定、优先排课时间
//			for(int i=0;i<courseSettings.length;i++)//逐个落实按课程设置的规则。
//			{
//				//逐条取出按课程设置的规则
//				CourseSettings Coursetemp=courseSettings[i];
//				//找到该设置对应的课表单元格
//				ClassTableCell cellTemp = cpr.classtable[Coursetemp.weekDay][Coursetemp.classNum];
//				//取得该课程的详细信息放入临时变量
//				CommonCellPlan planTemp=new CommonCellPlan();
//				planTemp.classId=Coursetemp.classId;
//				planTemp.curriculumName=Coursetemp.curriculumName;
//				planTemp.gradeID=Coursetemp.gradeID;
//				planTemp.subjectId=Coursetemp.subjectId;
//				planTemp.teachers=Coursetemp.teachers;
//				planTemp.courseId=Coursetemp.courseId;
//				
//				if(Coursetemp.type==1)//如果是禁止排课，向单元格加入标识
//				{					
//					cellTemp.banCoursePlanList.add(planTemp);
//				}
//				else if(Coursetemp.type==2)//如果是固定排课，向单元格加入课程安排。
//				{
//					for(int j=0;j<cellTemp.coursePlanList.size();j++)
//					{
//						
//					}
//					cellTemp.coursePlanList.add(planTemp);
//				}
//			}
//			
//			
//			
//			
//			//步骤1，优先按科目排课
//			//步骤1.1 科目信息在初始化时已按优先级排序,逐个取出
//			for(int i=0;i<this.subject.length;i++)
//			{
//				Subject subTemp=subject[i];
//				//步骤1.2 取出带该科目的所有任课信息
//				
//				
//				
//			}
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			cpr.errorCode=10001500;
//			cpr.errorMainMsg="发生未知错误";
//			cpr.errorMsg=e.getStackTrace();
//		}		
//		return cpr;
//	}
//	
//	/**
//	 * 创建空白课表，方法编码16
//	 * 要求所需参数都已检验过
//	 * @return
//	 */
//	private int createBlankTable()
//	{
//		try
//		{
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			return 10001600;
//		}
//		return 0;
//	}
}
