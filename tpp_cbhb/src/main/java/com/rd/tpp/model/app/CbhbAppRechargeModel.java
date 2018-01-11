package com.rd.tpp.model.app;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.model.CbhbHelper;
import com.rd.tpp.util.StringUtils;
import com.rd.tpp.util.TppPropertyUtil;

/**
 * 
 * 3.1 用户充值（页面方式） 移动端
 * 
 * @version 3.0
 * @author ZhangBiao
 * @date 2017年2月21日
 */
@SuppressWarnings("serial")
public class CbhbAppRechargeModel extends CbhbAppBaseModel {
	/**
	 * LOGGER
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbAppRechargeModel.class);
	/**
	 * 交易金额 Number(16)
	 */
	private String TransAmt;

	/**
	 * 手续费模式 String(1)
	 */
	private String FeeType;

	/**
	 * 商户手续费收入 Number(10)
	 */
	private String MerFeeAmt;

	/**
	 * 营销金额 Number(16)
	 */
	private String MarketAmt;
	/**
	 *  商户端保留域
	 */
	private String MerPriv;

	/**
	 * 手续费 Number(10)
	 */
	private String FeeAmt;

	/**
	 * 账户存管平台流水号 String(32)
	 */
	private String TransId;
	
	/**
	 * 编码
	 */
	private String Char_Set;

	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "PartnerId",
			"MerBillNo", "PlaCustId", "FeeType", "MerFeeAmt", "MarketAmt",
			"BackUrl", "FrontUrl", "TransAmt", "MerPriv"};

	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "PartnerId",
			"MerBillNo", "TransAmt", "TransId", "FeeAmt", "MerPriv",
			"Version_No", "Biz_Type", "RpCode", "RpDesc", "Mac",
			"Sign_Type", "Char_Set" };

	/**
	 * 构造器
	 */
	public CbhbAppRechargeModel() {
		super();
		this.setTransid("CBHBNetLoanRecharge");
		this.setFrontUrl(TppPropertyUtil.getMessage("web_url") + "/cbhb/app/rechargeReturn.html");
		this.setBackUrl(TppPropertyUtil.getMessage("notify_web_url") + "/cbhb/app/rechargeNotify.html");
	}

	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		LOGGER.info("CbhbAppRechargeModel valid...");
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

	/**
	 * 回调参数封装
	 */
	public void response(Map<String, String> map) {
		super.response(map);
		this.setTransAmt(CbhbHelper.getStringLower(StringUtils.isNull(map.get("TransAmt"))));
		this.setTransId(StringUtils.isNull(map.get("TransId")));
		this.setMerFeeAmt(CbhbHelper.getStringLower(StringUtils.isNull(map.get("MerFeeAmt"))));
		this.setFeeAmt(CbhbHelper.getStringLower(StringUtils.isNull(map.get("FeeAmt"))));
		this.setMerPriv(StringUtils.isNull(map.get("MerPriv")));
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

	public String getMarketAmt() {
		return MarketAmt;
	}

	public void setMarketAmt(String marketAmt) {
		MarketAmt = marketAmt;
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

	public String getTransId() {
		return TransId;
	}

	public void setTransId(String transId) {
		TransId = transId;
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


}
