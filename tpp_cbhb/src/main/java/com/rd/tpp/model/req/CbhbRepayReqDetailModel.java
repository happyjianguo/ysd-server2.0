package com.rd.tpp.model.req;


public class CbhbRepayReqDetailModel {
	
	
	private String id;//序号
	
	private String plaCustId;//投资人存管账户
	
	private double transAmt;// 还款本金
	
	private double interest; // 还款利息
	
	private double Inves_fee ;// 投资管理费

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlaCustId() {
		return plaCustId;
	}

	public void setPlaCustId(String plaCustId) {
		this.plaCustId = plaCustId;
	}

	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getInves_fee() {
		return Inves_fee;
	}

	public void setInves_fee(double inves_fee) {
		Inves_fee = inves_fee;
	}
}
