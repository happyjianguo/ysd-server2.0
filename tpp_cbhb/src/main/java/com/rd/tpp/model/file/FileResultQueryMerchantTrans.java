package com.rd.tpp.model.file;

import java.io.Serializable;

/**
 * 商户资金日志查询结果文件
 * @author wyw
 *
 */
public class FileResultQueryMerchantTrans  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7636390225947432093L;
	
	private String transId;//订单流水号
	
	private String creDt;// 订单日期 yyyyMMdd

	private String acTyp;// 账户类型
	
	private double transAmt;//交易金额
	
	private String transDesc;//交易描述

	
	
	/**
	 * 账户名称
	 */
	private String acTypName;
	
	
	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}


	public String getCreDt() {
		return creDt;
	}

	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}

	public String getAcTyp() {
		return acTyp;
	}

	public void setAcTyp(String acTyp) {
		this.acTyp = acTyp;
	}

	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}

	public String getTransDesc() {
		return transDesc;
	}

	public void setTransDesc(String transDesc) {
		this.transDesc = transDesc;
	}
	/**
	 * 获取属性acTypName的值
	 * @return acTypName属性值
	 */
	public String getAcTypName() {
		/**
		 *  800：手续费收入账户
				810：营销账户
				820：预付费账户
				830：现金账户
				840：信用账户

		 */
		if("800".equals(this.getAcTyp())){
			return "手续费收入账户";
		}else if("810".equals(this.getAcTyp())){
			return "营销账户";
		}else if("820".equals(this.getAcTyp())){
			return "预付费账户";
		}else if("830".equals(this.getAcTyp())){
			return "现金账户";
		}else if("840".equals(this.getAcTyp())){
			return "信用账户";
		}
		return acTypName;
	}
	
	
}
