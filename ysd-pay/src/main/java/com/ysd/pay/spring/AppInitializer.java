package com.ysd.pay.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 容器启动时设置容器对象给容器持有者
 */
@Component
public class AppInitializer implements ApplicationListener<ContextRefreshedEvent> {

    private final Logger LOGGER = LogManager.getLogger(AppInitializer.class.getName());


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContextHolder.init(event.getApplicationContext());
    }
}