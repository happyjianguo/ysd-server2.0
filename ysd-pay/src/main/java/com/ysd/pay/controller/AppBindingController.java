package com.ysd.pay.controller;

import com.aipg.common.AipgRsp;
import com.aipg.common.InfoRsp;
import com.aipg.rnp.*;
import com.allin.mtp.constant.MTPBank;
import com.allin.mtp.model.JrQianyueRequest;
import com.allin.mtp.model.JrQianyueResponse;
import com.allin.mtp.model.MsgVerifyRequest;
import com.allin.mtp.model.MsgVerifyResponse;
import com.allin.mtp.service.MTPTranxService;
import com.allin.mtp.service.impl.MTPTranxServiceImpl;
import com.allin.mtp.util.AllinMTPUtil;
import com.allinpay.xmltrans.constant.Bank;
import com.allinpay.xmltrans.constant.BankType;
import com.allinpay.xmltrans.constant.IDType;
import com.allinpay.xmltrans.service.TranxService;
import com.allinpay.xmltrans.service.impl.TranxServiceImpl;
import com.ysd.account.criteria.AccountBankCriteria;
import com.ysd.account.dao.AccountBankMapper;
import com.ysd.account.entity.AccountBank;
import com.ysd.pay.service.BindingService;
import com.ysd.pay.util.CommonUtil;
import com.ysd.user.entity.User;
import com.ysd.user.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 存管账号绑定
 * Created by yujian on 2017/9/11.
 */
@Controller
@RequestMapping("/app/")
public class AppBindingController extends BaseController {

    private Logger log = LogManager.getLogger(AppBindingController.class);


    @Autowired
    private BindingService bindingService;

    @Autowired
    private UserService userService;

    @Autowired
    private AccountBankMapper accountBankMapper;


