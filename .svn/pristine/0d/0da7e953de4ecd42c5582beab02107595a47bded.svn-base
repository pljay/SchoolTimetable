package cn.wizool.schooltimetable.utils;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * <p>Title: CheckUtils</p> 
 * <p>Description: </p>  
 * @author PLJay 
 * @date 2018年4月17日 
 */
public class CheckUtils {

	/**
	 * 正则表达式：验证手机号
	 */
	private static final String REGEX_MOBILE;

	/**
	 * 正则表达式：验证邮箱
	 */
	private static final String REGEX_EMAIL;

	/**
	 * 正则表达式：验证汉字
	 */
	private static final String REGEX_CHINESE;

	/**
	 * 正则表达式：验证身份证
	 */
	private static final String REGEX_ID_CARD;

	/**
	 * 正则表达式：验证URL
	 */
	private static final String REGEX_URL;

	/**
	 * 正则表达式：验证IP地址
	 */
	private static final String REGEX_IP_ADDR;

	/**
	 * 正则表达式：验证中文名
	 */
	private static final String REGEX_NAME;

	static {
		REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		REGEX_MOBILE = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
		REGEX_NAME = "^(([\u4e00-\u9fa5]{2,8})|([a-zA-Z]{2,16}))$";
		REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
		REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
		REGEX_ID_CARD = "^(\\d{15}$|^\\d{18}$|^\\d{17}(\\d|X|x))$";
		REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";
	}

	/**
	 * 校验身份证
	 * 
	 * @param idCard
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isIDCard(String idCard) {
		return Pattern.matches(REGEX_ID_CARD, idCard);
	}

	/**
	 * 校验手机号
	 * 
	 * @param mobile
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isMobile(String mobile) {
		return Pattern.matches(REGEX_MOBILE, mobile);
	}

	/**
	 * 校验邮箱
	 * 
	 * @param email
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isEmail(String email) {
		return Pattern.matches(REGEX_EMAIL, email);
	}

	/**
	 * 校验汉字
	 * 
	 * @param chinese
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isChinese(String chinese) {
		return Pattern.matches(REGEX_CHINESE, chinese);
	}

	/**
	 * 校验URL
	 *
	 * @param url
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isUrl(String url) {
		return Pattern.matches(REGEX_URL, url);
	}

	/**
	 * 校验IP地址
	 * 
	 * @param ipAddr
	 * @return
	 */
	public static boolean isIPAddr(String ipAddr) {
		return Pattern.matches(REGEX_IP_ADDR, ipAddr);
	}

	/**
	 * 校验时间
	 * @param Format
	 * @param Time
	 * @return 如果格式化失败返回false
	 */
	public static boolean isTime(String Format,String Time)  
	{  
		try  
		{  
			SimpleDateFormat dateFormat = new SimpleDateFormat(Format);  

			System.out.println(dateFormat.parse(Time));
			return true;  
		}  
		catch (Exception e)  
		{  
			return false;  
		}  
	}  

	/**
	 * 校验中文名
	 * @param name
	 * @return
	 */
	public static boolean isName(String name){
		return Pattern.matches(REGEX_NAME, name);
	}
    /**
     * 判断数字的位数
     *
     * @param number
     * @param length
     *
     * @return
     */
    public static boolean checkNumberLength(String number, int length) {
        if (number == null) {
            return false;
        }

        Pattern p = Pattern.compile("\\d*");
        return p.matcher(number).matches() && number.length() == length;
    }
    /**
     * 对象是否为空
     * 
     * @param obj
     *            对象
     * @return boolean TRUE-空;FALSE-非空
     */
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    /**
     * 是否为空字符串
     * 
     * @param str
     *            字符串
     * @return boolean TRUE-空字符串;FALSE-非空字符串
     */
    public static boolean isEmpty(CharSequence str) {
        return isNull(str) || str.length() == 0;
    }

    /**
     * 是否为空集合
     * 
     * @param coll
     *            集合
     * @return boolean TRUE-空集合;FALSE-非空集合
     */
    public static boolean isEmpty(Collection<?> coll) {
        return isNull(coll) || coll.size() == 0;
    }

    /**
     * 是否为空集合
     * 
     * @param map
     *            集合
     * @return boolean TRUE-空集合;FALSE-非空集合
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return isNull(map) || map.size() == 0;
    }

    /**
     * 是否为空数组
     * 
     * @param arr
     *            数组
     * @return boolean TRUE-空数组;FALSE-非空数组
     */
    public static boolean isEmpty(Object[] arr) {
        return isNull(arr) || arr.length == 0;
    }
    
	public static void main(String[] args) {
		System.out.println(CheckUtils.isTime("YYYYMM","199919"));
	}
}
