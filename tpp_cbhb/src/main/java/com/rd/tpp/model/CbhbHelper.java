/**
* 互联网金融交易系统ifaes (Internet Finance  Assets  Exchange  System)
 * Copyright (c) 2016 杭州融都科技股份有限公司 版权所有
 */
package com.rd.tpp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.model.xml.XmlQueryMerchantAccts;
import com.rd.tpp.model.xml.XmlQueryUserInf;
import com.rd.tpp.util.BigDecimalUtils;
import com.rd.tpp.util.StringUtils;

/**
 * 帮助类
 * @version 3.0
 * @author QianPengZhan
 * @date 2017年2月22日
 */
public class CbhbHelper {
	
	/**
	 * 日志记录器
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbHelper.class);
	
	
	/**
	 * 提交 不判断状态码是否是000000（成功）
	 * @author QianPengZhan
	 * @date 2017年2月22日
	 * @param model
	 * @return
	 */
	public  static CbhbBaseModel doSubmit(CbhbBaseModel model){
		try {
			model.submit(model);
		} catch (Exception e) {
			LOGGER.error("doSubmit提交异常：{}",e.toString());
		}
		//2、返回码处理
		if(!model.checkSuccess()){
			LOGGER.error("返回非成功：{}",model.getRespDesc());
		}
		return model;
	}
	
	
	/**
	 * 提交  状态码必须是000000（成功）
	 * @author QianPengZhan
	 * @date 2017年2月22日
	 * @param model
	 * @return
	 */
	public  static CbhbBaseModel doSubmitWithValidCode(CbhbBaseModel model){
		//1、提交
		try {
			model.submit(model); //TODO 测试文件上传 暂时注释
		} catch (Exception e) {
			LOGGER.error("提交异常：{}", e.toString());
			throw new CbhbException(e.getMessage());
		}
		//2、返回码处理
		if(!model.checkSuccess()){
			LOGGER.error("返回非成功：{}{}",model.getRespDesc(), model.getRespCode());
			throw new CbhbException(model.getRespDesc());
		}
		return model;
	}
	
	/**
	 * 渤海银行 -- 回调金额转为金额再除以100 保留2位有效数字
	 * @author QianPengZhan
	 * @date 2017年3月1日
	 * @return
	 */
	public static BigDecimal getBigDecimalMoneyLow(final String value){
		BigDecimal result = StringUtils.isBlank(value)?BigDecimal.ZERO:BigDecimalUtils.valueOf(value);
		return BigDecimalUtils.div(result, BigDecimal.valueOf(CbhbConstant.DOUBLE_ONE_HUNDRED),CbhbConstant.INT_TWO);
	}
	
	/**
	 * 渤海银行 -- 请求金额保留2位有效数字乘以100转为字符串
	 * @author QianPengZhan
	 * @date 2017年3月1日
	 * @return
	 */
	public static String getBigDecimalMoneyUpper(final String value){
		BigDecimal temp = StringUtils.isBlank(value)?BigDecimal.ZERO:BigDecimalUtils.valueOf(value);
		BigDecimal result = BigDecimalUtils.decimal(temp.multiply(BigDecimal.valueOf(CbhbConstant.DOUBLE_ONE_HUNDRED)),CbhbConstant.INT_ZERO);
		return result.toString();
	}
	
	/**
	 * 渤海银行 -- 请求金额保留2位有效数字除以100转为字符串
	 * @author QianPengZhan
	 * @date 2017年3月15日
	 * @param value
	 * @return
	 */
	public static String getStringLower(final String value){
		BigDecimal temp = StringUtils.isBlank(value)?BigDecimal.ZERO:BigDecimalUtils.valueOf(value);
		BigDecimal result = BigDecimalUtils.decimal(temp.divide(BigDecimal.valueOf(CbhbConstant.DOUBLE_ONE_HUNDRED)),CbhbConstant.INT_TWO);
		return result.toString();
	}
	
