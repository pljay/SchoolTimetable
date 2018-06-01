package cn.wizool.schooltimetable.bean;
/**
 * 上课时段枚举，含早上、上午、下午、晚上
 * @author zl
 *
 */
public enum  DayPart {
	moning("早上", 1), AM("上午", 2), PM("下午", 3), evening("晚上", 4);
	
//	1("周一", 1), 2("周二", 2), 3("周三", 3), 4("周四", 4),
//	5("周五", 5), 6("周六", 6), 7("周日", 7);
    private String name ;
    private int index ;
    private int value = 0;
    
    private DayPart( String name , int index ){
        this.name = name ;
        this.index = index ;
    }
    private DayPart( int value ){
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
