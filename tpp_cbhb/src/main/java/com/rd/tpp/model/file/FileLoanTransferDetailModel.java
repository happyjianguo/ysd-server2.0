package com.rd.tpp.model.file;

import com.rd.tpp.model.CbhbBaseModel;


/**
 * TODO 标的迁移明细实体类
 * 
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年8月1日 上午10:07:58
 */
@SuppressWarnings("serial")
public class FileLoanTransferDetailModel extends CbhbBaseModel{
	
	/**
	 * 序号
	 */
	private String id;
	
	/**
	 * 投资流水号
	 */
	private String investMerNo;
	
	/**
	 * 账户存管平台客户号
	 */
	private String plaCustId;
	
	/**
	 * 交易金额
	 */
	private String transAmt;
	
	/**
	 * 商户保留域
	 */
	private String merPriv;
	
	// 回调参数
	/**
	 * 手续费
	 */
	private String feeAmt;
	
	/**
	 * 账户存管平台流水
	 */
	private String transId;
	
	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] {"ID", "InvestMerNo", "PlaCustId", "TransAmt", "MerPriv"};

	/**
	 * 获取id
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置id
	 * @param id 要设置的id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取investMerNo
	 * @return investMerNo
	 */
	public String getInvestMerNo() {
		return investMerNo;
	}

	/**
	 * 设置investMerNo
	 * @param investMerNo 要设置的investMerNo
	 */
	public void setInvestMerNo(String investMerNo) {
		this.investMerNo = investMerNo;
	}

	/**
	 * 获取plaCustId
	 * @return plaCustId
	 */
	public String getPlaCustId() {
		return plaCustId;
	}

	/**
	 * 设置plaCustId
	 * @param plaCustId 要设置的plaCustId
	 */
	public void setPlaCustId(String plaCustId) {
		this.plaCustId = plaCustId;
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
	 * 获取merPriv
	 * @return merPriv
	 */
	public String getMerPriv() {
		return merPriv;
	}

	/**
	 * 设置merPriv
	 * @param merPriv 要设置的merPriv
	 */
	public void setMerPriv(String merPriv) {
		this.merPriv = merPriv;
	}

	/**
	 * 获取feeAmt
	 * @return feeAmt
	 */
	public String getFeeAmt() {
		return feeAmt;
	}

	/**
	 * 设置feeAmt
	 * @param feeAmt 要设置的feeAmt
	 */
	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
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

}
