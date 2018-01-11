package com.rd.tpp.model;

import java.util.Map;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.StringUtils;

/**
 * TODO 用户资金转移（后台方式）
 * 支持商户下用户进行存量资金转移，发起交易时由商户结算户扣款到商户存管户，且为用户增加电子账户余额
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年7月28日 上午9:27:38
 */
public class CbhbUserBalTransferModel extends CbhbBaseModel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5230341465252935044L;
	
	/**
	 * 交易金额
	 */
	private String transAmt;
	
	/**
	 * 账户存管平台流水号
	 */
	private String transId;
	
	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "char_set",
			"partner_id", "version_no", "biz_type", "sign_type", "MerBillNo",
			"PlaCustId", "TransAmt", "mac" };

	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "partner_id",
			"version_no", "biz_type", "sign_type", "MerBillNo", "TransId",
			"RespCode", "RespDesc", "mac" };

	
	public CbhbUserBalTransferModel() {
		super();
		this.setSaveRequest(true);
		this.setBizType(CbhbConstant.BIZ_TYPE_USER_BAL_TRANSFER);
	}
	
	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		if (StringUtils.isBlank(this.getPlaCustId())) {
			throw new CbhbException("渤海银行请求账户存管平台客户号plaCustId不能为空");
		}
		if (StringUtils.isBlank(this.getTransAmt())) {
			throw new CbhbException("渤海银行请求交易金额transAmt不能为空");
		}
	}
	
	/**
	 * 响应参数
	 */
	public void response(Map<String, String> map) {
		this.setTransId(StringUtils.isNull(map.get("TransId")));
		super.response(map);
	}

	/**
	 * 获取transAmt
	 * @return transAmt
	 */
	public String getTransAmt() {
		return transAmt;
	}

	/**
	 * 设置transAmt
	 * @param transAmt 要设置的transAmt
	 */
	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	/**
	 * 获取transId
	 * @return transId
	 */
	public String getTransId() {
		return transId;
	}

	/**
	 * 设置transId
	 * @param transId 要设置的transId
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
