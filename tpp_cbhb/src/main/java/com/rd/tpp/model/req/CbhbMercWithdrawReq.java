package com.rd.tpp.model.req;

/**
 * 商户取现请求
 * @author wyw
 *
 */
public class CbhbMercWithdrawReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8451637462083484487L;
	
	private double transAmt;//取现金额

	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}
	
	

}
