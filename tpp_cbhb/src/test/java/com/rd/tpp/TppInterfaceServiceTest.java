package com.rd.tpp;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.rd.tpp.model.CbhbCreditRightsChangeModel;
import com.rd.tpp.model.CbhbMercRechargeModel;
import com.rd.tpp.model.CbhbMercWithdrawModel;
import com.rd.tpp.model.req.CbhbAddProjectReq;
import com.rd.tpp.model.req.CbhbCashReq;
import com.rd.tpp.model.req.CbhbCommonReq;
import com.rd.tpp.model.req.CbhbCreditAssignReq;
import com.rd.tpp.model.req.CbhbInvestCancleReq;
import com.rd.tpp.model.req.CbhbInvestReq;
import com.rd.tpp.model.req.CbhbMercRechargeReq;
import com.rd.tpp.model.req.CbhbMercWithdrawReq;
import com.rd.tpp.model.req.CbhbRechargeReq;
import com.rd.tpp.model.req.ExperBonusReq;
import com.rd.tpp.util.DateUtils;
import com.rd.tpp.util.TppUtil;

public class TppInterfaceServiceTest {
	@Test
	public void testTppRegister() {
		CbhbCommonReq req = new CbhbCommonReq();
		req.setMobileNo("18368865484");
		System.out.println(TppUtil.getInstance().tppRegister(req));
	}
	//@Test
	public void tppUpdateBankCard(){
		CbhbCommonReq req = new CbhbCommonReq();
		req.setPlaCustId("0001100000007255");
	    System.out.println(TppUtil.getInstance().tppUpdateBankCard(req)); 	
	}
	//@Test
	public void tppUpdateMobileNo(){		
		CbhbCommonReq req = new CbhbCommonReq();
		req.setPlaCustId("0001100000007255");
		req.setMobileNo("13666666666");
	    System.out.println(TppUtil.getInstance().tppUpdateMobileNo(req)); 	
	}
	//@Test
	public void tppUpdatePayPass(){
		CbhbCommonReq req = new CbhbCommonReq();
		req.setPlaCustId("0001100000007255");
	    System.out.println(TppUtil.getInstance().tppUpdatePayPass(req)); 
	}
	//@Test
	public void tppSendUapMsg(){
		CbhbCommonReq req = new CbhbCommonReq();
		req.setPlaCustId("0001100000007255");
		req.setMobileNo("18368829352");
		System.out.println(TppUtil.getInstance().tppSendUapMsg(req)); 
	}
//	@Test
	public void tppRecharge(){
		CbhbRechargeReq req = new CbhbRechargeReq();
		req.setAmount(100d);
		req.setPlaCustId("0001100000007255");
		System.out.println(TppUtil.getInstance().tppRecharge(req)); 
		
	}
	//@Test
	public void tppCash(){
		CbhbCashReq req = new CbhbCashReq();
		req.setAmount(100d);
		req.setPlaCustId("0001100000007255");
		System.out.println(TppUtil.getInstance().tppCash(req)); 
		
	}
	@Test
	public void tppCreditRightsChange(){
		CbhbCreditAssignReq req = new CbhbCreditAssignReq();
		req.setPlaCustId("0001100000007255");
		TppUtil.getInstance().tppCreditAssign(req);
		System.out.println(TppUtil.getInstance().tppCreditAssign(req)); 
		
	}
//	@Test
	public void tppAddProject(){
		CbhbAddProjectReq req = new CbhbAddProjectReq();
		req.setBorrowId("10177");
		req.setBorrowTyp("1");
		req.setBorrowerAmt(120000);
		req.setBorrowerInterestAmt(8.0);
		req.setBorrCustId("0001100000007255");
		req.setBorrowerStartDate(DateUtils.getNow());
		req.setBorrowerEndDate(DateUtils.rollDay(DateUtils.getNow(), 7));
		req.setBorrowerRepayDate(DateUtils.rollDay(DateUtils.getNow(), 37));
		req.setInvestDateType("1");
		req.setInvestPeriod("30");
		req.setBorrowerDetails("项目详情");
		TppUtil.getInstance().tppAddProject(req);
	}
//	@Test
	public void tppAddTender(){
		CbhbInvestReq req = new CbhbInvestReq();
		req.setPlaCustId("0001100000007212");
		req.setBusiType("1");
		req.setSmsCode("741249");
		req.setTransAmt(100);
		req.setBorrowId("123345");
		TppUtil.getInstance().tppAddTender(req);	
	}
//	@Test
    public void tppInvestCancle(){
		CbhbInvestCancleReq req = new CbhbInvestCancleReq();
		req.setOldTransId("201708150001347578");
		req.setPlaCustId("0001100000007212");
		req.setFreezeId("12");
		req.setTransAmt(100);
		req.setSmsCode("666988");
		TppUtil.getInstance().tppInvestCancle(req);
	}
	
