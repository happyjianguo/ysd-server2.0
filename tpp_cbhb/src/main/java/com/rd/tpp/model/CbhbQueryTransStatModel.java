package com.rd.tpp.model;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.util.StringUtils;

/**
 * 
 * 4.4 交易状态查询（后台方式）
 * 
 * @version 3.0
 * @author ZhangBiao
 * @date 2017年2月21日
 */
@SuppressWarnings("serial")
public class CbhbQueryTransStatModel extends CbhbBaseModel {

	/**
	 * Log
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbQueryTransStatModel.class);
	
	/**
	 * 查询交易类型 String(32)
	 */
	private String queryTransType;

	/**
	 * 交易状态 String(2)
	 */
	private String transStat;
	
	/**
	 * 投标冻结编号
	 */
	private String freezeId;
	
	/**
	 * 充值失败时具体原因
	 */
	private String falRsn;

	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "char_set",
			"partner_id", "version_no", "biz_type", "sign_type", "MerBillNo",
			"QueryTransType", "mac" };

	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "partner_id",
			"version_no", "biz_type", "sign_type", "RespCode", "RespDesc",
			"MerBillNo", "TransStat", "FreezeId", "FalRsn", "mac" };

	/**
	 * 构造器
	 */
	public CbhbQueryTransStatModel() {
		super();
		this.setSaveRequest(false);
		this.setBizType(CbhbConstant.BIZ_TYPE_QUERY_TRANS_STAT);
	}

	/**
	 * 响应回调
	 */
	@Override
	public void response(Map<String, String> map) {
		LOGGER.info(CbhbConstant.BIZ_TYPE_QUERY_TRANS_STAT);
		this.setTransStat(StringUtils.isNull(map.get("TransStat")));
		if (CbhbConstant.BIZ_TYPE_WEB_RECHARGE.equals(this.queryTransType)) {
			this.setFalRsn(map.get("FalRsn"));
		}
		if (CbhbConstant.BIZ_TYPE_BACK_INVEST.equals(this.queryTransType)) {
			this.setFreezeId(map.get("FreezeId"));
		}
		super.response(map);
	}

	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		LOGGER.info("CbhbQueryTransStatModel valid...");
	}

	/**
	 * 获取queryTransType
	 * @return queryTransType
	 */
	public String getQueryTransType() {
		return queryTransType;
	}

	/**
	 * 设置queryTransType
	 * @param queryTransType 要设置的queryTransType
	 */
	public void setQueryTransType(String queryTransType) {
		this.queryTransType = queryTransType;
	}

	/**
	 * 获取transStat
	 * @return transStat
	 */
	public String getTransStat() {
		return transStat;
	}

	/**
	 * 设置transStat
	 * @param transStat 要设置的transStat
	 */
	public void setTransStat(String transStat) {
		this.transStat = transStat;
	}

	/**
	 * 获取freezeId
	 * @return freezeId
	 */
	public String getFreezeId() {
		return freezeId;
	}

	/**
	 * 设置freezeId
	 * @param freezeId 要设置的freezeId
	 */
	public void setFreezeId(String freezeId) {
		this.freezeId = freezeId;
	}

	/**
	 * 获取falRsn
	 * @return falRsn
	 */
	public String getFalRsn() {
		return falRsn;
	}

	/**
	 * 设置falRsn
	 * @param falRsn 要设置的falRsn
	 */
	public void setFalRsn(String falRsn) {
		this.falRsn = falRsn;
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
