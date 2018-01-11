package com.ysd.pay.controller;


import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by yujian on 2017/9/18.
 */
public abstract  class BaseController {

    public ModelAndView error(){
        ModelAndView mv = new ModelAndView("common");
        mv.addObject("info", "ERROR");
        return mv;
    }
    public ModelAndView error(String str){
        ModelAndView mv = new ModelAndView("common");
        mv.addObject("info", str);
        return mv;
    }

    public ModelAndView success(){
        ModelAndView mv = new ModelAndView("common");
        mv.addObject("info", "SUCCESS");
        return mv;
    }

    public ModelAndView success(String str){
        ModelAndView mv = new ModelAndView("common");
        mv.addObject("info", str);
        return mv;
    }


    public Map<String,Object> json(String code,String msg){
        Map<String,Object> mv = new HashMap<String,Object>();
        mv.put("code", code);
        mv.put("msg", msg);
        return mv;
    }

    public static void printInfo(Logger log, HttpServletRequest request ){


        log.info("请求地址:{}" , request.getRequestURL());
        Iterator<?> iter = request.getParameterMap().keySet().iterator();
        try{
            while (iter.hasNext()) {
                String key = (String) iter.next();
                String values = request.getParameter(key);
                log.info("key:{},value:{}",key,values);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("参数打印结束");
    }

    public Map<String,String> getRequestMap(HttpServletRequest request){

        Map<String,String> map = new HashMap<String,String>();
        Iterator<?> iter = request.getParameterMap().keySet().iterator();

        try{
            while (iter.hasNext()) {
                String key = (String) iter.next();
                map.put(key,request.getParameter(key));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


    public static String getBigDecimalMoneyUpper(final String value){
        BigDecimal temp = StringUtils.isBlank(value)?BigDecimal.ZERO: valueOf(value);
        BigDecimal result = decimal(temp.multiply(BigDecimal.valueOf(100.0)),0);
        return result.toString();
    }

    public static String getBigDecimalMoneyDown(final String value){
        BigDecimal temp = StringUtils.isBlank(value)?BigDecimal.ZERO: valueOf(value);
        BigDecimal result = decimal(temp.divide(BigDecimal.valueOf(100.0), BigDecimal.ROUND_DOWN).setScale(2), 2);
        return result.toString();
    }

    private static BigDecimal decimal(BigDecimal v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal one = new BigDecimal("1");
        return v.divide(one, scale, BigDecimal.ROUND_DOWN);
    }
    private static BigDecimal valueOf(String amount){
        BigDecimal result = null;
        if(StringUtils.isNotBlank(amount)){
            result = new BigDecimal(amount);
        }
        return result;
    }

    public static String getNowDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    public static String getDate(Date date) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(date);
        return dateString;
    }
}
