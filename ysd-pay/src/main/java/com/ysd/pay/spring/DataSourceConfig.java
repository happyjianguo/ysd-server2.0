package com.ysd.pay.spring;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@EnableTransactionManagement
@MapperScan({
		"com.ysd.*.dao"
})
@Order(1)
public class DataSourceConfig {
	private final static Logger logger = LogManager.getLogger(DataSourceConfig.class.getName());

	@Autowired
	private Environment environment;

	@Bean(name = "dataSource")
	public DataSource dataSource() {
        logger.info("dataSource ****init**** environment:{}", environment);
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(environment.getProperty("jdbc.url"));
		dataSource.setUsername(environment.getProperty("jdbc.username"));
		dataSource.setPassword(environment.getProperty("jdbc.password"));
//		dataSource.setInitialSize(environment.getProperty("jdbc.initialSize",Integer.class));
//		dataSource.setMaxActive(environment.getProperty("jdbc.maxActive",Integer.class));

		dataSource.setMaxWait(60000);
		dataSource.setMinIdle(1);
		dataSource.setTimeBetweenEvictionRunsMillis(60000);
		dataSource.setMinEvictableIdleTimeMillis(300000);
		dataSource.setValidationQuery("SELECT 'x'");
		dataSource.setTestOnBorrow(false);
		dataSource.setTestOnReturn(false);
		dataSource.setTestWhileIdle(true);
		dataSource.setPoolPreparedStatements(false);
		dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
		try {
			dataSource.setFilters("mergeStat");
		} catch (SQLException e) {
			logger.error("config datasource error",e);
		}
		// 怀疑连接池泄露再打开 
		// removeAbandoned=true removeAbandonedTimeout=1800 logAbandoned=true
		return dataSource;
	}

    @Bean
	public DruidStatInterceptor druidStatInterceptor(){
		return new DruidStatInterceptor();
	}

	@Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory;
    }

	@Bean(name="defaultTransactionManager")
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

}
