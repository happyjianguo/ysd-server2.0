package com.rd.tpp.model;

import java.util.Map;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.StringUtils;

/**
 * 查询商户所有交易流水，查询接口返回成功后
 * 则在指定目录下生成文件。如今天是
	20150403，网贷公司通过ftp 直接在./CHK/20150403 目录下获取。同一天查询相同日期
	的文件会覆盖
 * @author wyw
 *
 */
public class CbhbQueryMerchantTrans extends CbhbBaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8365274904240218400L;
	
	private String  startDate;// 查询开始日期
	
	private String  endDate;//查询结束日期 间隔不能超过七天
	
	private String  fileName;//结果文件
	
	
	
	/**
	 * 请求参数
	 */
	private String[] requestParamNames = new String[] { "char_set",
			"partner_id", "version_no", "biz_type", "sign_type", "StartDate",
			"EndDate","mac" };
	
	
	/**
	 * 响应参数
	 */
	private String[] responseParamNames = new String[] { "partner_id",
			"version_no", "biz_type","sign_type","RespCode","RespDesc", "FileName", "mac" };
	
	public CbhbQueryMerchantTrans() {
		super();
		this.setSaveRequest(false);
		this.setBizType("QueryMerchantTrans");
	}
	
	/**
	 * 通用 回调信息处理 有子类 每个子类需重写此类
	 */
	public void response(Map<String, String> map) {
		this.setFileName(StringUtils.isNull(map.get("FileName")));
		super.response(map);
	}
	
	/**
	 * 请求参数校验
	 */
	@Override
	public void requestColumnValid() {
		super.requestColumnValid();
		if (StringUtils.isBlank(this.getStartDate())) {
			throw new CbhbException("渤海银行请求起始时间不能为空");
		}else if(StringUtils.isBlank(this.getEndDate())){
			throw new CbhbException("渤海银行请求结束时间不能为空");	
		}
		//间隔时间不能超过七天
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
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
