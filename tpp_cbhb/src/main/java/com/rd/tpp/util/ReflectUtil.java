package com.rd.tpp.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Date;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 反射帮助类
 * 
 * @author fxx
 * @version 2.0
 * @since 2014年1月28日
 */
public class ReflectUtil {

	public static List<?> primitive_types = Arrays.asList(new Class[] {char.class, short.class, byte.class, int.class,
			long.class, float.class, double.class, boolean.class, Short.class, Byte.class, Integer.class, Long.class,
			Float.class, Double.class, Boolean.class, String.class, Date.class });

	public static boolean isPrimitive(Class<?> type) {
		return primitive_types.contains(type);
	}

	public static Object invokeGetMethod(Class<?> claszz, Object o, String name) {
		Object ret = null;
		try {
			Method method = claszz.getMethod("get" + StringUtils.firstCharUpperCase(name));
			ret = method.invoke(o);
		} catch (Exception e) {
		}
		return ret;
	}

	public static Object invokeSetMethod(Class<?> claszz, Object o, String name, Class<?>[] argTypes, Object[] args) {
		Object ret = null;
		try {
			Method method = claszz.getMethod("set" + StringUtils.firstCharUpperCase(name), argTypes);
			ret = method.invoke(o, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	public static Object invokeSetMethod(Class<?> claszz, Object o, String name, Class<?> argType, Object args) {
		Object ret = null;
		try {
			Method method = claszz.getMethod("set" + StringUtils.firstCharUpperCase(name), new Class[] { argType });
			ret = method.invoke(o, new Object[] { args });
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	@SuppressWarnings("rawtypes")
	public static Class<?> getSuperClassGenricType(Class clazz, int index) {
		Type genType = clazz.getGenericSuperclass();

		if (!(genType instanceof ParameterizedType)) {
			return Object.class;
		}

		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		if ((index >= params.length) || (index < 0)) {
			return null;
		}
		if (!(params[index] instanceof Class)) {
			return Object.class;
		}
		return (Class<?>) params[index];
	}

	@SuppressWarnings("rawtypes")
	public static Class getSuperClassGenricType(Class clazz) {
		return getSuperClassGenricType(clazz, 0);
	}

	public static Method getDeclaredMethod(Object object, String methodName, Class<?>... parameterTypes) {
		Method method = null;
		Class<?> clazz = object.getClass();
		while (clazz != Object.class) {
			try {
				method = clazz.getDeclaredMethod(methodName, parameterTypes);
			} catch (Exception e) {

			}
			if (method != null)
				break;
			clazz = clazz.getSuperclass();
		}
		return method;
	}

	public static Map<String, Field> getClassField(Class<?> clazz) {
		Field[] declaredFields = clazz.getDeclaredFields();
		Map<String, Field> fieldMap = new HashMap<String, Field>();
		Map<String, Field> superFieldMap = new HashMap<String, Field>();
		for (Field field : declaredFields) {
			fieldMap.put(field.getName(), field);
		}
		if (clazz.getSuperclass() != null) {
			superFieldMap = getClassField(clazz.getSuperclass());
		}
		fieldMap.putAll(superFieldMap);
		return fieldMap;
	}
	
	/**
	 * object 属性名称及属性值组装为String字符串。
	 * 组装规则：
	 * field.name1=field.value1&field.name2=field.value2 ...
	 * @param object
	 * @return
	 */
	public static String fieldValueToString(Object object) {
		Class<?> clazz = object.getClass();
		Field[] fss = new Field[0];
		for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
			try {
				Field[] fs = clazz.getDeclaredFields();
				fss = ArrayUtil.concat(fss, fs);
			} catch (Exception e) {
				// 这里异常不能抛出去。
				// 如果这里的异常打印或者往外抛，就不会执行clazz = clazz.getSuperclass(),
				// 最后就不会进入到父类中了
			}
		}
		StringBuffer sb = new StringBuffer(50);
		for (Field f : fss) {
			// 反射对象中String类型，且不为常量的字段
			if (String.class.equals(f.getType()) && !isConstant(f.getModifiers())) {
				String fieldName = f.getName();
				Object o = ReflectUtil.invokeGetMethod(f.getDeclaringClass(), object, fieldName);
				String value = StringUtils.isNull(o);
				if (value.equals("")) {
					continue;
				}
				sb.append(fieldName + "=" + value + "&");
			}
		}
		return sb.toString();
	}
	
	/**
	 * 是否为常量
	 * @param modifiers
	 * @return 常量返回true，非常量返回false
	 */
	public static boolean isConstant(int modifiers) {
		// static 和 final修饰
		if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
			return true;
		} 
		return false;
	}
	
	
}
