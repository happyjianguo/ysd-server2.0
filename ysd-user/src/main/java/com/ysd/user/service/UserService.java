package com.ysd.user.service;

import com.ysd.user.entity.User;

import java.util.List;

/**
 * @author xishengchun on 2017-09-10.
 */
public interface UserService {
    User login(String mobile, String password);

    User queryByPhone(String phone,int typeId);

    User queryById(Integer userId);
}
