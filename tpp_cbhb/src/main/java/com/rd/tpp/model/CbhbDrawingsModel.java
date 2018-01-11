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
import com.rd.tpp.util.TppPropertyUtil;

/**
 * 用户提现（页面方式）
 * 
 * @version 3.0
 * @author QianPengZhan
 * @date 2017年2月27日
 */
@SuppressWarnings("serial")
public class CbhbDrawingsModel extends CbhbBaseModel {
	/**
	 * 场景描述：投资人或借款人需要进行取现操作，触发此交易。网贷公司发起提现请求后，跳转到账户存管平台页面，
	 * 账户存管平台页面输入支付密码/手机动态口令后，完成提现申请操作（提现一般会在24小时内划转到绑定的银行卡中，
	 * 根据业务要求而定）即通过“用户提现结果通知”接口返回给网贷公司。
	 */

	/**
	 * LOGer
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbDrawingsModel.class);

	// 请求参数
	/**
	 * 交易金额(交易金额中包含商户手续费收入金额) 同时也是返回参数
	 */
	private String transAmt;

	/**
	 * 手续费模式(0不收取， 1商户收取用户手续费)
	 */
	private String feeType;

	/**
	 * 商户手续费收入(商户收取用户手续费，FeeType为1时不可空，FeeType为0时上送0) 同时也是返回参数
	 */
	private String merFeeAmt;

	// 返回参数
	/**
	 * 账户存管平台流水号
	 */
	private String transId;

	/**
	 * 手续费
	 */
	private String feeAmt;

	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "char_set",
			"partner_id", "version_no", "biz_type", "sign_type", "MerBillNo",
			"PlaCustId", "TransAmt", "FeeType", "MerFeeAmt", "PageReturnUrl",
			"BgRetUrl", "MerPriv", "mac" };

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
	public CbhbDrawingsModel() {
		super();
		this.setSaveRequest(true);
		this.setBizType(CbhbConstant.BIZ_TYPE_DRAWINGS);
		this.setPageReturnUrl(TppPropertyUtil.getMessage("web_url") + "/cbhb/cash/return.html");
		this.setBgRetUrl(TppPropertyUtil.getMessage("notify_web_url") + "/cbhb/cash/notify.html");
	}

	/**
	 * 回调信息
	 */
	@Override
	public void response(Map<String, String> map) {
//		this.setTransAmt(CbhbHelper.getStringLower(StringUtils.isNull(map.get("TransAmt"))));
		this.setTransAmt(StringUtils.isNull(map.get("TransAmt")));
		this.setTransId(StringUtils.isNull(map.get("TransId")));
		this.setMerFeeAmt(StringUtils.isNull(map.get("MerFeeAmt")));
		this.setFeeAmt(StringUtils.isNull(map.get("FeeAmt")));
		super.response(map);
	}

	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		LOGGER.info("cbhbDrawings valid...");
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
	 * 获取属性feeType的值
	 * 
	 * @return feeType属性值
	 */
	public String getFeeType() {
		return feeType;
	}

	/**
	 * 设置属性feeType的值
	 * 
	 * @param feeType属性值
	 */
	public void setFeeType(String feeType) {
		this.feeType = feeType;
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
	 * 获取属性requestParamNames的值
	 * 
	 * @return requestParamNames属性值
	 */
	public String[] getRequestParamNames() {
		return requestParamNames;
	}

	/**
	 * 设置属性requestParamNames的值
	 * 
	 * @param requestParamNames属性值
	 */
	public void setRequestParamNames(String[] requestParamNames) {
		this.requestParamNames = requestParamNames;
	}

	/**
	 * 获取属性responseParamNames的值
	 * 
	 * @return responseParamNames属性值
	 */
	public String[] getResponseParamNames() {
		return responseParamNames;
	}

	/**
	 * 设置属性responseParamNames的值
	 * 
	 * @param responseParamNames属性值
	 */
	public void setResponseParamNames(String[] responseParamNames) {
		this.responseParamNames = responseParamNames;
	}

	/**
	 * 获取属性transAmt的值
	 * 
	 * @return transAmt属性值
	 */
	public String getTransAmt() {
		return transAmt;
	}

	/**
	 * 设置属性transAmt的值
	 * 
	 * @param transAmt属性值
	 */
	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	/**
	 * 获取属性merFeeAmt的值
	 * 
	 * @return merFeeAmt属性值
	 */
	public String getMerFeeAmt() {
		return merFeeAmt;
	}

	/**
	 * 设置属性merFeeAmt的值
	 * 
	 * @param merFeeAmt属性值
	 */
	public void setMerFeeAmt(String merFeeAmt) {
		this.merFeeAmt = merFeeAmt;
	}

	/**
	 * 获取属性feeAmt的值
	 * 
	 * @return feeAmt属性值
	 */
	public String getFeeAmt() {
		return feeAmt;
	}

	/**
	 * 设置属性feeAmt的值
	 * 
	 * @param feeAmt属性值
	 */
	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}

}
