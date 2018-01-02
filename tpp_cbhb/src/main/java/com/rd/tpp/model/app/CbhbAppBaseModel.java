package com.rd.tpp.model.app;

import com.alibaba.fastjson.JSONArray;
import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.*;
import org.apache.logging.log4j.LogManager;


import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/**
 * 渤海银行 移动端 实体类 基类
 */
public class CbhbAppBaseModel implements Serializable {
    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(CbhbAppBaseModel.class);

    /**
	 * 
	 */
	private static final long serialVersionUID = -7554577240424394811L;

	/**
	 * 渤海app请求提交地址
	 */
    private String CbhbSubmitUrl;
	/**
	 * 商户号 String(16)
	 */
	private String PartnerId;

	/**
	 * 商户流水号
	 */
	private String MerBillNo;

	/**
	 * 存管平台用户号
	 */
	private String PlaCustId;
	/**
	 * 返回链接
	 */
	private String BackUrl;

	/**
	 * 前置返回链接
	 */
	private String FrontUrl;
	
	/**
	 * 接口代号   CBHBNetLoanRegister（注册）  CBHBNetLoanBindCardMessage（修改绑定银行卡）  
	 * 
	 * CBHBNetLoanRecharge（充值） CBHBNetLoanWithdraw（提现）
	 */
	private String Transid;
	
	/**
	 * 明文加密后的结果
	 */
	private String NetLoanInfo;
	
	/**
	 * 版本号
	 */
	private String Version_No;
	/**
	 * 消息类型
	 */
	private String Biz_Type;
	/**
	 * 应答返回码
	 */
	private String RpCode;
	/**
	 * 应答返回码描述信息
	 */
	private String RpDesc;
	/**
	 * 签名值
	 */
	private String Mac;
	/**
	 * 签名方式
	 * */
	private String Sign_Type;
	
	/**
	 * 请求地址
	 */
	private String requestUrl;
	/**
	 * 请求参数字段数组 包含所有的
	 */
	private String[] requestParamNames = new String[] {};

	/**
	 * 响应参数字段数组 包含所有的
	 */
	private String[] responseParamNames = new String[] {};
	/**
	 * 后台方式回调的参数-- 通信状态 200 通过
	 */
	private int status;
	/**
	 * 构造器
	 */
	public CbhbAppBaseModel() {
		this.setPartnerId(TppPropertyUtil.getMessage("partner_id"));
		this.setCbhbSubmitUrl(TppPropertyUtil.getMessage("cbhb_app_submit_url")); // 测试地址
		this.setMerBillNo(TppPropertyUtil.getMessage("partner_id") + OrderNoUtils.getSerialNumber());
	}

