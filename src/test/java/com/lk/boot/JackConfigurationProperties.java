package com.lk.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by luokai on 2017/11/14.
 */
@Configuration
@ConfigurationProperties(prefix = "spring")
@PropertySource("classpath:application0.properties")
public class JackConfigurationProperties {

//    @Value("${mybatis.type-aliases-package}")
    public String str;

//    public String getStr() {
//        return str;
//    }
//
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "JackConfigurationProperties{" +
                "str='" + str + '\'' +
                '}';
    }
}
