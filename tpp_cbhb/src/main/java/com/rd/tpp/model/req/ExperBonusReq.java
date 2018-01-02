package com.rd.tpp.model.req;

public class ExperBonusReq extends BaseReq{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2635428107736351846L;
	
	
	private double transAmt;//交易金额
	
	private double merFeeAmt;//手续费

	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}

	public double getMerFeeAmt() {
		return merFeeAmt;
	}

	public void setMerFeeAmt(double merFeeAmt) {
		this.merFeeAmt = merFeeAmt;
	}
}
