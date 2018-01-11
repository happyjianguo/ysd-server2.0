/**
 * 互联网金融交易系统ifaes (Internet Finance  Assets  Exchange  System)
 * Copyright (c) 2016 杭州融都科技股份有限公司 版权所有
 */
package com.rd.tpp.model;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.StringUtils;

/**
 * 投标撤销接口
 * 
 * @version 3.0
 * @author QianPengZhan
 * @date 2017年3月4日
 */
@SuppressWarnings("serial")
public class CbhbInvestCancleModel extends CbhbBaseModel {

	/**
	 * LOGGER
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbInvestCancleModel.class);

	/**
	 * 原账户存管平台流水
	 */
	private String oldTransId;

	/**
	 * 短信验证码
	 */
	private String SmsCode;

	/**
	 * 原投标金额
	 */
	private String TransAmt;

	/**
	 * 冻结编号
	 */
	private String freezeId;

	/**
	 * 回调参数：账户存管平台流水号
	 */
	private String transId;
	
	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "char_set",
			"partner_id", "version_no", "biz_type", "sign_type", "MerBillNo",
			"OldTransId", "PlaCustId", "SmsCode", "TransAmt", "FreezeId",
			"MerPriv", "mac"};

	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "partner_id",
			"version_no", "biz_type", "sign_type", "MerBillNo", "OldTransId", 
			"RespCode", "RespDesc", "TransAmt", "TransId", "MerPriv", "mac" };

	/**
	 * 构造器
	 */
	public CbhbInvestCancleModel() {
		super();
		this.setBizType(CbhbConstant.BIZ_TYPE_INVEST_CANCLE);
	}

	/**
	 * 响应回调
	 */
	@Override
	public void response(Map<String, String> map) {
		LOGGER.info("CbhbInvestCancleModel===response");
		this.setOldTransId(StringUtils.isNull(map.get("OldTransId")));
		this.setTransAmt(StringUtils.isNull(map.get("TransAmt")));
		this.setTransId(StringUtils.isNull(map.get("TransId")));
		super.response(map);
	}

	/**
	 * 每个实体类的提交参数的字段的校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		LOGGER.info("CbhbInvestCancleModel===requestColumnValid");
		if (StringUtils.isBlank(this.getOldTransId())) {
			throw new CbhbException("渤海银行请求原账户存管平台流水不能为空");
		}
		if (StringUtils.isBlank(this.getSmsCode())) {
			throw new CbhbException("渤海银行请求短信验证码不能为空");
		}
		if (StringUtils.isBlank(this.getTransAmt())) {
			throw new CbhbException("渤海银行请求原投标金额不能为空");
		}
		if (StringUtils.isBlank(this.getFreezeId())) {
			throw new CbhbException("渤海银行请求冻结编号不能为空");
		}
		if (StringUtils.isBlank(this.getPlaCustId())) {
			throw new CbhbException("渤海银行请求存管账户号不能为空");
		}
	}

	/**
	 * 获取属性oldTransId的值
	 * 
	 * @return oldTransId属性值
	 */
	public String getOldTransId() {
		return oldTransId;
	}

	/**
	 * 设置属性oldTransId的值
	 * 
	 * @param oldTransId属性值
	 */
	public void setOldTransId(String oldTransId) {
		this.oldTransId = oldTransId;
	}

	/**
	 * 获取属性smsCode的值
	 * 
	 * @return smsCode属性值
	 */
	public String getSmsCode() {
		return SmsCode;
	}

	/**
	 * 设置属性smsCode的值
	 * 
	 * @param smsCode属性值
	 */
	public void setSmsCode(String smsCode) {
		SmsCode = smsCode;
	}

	/**
	 * 获取属性transAmt的值
	 * 
	 * @return transAmt属性值
	 */
	public String getTransAmt() {
		return TransAmt;
	}

	/**
	 * 设置属性transAmt的值
	 * 
	 * @param transAmt属性值
	 */
	public void setTransAmt(String transAmt) {
		TransAmt = transAmt;
	}

	/**
	 * 获取属性freezeId的值
	 * 
	 * @return freezeId属性值
	 */
	public String getFreezeId() {
		return freezeId;
	}

	/**
	 * 设置属性freezeId的值
	 * 
	 * @param freezeId属性值
	 */
	public void setFreezeId(String freezeId) {
		this.freezeId = freezeId;
	}

	/**
	 * 获取属性transId的值
	 * 
	 * @return transId属性值
	 */
	public String getTransId() {
		return transId;
	}

	/**
	 * 设置属性transId的值
	 * 
	 * @param transId属性值
	 */
	public void setTransId(String transId) {
		this.transId = transId;
	}

	/**
	 * 获取requestParamNames
	 * @return requestParamNames
	 */
	public String[] getRequestParamNames() {
		return requestParamNames;
	}

	/**
	 * 设置requestParamNames
	 * @param requestParamNames 要设置的requestParamNames
	 */
	public void setRequestParamNames(String[] requestParamNames) {
		this.requestParamNames = requestParamNames;
	}

	/**
	 * 获取responseParamNames
	 * @return responseParamNames
	 */
	public String[] getResponseParamNames() {
		return responseParamNames;
	}

	/**
	 * 设置responseParamNames
	 * @param responseParamNames 要设置的responseParamNames
	 */
	public void setResponseParamNames(String[] responseParamNames) {
		this.responseParamNames = responseParamNames;
	}

}
