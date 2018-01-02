package com.ysd.pay.controller;

import com.aipg.common.AipgRsp;
import com.aipg.rnp.Rnpa;
import com.allinpay.xmltrans.constant.Bank;
import com.allinpay.xmltrans.constant.BankType;
import com.allinpay.xmltrans.constant.IDType;
import com.allinpay.xmltrans.service.TranxService;
import com.allinpay.xmltrans.service.impl.TranxServiceImpl;
import com.ysd.base.dto.BaseResponse;
import com.ysd.pay.config.AppConfig;
import com.ysd.pay.config.CBHBTppConfig;
import com.ysd.pay.spring.ApplicationContextHolder;
import com.ysd.pay.vo.LoginResponse;
import com.ysd.user.entity.User;
import com.ysd.user.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yujian on 2017/7/11.
 */
@Controller
public class HelloController {

    private Logger logger = LogManager.getLogger(HelloController.class);

    // 方式二
//    private Logger logger = LogManager.getLogger("paylogger");

    @Autowired
    private UserService userService;

    private TranxService tranxService = new TranxServiceImpl();

    /**
     * 配置文件读取
     * 方式一:通过Autowired注入
     * 方式二:通过调用ApplicationContextHolder.getAppConfig();
     *       ApplicationContextHolder.getCBHBTppConfig()
     */
    @Autowired
    private AppConfig appConfig;

    @Autowired
    private CBHBTppConfig cbhbTpp;

    @RequestMapping("/hello")
    public String hello(){

        String runtimeEnv = appConfig.getRuntimeEnv();
        String ftpHost = cbhbTpp.getFtpHost();
        logger.info("*******this is paylogger*******runtimeEnv:{} ftpHost: {}", runtimeEnv, ftpHost);
        return "hello";
    }

    /**
     * 直接通过BaseResponse中的extras返回附加内容
     * @param mobile
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public BaseResponse login(String mobile, String password) {
        User login = userService.login(mobile, password);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.getExtras().put("user", login);
        return baseResponse;
    }

    /**
     * 直接通过创建新的Vo对象返回
     * @param mobile
     * @param password
     * @return
     */
    @RequestMapping("/login2")
    public LoginResponse login2(String mobile, String password) {
        User login = userService.login(mobile, password);
        LoginResponse baseResponse = new LoginResponse();
        baseResponse.setUser(login);
        return baseResponse;
    }

    @RequestMapping("/bindCard")
    @ResponseBody
    public AipgRsp bindCard() {
        Rnpa rnpa = new Rnpa();
        rnpa.setID_TYPE(IDType.ID_CARD.code);
        rnpa.setID("330825198505313111");
        rnpa.setBANK_CODE(Bank.ABC.code);
        rnpa.setACCOUNT_NO("6228430329520075072");
        rnpa.setACCOUNT_NAME("席胜春");
        rnpa.setACCOUNT_TYPE(BankType.BANK_CARD.code);
        rnpa.setACCOUNT_PROP("0");
        rnpa.setTEL("18662376333");
        AipgRsp aipgRsp = tranxService.bindCard(rnpa);
        return aipgRsp;
    }


}
