package com.rd.tpp.model.req;


/**
 * TODO 存量标转移请求详情
 * 
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年8月1日 下午2:04:15
 */
public class CbhbFileLoanTransferReqDetailModel {
	
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

}
