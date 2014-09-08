/**
 * 
 */
package com.ims.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期时间工具类
 * @author ChengNing
 * @date   2014-9-7
 */
public class DateTimeUtil {
	
	public static final String DEFAULT_FORMAT_DATE = "yyyy-MM-dd";
	public static final String DEFAULT_FORMAT_TIME = "HH:mm:SS";
	public static final String DEFAULT_FORMAT_DATETIME = "yyyy-MM-dd HH:mm:SS";
	
	/**
	 * 字符串转换为日期
	 * @param dateString   日期字符串
	 * @param format       格式化字符串
	 * @return
	 */
	public static Date getDateTime(String dateString,String format){
		SimpleDateFormat sf = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = sf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 通过时间字符串得到一个Date
	 * @param dateString eg:2010-01-01 10:10:00
	 * @return
	 */
	public static Date getDateTime(String dateTimeString){
		return getDateTime(dateTimeString,DEFAULT_FORMAT_DATETIME);
	}
	
	/**
	 * 转换一个日期串为Date
	 * @param date eg:2010-01-01
	 * @return
	 */
	public static Date getDate(String date){
		return getDateTime(date, DEFAULT_FORMAT_DATE);
	}
	
	/**
	 * 转换一个时间串为Date
	 * @param time 10:10:00
	 * @return
	 */
	public static Date getTime(String time){
		return getDateTime(time,DEFAULT_FORMAT_TIME);
	}
	
	
	/**
	 * 将给定日期转换为日期字符串
	 * @param date
	 * @param format
	 * @return
	 */
	public static String toDateString(Date date,String format) {
		SimpleDateFormat sf = new SimpleDateFormat(format);
		return sf.format(date);
	}
	
	/**
	 * 将给定的日期时间输出为默认字符串格式
	 * @param date eg:2010-01-01 10:10：00
	 * @return
	 */
	public static String toDateTimeStr(Date date){
		return toDateString(date, DEFAULT_FORMAT_DATETIME);
	}
	
	/**
	 * 将给定的日期时间输出为默认格式日期字符串
	 * @param date eg:2010-01-01
	 * @return
	 */
	public static String toDateStr(Date date){
		return toDateString(date, DEFAULT_FORMAT_DATE);
	}
	
	/**
	 * 将给定的日期时间输出为默认格式时间字符串
	 * @param date eg:10:10：00
	 * @return
	 */
	public static String toTimeStr(Date date){
		return toDateString(date, DEFAULT_FORMAT_TIME);
	}
	
	/**
	 * 今天的日期字符串
	 * @return
	 */
	public static String today(){
		return currentDate();
	}
	
	/**
	 * 获得今天指定时间的Date
	 * @param time
	 * @return
	 */
	public static Date getToday(String time){
		String today = today();
		return getDateTime(today + " " + time,DEFAULT_FORMAT_DATETIME);
	}
	
	/**
	 * 获取当前时间
	 * @return eg:2012-01-01 01:01:00
	 */
	public static String now(){
		return current();
	}
	
	/**
	 * 获取当前的时间
	 * @return eg:10:30:00
	 */
	public static String currentTime(){
		return toDateString(new Date(), DEFAULT_FORMAT_TIME);
	}
	
	/**
	 * 获取当期日期
	 * @return eg:2012-01-01
	 */
	public static String currentDate(){
		return toDateString(new Date(), DEFAULT_FORMAT_DATE);
	}
	
	/**
	 * 当前的日期和时间，等于now()
	 * @return
	 */
	public static String current(){
		return toDateString(new Date(), DEFAULT_FORMAT_DATETIME);
	}
	
	/**
	 * 格式化字符串，使用指定Date替换其中的时间参数
	 * @param text
	 * @param date
	 * @return
	 */
	public static String format(String text,Date date){
		int start = text.indexOf("{");
		int end = text.indexOf("}");
		while(start > 0 && end > 0){
			String subStr = text.substring(start, end+1);
			String format = text.substring(start+1, end);
			String dateStr = toDateString(date, format);
			text = text.replace(subStr, dateStr);
			
			start = text.indexOf("{");
			end = text.indexOf("}");
		}
		return text;
	}
	
}
