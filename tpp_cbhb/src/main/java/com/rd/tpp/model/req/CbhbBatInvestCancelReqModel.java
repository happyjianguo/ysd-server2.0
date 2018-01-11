package com.rd.tpp.model.req;

import java.io.Serializable;
import java.util.List;

/**
 * TODO 渤海批量投标撤销文件接口请求参数封装
 * 
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年7月9日 下午1:15:50
 */
public class CbhbBatInvestCancelReqModel extends BaseReq {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1683282925804419492L;

	/**
	 * 投标撤销明细
	 */
	List<CbhbBatInvestCancelReqDetailModel> batInvestCancelDetailList;

	/**
	 * 获取batInvestCancelDetailList
	 * @return batInvestCancelDetailList
	 */
	public List<CbhbBatInvestCancelReqDetailModel> getBatInvestCancelDetailList() {
		return batInvestCancelDetailList;
	}

	/**
	 * 设置batInvestCancelDetailList
	 * @param batInvestCancelDetailList 要设置的batInvestCancelDetailList
	 */
	public void setBatInvestCancelDetailList(
			List<CbhbBatInvestCancelReqDetailModel> batInvestCancelDetailList) {
		this.batInvestCancelDetailList = batInvestCancelDetailList;
	}	
}