	/**
	 * 通用 回调信息处理 有子类 每个子类需重写此类
	 */
	public void response(Map<String, String> map) {
		
		this.setPartnerId(map.get("PartnerId"));
		this.setMerBillNo(map.get("MerBillNo"));
		this.setPartnerId(map.get("PlaCustId")); 
		
		this.setVersion_No(map.get("Version_No"));
		this.setBiz_Type(map.get("Biz_Type"));
		this.setRpCode(map.get("RpCode"));
		this.setRpDesc(map.get("RpDesc"));
		this.setMac(map.get("Mac"));
		this.setSign_Type(map.get("Sign_Type"));
	}
	/**
	 * 请求的map包
	 */
	public Map<String, String> getRequestMap() {
		final Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < this.getRequestParamNames().length; i++) {
			final String name = this.getRequestParamNames()[i];
			String upperName = this.getFirstUpperName(name);
			String value = this.getColumnValue(upperName);
			map.put(name, value);
		}
		return map;
	}

	/**
	 * 根据 responseParamNames 获取map对象 响应的map包
	 */
	public Map<String, String> getResponseMap() {
		final Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < this.getResponseParamNames().length; i++) {
			final String name = this.getResponseParamNames()[i];
			String upperName = this.getFirstUpperName(name);
			String value = this.getColumnValue(upperName);
			map.put(name, value);
		}
		return map;
	}
	/**
	 * 获取商户流水号
	 */
	public String getMerBillNoStr() {
		return TppPropertyUtil.getMessage("partner_id")
				+ OrderNoUtils.getSerialNumber();
	}

	/**
	 * 根据name获取属性value值
	 */
	private String getColumnValue(String upperName) {
		final Object result = ReflectUtil.invokeGetMethod(getClass(), this, upperName);
		final String value = (result == null ? "" : result.toString());
		return value;
	}

	/**
	 * 将不规则的字段变为驼峰命名
	 * @return
	 */
	private String getFirstUpperName(String name) {
		String upperName = name;
		if (name.contains("_")) {
			String[] array = name.split("_");
			upperName = array[0] + StringUtils.firstCharUpperCase(array[1]);
			if (array.length > 2) {
				upperName = upperName + StringUtils.firstCharUpperCase(array[2]);
			}
			if ("FEEAMT".equals(upperName)) {// 不规则命名处理
				upperName = "FeeAmt";
			}
		}
		if ("ID".equals(upperName)) {
			upperName = "Id";
		}
		return upperName;
	}
	/**
	 * 校验返回码是否成功
	 */
	public boolean checkSuccess() {
		boolean result = false;
		if (StringUtils.isNotBlank(getRpCode())
				&& CbhbConstant.CBHB_CODE_SUCCESS.equals(getRpCode())) {
			result = true;
		}
		return result;
	}
	/**
	 * 默认值设置
	 */
	public void defalutSet(){
		
		
	}
	/**
	 * 每个实体类的提交参数的字段的校验 
	 * @author QianPengZhan
	 * @date 2017年3月4日
	 */
	public void requestColumnValid() {
		if (StringUtils.isBlank(this.getPartnerId())) {
			throw new CbhbException("渤海银行请求商户号不能为空");
		}
		if (StringUtils.isBlank(this.getMerBillNo())) {
			throw new CbhbException("渤海银行请求商户流水号不能为空");
		}
//		if (StringUtils.isBlank(this.getCbhbSubmitUrl())) {
//			throw new CbhbException("渤海银行请求提交地址不能为空");
//		}
	}

	/**
	 * 回调打印，用于响应CBHB异步回调
	 */
	public void printSuccessReturn(final HttpServletResponse response) {
		try {
			response.reset();
			response.setContentType("text/html;charset=GBK");
			response.setCharacterEncoding("GBK");
			response.getWriter().write(CbhbConstant.CBHB_SUCCESS_CODE);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			// TODO
			e.printStackTrace();
		}
	}
	
	public String getCbhbSubmitUrl() {
		return CbhbSubmitUrl;
	}

	public void setCbhbSubmitUrl(String cbhbSubmitUrl) {
		CbhbSubmitUrl = cbhbSubmitUrl;
	}

	public String getPartnerId() {
		return PartnerId;
	}

	public void setPartnerId(String partnerId) {
		PartnerId = partnerId;
	}

	public String getMerBillNo() {
		return MerBillNo;
	}

	public void setMerBillNo(String merBillNo) {
		MerBillNo = merBillNo;
	}

	public String getPlaCustId() {
		return PlaCustId;
	}

	public void setPlaCustId(String plaCustId) {
		PlaCustId = plaCustId;
	}

	public String getBackUrl() {
		return BackUrl;
	}

	public void setBackUrl(String backUrl) {
		BackUrl = backUrl;
	}

	public String getFrontUrl() {
		return FrontUrl;
	}

	public void setFrontUrl(String frontUrl) {
		FrontUrl = frontUrl;
	}

	public String getTransid() {
		return Transid;
	}

	public void setTransid(String transid) {
		Transid = transid;
	}

	public String getNetLoanInfo() {
		//根据 请求参数转换Json格式字符串后 进行加密处理
		Map<String, String> dataMap = new HashMap<String, String>();
		String name;
		String firstUpperName;
		String value;
		for (int i = 0; i < this.getRequestParamNames().length; i++){
			name = this.getRequestParamNames()[i];
			firstUpperName = this.getFirstUpperName(name);
			value = this.getColumnValue(firstUpperName);// 反射获取属性值
			dataMap.put(name, value);	
		}
		//将map转换json字符串
		String jsonString = JSONArray.toJSONString(dataMap);
		LOGGER.info("APP接口请求参数："+jsonString);
		//加密
		NetLoanInfo = AppEndeCodeUtii.AES_Encrypt(jsonString);
		return NetLoanInfo;
	}

	public void setNetLoanInfo(String netLoanInfo) {
		NetLoanInfo = netLoanInfo;
	}

	public String getVersion_No() {
		return Version_No;
	}

	public void setVersion_No(String version_No) {
		Version_No = version_No;
	}

	public String getBiz_Type() {
		return Biz_Type;
	}

	public void setBiz_Type(String biz_Type) {
		Biz_Type = biz_Type;
	}

	public String getRpCode() {
		return RpCode;
	}

	public void setRpCode(String rpCode) {
		RpCode = rpCode;
	}

	public String getRpDesc() {
		return RpDesc;
	}

	public void setRpDesc(String rpDesc) {
		RpDesc = rpDesc;
	}

	public String getMac() {
		return Mac;
	}

	public void setMac(String mac) {
		Mac = mac;
	}

	public String getSign_Type() {
		return Sign_Type;
	}

	public void setSign_Type(String sign_Type) {
		Sign_Type = sign_Type;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRequestUrl() {
		requestUrl= this.getCbhbSubmitUrl()+"?Transid="+getTransid()+"&NetLoanInfo="+getNetLoanInfo();
		return requestUrl;
	}
}
