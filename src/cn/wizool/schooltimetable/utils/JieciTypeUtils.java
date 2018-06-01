package cn.wizool.schooltimetable.utils;

public class JieciTypeUtils {

	private int NORMAL=0;
	private int BAN=1;
	private int FIXED=2;
	private int PRIORITY=3;
	private int MONOPOLY=4;
	private String type1="ui-droppable";
	private String type2="ui-droppable ban";
	private String type3="ui-droppable fixed";
	private String type4="ui-droppable priority";
	private String type5="ui-droppable monopoly";
	String flag="";
	int code;
	public int GetNumber(String message) {
		
		switch (message) {
		case "normal":
			code= NORMAL;
			break;
		case "fixed":
			code= FIXED;
			break;
		case "ban":
			code= BAN;
			break;
		case "priority":
			code= PRIORITY;
			break;
		case "monopoly":
			code= MONOPOLY;
			break;

		default:
			break;
		}
		return code;

	}
public String GetCSSClassname(int message) {
		
		switch (message) {
		case 0:
			flag= type1;
			break;
		case 1:
			flag= type2;
			break;
		case 2:
			flag= type3;
			break;
		case 3:
			flag= type4;
			break;
		case 4:
			flag= type5;
			break;
		default:
			break;
		}
		return flag;

	}

}
