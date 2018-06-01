package cn.wizool.schooltimetable.bean;
/**
 * 排课时间规则 设置对象 枚举，含按统一、按科目、按教师、按班级、按课程
 * @author zl
 *
 */
public enum  TimeRuleType {
	
	forAll("统一", 1), forSubject("按科目", 2), forTeacher("按教师", 3), forClass("按班级", 4), forCourse("按课程", 5);
	
//	1("周一", 1), 2("周二", 2), 3("周三", 3), 4("周四", 4),
//	5("周五", 5), 6("周六", 6), 7("周日", 7);
    private String name ;
    private int index ;
    private int value = 0;
    
    private TimeRuleType( String name , int index ){
        this.name = name ;
        this.index = index ;
    }
    private TimeRuleType( int value ){
        this.value = value ;
    } 
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    
}
