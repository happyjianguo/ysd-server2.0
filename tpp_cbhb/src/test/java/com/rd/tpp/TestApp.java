package com.rd.tpp;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.rd.tpp.model.req.CbhbAddProjectReq;
import com.rd.tpp.model.req.CbhbRechargeReq;
import com.rd.tpp.service.impl.TppInterfaceServiceImpl;
import com.rd.tpp.util.DateUtils;
import com.rd.tpp.util.TppUtil;

import junit.framework.TestCase;

public class TestApp  extends TestCase{


    private static final Logger LOGGER = LogManager.getLogger(TestApp.class);
		
    
    public static void main(String[] args){

        CbhbRechargeReq req = new CbhbRechargeReq();
        req.setAmount(100d);
        req.setPlaCustId("0001100000007255");
        String str = TppUtil.getInstance().tppRecharge(req).toString();

        System.out.print(str);
    }
		//public void testTppRegister() {
//			CbhbCommonReq req = new CbhbCommonReq();
//			req.setMobileNo("18368865484");
//			System.out.println(TppUtil.getInstance().tppRegister(req));
		//}
		
		//@Test
		public void qtestTppRecharge(){
			CbhbRechargeReq req = new CbhbRechargeReq();
			req.setAmount(100d);
			req.setPlaCustId("0001100000007255");
			String str  =TppUtil.getInstance().tppRecharge(req).toString();
			
			System.out.println("1:"+str+"=====");
			LOGGER.info("2:{}"+str);
			
		}
		
		@Test
		public void testAddProject() {
		
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
}
