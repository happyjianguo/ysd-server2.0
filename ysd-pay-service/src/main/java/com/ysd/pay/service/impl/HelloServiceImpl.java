package com.ysd.pay.service.impl;

import com.ysd.pay.service.HelloService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * @author xishengchun on 2017-09-09.
 */
@Service
public class HelloServiceImpl implements HelloService {

    private Logger logger = LogManager.getLogger(HelloServiceImpl.class);

    @Override
    public void hello() {
        logger.info("****hello");
    }
}
