package spring.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.ysd"})
@PropertySources({
        @PropertySource({"classpath:/jdbc.properties"}),
        @PropertySource({"classpath:/application.properties"})
})
@Import(value = DataSourceConfig.class)
public class AppConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
