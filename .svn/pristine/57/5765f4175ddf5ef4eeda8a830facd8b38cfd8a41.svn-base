package cn.wizool.schooltimetable.bean;

public enum  WeekDay {
	
	Monday("周一", 1), Tuesday("周二", 2), Wednesday("周三", 3), Thursday("周四", 4),
	Friday("周五", 5), Saturday("周六", 6), Sunday("周日", 7);
//	1("周一", 1), 2("周二", 2), 3("周三", 3), 4("周四", 4),
//	5("周五", 5), 6("周六", 6), 7("周日", 7);
    private String name ;
    private int index ;
    private int value = 0;
    
    private WeekDay( String name , int index ){
        this.name = name ;
        this.index = index ;
    }
    private WeekDay( int value ){
        this.value = value ;
    } 
    public static WeekDay valueOf(int value){   //   手写的从int到enum的转换函数
        switch(value) {
        case 1:
           return Monday;
        case 2:
           return Tuesday;
        case 3:
            return Wednesday;
        case 4:
            return Tuesday;
        case 5:
            return Tuesday;
        case 6:
            return Tuesday;
        case 7:
            return Tuesday;
       default:
           return null;
        }
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
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	private WeekDay(String name, int index, int value) {
		this.name = name;
		this.index = index;
		this.value = value;
	}
    
}
