package com.rd.tpp.model;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.util.StringUtils;
import com.rd.tpp.util.TppPropertyUtil;

/**
 * 
 * 2.1 存量用户注册(ftp文件&后台方式)
 * 
 * @version 3.0
 * @author ZhangBiao
 * @date 2017年2月21日
 */
public class CbhbExistUserRegisterModel extends CbhbBaseModel {

	private static final long serialVersionUID = -3639191443537894840L;
	/**
	 * LOGGER
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CbhbExistUserRegisterModel.class);

	/**
	 * 批次号 String(10)
	 */
	private String batchNo;

	/**
	 * 文件名 String(256)
	 */
	private String fileName;

	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "char_set",
			"partner_id", "version_no", "biz_type", "sign_type", "MerBillNo",
			"BatchNo", "BgRetUrl", "FileName", "MerPriv", "mac" };

	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "partner_id",
			"version_no", "biz_type", "sign_type", "BatchNo", "MerBillNo",
			"RespCode", "RespDesc", "mac" };

	/**
	 * 构造器
	 */
	public CbhbExistUserRegisterModel() {
		super();
		this.setBizType(CbhbConstant.BIZ_TYPE_EXIST_USER_REGISTER);
		this.setBgRetUrl(TppPropertyUtil.getMessage("notify_web_url") + "/cbhb/existUserRegister/notify.html");
		this.setFileName(this.getFileNameOnByRule());
	}

	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		LOGGER.info("existUserRegister valid...");
	}

	/**
	 * 回调响应
	 */
	@Override
	public void response(Map<String, String> map) {
		LOGGER.info("existUserRegister....");
		this.setBatchNo(StringUtils.isNull(map.get("BatchNo")));
		super.response(map);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String[] getRequestParamNames() {
		return requestParamNames;
	}

	public void setRequestParamNames(String[] requestParamNames) {
		this.requestParamNames = requestParamNames;
	}

	public String[] getResponseParamNames() {
		return responseParamNames;
	}

	public void setResponseParamNames(String[] responseParamNames) {
		this.responseParamNames = responseParamNames;
	}

}
