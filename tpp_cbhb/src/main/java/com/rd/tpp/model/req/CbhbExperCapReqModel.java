package com.rd.tpp.model.req;

import java.io.Serializable;
import java.util.List;

import com.rd.tpp.util.OrderNoUtils;
import com.rd.tpp.util.TppPropertyUtil;

/**
 * 3.10 红包体验金
 * @author wyw
 *
 */
public class CbhbExperCapReqModel extends BaseReq implements Serializable{

	private static final long serialVersionUID = 3875854233340827158L;
	
	private String borrowId;//标id
	
	private double merFeeAmt;//商户收取手续费
	
	private String capTyp;// 红包类型，1-普通红包2-收益红包3-体验金

	private List<CbhbExperCapReqDetailModel> detailList;//发放详情

	public String getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}

	public double getMerFeeAmt() {
		return merFeeAmt;
	}

	public void setMerFeeAmt(double merFeeAmt) {
		this.merFeeAmt = merFeeAmt;
	}

	public String getCapTyp() {
		return capTyp;
	}

	public void setCapTyp(String capTyp) {
		this.capTyp = capTyp;
	}


	public List<CbhbExperCapReqDetailModel> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<CbhbExperCapReqDetailModel> detailList) {
		this.detailList = detailList;
	}
	
}