    // #####################  app接口开始  ############################
//	@Test
	public void tppAppRegister() {
		//app注册接口
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("mobileNo", "13586994246");
//		CbhbAppRealNameWebModel queryUserInf = (CbhbAppRealNameWebModel) TppUtil.getAppInstance().tppAppRegister(params);
	}
	@Test
	public void tppAppBindCard() {
/*		//app修改银行卡接口
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("mobileNo", "13586994246");
		CbhbAppBindCardWebModel queryUserInf = (CbhbAppBindCardWebModel) TppUtil.getAppInstance().tppAppUpdateBankCard(params);*/
	}
	
	//@Test
	public void tppAppCash() {
		//app取现
		/*Map<String, Object> params = new HashMap<String, Object>();
		CbhbAppDrawingsModel queryUserInf = (CbhbAppDrawingsModel) TppUtil.getAppInstance().tppAppCash(params);*/
	}
	
	//@Test
	public void tppAppRecharge() {
		//app取现
//		Map<String, Object> params = new HashMap<String, Object>();
//		CbhbAppDrawingsModel queryUserInf = (CbhbAppDrawingsModel) TppUtil.getAppInstance().tppAppRecharge(params);
	}
	// #####################  app接口结束 ############################
	/**
	 * TODO 查询用户信息
	 * @author zza@erongdu.com
	 * @since 2017年6月13日 下午2:20:05
	 */
	@Test
	public void testQueryUserInf() {
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("mobileNo", "");
//		params.put("plaCustId", "0001100000007416");
//		CbhbQueryUserInfModel responseModel = (CbhbQueryUserInfModel) TppUtil.getInstance().queryUserInf(params);
//		System.out.println("应答返回码： " + responseModel.getRespCode());
//		System.out.println("应答返回码描述： " + responseModel.getRespDesc());
//		System.out.println("账户存管平台客户号： " + responseModel.getPlaCustId());
//		BASE64Decoder decoder = new BASE64Decoder();
//		List<XmlQueryUserInf> list = new ArrayList<XmlQueryUserInf>();
//		try {
//			responseModel.setRespData(new String(decoder.decodeBuffer(responseModel.getRespData()), "GB2312"));
//			System.out.println("渤海银行--用户信息查询回调RespData--XML:" + responseModel.getRespData());
//			list = CbhbHelper.xmlToMapQueryUserInf(responseModel.getRespData());
//		} catch (IOException e) {
//			System.out.println("渤海银行--用户信息查询回调RespData错误");
//		}
//		System.out.println("返回数据： " + responseModel.getRespData());
	}
	
