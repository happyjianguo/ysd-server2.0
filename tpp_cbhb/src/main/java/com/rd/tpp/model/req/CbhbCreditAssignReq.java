package com.rd.tpp.model.req;

import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.BigDecimalUtils;

/**
 * 债权转让请求
 * @author wyw
 *
 */
public class CbhbCreditAssignReq  extends BaseReq{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6313810712895137890L;
	
	private double transAmt;//交易金额  本金 （折扣后）+ 利息
	
	private String oldTransId;// 转让人投资存管流水
	
	private double merFeeAmt; // 商户收取的手续费
	
	private String feeType;// 手续费类型 0 受让人出，1 转让人出
	
	
	private String outCustId;// 受让人客户号
	
	private String inCustId;// 转让人客户号
	
	private String smsCode; //短信动态验证码
	
	private String borrowId;//原始标的id
	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}

	public String getOldTransId() {
		return oldTransId;
	}

	public void setOldTransId(String oldTransId) {
		this.oldTransId = oldTransId;
	}

	public double getMerFeeAmt() {
		return merFeeAmt;
	}

	public void setMerFeeAmt(double merFeeAmt) {
		this.merFeeAmt = merFeeAmt;
	}

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getOutCustId() {
		return outCustId;
	}

	public void setOutCustId(String outCustId) {
		this.outCustId = outCustId;
	}

	public String getInCustId() {
		return inCustId;
	}

	public void setInCustId(String inCustId) {
		this.inCustId = inCustId;
	}

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}
	public double getOutAmt() {
		if("1".equalsIgnoreCase(getFeeType())){
			return getTransAmt();	
		}else if("0".equalsIgnoreCase(getFeeType())){
			return  BigDecimalUtils.add(getTransAmt(), getMerFeeAmt());
		}else{
			throw new CbhbException("参数feeType错误");
		}
	}
	public double getInAmt() {
		if("1".equalsIgnoreCase(getFeeType())){
			return BigDecimalUtils.sub(getTransAmt(), getMerFeeAmt());	
		}else if("0".equalsIgnoreCase(getFeeType())){
			return  getTransAmt();
		}else{
			throw new CbhbException("参数feeType错误");
		}
	}
}
