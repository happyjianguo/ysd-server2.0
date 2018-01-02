package com.ysd.pay.service.impl;

import com.ysd.pay.service.HelloService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import spring.AbstractTest;

/**
 * @author xishengchun on 2017-09-09.
 */
public class HelloServiceTest extends AbstractTest {

    @Autowired
    private HelloService helloService;

    @Test
    @Rollback(false) // 数据库的读取不会被rollback
    public void testHello() {
        helloService.hello();
    }

}
