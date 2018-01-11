package com.rd.tpp.model;

import com.hisun.merchant.atc.RSASignUtil;
import com.hisun.merchant.utils.HexStringByte;
import com.hisun.merchant.utils.HttpSendResult;
import com.hisun.merchant.utils.SimpleHttpsClient;
import com.rd.tpp.constant.CbhbConstant;
import com.rd.tpp.exception.CbhbException;
import com.rd.tpp.util.*;
import org.apache.logging.log4j.LogManager;

import java.io.Serializable;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;

/**
 * 渤海银行 实体类 基类
 */
public class CbhbBaseModel implements Serializable {

    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(CbhbBaseModel.class);

    private static final long serialVersionUID = 8688318324987342468L;
	/**
	 * 签名验签工具类
	 */
	private static RSASignUtil util;
	/**
	 * 本地私钥路径
	 */
	private static final String PRIVATE_KEY_PATH;
	/**
	 * 本地公钥路径
	 */
	private static final String PUBLIC_KEY_PATH;
	/**
	 * 公钥hexString
	 */
	private static  String PUBLIC_HEX_STRING  ;
	/**
	 * 临时文件目录
	 */
	public static final String FILE_TEMP_PATH;
	/**
	 * 静态块 加载一次
	 */
	static {
		FILE_TEMP_PATH = TppPropertyUtil.getMessage("file_temp_path");
		PRIVATE_KEY_PATH = TppPropertyUtil.class.getClassLoader().getResource("").getPath() + TppPropertyUtil.getMessage("private_key_path");
		PUBLIC_KEY_PATH = TppPropertyUtil.class.getClassLoader().getResource("").getPath() + TppPropertyUtil.getMessage("pub_key_path");
		util = new RSASignUtil(PRIVATE_KEY_PATH, TppPropertyUtil.getMessage("private_key_password"));
		try {
			X509Certificate publicCel = null;
			publicCel = util.getCertfromPath(PUBLIC_KEY_PATH);
			PUBLIC_HEX_STRING = HexStringByte.byteToHex(publicCel.getEncoded());
		} catch (Exception e) {
			LOGGER.error("接口基类初始化错误" + e.getMessage());
			throw new CbhbException("接口基类初始化错误" + e.getMessage());
		}
	}
	/**
	 * 字符集 String
	 */
	private String charSet;

	/**
	 * 商户号 String(16)
	 */
	private String partnerId;

	/**
	 * 版本号 String(3)
	 */
	private String versionNo;

	/**
	 * 消息类型 String(32)
	 */
	private String bizType;

	/**
	 * 签名方式 String(3)
	 */
	private String signType;

	/**
	 * 商户流水号 String(32)
	 */
	private String merBillNo;

	/**
	 * 页面返回url String(256)
	 */
	private String pageReturnUrl;

	/**
	 * 后台通知url String(256)
	 */
	private String bgRetUrl;

	/**
	 * 商户保留域 String(128)
	 */
	private String merPriv;

	/**
	 * 签名值 String(16)
	 */
	private String mac;

	/**
	 * 账户存管平台客户号 String(16)
	 */
	private String plaCustId;

	/**
	 * 应答返回码 String(16)
	 */
	private String respCode;

	/**
	 * 应答返回码描述信息 String(256)
	 */
	private String respDesc;

	/**
	 * 回调流水号
	 */
	private String respTransId;

	/**
	 * 第三方通用提交地址
	 */
	private String cbhbSubmitUrl;

	/**
	 * 证书信息
	 */
	private String merchantCert;

	/**
	 * 请求参数字段数组 包含所有的
	 */
	private String[] requestParamNames = new String[] {};

	/**
	 * 响应参数字段数组 包含所有的
	 */
	private String[] responseParamNames = new String[] {};

	/**
	 * http提交参数Map 包含mac 和 merchantCert
	 */
	private Map<String, String> requestParamsMap;

	/**
	 * http响应参数Map 包含mac 和 merchantCert
	 */
	private Map<String, String> responseParamsMap;

