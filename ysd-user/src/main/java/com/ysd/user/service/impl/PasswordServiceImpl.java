package com.ysd.user.service.impl;

import com.ysd.user.service.PasswordService;
import org.springframework.stereotype.Service;

/**
 * @author xishengchun on 2017-09-13.
 */
@Service
public class PasswordServiceImpl implements PasswordService {

    @Override
    public boolean modifyLoginPWD(Integer userId, String oldPWD, String newPWD) {
        // TODO 密码策略
        return false;
    }

    @Override
    public boolean modifyAgencyPayPWD(Integer userId, String oldPWD, String newPWD) {
        // TODO
        return false;
    }

    @Override
    public boolean modifyPayPWD(Integer userId, String oldPWD, String newPWD) {
        // TODO
        return false;
    }

    @Override
    public boolean forgetLoginPWD(Integer userId, String newPWD) {
        // TODO
        return false;
    }
}
