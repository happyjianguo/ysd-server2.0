package com.rd.tpp.util;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.rd.tpp.service.TppAppInterfaceService;
import com.rd.tpp.service.TppInterfaceService;
import com.rd.tpp.service.impl.TppAppInterfaceServiceImpl;
import com.rd.tpp.service.impl.TppInterfaceServiceImpl;
/**
 * 获取单例的接口对象
 * @author win10
 *
 */
public class TppUtil {

//	private static final Logger LOGGER = LoggerFactory.getLogger(TppUtil.class);
	private static TppInterfaceService tppService = null;
	private static TppAppInterfaceService tppAppService = null;

	/**
	 * 构造器私有化
	 */
	private TppUtil() {
		
	}

	/*
	 * 单例设计模式
	 */
	public static TppInterfaceService getInstance() {
		if (tppService == null) {
			tppService = new TppInterfaceServiceImpl();
		}
		return tppService;
	}
	/*
	 * 单例设计模式
	 */
	public static TppAppInterfaceService getAppInstance() {
		if (tppAppService == null) {
			tppAppService = new TppAppInterfaceServiceImpl();
		}
		return tppAppService;
	}
}