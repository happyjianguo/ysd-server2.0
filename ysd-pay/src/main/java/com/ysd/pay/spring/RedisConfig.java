package com.ysd.pay.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * redis配置
 */
@Configuration
@EnableCaching
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 7200,redisNamespace = "ims:manage")//spring:session:ims:manage:sessions:
@Order(2)
public class RedisConfig extends CachingConfigurerSupport {
    private final Logger LOGGER = LogManager.getLogger(RedisConfig.class.getName());


    @Bean
    public ThreadPoolTaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(2);
        scheduler.setThreadNamePrefix("task-");
        scheduler.setAwaitTerminationSeconds(60);
        scheduler.setWaitForTasksToCompleteOnShutdown(true);
        return scheduler;
    }

    /**
     * 自定义key. 这个可以不用
     * 此方法将会根据类名+方法名+所有参数的值生成唯一的一个key,即使@Cacheable中的value属性一样，key也会不一样。
     */
//    @Override
//    public KeyGenerator keyGenerator() {
//       return new KeyGenerator() {
//           @Override
//           public Object generate(Object o, Method method, Object... objects) {
//              // This will generate a unique key of the class name, the method name
//              //and all method parameters appended.
//              StringBuilder sb = new StringBuilder();
//              sb.append(o.getClass().getName());
//              sb.append(method.getName());
//              for (Object obj : objects) {
//                  sb.append(obj.toString());
//              }
//              return sb.toString();
//           }
//       };
//    }

    @Bean(name="cacheManager")
    public CacheManager cacheManager(RedisTemplate redisTemplate) {
        RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
        LOGGER.debug("rcm template id:{}",redisTemplate);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        return rcm;
    }

    /**
     * RedisTemplate配置
     *
     * @param factory
     * @return
     */
    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
        StringRedisTemplate template = new StringRedisTemplate(factory);
        template.setValueSerializer(new JdkSerializationRedisSerializer());
        LOGGER.debug("rcm template id:{}",template);
        return template;
    }

}
