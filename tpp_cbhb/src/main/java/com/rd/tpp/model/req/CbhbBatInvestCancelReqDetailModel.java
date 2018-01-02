package com.rd.tpp.model.req;


/**
 * TODO 渤海批量投标撤销明细类
 * 
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年7月9日 下午1:11:52
 */
public class CbhbBatInvestCancelReqDetailModel {
	/**
	 * 序号
	 */
	private String id;
	
	/**
	 * 原账户存管平台流水（投标时返回的transId）
	 */
	private String oldTransId;
	
	/**
	 * 投资人存管客户号
	 */
	private String plaCustId;
	
	/**
	 * 原投标金额
	 */
	private double transAmt;
	
	/**
	 * 冻结编号
	 */
	private String freezeId;

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
	 * 获取oldTransId
	 * @return oldTransId
	 */
	public String getOldTransId() {
		return oldTransId;
	}

	/**
	 * 设置oldTransId
	 * @param oldTransId 要设置的oldTransId
	 */
	public void setOldTransId(String oldTransId) {
		this.oldTransId = oldTransId;
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
	public double getTransAmt() {
		return transAmt;
	}

	/**
	 * 设置transAmt
	 * @param transAmt 要设置的transAmt
	 */
	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}

	/**
	 * 获取freezeId
	 * @return freezeId
	 */
	public String getFreezeId() {
		return freezeId;
	}

	/**
	 * 设置freezeId
	 * @param freezeId 要设置的freezeId
	 */
	public void setFreezeId(String freezeId) {
		this.freezeId = freezeId;
	}
	
}
