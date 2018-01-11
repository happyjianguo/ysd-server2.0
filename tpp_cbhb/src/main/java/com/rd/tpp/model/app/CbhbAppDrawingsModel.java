/**
 * 互联网金融交易系统ifaes (Internet Finance  Assets  Exchange  System)
 * Copyright (c) 2016 杭州融都科技股份有限公司 版权所有
 */
package com.rd.tpp.model.app;

import java.util.Map;

import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.model.CbhbHelper;
import com.rd.tpp.util.StringUtils;
import com.rd.tpp.util.TppPropertyUtil;

/**
 * 用户提现（页面方式）app
 * @version 3.0
 * @date 2017年2月27日
 */
@SuppressWarnings("serial")
public class CbhbAppDrawingsModel extends CbhbAppBaseModel {
	/**
	 * LOGer
	 */
	/*private static final Logger LOGGER = LoggerFactory.getLogger(CbhbAppDrawingsModel.class);*/
	// 请求参数
	/**
	 * 交易金额(交易金额中包含商户手续费收入金额) 同时也是返回参数
	 */
	private String TransAmt;

	/**
	 * 手续费模式(0不收取， 1商户收取用户手续费)
	 */
	private String FeeType;

	/**
	 * 商户手续费收入(商户收取用户手续费，FeeType为1时不可空，FeeType为0时上送0) 同时也是返回参数
	 */
	private String MerFeeAmt;
	
	/**
	 * 扩展域
	 */
    private String MerPriv;
  

	/**
	 * 手续费
	 */
	private String FeeAmt;
	
	/**
	 * 字符集
	 */
	private String Char_Set;
	
	/**
	 * 存管取现流水号
	 */
	private String TransId;

	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "PartnerId",
			"MerBillNo", "PlaCustId", "FeeType", "MerFeeAmt", "BackUrl",
			"FrontUrl", "TransAmt", "MerPriv"};

	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "PartnerId",
			"MerBillNo", "TransAmt", "TransId", "FeeAmt", "MerPriv",
			"Version_No", "Biz_Type", "RpCode", "Mac", "Sign_Type",
			"Char_Set"};

	/**
	 * 构造器
	 */
	public CbhbAppDrawingsModel() {
		super();
		this.setTransid("CBHBNetLoanWithdraw");
		this.setFrontUrl(TppPropertyUtil.getMessage("web_url") + "/cbhb/app/cashReturn.html");
		this.setBackUrl(TppPropertyUtil.getMessage("notify_web_url") + "/cbhb/app/cashNotify.html");
	}

	/**
	 * 回调信息
	 */
	@Override
	public void response(Map<String, String> map) {
		super.response(map);
		this.setTransAmt(CbhbHelper.getStringLower(StringUtils.isNull(map.get("TransAmt"))));
		this.setTransId(StringUtils.isNull(map.get("TransId")));
		this.setMerFeeAmt(CbhbHelper.getStringLower(StringUtils.isNull(map.get("MerFeeAmt"))));
		this.setFeeAmt(CbhbHelper.getStringLower(StringUtils.isNull(map.get("FeeAmt"))));
	}

	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		if (StringUtils.isBlank(this.getPlaCustId())) {
			throw new CbhbException("渤海银行请求账户存管平台客户号不能为空");
		}
		if (StringUtils.isBlank(this.getTransAmt())) {
			throw new CbhbException("渤海银行请求交易金额不能为空");
		}
		if (StringUtils.isBlank(this.getFeeType())) {
			throw new CbhbException("渤海银行请求手续费模式不能为空");
		}
		if (StringUtils.isBlank(this.getMerFeeAmt())) {
			throw new CbhbException("渤海银行请求商户手续费收入不能为空");
		}
	}

	public String getTransAmt() {
		return TransAmt;
	}

	public void setTransAmt(String transAmt) {
		TransAmt = transAmt;
	}

	public String getFeeType() {
		return FeeType;
	}

	public void setFeeType(String feeType) {
		FeeType = feeType;
	}

	public String getMerFeeAmt() {
		return MerFeeAmt;
	}

	public void setMerFeeAmt(String merFeeAmt) {
		MerFeeAmt = merFeeAmt;
	}

	public String getMerPriv() {
		return MerPriv;
	}

	public void setMerPriv(String merPriv) {
		MerPriv = merPriv;
	}

	public String getFeeAmt() {
		return FeeAmt;
	}

	public void setFeeAmt(String feeAmt) {
		FeeAmt = feeAmt;
	}

	public String getChar_Set() {
		return Char_Set;
	}

	public void setChar_Set(String char_Set) {
		Char_Set = char_Set;
	}

	public String[] getRequestParamNames() {
		return requestParamNames;
	}

	public void setRequestParamNames(String[] requestParamNames) {
		this.requestParamNames = requestParamNames;
	}

	public String[] getResponseParamNames() {
		return responseParamNames;
	}

	public void setResponseParamNames(String[] responseParamNames) {
		this.responseParamNames = responseParamNames;
	}

	public String getTransId() {
		return TransId;
	}

	public void setTransId(String transId) {
		TransId = transId;
	}


}
