package com.ysd.pay.controller;

import com.aipg.common.AipgRsp;
import com.aipg.common.InfoRsp;
import com.aipg.rnp.*;
import com.allinpay.xmltrans.constant.Bank;
import com.allinpay.xmltrans.constant.BankType;
import com.allinpay.xmltrans.constant.IDType;
import com.allinpay.xmltrans.service.TranxService;
import com.allinpay.xmltrans.service.impl.TranxServiceImpl;
import com.ysd.account.entity.AccountBank;
import com.ysd.pay.service.BindingService;
import com.ysd.pay.service.PaymentService;
import com.ysd.pay.util.CommonUtil;
import com.ysd.user.entity.User;
import com.ysd.user.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 存管账号绑定
 * Created by yujian on 2017/9/11.
 */
@Controller
public class BindingController extends BaseController {

    private Logger log = LogManager.getLogger(BindingController.class);


    @Autowired
    private BindingService bindingService;
    @Autowired
    private UserService userService;


    @RequestMapping("/binding")
    @ResponseBody
    public Map<String, Object> binding(HttpServletRequest request) {

        printInfo(log, request);
        //注册
        Map<String, String> _map = getRequestMap(request);


        try {
            TranxService tranxService = new TranxServiceImpl();

            Rnpa rnpa = new Rnpa();
            rnpa.setID_TYPE(IDType.ID_CARD.code);
            rnpa.setID(_map.get("cardId"));

            String bankId = Bank.getBankIdByCode(_map.get("bankId"));
            rnpa.setBANK_CODE(bankId);
            rnpa.setACCOUNT_NO(_map.get("account"));
            rnpa.setACCOUNT_NAME(_map.get("realName"));
            rnpa.setACCOUNT_TYPE(BankType.BANK_CARD.code);
            rnpa.setACCOUNT_PROP("0");
            rnpa.setTEL(_map.get("phone"));


            AipgRsp aipgRsp = tranxService.bindCard(rnpa);
            InfoRsp info = aipgRsp.getINFO();
            String infoRetCode = info.getRET_CODE();
            String errMsg = info.getERR_MSG();

            String result = "";
            String msg = "";
            if ("0000".equals(infoRetCode)) {
                log.debug("提交成功");
                RnpaRet ret = (RnpaRet) aipgRsp.findObj(RnpaRet.class);
                result = ret.getRET_CODE();
                msg = ret.getERR_MSG();

                if ("0000".equals(result)) {
                    _map.put("no", info.getREQ_SN());
                    bindingUpdate(_map, 0);
                }

                log.error("交易结果:{}", ret.getRET_CODE(), ret.getERR_MSG());


            } else {
                log.error("响应码:{}, 原因:{}", infoRetCode, errMsg);
                result = infoRetCode;
                msg = errMsg;
            }

            Map<String, Object> mv = new HashMap<String, Object>();
            mv.put("code", result);
            mv.put("msg", msg);
            return mv;
        } catch (Exception ex) {
            log.error(ex);
            return json("4444", ex.getMessage());
        }


    }


    @RequestMapping("/bindingCode")
    @ResponseBody
    public Map<String, Object> bindingCode(HttpServletRequest request) {
        printInfo(log, request);
        //注册
        Map<String, String> _map = getRequestMap(request);


        try {
            TranxService tranxService = new TranxServiceImpl();
            String result = "";
            String msg = "";

            Rnpr rnpr = new Rnpr();
            rnpr.setSRCREQSN(_map.get("no"));
            AipgRsp aipgRsp = tranxService.repeatSmsForBindCard(rnpr);

            InfoRsp info = aipgRsp.getINFO();
            String infoRetCode = info.getRET_CODE();
            String errMsg = info.getERR_MSG();

            if ("0000".equals(infoRetCode)) {
                log.debug("提交成功");
                RnprRet ret = (RnprRet) aipgRsp.findObj(RnprRet.class);
                result = ret.getRET_CODE();
                msg = ret.getERR_MSG();

                log.error("交易结果:{}", ret.getRET_CODE(), ret.getERR_MSG());

            } else {
                log.error("响应码:{}, 原因:{}", infoRetCode, errMsg);
                result = infoRetCode;
                msg = errMsg;
            }

            Map<String, Object> mv = new HashMap<String, Object>();
            mv.put("code", result);
            mv.put("msg", msg);
            return mv;
        } catch (Exception ex) {
            log.error(ex);
            return json("4444", ex.getMessage());
        }

    }


