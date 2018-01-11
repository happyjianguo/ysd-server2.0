package com.rd.tpp.model.req;

import java.io.Serializable;

public class CbhbExperCapReqDetailModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5169805014149917880L;

	private String id;//序号
	
	private String plaCustId;//商户号
	
	private double tasteAmt;//本金金额
	
	private double interest;//收益金额
	
	private double inves_fee;//投资管理费

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

	public double getTasteAmt() {
		return tasteAmt;
	}

	public void setTasteAmt(double tasteAmt) {
		this.tasteAmt = tasteAmt;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getInves_fee() {
		return inves_fee;
	}

	public void setInves_fee(double inves_fee) {
		this.inves_fee = inves_fee;
	}
	
	
	
	
}
