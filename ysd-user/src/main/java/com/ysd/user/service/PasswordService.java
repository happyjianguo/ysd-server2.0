package com.ysd.user.service;

/**
 * @author xishengchun on 2017-09-13.
 * 密码管理
 */
public interface PasswordService {


    /**
     * 修改所有用户的登录密码
     * @return
     */
    boolean modifyLoginPWD(Integer userId, String oldPWD, String newPWD);

    /**
     * 修改服务商类型用户的安全密码
     * @return
     */
    boolean modifyAgencyPayPWD(Integer userId, String oldPWD, String newPWD);

    /**
     * 修改投资人交易密码
     * @return
     */
    boolean modifyPayPWD(Integer userId, String oldPWD, String newPWD);

    /**
     * 忘记密码
     * @param userId
     * @param newPWD
     * @return
     */
    boolean forgetLoginPWD(Integer userId, String newPWD);
}