    /**
     * 签约接口
     * @param request
     * @return
     */
    @RequestMapping("/binding")
    @ResponseBody
    public Map<String, Object> binding(HttpServletRequest request) {

        printInfo(log, request);
        //注册
        Map<String, String> _map = getRequestMap(request);
        try {

            MTPTranxService mtpTranxService = new MTPTranxServiceImpl();
            JrQianyueRequest jrQianyueRequest = new JrQianyueRequest();
            String reqTraceNum = AllinMTPUtil.getReqTraceNum();
            jrQianyueRequest.setReqTraceNum(reqTraceNum);
            jrQianyueRequest.setBnkId(MTPBank.getBankIdByCode(_map.get("bankId")));// 银行代码
            jrQianyueRequest.setAcctType("1");// 借记卡,固定
            jrQianyueRequest.setAcctNum(_map.get("account"));// 卡号
            jrQianyueRequest.setHldName(_map.get("realName"));// 户名称
            jrQianyueRequest.setTelNum(_map.get("phone"));// 预留手机号

            jrQianyueRequest.setCerType("01");// 身份证,固定
            jrQianyueRequest.setCerNum(_map.get("cardId"));// 身份证号
            jrQianyueRequest.setSignType("2");// 快捷支付
            jrQianyueRequest.setProdFlag("0");

            JrQianyueResponse jrQianyueResponse = mtpTranxService.bindCard(jrQianyueRequest);

            String result = jrQianyueResponse.getRespCode();
            String msg = jrQianyueResponse.getRespMsg();
            if (jrQianyueResponse.ok()) {
                result = "0000";
                log.debug("提交成功");
                // 需要保存 银行代码,卡号,户名称,预留手机号,身份证件号
                // 另外还需要保存原来交易的交易日期,交易时间
                _map.put("no", jrQianyueResponse.getReqTraceNum());
                _map.put("mtp_trans_date", jrQianyueResponse.getTransDate());
                _map.put("mtp_trans_time", jrQianyueResponse.getTransTime());
                bindingUpdate(_map, 0);

                log.error("交易结果, code:{}, msg:{}", result, msg);
            } else {
                log.error("响应码:{}, 原因:{}", result, msg);
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


    /**
     *
     * 从数据库获取签名参数,重新发起签名请求
     * @param request
     * @return
     */
    @RequestMapping("/bindingCode")
    @ResponseBody
    public Map<String, Object> bindingCode(HttpServletRequest request) {
        printInfo(log, request);
        //注册
        Map<String, String> _map = getRequestMap(request);

        try {

            // 从数据库重新获取签约信息,重新签约。为了重新发送短信
            int id = NumberUtils.toInt(_map.get("id"));
            User user = userService.queryById(id);
            AccountBankCriteria accountBankCriteria = new AccountBankCriteria();
            accountBankCriteria.createCriteria()
                    .andUserIdEqualTo(id)
                    .andStatusEqualTo(2)
                    ;
            // 查询银行卡状态是签约中的,
            String result = "";
            String msg = "";
            List<AccountBank> accountBanks = accountBankMapper.selectByCriteria(accountBankCriteria);
            if (CollectionUtils.isEmpty(accountBanks)) {
                result = "-444";
                msg = "银行卡不存在";
            } else {
                AccountBank accountBank = accountBanks.get(0);
                MTPTranxService mtpTranxService = new MTPTranxServiceImpl();
                JrQianyueRequest jrQianyueRequest = new JrQianyueRequest();
                String reqTraceNum = AllinMTPUtil.getReqTraceNum();
                jrQianyueRequest.setReqTraceNum(reqTraceNum);
                jrQianyueRequest.setAcctType("1");// 借记卡,固定
                jrQianyueRequest.setBnkId(MTPBank.getBankIdByCode(accountBank.getBankId()));// 银行代码
                jrQianyueRequest.setAcctNum(accountBank.getAccount());// 卡号
                jrQianyueRequest.setHldName(user.getRealName());// 户名称
                jrQianyueRequest.setTelNum(accountBank.getPhone());// 预留手机号
                jrQianyueRequest.setCerNum(user.getCardId());// 身份证号
                jrQianyueRequest.setCerType("01");// 身份证,固定
                jrQianyueRequest.setSignType("2");// 快捷支付
                jrQianyueRequest.setProdFlag("0");
                JrQianyueResponse jrQianyueResponse = mtpTranxService.bindCard(jrQianyueRequest);
                result = jrQianyueResponse.getRespCode();
                msg = jrQianyueResponse.getRespMsg();
                if (jrQianyueResponse.ok()) {
                    result = "0000";
                    log.debug("提交成功");
                    // 需要保存 银行代码,卡号,户名称,预留手机号,身份证件号
                    // 另外还需要保存原来交易的交易日期,交易时间
                    _map.put("phone", accountBank.getPhone());
                    _map.put("no", jrQianyueResponse.getReqTraceNum());
                    _map.put("mtp_trans_date", jrQianyueResponse.getTransDate());
                    _map.put("mtp_trans_time", jrQianyueResponse.getTransTime());
                    bindingUpdate(_map, 0);

                    log.error("交易结果, code:{}, msg:{}", result, msg);
                } else {
                    log.error("响应码:{}, 原因:{}", result, msg);
                }
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

    /**
     * 处理短信上送,完成签约
     * @param request
     * @return
     */
    @RequestMapping("/binding2")
    @ResponseBody
    public Map<String, Object> binding2(HttpServletRequest request) {

        printInfo(log, request);
        //注册
        Map<String, String> _map = getRequestMap(request);
        try {
            int userId = Integer.parseInt(_map.get("id"));
            User user = userService.queryById(userId);

            MTPTranxService mtpTranxService = new MTPTranxServiceImpl();
            MsgVerifyRequest msgVerifyRequest = new MsgVerifyRequest();
            // 从数据库获取
            msgVerifyRequest.setOrgTransDate(user.getMtpTransDate());
            msgVerifyRequest.setOrgReqTraceNum(_map.get("no"));
            msgVerifyRequest.setVerifyCode(_map.get("code"));

            MsgVerifyResponse msgVerifyResponse = mtpTranxService.sendSmsForBindCard(msgVerifyRequest);
            String result = msgVerifyResponse.getRespCode();
            String msg = msgVerifyResponse.getRespMsg();
            if (msgVerifyResponse.ok()) {
                result = "0000";
                //更新实名状态
                int num = bindingService.bindUpdateRealStatus(userId, msgVerifyResponse.getSignNum());
                if (num != 1) {
                    log.error("实名认证更新状态失败:{}", _map.get("id"));
                    result = "4444";
                    msg = "实名认证更新状态失败";
                }
            } else {
                log.error("短信验证码上送");
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

        userLogin.setMtpTransDate(map.get("mtp_trans_date"));
        userLogin.setMtpTransTime(map.get("mtp_trans_time"));

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