	/**
	 * 后台方式回调的参数-- 通信状态 200 通过
	 */
	private int status;

	/**
	 * 后台方式回调的参数-- 返回字符串
	 */
	private String responseBody;

	/**
	 * 处理类型： 1 = request 请求 ;不是 1 均为 response 响应
	 */
	private String handleType;

	/**
	 * 回调类型 1 实时回调 2同步回调 3 异步回调
	 */
	private String responseType;
	
	private boolean saveRequest;

	/**
	 * 构造器
	 */
	public CbhbBaseModel() {
		this.setCharSet(CbhbConstant.CHAR_SET);
		this.setPartnerId(TppPropertyUtil.getMessage("partner_id"));
		this.setCbhbSubmitUrl(TppPropertyUtil.getMessage("cbhb_submit_url")); // 测试地址
		this.setSignType(CbhbConstant.SIGN_TYPE_RSA);// RSA签名方式
		this.setVersionNo(CbhbConstant.VERSION_NO);
		this.setSaveRequest(false);//默认保存请求数据
		this.setMerBillNo(TppPropertyUtil.getMessage("partner_id") + OrderNoUtils.getSerialNumber());
	}
	/**
	 * 通用 回调信息处理 有子类 每个子类需重写此类
	 */
	public void response(Map<String, String> map) {
		this.setPartnerId(StringUtils.isNull(map.get("partner_id")));
		this.setBizType(StringUtils.isNull(map.get("biz_type")));
		this.setVersionNo(StringUtils.isNull(map.get("version_no")));
		this.setPlaCustId(StringUtils.isNull(map.get("PlaCustId")));
		this.setSignType(StringUtils.isNull(map.get("sign_type")));
		this.setMerBillNo(StringUtils.isNull(map.get("MerBillNo")));
		this.setRespCode(StringUtils.isNull(map.get("RespCode")));
		this.setRespDesc(StringUtils.isNull(map.get("RespDesc")));
		this.setMac(StringUtils.isNull(map.get("mac")));
		this.setMerPriv(StringUtils.isNull(map.get("MerPriv")));
	}

	/**
	 * 请求参数拼装和签名
	 */
	private String getRequestSignData() {
		String name;
		String firstUpperName;
		String value;
		StringBuilder nameData = new StringBuilder();
		StringBuilder signData = new StringBuilder();
		for (int i = 0; i < this.getRequestParamNames().length; i++) {
			name = this.getRequestParamNames()[i];
			firstUpperName = this.getFirstUpperName(name);
			value = this.getColumnValue(firstUpperName);// 反射获取属性值
//			LOGGER.info(name+":"+value);
			if (name.equalsIgnoreCase("mac")) { // 请求参数签名加密的时候不需要mac和merchantCert
				continue;
			}
			nameData.append(name + "=" + value + "&");
			signData.append(value);
		}
		LOGGER.info("签名参数nameData：" + nameData.toString());
		String signDataGbk = signData.toString();
		LOGGER.info("signData：" + signDataGbk);
		return signDataGbk;
	}
	
	/**
	 * 请求参数加密签名
	 */
	public void sign() {
		try {
			this.setMac(util.sign(this.getRequestSignData(), getEncoding()));// 基类保存签名
			this.setRequestParamsMap(this.getRequestMap());// 基类保存请求map包	
		} catch (Exception e) {
			System.out.println("请求参数签名异常:" + e.toString());
		}
	} 
	/**
	 * 响应参数拼装和签名字符串
	 */
	private String getResponseSignData() {
		String name;
		String firstUpperName;
		String value;
		StringBuilder nameData = new StringBuilder();
		StringBuilder signData = new StringBuilder();
		for (int i = 0; i < this.getResponseParamNames().length; i++) {
			name = this.getResponseParamNames()[i];
			firstUpperName = this.getFirstUpperName(name);
			value = this.getColumnValue(firstUpperName);// 反射获取属性值
			if (name.equals("mac")) { // 请求参数签名加密的时候不需要mac
				continue;
			}
			nameData.append(name + "=" + value + "&");
			signData.append(value);
		}
		LOGGER.info("回调签名： " + nameData.toString());
		LOGGER.info("回调signData： " + signData.toString());
		return signData.toString();
	}

