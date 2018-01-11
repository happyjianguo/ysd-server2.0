package com.ysd.pay.util;

import com.ysd.pay.constants.SessionKey;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class HttpRequestUtils {
    private final static Logger LOGGER = LogManager.getLogger(HttpRequestUtils.class.getName());

    public static HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    public static ServletContext getServletContext() {
        return getRequest().getServletContext();
    }

    public static <E> E geAttrFromApplication(SessionKey sessionKey) {
        E attrVal = (E) getRequest().getServletContext().getAttribute(sessionKey.code);
        return attrVal;
    }

    public static void setAttrToApplication(SessionKey sessionKey, Object value) {
        getRequest().getServletContext().setAttribute(sessionKey.code, value);
    }

    public static HttpSession getSession() {
        return getRequest().getSession();
    }


    public static <E> E getAttrFromSession(SessionKey sessionKey) {
        E attrVal = (E) getRequest().getSession().getAttribute(sessionKey.code);
        return attrVal;
    }

    public static void removeAttrFromSession(SessionKey sessionKey) {
        getRequest().getSession().removeAttribute(sessionKey.code);
    }


    public static <T> void setAttrToSession(SessionKey sessionKey, T value) {
        getRequest().getSession().setAttribute(sessionKey.code, value);
    }


    /*public static boolean isLogin() {
        Long userId = getAttrFromSession(SessionKey.SESSION_USER_ID);
        return userId != null;
    }*/

    public static String getReferrer() {
        return getRequest().getHeader("referer");
    }

    public static boolean isAjaxRequest() {
        return "XMLHttpRequest".equals(getRequest().getHeader("X-Requested-With"));
    }



    /**
     * 清空session
     */
    public static void invalidateSession() {
        getSession().invalidate();
    }

    public static String getRequestIp() {
        HttpServletRequest request = getRequest();
        String ip = request.getHeader("X-Real-IP");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("x-forwarded-for");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (StringUtils.isNotEmpty(ip) && ip.lastIndexOf(",") != -1) {
            int startIndex = ip.lastIndexOf(",") + 1;
            ip = ip.substring(startIndex).trim();
        }
        return ip;
    }







}