	/**
	 * TODO 用户余额查询接口
	 * @author zza@erongdu.com
	 * @since 2017年6月14日 上午10:22:22
	 */
	@Test
	public void testTppQueryBalance() {
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("plaCustId", "0001100000007268");
//		CbhbQueryBalanceModel responseModel = (CbhbQueryBalanceModel) TppUtil.getInstance().tppQueryBalance(params);
//		System.out.println("可用余额： " + responseModel.getAvlBal());
//		System.out.println("账户余额： " + responseModel.getAcctBal());
//		System.out.println("冻结余额： " + responseModel.getFrzBal());
	}
	@Test
	public void testTppSendUapMsg() {
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("mobileNo", "13122320132");
//		CbhbSendUapMsgModel responseModel = (CbhbSendUapMsgModel) TppUtil.getInstance().tppSendUapMsg(params);
//		System.out.println("应答返回码： " + responseModel.getRespCode());
//		System.out.println("应答返回码描述： " + responseModel.getRespDesc());
//		System.out.println("短信识别码： " + responseModel.getRtnCod());
	}	
	/**
	 * TODO 实时红包
	 * @author zza@erongdu.com
	 * @since 2017年6月14日 下午7:51:26
	 */
	@Test
	public void testExperBonus() {
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("plaCustId", "0001100000095017");
//		params.put("transAmt", "100.00");
//		params.put("merFeeAmt", "0.00");
//		CbhbExperBonusModel responseModel = (CbhbExperBonusModel) TppUtil.getInstance().experBonus(params);
//		System.out.println("应答返回码： " + responseModel.getRespCode());
//		System.out.println("应答返回码描述： " + responseModel.getRespDesc());
//		System.out.println("商户流水号： " + responseModel.getMerBillNo());
//		System.out.println("账户存管平台流水号： " + responseModel.getTransId());
	}
	@Test
    public void tppExperBonus(){
		//实时接口测试
		ExperBonusReq req = new ExperBonusReq();
		req.setTransAmt(100);
		req.setMerFeeAmt(0);
		req.setPlaCustId("0001100000007212");
		TppUtil.getInstance().experBonus(req);
	}
	/**
	 * TODO 商户自主账户提现
	 * @author zza@erongdu.com
	 * @since 2017年6月14日 下午8:05:59
	 */
//	@Test
	public void testTppMerchantCash() {
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("transAmt", "100.00");
		CbhbMercWithdrawReq req = new CbhbMercWithdrawReq();
		req.setTransAmt(100d);
		CbhbMercWithdrawModel responseModel = (CbhbMercWithdrawModel) TppUtil.getInstance().tppMerchantCash(req);
		System.out.println("应答返回码： " + responseModel.getRespCode());
		System.out.println("应答返回码描述： " + responseModel.getRespDesc());
		System.out.println("商户流水号： " + responseModel.getMerBillNo());
		System.out.println("账户存管平台流水号： " + responseModel.getTransId());
	}
	
	/**
	 * TODO 商户账户充值（账户存管平台支持商户为810虚拟营销账户充值，实体资金由商户在渤海开立的结算对公账户转到商户存管账户）
	 * @author zza@erongdu.com
	 * @since 2017年6月15日 上午9:37:18
	 */
//	@Test
	public void testTppMerchantRecharge() {
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("transAmt", "1000.00");
//		params.put("merAccTyp", "820"); // 810-营销账户 820-预付费账户
		CbhbMercRechargeReq req = new CbhbMercRechargeReq();
		
		CbhbMercRechargeModel responseModel = (CbhbMercRechargeModel) TppUtil.getInstance().tppMerchantRecharge(req);
		System.out.println("应答返回码： " + responseModel.getRespCode());
		System.out.println("应答返回码描述： " + responseModel.getRespDesc());
		System.out.println("商户流水号： " + responseModel.getMerBillNo());
		System.out.println("账户存管平台流水号： " + responseModel.getTransId());
	}

	/**
	 * TODO 商户账户查询
	 * @author zza@erongdu.com
	 * @since 2017年6月14日 下午8:12:19
	 */
	@Test
	public void testQueryMerchantAccts() {
//		List<XmlQueryMerchantAccts> list = (List<XmlQueryMerchantAccts>) TppUtil.getInstance().queryMerchantAccts();
//		for (XmlQueryMerchantAccts acTyp : list) {
//			System.out.println("账户名称： " + acTyp.getAcTypName());
//			System.out.println("账户类型：" + acTyp.getAcTyp());
//			System.out.println("可用余额：" + acTyp.getAvlBal());
//			System.out.println("账户余额：" + acTyp.getActBal()); 
//			System.out.println("冻结余额：" + acTyp.getFrzBal());
//			System.out.println("-------- 分割线 --------");
//		}
	}
	/**
	 * TODO 债权转让
	 * @author zza@erongdu.com
	 * @since 2017年6月15日 下午8:52:49
	 */
	//@Test
	public void testTppCreditAssign() {
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("transAmt", "2000.00");
//		params.put("oldTransId", "201706140001329451");
//		params.put("merFeeAmt", "10.00"); // 商户收取用户手续费
//		params.put("feeType", "1"); // 手续费模式，0 受让人出，1 转让人出
//		// 受让人出账金额，若feeType=0，传transAmt+merFeeAmt；若feeType=1，传transAmt
//		params.put("outAmt", "2000.00");
//		// 转让人入账金额，若feeType=0，传transAmt；若feeType=1，传transAmt-merFeeAmt
//		params.put("inAmt", "1990.00");
//		params.put("outCustId", "0001100000095036"); // 受让人客户号
//		params.put("inCustId", "0001100000095017"); // 转让人客户号
//		params.put("smsCode", "233557");
//		params.put("borrowId", "1");
//		CbhbCreditRightsChangeModel responseModel = (CbhbCreditRightsChangeModel) TppUtil.getInstance().tppCreditAssign(params);
//		System.out.println("应答返回码： " + responseModel.getRespCode());
//		System.out.println("应答返回码描述： " + responseModel.getRespDesc());
//		System.out.println("商户流水号： " + responseModel.getMerBillNo());
	}
	
