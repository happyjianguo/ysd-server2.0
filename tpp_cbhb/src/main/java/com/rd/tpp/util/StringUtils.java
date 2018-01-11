package com.rd.tpp.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSONObject;

public class StringUtils
{
	/**
	 * 空字符串 
	 */
	public static final String EMPTY = "";
	public static final String ONLY_VERTICAL_LINE = "|";//竖线  纯字符串
	public static final String VERTICAL_LINE = "\\|";//竖线  正则表达式
	public static final String LF = "\n";
	public static boolean isBlank(String str) {
		return isNull(str).equals("");
	}

	public static String isNull(Object o) {
		if (o == null) {
			return "";
		}
		String str = "";
		if ((o instanceof String))
			str = (String) o;
		else {
			str = o.toString();
		}
		return str;
	}

	public static String firstCharUpperCase(String s) {
		StringBuffer sb = new StringBuffer(s.substring(0, 1).toUpperCase());
		sb.append(s.substring(1, s.length()));
		return sb.toString();
	}

	/**
	 * 检验是否非空字符串
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(String str) {
		return !isNull(str).equals(EMPTY);
	}
	
	/**
     * @Description: 过滤参数json串中的空值，避免数据库存储太多无用数据
     * @param @param jsonString
     * @param @return
     * @throws
     */
	public static String reBuildJson(String jsonString) {
		if (isNotBlank(jsonString)) {
			JSONObject jsonObject = JSONObject.parseObject(jsonString);

			Iterator<Entry<String, Object>> iterator = jsonObject.entrySet().iterator();
			Map<String, Object> rtMap = new HashMap<String, Object>();
			while (iterator.hasNext()) {
				Entry<String, Object> entry = iterator.next();
				if (entry.getValue().getClass().equals(String.class)) {
					if (isNotBlank(entry.getValue().toString())) {
						rtMap.put(entry.getKey(), entry.getValue());
					}
				} else if (entry.getValue().getClass().isArray()) {
					Object[] objs = (Object[]) entry.getValue();
					if (objs.length > 0) {
						rtMap.put(entry.getKey(), entry.getValue());
					}
				} else {
					rtMap.put(entry.getKey(), entry.getValue());
				}
			}
			jsonString = JSONObject.toJSONString(rtMap);
			return jsonString;
		} else {
			return "";
		}
	}
}
