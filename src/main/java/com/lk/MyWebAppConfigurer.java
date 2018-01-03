package com.lk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class MyWebAppConfigurer implements EnvironmentAware
        {
    private static final Logger logger = LoggerFactory.getLogger(MyWebAppConfigurer.class);

    private RelaxedPropertyResolver propertyResolver;

//    @Value("${spring.datasource.test1.driverClassName}")
    private String myUrl;

    @Value("${spring.jpa.show-sql}")
    private String myUrl2;

    /**
     * 这个方法只是测试实现EnvironmentAware接口，读取环境变量的方法。
     */
    @Override
    public void setEnvironment(Environment env) {
        logger.info(env.getProperty("JAVA_HOME"));
        logger.info("setEnvironment ++ " + myUrl2);
        logger.info("setEnvironment ++ " + myUrl);
        String str = env.getProperty("mybatis.mapper-locations");
        logger.info(str);
        propertyResolver = new RelaxedPropertyResolver(env, "log4j.logger.java.sql.");
        String url = propertyResolver.getProperty("Statement");
        logger.info(url);
    }
}