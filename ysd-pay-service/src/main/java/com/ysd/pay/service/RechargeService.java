package com.ysd.pay.service;

import java.util.Map;

/**
 * Created by yujian on 2017/9/11.
 */
public interface RechargeService {


    int rechargeSuccess(Map<String, Object> map);

    int rechargeBack(Map<String, Object> map);

}