	/**
	 * TODO 放款文件
	 * @author zza@erongdu.com
	 * @since 2017年6月16日 上午9:27:46
	 */
	@Test
	public void testTppLoan() {
		// 投资记录明细
//		String[][] detailList = new String[4][];
//		String[] detail = new String[5];
//		detail[0] = "1"; //序号
//		detail[1] = "201706140001328701"; // 账户存管平台客户号
//		detail[3] = "1000.00"; // 交易金额
//		detail[4] = "1"; // 冻结标识号
//		detailList[0] = detail;
//
//		String[] detail1 = new String[5];
//		detail1[0] = "2"; //序号
//		detail1[1] = "201706140001328702"; // 账户存管平台客户号
//		detail1[3] = "2000.00"; // 交易金额
//		detail1[4] = "2"; // 冻结标识号
//		detailList[1] = detail1;
//
//		String[] detail2 = new String[5];
//		detail2[0] = "2"; //序号
//		detail2[1] = "201706140001328703"; // 账户存管平台客户号
//		detail2[3] = "7000.00"; // 交易金额
//		detail2[4] = "3"; // 冻结标识号
//		detailList[2] = detail2;
//
//		String[] detail3 = new String[5];
//		detail3[0] = "2"; //序号
//		detail3[1] = "201706140001328703"; // 账户存管平台客户号
//		detail3[3] = "7000.00"; // 交易金额
//		detail3[4] = "3"; // 冻结标识号
//		detailList[3] = detail3;
//
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("detailList", detailList);
//		params.put("transAmt", "10000.00");
//		params.put("feeAmt", "100.00");
//		params.put("borrowId", "1");
//		params.put("borrowerAmt", "10000.00");
//		params.put("borrCustId", "0001100000095005");
//		TppUtil.getInstance().tppLoan(params);
	}
	
	@Test
	public void testTppRepayment() {
//		String[][] detailList = new String[4][];
//		String[] detail = new String[5];
//		detail[0] = "1"; //序号
//		detail[1] = "201706140001328701"; // 账户存管平台客户号
//		detail[2] = "1000.00"; // 还款本金
//		detail[3] = "10.00"; // 还款利息
//		// 投资管理费，商户收取投资人手续费+体验金本金（若用户投资时使用体验金，由商户计算）
//		detail[4] = "0.10"; 
//		detailList[0] = detail;
//		
//		String[] detail1 = new String[5];
//		detail1[0] = "2"; //序号
//		detail1[1] = "201706140001328702"; // 账户存管平台客户号
//		detail1[2] = "2000.00"; // 还款本金
//		detail1[3] = "20.00"; // 还款利息
//		// 投资管理费，商户收取投资人手续费+体验金本金（若用户投资时使用体验金，由商户计算）
//		detail1[4] = "0.20"; 
//		detailList[1] = detail1;
//		
//		String[] detail2 = new String[5];
//		detail2[0] = "3"; //序号
//		detail2[1] = "201706140001328703"; // 账户存管平台客户号
//		detail2[2] = "7000.00"; // 还款本金
//		detail2[3] = "70.00"; // 还款利息
//		// 投资管理费，商户收取投资人手续费+体验金本金（若用户投资时使用体验金，由商户计算）
//		detail2[4] = "0.70"; 
//		detailList[2] = detail2;
//		
//		String[] detail3 = new String[5];
//		detail3[0] = "4"; //序号
//		detail3[1] = "201706140001328703"; // 账户存管平台客户号
//		detail3[2] = "7000.00"; // 还款本金
//		detail3[3] = "70.00"; // 还款利息
//		// 投资管理费，商户收取投资人手续费+体验金本金（若用户投资时使用体验金，由商户计算）
//		detail3[4] = "0.70"; 
//		detailList[3] = detail3;
//		
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("detailList", detailList);
//		params.put("borrowId", "1");
//		// 还款类型，1正常还款，2担保还款（从担保账户扣款）
//		params.put("repayTyp", "1");
//		// 分期还款总期数，若不分期则为0
//		params.put("repayInstTot", "3");
//		// 分期还款当前期数，若不分期则为0
//		params.put("repayInstCur", "1");
//		TppUtil.getInstance().tppRepayment(params);
	}
	/**
	 * 投资批量取消测试
	 */
	@Test
	public void testTppBatInvestCancle() {
		// 投资记录明细
		/*String[][] detailList = new String[2][];
		String[] detail = new String[5];
		detail[0] = "1";//序号
		detail[1] = "201706140001328798"; //原账户存管平台流水
		detail[2] = "0001100000095017";// 投资人
		detail[3] = "10000.00";//撤销的金额
		detail[4] = "1";//冻结标识号
		detailList[0] = detail;
		
		String[] detail1 = new String[5];
		detail1[0] = "2";//序号
		detail1[1] = "201706140001328799"; //原账户存管平台流水
		detail1[2] = "0001100000095017";// 投资人
		detail1[3] = "20000.00";//撤销的金额
		detail1[4] = "2";//冻结标识号
		detailList[1] = detail1;
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("detailList", detailList);
		TppUtil.getInstance().tppBatInvestCancle(params);*/
		
	}

