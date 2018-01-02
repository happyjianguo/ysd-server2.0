package com.rd.tpp.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * JAVA版本的自动生成有规则的订单号(或编号) 生成的格式是: 200908010001 前面几位为当前的日期,后面五位为系统自增长类型的编号 原理: 1.获取当前日期格式化值; 2.读取文件,上次编号的值+1最为当前此次编号的值
 * (新的一天会重新从1开始编号)
 */

public class OrderNoUtils {
	private OrderNoUtils() {}

	/**
	 * 产生唯一 的序列号。
	 * 
	 * @return String
	 */
	public static String getSerialNumber() {
		int hashCode = UUID.randomUUID().toString().hashCode();
		if (hashCode < 0) {
			hashCode = -hashCode;
		}
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(getNow()).substring(2, 8) + String.format("%010d", hashCode);
	}
	/**
	 * 产生批量序列号
	 * @param count
	 * @return
	 */
	public static List<String> getBatchSerialNumber(String batchCount) {
		int count = getInt(batchCount);
		List<String> orderNoList = new ArrayList<String>();
		if (count <= 1) {
			orderNoList.add(getSerialNumber());
			return orderNoList;
		}
		
		for (int i = 0; i < count; i++) {
			orderNoList.add(getSerialNumber());
		}
		
		return orderNoList;
	}
	public static Date getNow() {
		Calendar cal = Calendar.getInstance();
		Date currDate = cal.getTime();
		return currDate;
	}
	public static int getInt(String str){
		if(str==null||str.equals(""))
			return 0;
		int ret=0;
		try {
			ret=Integer.parseInt(str);
		} catch (NumberFormatException e) {
			ret=0;
		}
		return ret;
	}
}
