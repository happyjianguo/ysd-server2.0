package com.ysd.pay.vo;

import com.ysd.base.dto.BaseResponse;
import com.ysd.user.entity.User;

/**
 * @author xishengchun on 2017-09-10.
 */
public class LoginResponse extends BaseResponse {

    private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
