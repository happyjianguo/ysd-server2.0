package com.rd.tpp.util;

import java.util.Arrays;

/**
 * 数组操作工具类
 */
public class ArrayUtil {

	/**
	 * 数组合并
	 * 
	 * @param first 第一个数组
	 * @param second 第二个数组
	 * @return
	 */
	public static <T> T[] concat(T[] first, T[] second) {
		T[] result = Arrays.copyOf(first, first.length + second.length);
		System.arraycopy(second, 0, result, first.length, second.length);
		
		return result;
	}
	
	
	/**
	 * 初始化String数组
	 * @param str
	 * @return
	 */
	public static String[] init(String... str) {
		return str;
	}
	
}