    @RequestMapping("/bindingTest")
    @ResponseBody
    public Map<String, Object> bindingTest(HttpServletRequest request) {

        printInfo(log, request);
        //注册
        Map<String, String> _map = getRequestMap(request);
        String result = "";
        String msg = "";

        int num = bindingService.bindUpdateRealStatus(Integer.parseInt(_map.get("id")));
        if (num != 1) {
            log.error("实名认证更新状态失败:{id}", _map.get("id"));
            result = "4444";
            msg = "实名认证更新状态失败";
        }
        Map<String, Object> mv = new HashMap<String, Object>();
        mv.put("code", result);
        mv.put("msg", msg);
        return mv;
    }

    @RequestMapping("/binding2")
    @ResponseBody
    public Map<String, Object> binding2(HttpServletRequest request) {

        printInfo(log, request);
        //注册
        Map<String, String> _map = getRequestMap(request);


        try {
            TranxService tranxService = new TranxServiceImpl();
            String result = "";
            String msg = "";

            Rnpc rnpc = new Rnpc();
            rnpc.setSRCREQSN(_map.get("no"));
            rnpc.setVERCODE(_map.get("code"));

            AipgRsp aipgRsp = tranxService.confirmSmsForBindCard(rnpc);
            InfoRsp info = aipgRsp.getINFO();
            String infoRetCode = info.getRET_CODE();
            String errMsg = info.getERR_MSG();

            if ("0000".equals(infoRetCode)) {
                log.debug("提交成功");
                RnpcRet ret = (RnpcRet) aipgRsp.findObj(RnpcRet.class);
                result = ret.getRET_CODE();
                msg = ret.getERR_MSG();

                if ("0000".equals(result)) {
                    //更新实名状态
                    int num = bindingService.bindUpdateRealStatus(Integer.parseInt(_map.get("id")));
                    if (num != 1) {
                        log.error("实名认证更新状态失败:{id}", _map.get("id"));
                        result = "4444";
                        msg = "实名认证更新状态失败";
                    }
                }

                log.error("交易结果:{}", ret.getRET_CODE(), ret.getERR_MSG());


            } else {
                log.error("响应码:{}, 原因:{}", infoRetCode, errMsg);
                result = infoRetCode;
                msg = errMsg;
            }


            Map<String, Object> mv = new HashMap<String, Object>();
            mv.put("code", result);
            mv.put("msg", msg);
            return mv;
        } catch (Exception ex) {
            log.error(ex);
            return json("4444", ex.getMessage());
        }
    }


    /***返回**/

    private boolean bindingUpdate(Map<String, String> map, int typeId) {

        //mac验证
        User userLogin = userService.queryByPhone(map.get("phone"), typeId);

        //用户信息
        userLogin.setRealName(map.get("realName"));
        userLogin.setCardId(map.get("cardId"));
        userLogin.setCardType("1");//身份证
        userLogin.setRealStatus(2);//签约中间状态
        userLogin.setBankCustNo(map.get("no"));//存管返回账号
        userLogin.setPayPassword(map.get("safePwd"));

        if (StringUtils.isEmpty(userLogin.getTgNo())) {
            userLogin.setTgNo(CommonUtil.getRandomNumAndLetter(6));
        }
        try {
            String sex = "1";
            String str = userLogin.getCardId().substring(16, 17);
            if ((Integer.valueOf(str) % 2) == 0) {
                sex = "2";
            }
            userLogin.setSex(sex);
            userLogin.setBirthday(CommonUtil.getString2Date(userLogin.getCardId().substring(6, 14), "yyyyMMdd"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //银行卡信息
        AccountBank accountBank = new AccountBank();
        accountBank.setModifyDate(new Date());
        accountBank.setAccount(map.get("account"));
        accountBank.setBankId(map.get("bankId"));
        accountBank.setAddIp("0.0.0.0");
        accountBank.setPhone(map.get("phone"));
        if (userLogin.getAgencyid() != null) {
            accountBank.setAgencyId(userLogin.getAgencyid().longValue());
        }

        if (accountBank.getId() == null) {
            accountBank.setCreateDate(new Date());
            accountBank.setUserId(userLogin.getId());
            accountBank.setStatus(2);//yujian 签约中间成功
        } else {
            accountBank.setStatus(2);//yujian 签约中间成功
        }

        //保存信息
        Integer num = bindingService.bindCardNotify(userLogin, accountBank);

        if (num.compareTo(1) == 0) {
            log.info("重复添加银行卡!");
        } else {
            log.info("银行卡验证成功");
        }
        return true;
    }

}


