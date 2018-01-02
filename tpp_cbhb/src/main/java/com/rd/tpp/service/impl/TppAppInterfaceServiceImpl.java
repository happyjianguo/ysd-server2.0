package com.rd.tpp.service.impl;

import java.util.Map;

import com.rd.tpp.model.CbhbHelper;
import com.rd.tpp.model.app.CbhbAppBindCardWebModel;
import com.rd.tpp.model.app.CbhbAppDrawingsModel;
import com.rd.tpp.model.app.CbhbAppRealNameWebModel;
import com.rd.tpp.model.app.CbhbAppRechargeModel;
import com.rd.tpp.service.TppAppInterfaceService;
import com.rd.tpp.util.StringUtils;
import com.rd.tpp.util.TppPropertyUtil;
import org.apache.logging.log4j.LogManager;

public class TppAppInterfaceServiceImpl implements TppAppInterfaceService {
    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(TppAppInterfaceServiceImpl.class);


    @Override
	public Object tppAppRegister(Map<String, Object> params) {
		final CbhbAppRealNameWebModel realNameApp = new CbhbAppRealNameWebModel();
		realNameApp.setMobileNo(params.get("mobileNo").toString());
		realNameApp.setUsrFlag("0");//0：新用户；1：老用户
		realNameApp.setMerPriv(StringUtils.isNull(params.get("merPriv")));
		if ("wechat".equals(params.get("channel"))) {
			realNameApp.setFrontUrl(TppPropertyUtil.getMessage("web_url") 
					+ "/cbhb/wechat/registerReturn.html");
		}
		realNameApp.requestColumnValid();
		LOGGER.info(realNameApp.getRequestUrl());
		return realNameApp;
	}

	@Override
	public Object tppAppUpdateBankCard(Map<String, Object> params) {
		final CbhbAppBindCardWebModel bindcard = new CbhbAppBindCardWebModel();
		bindcard.setPlaCustId(params.get("plaCustId").toString());
		if ("wechat".equals(params.get("channel"))) {
			bindcard.setFrontUrl(TppPropertyUtil.getMessage("web_url") 
					+ "/cbhb/wechat/bindCardReturn.html");
		}
		bindcard.requestColumnValid();
		LOGGER.info(bindcard.getRequestUrl());
		return bindcard;
	}
	
	/**
	 * 渤海银行-- 取现
	 */
	@Override
	public Object tppAppCash(Map<String, Object> params) {
		final CbhbAppDrawingsModel drawingsModel = new CbhbAppDrawingsModel();
		drawingsModel.setPlaCustId(params.get("plaCustId").toString());
		/*String transAmt = CbhbHelper.getBigDecimalMoneyUpper(StringUtils.isNull(params.get("amount")));*/
		String servFee = CbhbHelper.getBigDecimalMoneyUpper(StringUtils.isNull(params.get("servFee"))); // 商户收取用户手续费
		String isAdvance = StringUtils.isNull(params.get("isAdvance")); // 是否垫付
		drawingsModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(StringUtils.isNull(params.get("amount"))));
		drawingsModel.setFeeType("Y".equals(isAdvance) ? "0" : "1"); // 垫付就是不收取用户手续费 为0 不垫付就是收取 为 1
		drawingsModel.setMerFeeAmt("Y".equals(isAdvance) ? "0" : servFee);
		if ("wechat".equals(params.get("channel"))) {
			drawingsModel.setFrontUrl(TppPropertyUtil.getMessage("web_url") 
					+ "/cbhb/wechat/cashReturn.html");
		}
		drawingsModel.requestColumnValid();
		LOGGER.info(drawingsModel.getRequestUrl());
		return drawingsModel;
	}
	/**
	 * 渤海银行-- 充值
	 */
	@Override
	public Object tppAppRecharge(Map<String, Object> params) {
		final CbhbAppRechargeModel cbhbWebRechargeModel = new CbhbAppRechargeModel();
		cbhbWebRechargeModel.setPlaCustId(params.get("plaCustId").toString());
		cbhbWebRechargeModel.setTransAmt(CbhbHelper.getBigDecimalMoneyUpper(StringUtils.isNull(params.get("amount"))));
		cbhbWebRechargeModel.setFeeType(params.get("feeType").toString());
		cbhbWebRechargeModel.setMerFeeAmt(CbhbHelper.getBigDecimalMoneyUpper(StringUtils.isNull(params.get("merFeeAmt"))));
		if ("wechat".equals(params.get("channel"))) {
			cbhbWebRechargeModel.setFrontUrl(TppPropertyUtil.getMessage("web_url") 
					+ "/cbhb/wechat/rechargeReturn.html");
		}
		cbhbWebRechargeModel.requestColumnValid();
		LOGGER.info(cbhbWebRechargeModel.getRequestUrl());
//		params.put("orderNo", cbhbWebRechargeModel.getMerBillNo());
		return cbhbWebRechargeModel;
	}
}
