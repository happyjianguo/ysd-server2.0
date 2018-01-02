package com.rd.tpp.model.chk;

import java.util.Date;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.util.DateUtils;
import com.rd.tpp.util.TppPropertyUtil;

/**
 * TODO 5.3 资金转移对账文件(ftp文件)
 * 
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年7月28日 上午9:47:32
 */
@SuppressWarnings("serial")
public class CbhbTransferChkModel extends CbhbChkBaseModel{
	
	/**
	 * 账户存管平台流水号
	 */
	private String transId;
	
	/**
	 * 商户流水号
	 */
	private String merBillNo;
	
	/**
	 * 订单日期（yyyyMMdd）
	 */
	private String creDt;
	
	/**
	 * 交易金额
	 */
	private String transAmt;
	
	/**
	 * 账户存管平台ID
	 */
	private String plaCustId;
	
	/**
	 * TODO 下载文件名称
	 * @param time
	 * @return
	 * @author zza@erongdu.com
	 * @since 2017年7月28日 上午9:53:13
	 */
	public String getResultFileName(Date time) {
		String date = DateUtils.formatDate(
				DateUtils.rollDay(time, CbhbConstant.INT_ONE_NEGA),
				DateUtils.DATEFORMAT_STR_yyyyMMdd);
		return TppPropertyUtil.getMessage("partner_id") + "_" + date
				+ "TRANSFER_chk.txt";
	}
	

	/**
	 * 获取transId
	 * @return transId
	 */
	public String getTransId() {
		return transId;
	}

	/**
	 * 设置transId
	 * @param transId 要设置的transId
	 */
	public void setTransId(String transId) {
		this.transId = transId;
	}

	/**
	 * 获取merBillNo
	 * @return merBillNo
	 */
	public String getMerBillNo() {
		return merBillNo;
	}


	/**
	 * 设置merBillNo
	 * @param merBillNo 要设置的merBillNo
	 */
	public void setMerBillNo(String merBillNo) {
		this.merBillNo = merBillNo;
	}


	/**
	 * 获取creDt
	 * @return creDt
	 */
	public String getCreDt() {
		return creDt;
	}

	/**
	 * 设置creDt
	 * @param creDt 要设置的creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}

	/**
	 * 获取transAmt
	 * @return transAmt
	 */
	public String getTransAmt() {
		return transAmt;
	}

	/**
	 * 设置transAmt
	 * @param transAmt 要设置的transAmt
	 */
	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
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

	@Override
	public String toString() {
		return "{TransId=" + this.getTransId() + ",MerBillNo="
				+ this.getMerBillNo() + ",Credt=" + this.getCreDt()
				+ ",TransAmt=" + this.getTransAmt() + ",PlaCustId="
				+ this.getPlaCustId() + "}";
	}
	
	
}
