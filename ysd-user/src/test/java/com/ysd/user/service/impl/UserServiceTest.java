package com.ysd.user.service.impl;

import com.ysd.user.entity.User;
import com.ysd.user.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import spring.test.BeanTest;

import java.util.List;

/**
 * @author xishengchun on 2017-09-10.
 */
public class UserServiceTest extends BeanTest {

    @Autowired
    private UserService userService;


    @Test
    public void testLogin() {
        String mobile = "18662376333";
        String password = "8888";
        User login = userService.login(mobile, password);
        logger.info("login:{}", login);
        Assert.assertTrue(login != null );
    }
}
