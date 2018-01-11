package com.rd.tpp.model.req;

/**
 * 投标请求参数
 * @author wyw
 *
 */
public class CbhbInvestReq  extends BaseReq{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7761777584609281060L;
	
	private String oldMerBillNo;//冻结流水号 
	
	private String busiType;//1冻结投资 2 先解冻后投资
	
	private String smsCode;//动态短信
	
	private double transAmt;//交易金额（包含营销金额）
	
	private double marketAmt;//营销金额 红包
	
	private String borrowId;//标id

	public String getOldMerBillNo() {
		return oldMerBillNo;
	}

	public void setOldMerBillNo(String oldMerBillNo) {
		this.oldMerBillNo = oldMerBillNo;
	}

	public String getBusiType() {
		return busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}

	public double getMarketAmt() {
		return marketAmt;
	}

	public void setMarketAmt(double marketAmt) {
		this.marketAmt = marketAmt;
	}

	public String getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}
	
	

}