	/**
	 * 回调验签
	 */
	public boolean validSign(CbhbBaseModel model) {
		boolean flag = false;
		try {
			flag = util.verify(model.getResponseSignData(), model.getMac(), PUBLIC_HEX_STRING, model.getEncoding());
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			flag =false;
		}
		return flag;
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
	 * 后台方式 http传输map提交基类
	 * 
	 */
	public void submit(CbhbBaseModel requestModel) {
		// 请求提交
		SimpleHttpsClient httpClinet = new SimpleHttpsClient();
		LOGGER.info("http请求参数：" + requestModel.getRequestParamsMap().toString());
		LOGGER.info( requestModel.getCbhbSubmitUrl().toString() );
		HttpSendResult result =httpClinet.postRequest(requestModel.getCbhbSubmitUrl(),
				requestModel.getRequestParamsMap(), CbhbConstant.CBHB_TIME_OUT, this.getEncoding());
		// 回调
		if (200 == result.getStatus()) {
			final Map<String, String> responseMap = this.getResponseBodyString(result.getResponseBody());
			requestModel.setStatus(result.getStatus());
			requestModel.setResponseBody(result.getResponseBody());
			
			LOGGER.info("渤海回调响应参数：" + result.getResponseBody());
			response(responseMap);
			requestModel.setRespTransId(StringUtils.isNull(responseMap.get("TransId")));// 回调流水号
			requestModel.setResponseType(CbhbConstant.CBHB_RESPONSE_TYPE_CURRENT);// 回调类型
			// 验签
			if (!this.validSign(requestModel)) {
				LOGGER.info("验签不通过 "); 
				throw new CbhbException("签名验证错误");
			}
		} else {
			throw new CbhbException("通信失败");
		}
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
	 * getResponseBody 对响应参数进行批处理
	 * 
	 */
	private Map<String, String> getResponseBodyString(String responseBody) {
		Map<String, String> map = new HashMap<String, String>();
		String[] arrayOne = responseBody.split("&");
		for (int i = 0; i < arrayOne.length; i++) {
//			String[] arrayTwo = arrayOne[i].split("=");
//			String name = arrayTwo[0];
//			String value = "";
//			if (arrayTwo.length > 1) {
//				value = arrayTwo[1];
//			}
			String name = arrayOne[i].substring(0, arrayOne[i].indexOf("="));
			String value = arrayOne[i].substring(arrayOne[i].indexOf("=") + 1, arrayOne[i].length());
			map.put(name, value);
		}
		return map;
	}
	
	/**
	 * 获取编码
	 * 
	 * @return
	 */
	public String getEncoding() {
		if ("00".equals(this.charSet)) {
			return "GBK";
		} else if ("01".equals(this.charSet)) {
			return "GB2312";
		} else if ("02".equals(this.charSet)) {
			return "UTF-8";
		} else {
			return "GBK";
		}
	}

	/**
	 * 校验返回码是否成功
	 */
	public boolean checkSuccess() {
		boolean result = false;
		if (StringUtils.isNotBlank(getRespCode())
				&& CbhbConstant.CBHB_CODE_SUCCESS.equals(getRespCode())) {
			result = true;
		}
		return result;
	}

	/**
	 * 根据规则生生成名 商户号_文件生成日期(yyyymmdd)_消息类型_商户流水号.txt
	 */
	public String getFileNameOnByRule() {
		String billNo = this.getMerBillNo();
//		if (CbhbConstant.BIZ_TYPE_BAT_INVEST_CANCLE.equals(this.getBizType())) {// 批量投资撤销用批次号
			billNo = this.getMerBillNo().substring(this.getMerBillNo().length() - 10, this.getMerBillNo().length());
//		}
		StringBuilder sb = new StringBuilder();
		sb.append(TppPropertyUtil.getMessage("partner_id")).append("_")
				.append(DateUtils.getDate(DateUtils.DATEFORMAT_STR_yyyyMMdd))
				.append("_").append(this.getBizType()).append("_")
				.append(billNo).append(".txt");
		return sb.toString();
	}

	/**
	 * OKfile名称
	 * @date 2017年3月7日
	 * @return
	 */
	public String getOKFileName() {
		return this.getFileNameOnByRule() + ".OK";
	}

	/**
	 * result File 名称 RESULT_商户号_文件生成日期(yyyymmdd)_消息类型_商户流水号.txt
	 * @date 2017年3月13日
	 * @return
	 */
	public String getResultFileName() {
		return "RESULT_" + this.getFileNameOnByRule();
	}

	/**
	 * result file 本地存放的路径
	 * @date 2017年3月13日
	 * @return
	 */
	public String getResultFileNamePath() {
		StringBuilder sb = new StringBuilder();
		sb.append(FILE_TEMP_PATH).append(DateUtils.getDate(DateUtils.DATEFORMAT_STR_yyyyMMdd)).append("/result/");
		return sb.toString();
	}

	/**
	 * FILE_TEMP_PATH + 商户号_文件生成日期(yyyymmdd)_消息类型_商户流水号.txt
	 * @return
	 */
	public String getFileNamePath() {
		StringBuilder sb = new StringBuilder();
		sb.append(FILE_TEMP_PATH).append(this.getFileNameOnByRule());
		return sb.toString();
	}

	/**
	 * TEMP_DIR + 商户号_文件生成日期(yyyymmdd)_消息类型_商户流水号.txt.OK
	 */
	public String getOKFileNamePath() {
		return this.getFileNamePath() + ".OK";
	}

	/**
	 * 拼接文件中的内容
	 * @return
	 */
	public String getFileContent() {
		StringBuilder nameData = new StringBuilder();
		StringBuilder fileData = new StringBuilder();
		// 获取文件类请求参数字段数组
		final String[] paramNames = getRequestParamNames();
		for (int i = 0; i < paramNames.length; i++) {
			String name = paramNames[i];
			String upperName = this.getFirstUpperName(name);
			final String value = this.getColumnValue(upperName);
			if (i == paramNames.length - 1) {
				fileData.append(value);
			} else {
				nameData.append(name).append(",");
				fileData.append(value).append(StringUtils.ONLY_VERTICAL_LINE);
			}
		}
		fileData.append(StringUtils.LF);
		return fileData.toString();
	}

/*	*//**
	 * 回调打印，用于响应CBHB异步回调
	 *//*
	public void printSuccessReturn(final HttpServletResponse response) {
		try {
			response.reset();
			response.setContentType("text/html;charset=GBK");
			response.setCharacterEncoding("GBK");
			response.getWriter().write(CbhbConstant.CBHB_SUCCESS_CODE);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
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
		if (StringUtils.isBlank(this.getCharSet())) {
			throw new CbhbException("渤海银行请求字符编码不能为空");
		}
		if (StringUtils.isBlank(this.getPartnerId())) {
			throw new CbhbException("渤海银行请求商户号不能为空");
		}
		if (StringUtils.isBlank(this.getSignType())) {
			throw new CbhbException("渤海银行请求签名类型不能为空");
		}
		if (StringUtils.isBlank(this.getVersionNo())) {
			throw new CbhbException("渤海银行请求版本号不能为空");
		}
		if (StringUtils.isBlank(this.getMerBillNo())) {
			throw new CbhbException("渤海银行请求商户流水号不能为空");
		}
		if (StringUtils.isBlank(this.getCbhbSubmitUrl())) {
			throw new CbhbException("渤海银行请求提交地址不能为空");
		}
	}
	/**
	 * 获取属性respTransId的值
	 * 
	 * @return respTransId属性值
	 */
	public String getRespTransId() {
		return respTransId;
	}

	/**
	 * 设置属性respTransId的值
	 * 
	 * @param respTransId
	 */
	public void setRespTransId(String respTransId) {
		this.respTransId = respTransId;
	}

	public String getCharSet() {
		return charSet;
	}

	public void setCharSet(String charSet) {
		this.charSet = charSet;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getMerBillNo() {
		return merBillNo;
	}

	public void setMerBillNo(String merBillNo) {
		this.merBillNo = merBillNo;
	}

	public String getPageReturnUrl() {
		return pageReturnUrl;
	}

	public void setPageReturnUrl(String pageReturnUrl) {
		this.pageReturnUrl = pageReturnUrl;
	}

	public String getBgRetUrl() {
		return bgRetUrl;
	}

	public void setBgRetUrl(String bgRetUrl) {
		this.bgRetUrl = bgRetUrl;
	}

	public String getMerPriv() {
		return merPriv;
	}

	public void setMerPriv(String merPriv) {
		this.merPriv = merPriv;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getPlaCustId() {
		return plaCustId;
	}

	public void setPlaCustId(String plaCustId) {
		this.plaCustId = plaCustId;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespDesc() {
		return respDesc;
	}

	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}

	/**
	 * 获取属性cbhbSubmitUrl的值
	 * 
	 * @return cbhbSubmitUrl属性值
	 */
	public String getCbhbSubmitUrl() {
		return cbhbSubmitUrl;
	}

	/**
	 * 设置属性cbhbSubmitUrl的值
	 * 
	 * @param cbhbSubmitUrl
	 */
	public void setCbhbSubmitUrl(String cbhbSubmitUrl) {
		this.cbhbSubmitUrl = cbhbSubmitUrl;
	}

	/**
	 * 获取属性merchantCert的值
	 * 
	 * @return merchantCert属性值
	 */
	public String getMerchantCert() {
		return merchantCert;
	}

	/**
	 * 设置属性merchantCert的值
	 * 
	 * @param merchantCert
	 */
	public void setMerchantCert(String merchantCert) {
		this.merchantCert = merchantCert;
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
	 * @param requestParamNames
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
	 * @param responseParamNames
	 */
	public void setResponseParamNames(String[] responseParamNames) {
		this.responseParamNames = responseParamNames;
	}

	/**
	 * 获取属性requestParamsMap的值
	 * 
	 * @return requestParamsMap属性值
	 */
	public Map<String, String> getRequestParamsMap() {
		return requestParamsMap;
	}

	/**
	 * 设置属性requestParamsMap的值
	 * 
	 * @param requestParamsMap
	 */
	public void setRequestParamsMap(Map<String, String> requestParamsMap) {
		this.requestParamsMap = requestParamsMap;
	}

	/**
	 * 获取属性responseParamsMap的值
	 * 
	 * @return responseParamsMap属性值
	 */
	public Map<String, String> getResponseParamsMap() {
		return responseParamsMap;
	}

	/**
	 * 设置属性responseParamsMap的值
	 * 
	 * @param responseParamsMap
	 */
	public void setResponseParamsMap(Map<String, String> responseParamsMap) {
		this.responseParamsMap = responseParamsMap;
	}

	/**
	 * 获取属性status的值
	 * 
	 * @return status属性值
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * 设置属性status的值
	 * 
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * 获取属性responseBody的值
	 * 
	 * @return responseBody属性值
	 */
	public String getResponseBody() {
		return responseBody;
	}

	/**
	 * 设置属性responseBody的值
	 * 
	 * @param responseBody
	 */
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	/**
	 * 获取属性handleType的值
	 * 
	 * @return handleType属性值
	 */
	public String getHandleType() {
		return handleType;
	}

	/**
	 * 设置属性handleType的值
	 * 
	 * @param handleType
	 */
	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	/**
	 * 获取属性responseType的值
	 * 
	 * @return responseType属性值
	 */
	public String getResponseType() {
		return responseType;
	}

	/**
	 * 设置属性responseType的值
	 * 
	 * @param responseType
	 */
	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	public boolean isSaveRequest() {
		return saveRequest;
	}
	public void setSaveRequest(boolean saveRequest) {
		this.saveRequest = saveRequest;
	}
	
}
