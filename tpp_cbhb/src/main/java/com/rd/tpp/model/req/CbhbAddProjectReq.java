package com.rd.tpp.model.req;

import java.util.Date;
/**
 * 渤海建标请求
 * @author wyw
 *
 */
public class CbhbAddProjectReq  extends BaseReq{
	private static final long serialVersionUID = 1362885370968578969L;
	
	private String borrowId;//borrowId
	
	private String borrowTyp;//1-对私 2-对公
	
	private double borrowerAmt;//项目金额
	
	private double borrowerInterestAmt;//项目预期年化

	private String borrCustId;//借款人存管平台标识 非渤海对公账户 需要先进行 大额充值开户接口开户

	private String accountName;// 对公账户户名 borrowTyp=2 必须填写
	
	private String guaranteeNo;//担保账户需线下开设账户的 标识 
	
	private Date  borrowerStartDate;//募集开始日
	
	private Date  borrowerEndDate;//募集到期日
	
	private Date  borrowerRepayDate;//标到期日
	
	private String investDateType;// 投资期限类型 1-日2-月3-年
	
	private String investPeriod;//投资期限
	
	private String borrowerDetails;//借款详情

	public String getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}

	public String getBorrowTyp() {
		return borrowTyp;
	}

	public void setBorrowTyp(String borrowTyp) {
		this.borrowTyp = borrowTyp;
	}

	public double getBorrowerAmt() {
		return borrowerAmt;
	}

	public void setBorrowerAmt(double borrowerAmt) {
		this.borrowerAmt = borrowerAmt;
	}

	public double getBorrowerInterestAmt() {
		return borrowerInterestAmt;
	}

	public void setBorrowerInterestAmt(double borrowerInterestAmt) {
		this.borrowerInterestAmt = borrowerInterestAmt;
	}

	public String getBorrCustId() {
		return borrCustId;
	}

	public void setBorrCustId(String borrCustId) {
		this.borrCustId = borrCustId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getGuaranteeNo() {
		return guaranteeNo;
	}

	public void setGuaranteeNo(String guaranteeNo) {
		this.guaranteeNo = guaranteeNo;
	}

	public Date getBorrowerStartDate() {
		return borrowerStartDate;
	}

	public void setBorrowerStartDate(Date borrowerStartDate) {
		this.borrowerStartDate = borrowerStartDate;
	}

	public Date getBorrowerEndDate() {
		return borrowerEndDate;
	}

	public void setBorrowerEndDate(Date borrowerEndDate) {
		this.borrowerEndDate = borrowerEndDate;
	}

	public Date getBorrowerRepayDate() {
		return borrowerRepayDate;
	}

	public void setBorrowerRepayDate(Date borrowerRepayDate) {
		this.borrowerRepayDate = borrowerRepayDate;
	}

	public String getInvestDateType() {
		return investDateType;
	}

	public void setInvestDateType(String investDateType) {
		this.investDateType = investDateType;
	}

	public String getInvestPeriod() {
		return investPeriod;
	}

	public void setInvestPeriod(String investPeriod) {
		this.investPeriod = investPeriod;
	}

	public String getBorrowerDetails() {
		return borrowerDetails;
	}

	public void setBorrowerDetails(String borrowerDetails) {
		this.borrowerDetails = borrowerDetails;
	}
	
}
