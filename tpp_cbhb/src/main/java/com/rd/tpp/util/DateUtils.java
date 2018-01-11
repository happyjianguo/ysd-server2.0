package com.rd.tpp.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

public class DateUtils {
	/** 格式 ：yyyyMMdd */
	public static final String DATEFORMAT_STR_yyyyMMdd = "yyyyMMdd";
	
	public static final String PATTERN_YYMMDDHHMMSS="yyMMddHHmmss";
	
	/** 格式 ：yyyy-MM-dd HH:mm:ss */
	public static final String DATEFORMAT_STR_001 = "yyyy-MM-dd HH:mm:ss";
	/** 格式 ：yyyy-MM-dd */
	public static final String DATEFORMAT_STR_002 = "yyyy-MM-dd";
	/** 格式 ：MM-dd */
	public static final String DATEFORMAT_STR_003 = "MM-dd";
	/** 格式 ：HH:mm:ss */
	public static final String DATEFORMAT_STR_004 = "HH:mm:ss";
	
	/** 格式 ：yyyyMMddHHmmss */
	public static final String DATEFORMAT_STR_011 = "yyyyMMddHHmmss";
	/** 格式 ：yyyyMMdd */
	public static final String DATEFORMAT_STR_012 = "yyyyMMdd";
	/** 格式 ：yyyyMM */
	public static final String DATEFORMAT_STR_013 = "yyyyMM";
	/** 格式 ：HHmmss */
	public static final String DATEFORMAT_STR_014 = "HHmmss";
	/** 格式 ：yyyyMMddHH:mm:ss */
	public static final String DATEFORMAT_STR_015 = "yyyyMMdd HH:mm:ss";
	
	/** 格式 ：yyyy年MM月dd日 HH时mm分ss秒 */
	public static final String DATEFORMAT_STR_021 = "yyyy年MM月dd日 HH时mm分ss秒";
	/** 格式 ：yyyy年MM月dd日 */
	public static final String DATEFORMAT_STR_022 = "yyyy年MM月dd日";
	/** 格式 ：MM月dd日 hh:mm */
	public static final String DATEFORMAT_STR_023 = "MM月dd日 hh:mm";
	
	/** 日期开始 */
	public static final String DATE_START = " 00:00:00";
	/** 日期开始 */
	public static final String DATE_END = " 23:59:59";
	
	/**
	 * 得到当前日期字符串 格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String getDate(String pattern) {
		return DateFormatUtils.format(new Date(), pattern);
	}
	/**
	 * 得到日期字符串 默认格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String formatDate(Date date, Object... pattern) {
		String formatDate = null;
		if (pattern != null && pattern.length > 0) {
			formatDate = DateFormatUtils.format(date, pattern[0].toString());
		} else {
			formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
		}
		return formatDate;
	}
	
	/**
	 * 获得当前日期
	 * @return
	 */
	public static Date getNow() {
		Calendar cal = Calendar.getInstance();
		Date currDate = cal.getTime();
		return currDate;
	}
	/**
	 * 前/后?天
	 * 
	 * @param d
	 * @param day
	 * @return
	 */
	public static Date rollDay(Date d, int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DAY_OF_MONTH, day);
		return cal.getTime();
	}
	
	/**
	 * 默认的valueOf 方法，格式化 yyyy-mm-dd HH:mm:ss
	 * @param str 
	 * @return
	 */
	public static Date valueOf(String str){
		return valueOf(str, DATEFORMAT_STR_001);
	}
	
	/**
	 * 
	 * 自定义format格式化字符串为date
	 * @param str 要格式化的字符串
	 * @param dateFormatStr 
	 * @return
	 */
	public static Date valueOf(String str, String dateFormatStr){
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormatStr);
		ParsePosition pos = new ParsePosition(0);
		Date strtoDate = formatter.parse(str, pos);
		return strtoDate;
	}
}
