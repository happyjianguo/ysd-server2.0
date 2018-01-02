/**
 * 互联网金融交易系统ifaes (Internet Finance  Assets  Exchange  System)
 * Copyright (c) 2016 杭州融都科技股份有限公司 版权所有
 */
package com.rd.tpp.model;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.StringUtils;
import com.rd.tpp.util.TppPropertyUtil;

/**
 * 批量投资撤销
 * 
 * @version 3.0
 * @author QianPengZhan
 * @date 2017年3月9日
 */
@SuppressWarnings("serial")
public class CbhbBatInvestCancleModel extends CbhbBaseModel {
	/**
	 * 场景描述： 网贷公司将投标撤销文件发送到账户存管平台ftp服务器后，发起http请求指令，
	 * 系统将指令文件获取后，解析文件入库，并返回接收结果给网贷公司，并在后台服务器上生成批量投标撤销结果文件。
	 */
	/**
	 * LOGGER
	 */
	private static final Logger LOGGER = LoggerFactory
			.getLogger(CbhbBatInvestCancleModel.class);

	/**
	 * 批次号
	 */
	private String batchNo;

	/**
	 * 文件名
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
	public CbhbBatInvestCancleModel() {
		super();
		this.setSaveRequest(true);
		this.setBizType(CbhbConstant.BIZ_TYPE_BAT_INVEST_CANCLE);
		this.setBgRetUrl(TppPropertyUtil.getMessage("notify_web_url") + "/cbhb/batInvestCancle/notify.html");
		this.setBatchNo(this.getMerBillNo().substring(this.getMerBillNo().length() - 10, this.getMerBillNo().length()));
		this.setFileName(this.getFileNameOnByRule());
	}

	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		if (StringUtils.isBlank(this.getBatchNo())) {
			throw new CbhbException("渤海银行请求批次号不能为空");
		}
	}

	/**
	 * 回调响应
	 */
	@Override
	public void response(Map<String, String> map) {
		this.setBatchNo(StringUtils.isNull(map.get("BatchNo")));
		super.response(map);
	}

	/**
	 * 获取属性batchNo的值
	 * 
	 * @return batchNo属性值
	 */
	public String getBatchNo() {
		return batchNo;
	}

	/**
	 * 设置属性batchNo的值
	 * 
	 * @param batchNo属性值
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	/**
	 * 获取属性fileName的值
	 * 
	 * @return fileName属性值
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * 设置属性fileName的值
	 * 
	 * @param fileName属性值
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * 获取属性requestParamNames的值
	 * 
	 * @return requestParamNames属性值
	 */
	public String[] getRequestParamNames() {
		return requestParamNames;
	}

	/**
	 * 设置属性requestParamNames的值
	 * 
	 * @param requestParamNames属性值
	 */
	public void setRequestParamNames(String[] requestParamNames) {
		this.requestParamNames = requestParamNames;
	}

	/**
	 * 获取属性responseParamNames的值
	 * 
	 * @return responseParamNames属性值
	 */
	public String[] getResponseParamNames() {
		return responseParamNames;
	}

	/**
	 * 设置属性responseParamNames的值
	 * 
	 * @param responseParamNames属性值
	 */
	public void setResponseParamNames(String[] responseParamNames) {
		this.responseParamNames = responseParamNames;
	}

}
