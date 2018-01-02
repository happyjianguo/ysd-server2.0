package com.ysd.pay.spring;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ysd.base.exception.YsdException;
import com.ysd.pay.constants.Constant;
import com.ysd.pay.exception.PayException;
import com.ysd.pay.util.FastJsonConverter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.annotation.Order;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@EnableWebMvc
@PropertySources({
        @PropertySource({"classpath:/cbhbTpp.properties", "classpath:/message.properties"})
})
@Order(4)
public class WebConfig extends WebMvcConfigurerAdapter {

    private Logger logger = LogManager.getLogger(WebConfig.class);

//    @Resource
//    private RedisTemplate<String,String> redisTemplate;

    private void response(HttpServletResponse response, String resultCode, String resultMsg) {
        response.setContentType(Constant.CONTENT_TYPE_JSON);
        Map<String,String> result = new HashMap<>();
        result.put(Constant.RESULT_CODE_KEY,resultCode);
        result.put(Constant.RESULT_MSG_KEY, resultMsg);
        try {
            response.getWriter().write(JSON.toJSONString(result));
            response.getWriter().flush();
            response.getWriter().close();
        } catch (Exception e){
            logger.error("write json error",e);
        }

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations(
                        "classpath:/META-INF/resources/webjars/");
        super.addResourceHandlers(registry);
    }

    @Bean
    public FastJsonConverter fdFastJsonConverter() {
        logger.info("fdFastJsonConverter **init**");

        FastJsonConverter converter = new FastJsonConverter();
        converter.setFeatures(SerializerFeature.QuoteFieldNames, SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteMapNullValue);
        return converter;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(fdFastJsonConverter());
    }


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
        exceptionResolvers.add(new HandlerExceptionResolver() {
            @Override
            public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

                String msg = Constant.RESULT_MSG_EXCEPTION;
                if (e instanceof YsdException) {
                    msg = e.getMessage();
                    logger.error("系统异常,参数:{}", ((YsdException) e).getExceptionField(), e);
                } else {
                    logger.error("系统异常", e);
                }
                response(httpServletResponse,Constant.RESULT_CODE_EXCEPTION,msg);
                return new ModelAndView();
            }
        });

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor());
    }

    private class MyInterceptor extends HandlerInterceptorAdapter {

        /*private void setCrossDomainAjax(HttpServletRequest request, HttpServletResponse response){
            response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
            response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE");
            response.setHeader("Access-Control-Max-Age", "3600");//单位秒
            response.setHeader("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, token");
            response.setHeader("Access-Control-Allow-Credentials", "true");
        }*/

        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//            setCrossDomainAjax(request,response);
            String contextPath = request.getContextPath();
            String urlStartPart = (contextPath + "/public");
            logger.debug("urlStartPart:{}", urlStartPart);
            String requestUri = request.getRequestURI();
            requestUri = requestUri.replaceAll("//","/");
            logger.debug("requestUri:{}", requestUri);

            //权限拦截这里
            /*** 权限判断start ***/
            if (requestUri.startsWith(urlStartPart)){//不需要登入的页面 /public开头
                return true;
            }

            /*if (!HttpRequestUtils.isLogin()){
                response(response, Constant.RESULT_CODE_NO_LOGIN,Constant.RESULT_MSG_NO_LOGIN);
                return false;
            }*/

            return true;
        }
    }

    /*@Bean
    public ServletRegistrationBean RandomCodeServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new RandomCodeServlet(),"/public/randomCode");
        return registrationBean;
    }*/

    @Bean
    public RestTemplate restTemplate(ClientHttpRequestFactory factory){
        return new RestTemplate(factory);
    }

    @Bean
    public ClientHttpRequestFactory simpleClientHttpRequestFactory(){
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(5000);//ms
        factory.setConnectTimeout(15000);//ms
        return factory;
    }

}
