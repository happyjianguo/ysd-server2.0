package com.rd.tpp.model.req;

/**
 *  用户资金转移
 * @author wyw
 *
 */
public class CbhbUserBalTransferReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2014292131519804350L;
	
	private double transAmt;//交易金额

	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}
	
	

}