	/**
	 * 渤海银行 -- 去除小数点
	 * @author ZhangBiao
	 * @date 2017年3月1日
	 * @param value
	 * @return
	 */
	public static String checkNumber(final String value){
		int num = value.indexOf('.');
		return value.substring(0,num);
	}
	
	/**
	 * 将商户查询接口中的xmlString 转换为map对象
	 * @author QianPengZhan
	 * @date 2017年3月6日
	 * @param xmlStr
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static final List<XmlQueryMerchantAccts> xmlToMap(String xmlStr){
		//处理xmlString 
		int length = xmlStr.lastIndexOf("</viin>");
		xmlStr = xmlStr.substring(0, length+7);
		List<XmlQueryMerchantAccts> list = new ArrayList<XmlQueryMerchantAccts>();
		try {
			//1、将字符串转换为xml的文件元素
			Document document = DocumentHelper.parseText(xmlStr);
			//2、获取根元素
			Element rootElement = document.getRootElement();
//			LOGGER.info("rootElememt-name:"+rootElement.getName());
			 for ( Iterator i = rootElement.elementIterator(); i.hasNext(); ) {
		            Element element = (Element) i.next();
		            LOGGER.info(element.asXML());
		            List eList =  element.elements();
		            XmlQueryMerchantAccts xqma = new XmlQueryMerchantAccts();
		            for (int j = 0; j < eList.size(); j++) {
						Element e = (Element) eList.get(j);
//						LOGGER.info(e.getName()+","+e.getTextTrim());
						if("ac_typ".equals(e.getName())){
							xqma.setAcTyp(e.getTextTrim());
						}
						if("avl_bal".equals(e.getName())){
							xqma.setAvlBal(getStringLower(e.getTextTrim()));
						}
						if("act_bal".equals(e.getName())){
							xqma.setActBal(getStringLower(e.getTextTrim()));
						}
						if("frz_bal".equals(e.getName())){
							xqma.setFrzBal(getStringLower(e.getTextTrim()));
						}
					}
		            list.add(xqma);
		        }
		} catch (DocumentException e) {
			throw  new CbhbException(e.toString());
		}
		return list;
	}
	
	/**
	 * TODO 将用户信息查询接口中的xmlString 转换为map对象
	 * @param xmlStr
	 * @return
	 * @author zza@erongdu.com
	 * @since 2017年6月20日 上午9:55:42
	 */
	@SuppressWarnings("rawtypes")
	public static final List<XmlQueryUserInf> xmlToMapQueryUserInf(String xmlStr){
		//处理xmlString 
		int length = xmlStr.lastIndexOf("</viin>");
		xmlStr = xmlStr.substring(0, length + 7);
		List<XmlQueryUserInf> list = new ArrayList<XmlQueryUserInf>();
		try {
			//1、将字符串转换为xml的文件元素
			Document document = DocumentHelper.parseText(xmlStr);
			//2、获取根元素
			Element rootElement = document.getRootElement();
//			LOGGER.info("rootElememt-name:"+rootElement.getName());
			 for ( Iterator i = rootElement.elementIterator(); i.hasNext(); ) {
		            Element element = (Element) i.next();
		            LOGGER.info(element.asXML());
		            List eList =  element.elements();
		            XmlQueryUserInf xmlQuery = new XmlQueryUserInf();
		            for (int j = 0; j < eList.size(); j++) {
						Element e = (Element) eList.get(j);
						if("cap_corg".equals(e.getName())){
							xmlQuery.setCapCorg(e.getTextTrim());
						}
						if("cap_crd_no".equals(e.getName())){
							xmlQuery.setCapCrdNo(e.getTextTrim());
						}
						if("mbl_no".equals(e.getName())){
							xmlQuery.setMblNo(e.getTextTrim());
						}
						if("usr_nm".equals(e.getName())){
							xmlQuery.setUsrNm(e.getTextTrim());
						}
					}
		            list.add(xmlQuery);
		        }
		} catch (DocumentException e) {
			throw  new CbhbException(e.toString());
		}
		return list;
	}
	
}