	/**
	 * TODO 存量用户注册
	 * @author zza@erongdu.com
	 * @since 2017年7月3日 上午9:03:08
	 */
	@Test
	public void testTppExperRealeName() {
		
//		String[][] detailList = new String[4][];
//		String[] detail = new String[5];
//		detail[0] = "00"; // 证件类型
//		detail[1] = "201706140001328701"; // t账户存管平台客户号
//		detail[2] = "1000.00"; // 还款本金
//		detail[3] = "10.00"; // 还款利息
//		// 投资管理费，商户收取投资人手续费+体验金本金（若用户投资时使用体验金，由商户计算）
//		detail[4] = "0.10"; 
//		detailList[0] = detail;
//		
//		String[] detail1 = new String[5];
//		detail1[0] = "2"; //序号
//		detail1[1] = "201706140001328702"; // 账户存管平台客户号
//		detail1[2] = "2000.00"; // 还款本金
//		detail1[3] = "20.00"; // 还款利息
//		// 投资管理费，商户收取投资人手续费+体验金本金（若用户投资时使用体验金，由商户计算）
//		detail1[4] = "0.20"; 
//		detailList[1] = detail1;
//		
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("detailList", detailList);
//		params.put("borrowId", "1");
//		// 还款类型，1正常还款，2担保还款（从担保账户扣款）
//		params.put("repayTyp", "1");
//		// 分期还款总期数，若不分期则为0
//		params.put("repayInstTot", "3");
//		// 分期还款当前期数，若不分期则为0
//		params.put("repayInstCur", "1");
//		TppUtil.getInstance().tppRepayment(params);
//		Map<String, Object> map = FileUtil.getResultFileContent("D:/downloads", "/bhbank/20170703/", "RESULT_800080290000001_20130402_BatInvestCancle_0000010012.txt");
	}
	@Test
	public void testTppPpdChk() {
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("searchTime", "2017-07-08 15:00:00");
//		List<CbhbPpdChkModel> chkList = (List<CbhbPpdChkModel>) TppUtil.getInstance().tppPpdChk(params);
//		System.out.println(chkList.size());
	}
	
	/**
	 * TODO 大额充值账号查询
	 * @author zza@erongdu.com
	 * @since 2017年6月14日 上午10:22:22
	 */
	@Test
	public void testTppQueryChargeAccount() {
//		Map<String, Object> params = new HashMap<String, Object>();
//		// 账号属性（1-对私 2-对公）
//		params.put("accountTyp", "2");
//		// 存管平台账户号或对公账号（根据 AccountTypTyp 取不同值 1-账户存管平台客户号 2-对公账号）
//		params.put("accountNo", "2000200634000127");
//		CbhbQueryChargeAccountModel responseModel = (CbhbQueryChargeAccountModel) TppUtil.getInstance().tppQueryChargeAccount(params);
//		System.out.println("大额充值账号： " + responseModel.getChargeAccount());
//		System.out.println("大额充值账户户名： " + responseModel.getAccountName());
//		System.out.println("可用余额： " + responseModel.getAvlBal());
//		System.out.println("账户余额： " + responseModel.getAcctBal());
//		System.out.println("冻结余额： " + responseModel.getFrzBal());
	}

}
