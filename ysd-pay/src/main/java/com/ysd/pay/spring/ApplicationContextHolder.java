package com.ysd.pay.spring;


import com.ysd.pay.config.AppConfig;
import com.ysd.pay.config.CBHBTppConfig;
import org.springframework.context.ApplicationContext;


public class ApplicationContextHolder {
    private static ApplicationContext context;
    public  static  void init(ApplicationContext ctx){
        if (ctx != null){
           context = ctx;
        }
    }

    public static  <T> T getBean(Class<T> type){
       return context.getBean(type);
    }

    public static  <T> T getBean(String beanName){
        return (T) context.getBean(beanName);
    }

    public static AppConfig getAppConfig() {
        return getBean(AppConfig.class);
    }

    public static CBHBTppConfig getCBHBTppConfig() {
        return getBean(CBHBTppConfig.class);
    }
}
