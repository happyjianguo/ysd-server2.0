package com.allin.mtp.service.impl;

import com.allin.mtp.model.*;
import com.allin.mtp.service.MTPTranxService;
import com.allin.mtp.util.AllinMTPUtil;
import com.mind.platform.system.base.CMData;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author xishengchun on 2017-12-11.
 */
public class TranxServiceImplTest {

    private Logger logger = LogManager.getLogger(MTPTranxServiceImpl.class);

    private String reqTraceNum;

    private String transDate;

    private String transTime;

    private MTPTranxService mtpTranxService = new MTPTranxServiceImpl();

    @Before
    public void before() {
        reqTraceNum = AllinMTPUtil.getReqTraceNum();
        transDate = AllinMTPUtil.getDateString();
        transTime = AllinMTPUtil.getTimeString();
    }

    @Test
    public void testBind() throws Exception {
        RequestHeader requestHeaderDTO = new RequestHeader();
        requestHeaderDTO.setInstId("78380000");
        requestHeaderDTO.setProcessingCode("1087");
        requestHeaderDTO.setTransDate(this.transDate);
        requestHeaderDTO.setTransTime(this.transTime);


        JrQianyueRequest jrQianyueRequestDTO = new JrQianyueRequest();
//        String reqTraceNum = AllinMTPUtil.getReqTraceNum();
//        System.out.println("reqTraceNum:" + reqTraceNum);
        jrQianyueRequestDTO.setReqTraceNum(reqTraceNum);
        jrQianyueRequestDTO.setBnkId("03040000");
        jrQianyueRequestDTO.setAcctType("1");
        jrQianyueRequestDTO.setAcctNum("1234551234567890098");
        jrQianyueRequestDTO.setHldName("王三");
        jrQianyueRequestDTO.setTelNum("18662376333");
        jrQianyueRequestDTO.setCerType("01");
        jrQianyueRequestDTO.setCerNum("330825198505313111");
        jrQianyueRequestDTO.setSignType("2");
        jrQianyueRequestDTO.setProdFlag("0");
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = requestHeaderDTO.convert();
        DataRow requestListRow = jrQianyueRequestDTO.convert();
        // REQUEST
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);
        System.out.println("transactionDataRow:" + transactionDataRow);
        String requestJrQianyueCryptoMsg = DataGramB2cUtil.createRequestJrQianyueCryptoMsg(transactionDataRow);
        String s = AllinMTPUtil.postFor(requestJrQianyueCryptoMsg);
        System.out.println("s:" + s);
    }

    @Test
    public void testBind2() throws Exception {
        JrQianyueRequest jrQianyueRequestDTO = new JrQianyueRequest();
        jrQianyueRequestDTO.setReqTraceNum(this.reqTraceNum);// TODO ?
        jrQianyueRequestDTO.setBnkId("03040000");
        jrQianyueRequestDTO.setAcctType("1");
        jrQianyueRequestDTO.setAcctNum("1234551234567890098");
        jrQianyueRequestDTO.setHldName("王三");
        jrQianyueRequestDTO.setTelNum("18662376333");
        jrQianyueRequestDTO.setCerType("01");
        jrQianyueRequestDTO.setCerNum("330825198505313111");
        jrQianyueRequestDTO.setSignType("2");
        jrQianyueRequestDTO.setProdFlag("0");

        MTPTranxService tranxService = new MTPTranxServiceImpl();
        JrQianyueResponse jrQianyueResponse = tranxService.bindCard(jrQianyueRequestDTO);
        System.out.println("jrQianyueResponse:" + jrQianyueResponse);

        MsgVerifyRequest msgVerifyRequest = new MsgVerifyRequest();
        msgVerifyRequest.setReqTraceNum(AllinMTPUtil.getReqTraceNum());
        msgVerifyRequest.setVerifyCode("111111");
        msgVerifyRequest.setOrgReqTraceNum(this.reqTraceNum);
        msgVerifyRequest.setOrgTransDate(this.transDate);
        MsgVerifyResponse msgVerifyResponse = tranxService.sendSmsForBindCard(msgVerifyRequest);
        System.out.println("msgVerifyResponse:" + msgVerifyResponse);
    }

    @Test
    public void testBuyProduct() throws Exception {
        MTPTranxService mtpTranxService = new MTPTranxServiceImpl();
        BuyProductRequest buyProductRequest = new BuyProductRequest();
        buyProductRequest.setReqTraceNum(AllinMTPUtil.getReqTraceNum());
        buyProductRequest.setSignNum("201712112056131210");// TODO
        buyProductRequest.setBnkId("03040000");
        buyProductRequest.setAcctNum("1234551234567890098");
        buyProductRequest.setTelNum("18662376333");
        buyProductRequest.setAmtTran("10");
        buyProductRequest.setCurType("156");
        buyProductRequest.setOrderNum(AllinMTPUtil.getReqTraceNum());
        buyProductRequest.setTransUnits("1");
        buyProductRequest.setRespUrl("http://www.baidu.com");
        BuyProductResponse buyProductResponse = mtpTranxService.buyProduct(buyProductRequest);
        System.out.println("buyProductResponse:" + buyProductResponse);
    }

    @Test
    public void testBatchSubmit() throws Exception {

        SummaryRepayment summaryRepayment = new SummaryRepayment();
//        summaryRepayment.setBatchNo("O_D_20171215_01_78380000_ST");
        summaryRepayment.setBatchNo("O_D_20171217_14_78380000_ST");
        summaryRepayment.setProductNum("WZ5555");
        summaryRepayment.setTotalAmount("20000.00");
        summaryRepayment.setTotalCount("1");
        summaryRepayment.setTotalDiscount("0");
        summaryRepayment.setTotalUnits("0");
        // 只能是当天的
        summaryRepayment.setTransDate("20171217");
        //boolean b = mtpTranxService.batchRepayment(summaryRepayment);
    }

    @Test
    public void testDownload() throws Exception {
//        mtpTranxService.downloadRepayment("20171120", "O_D_20171120_00_78380000_ST");
        mtpTranxService.downloadRepayment("20171217", "O_D_20171217_38_78380000_ST");
    }

    @Test
    public void testParse() throws Exception {
        String result = "PFNUU1BhY2thZ2U PEVuY3J5cHRlZFRleHQ VS8vc0JUWGNtMDJmQTlxWGlSS3F0YkRUSnlOSzZrSjVVdUxjYUgvcndyWWRiRm5ySFhxR2MyODRZdmdoNStoVEFaSlBIeWRIOGtJUWpKczNGNHY3alZoSmlpV2wwNCtrN08yN2dObHVlbDVrY1FMRGhJZldnaDU2RHJHZS9BRGxFaGJXNVphbWZFaEUwYmVoMXUrSDExRC9CcWJHQkpyaTlOMHJDWUxHTjh6eUltaEtEVmZzaDNSZnE5MFpOWlFzTjZmeENWSEkrNjFNK2hVNnRxMEZpL0k5c0FuVHVta1E2WG4zV0hRNzk2ZkYxQXBpY3BlS1JkdTZLQk9vQWlNSGRqOTZVdDlmR1J4U1ZHUVdzVU1kZi9XUTRtTjR3bkdVdXF1d0UzVEZCa0ducVRiQlRxVHlveWlwa2dqeEVncE9Fb2hFNHRIWFpnWkdmYjM0bE1ScWhYSllGMktkZ0RRVW5XQWdvamxUWWNOd2pTYjJacHpqcWUvUFdnOStia3UrZVJFUVJudHpySGl5c2dvR3FNTTN2ZHJadkZrdi9YNXE1R1BkMnVtT3U3cWJvcVI1ZkgyTjM4RjNTMGJiR2dUWERZbHNzVWx2WFRVSU5sTitISTRmTHhpR2JydDFwU1dReVdlM1RRVklPdHp5WWtqd2pjMkJJZHNwcjlyZjYyL1IzN0dRYitaakJpWTFObjNkcW9jOHg5b3lHZWFvWXVjRnZQdlhNa2dCa3JvZDZaZG5GV2t5ZGpjWXgySlZJWHpTUFI2TTlSeXhOQmlQclRSWDhSb1ZuSWlzSVVmNXNyQzFoN0F3ZUc3dk9VaW11MDRjZGdJS0FzNGZjbkIyY0laOG9tVXREOWExUU1CemlHejU1ZTdsdFk2N3VkalAyV21tVWpITXNMM1A2SUhlQVdPSG9tYUs5NCt0TkZmeEdoV2NaNEJEaFdqR25qMUpwdm9rTkRQRC9yTlVzQUd5MUN0TkN0M2Y1UDRXZC92SzZzTDd6Z3d4cjdKcENHTUZ0NnE0eXVyQys4NE1NYS9qa2tNYlp3Uzd5bDNFNEZ6Vmx5Wmd1M3pTMFNxd2lLbXBTcFR1ajhQc2hSa1JtcXFPOUR6VVZUYmszNW5ML1ppVUM0QXBJUU8zTE5DY2NxZ3lrOENlR1Q1WkVybmo4aGJVZmxzRUNQVlNYcmZoS0UxbllDSWhnOHBaRmIxbnZFVHl2d3Nma3lMNFlsaWVzRVpmemFLeC9ZWDhEUGFRVnFaRmtabHBIVVdHWWlXNXlIUkplWXR4MWc0eU8yV2Y3NXVTb1RBb3BJUTg5UXRGbmp5eCtlR3Z6M0dNcjl3YWRETXVTdm9YWEp6RWlpVzJNRk9XMVRVTExOdU41d0F4akNnbHRqQlRsdFUxQzlNa3N5NWVNWWduRGt6djNMakhNL2ZvSnh1aUdvc21EdEZQNnByRkVvOWNxZW9SZlFZQlY1VUgxcldIRmFCeDRqKytXeDBLai85anc1WG9lblBNbitHMzcraitlYmo3dGtWMWFzS0p0em1IMytycWlmbmFJVHQvbnhTVEtObGxDUG0rZjlhUjlDa3FJdGl1TVhSWWYvQVZySnZ3T1BZKzRzU0FDRmU3SlFUKzExMnNWTW1Bb0ZRU2w0d3pVZUl3TllwS2hzb1hiVzFsVnhlOU1DVkIzeXA3K0JUK1ErRW15SUdSaysvWGRlUUhHK3NPSFhaMC9kSytFY3dURVpjM0lJWHlrRXczYUxwZEM5dXY0eFdEdC9ucVVtUWpDR1NKZC9KeUlNK25nbGpRY0VtbnF6UnBoTUs3Wkx0ZW9hTlhTK2RwWVRMSE1NMnIxU1F3L1VoSGxVa2lmTjY1MVpPa3FpUGVQaDZna0Vmd25GZ0JMYk5DUWtEYm1penhqKzdrcWNpa2p6bklmdUR4YkZYQW9SdjVyRVMzTVhCMXV4dTgyaDQ4ckRRMDNERVgramNKSlNUU0h2bjQ3eEY1bXEveC94RkxyNjJNdmhZNCtPOFJlWnF2OGYvaTJwdWxNLzNZM05nUVI2RTlHcmFNTi8zSklYTUxqakd5SXgydkhlQk11d2Z1Q3o3MEg3KzZ0cVF5TlZVMXdMR0xYZ2liNkZNWStocVVQa2dEMSthQklCclppR2l0bTFvSDhnamFsVmlRelgvdnoyWXZNcnVhNmlBNW5RNzNVc01VWWxzQmpwV1Q0ckFBWXBvZjE5S0ZWbVNiS1hsSnk3b3A5MmRYZWlBVkh6cTR3blYvSi82Nk5zNEdHVHVzOVNNTVZjRXFERFA2bStDSVR2SVNkR3VRPC9FbmNyeXB0ZWRUZXh0PjxLZXlJbmZvPjxSZWNlaXZlclg1MDlDZXJ0U04 OTA4NTMzNzY2MzQ3NjYyNzkzNjk0MTYwNzA3NDI5NDQ3MTcwNDwvUmVjZWl2ZXJYNTA5Q2VydFNOPjxFbmNyeXB0ZWRLZXk WVdEWFZRUVVOREM4RTh0dVQrR08yUTJQOFJ4eFpxTy9hd2dNaTBTSmVISzRnNDBnZTBJRWlNQVd0VytoNE51Qk5rZTlqS01mK0tvdXZKVU5uSWNNL01tcGljZnAyV0pjOEFsU1JTdmhDKzU5c2pvY1VTTE5LbWU3bzFIZ25OT1d2T21UZU93NytLVnJNVkNtWTNJZGNod0o5c3JoQ2RpMGlxaVh1eWI4RlBFPTwvRW5jcnlwdGVkS2V5PjwvS2V5SW5mbz48L1NUU1BhY2thZ2U";
        String s = result.replaceAll(" ", "+");
        MTPTranxService mtpTranxService = new MTPTranxServiceImpl();
        mtpTranxService.notifyBuyProduct(s);
    }

    @Test
    public void testToFen() {
        BigDecimal bigDecimal = new BigDecimal("100");
        String result = bigDecimal.multiply(new BigDecimal(100)).setScale(0).toString();
        System.out.println("result:" + result);
    }

}
