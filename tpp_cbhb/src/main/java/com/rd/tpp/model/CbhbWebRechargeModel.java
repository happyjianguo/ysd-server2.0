package com.rd.tpp.model;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.StringUtils;
import com.rd.tpp.util.TppPropertyUtil;

/**
 * 
 * 3.1 用户充值（页面方式）
 * 
 * @version 3.0
 * @author ZhangBiao
 * @date 2017年2月21日
 */
@SuppressWarnings("serial")
public class CbhbWebRechargeModel extends CbhbBaseModel {
	/**
	 * LOGGER
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbUnHoldAmtModel.class);
	/**
	 * 账户存管平台客户号 String(16)
	 */
	private String plaCustId;

	/**
	 * 交易金额 Number(16)
	 */
	private String transAmt;

	/**
	 * 手续费模式 String(1)
	 */
	private String feeType;

	/**
	 * 商户手续费收入 Number(10)
	 */
	private String merFeeAmt;

	/**
	 * 营销金额 Number(16)
	 */
	private String marketAmt;

	/**
	 * 手续费 Number(10)
	 */
	private String feeAmt;

	/**
	 * 账户存管平台流水号 String(32)
	 */
	private String transId;

	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "char_set",
			"partner_id", "version_no", "biz_type", "sign_type", "MerBillNo",
			"PlaCustId", "TransAmt", "FeeType", "MerFeeAmt", "MarketAmt",
			"PageReturnUrl", "BgRetUrl", "MerPriv", "mac", "merchantCert" };

	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "char_set",
			"partner_id", "version_no", "biz_type", "sign_type", "MerBillNo",
			"RespCode", "RespDesc", "TransAmt", "TransId", "MerFeeAmt",
			"FeeAmt", "MerPriv", "mac" };

	/**
	 * 构造器
	 */
	public CbhbWebRechargeModel() {
		super();
		this.setSaveRequest(true);
		this.setBizType(CbhbConstant.BIZ_TYPE_WEB_RECHARGE);
		this.setPageReturnUrl(TppPropertyUtil.getMessage("web_url") + "/cbhb/recharge/return.html");
		this.setBgRetUrl(TppPropertyUtil.getMessage("notify_web_url") + "/cbhb/recharge/notify.html");
	}

	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		LOGGER.info("CbhbSendUapMsgModel valid...");
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
		if (StringUtils.isBlank(this.getPageReturnUrl())) {
			throw new CbhbException("渤海银行请求页面返回url不能为空");
		}
		if (StringUtils.isBlank(this.getBgRetUrl())) {
			throw new CbhbException("渤海银行请求后台通知url不能为空");
		}
	}

	/**
	 * 回调参数封装
	 */
	public void response(Map<String, String> map) {
//		this.setTransAmt(CbhbHelper.getStringLower(StringUtils.isNull(map.get("TransAmt"))));
		this.setTransAmt(StringUtils.isNull(map.get("TransAmt")));
		this.setTransId(StringUtils.isNull(map.get("TransId")));
		this.setMerFeeAmt(StringUtils.isNull(map.get("MerFeeAmt")));
		this.setFeeAmt(StringUtils.isNull(map.get("FeeAmt")));
		this.setMerPriv(StringUtils.isNull(map.get("MerPriv")));
		super.response(map);
	}

	public String getPlaCustId() {
		return plaCustId;
	}

	public void setPlaCustId(String plaCustId) {
		this.plaCustId = plaCustId;
	}

	public String getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getMerFeeAmt() {
		return merFeeAmt;
	}

	public void setMerFeeAmt(String merFeeAmt) {
		this.merFeeAmt = merFeeAmt;
	}

	public String getMarketAmt() {
		return marketAmt;
	}

	public void setMarketAmt(String marketAmt) {
		this.marketAmt = marketAmt;
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
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}

}
