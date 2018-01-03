package com.lk.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertyResolver;
import org.springframework.stereotype.Component;

/**
 * Created by luokai on 2017/11/14.
 */
@Component
//@PropertySource("classpath:application0.properties")
public class Simon {

    @Value("${mybatis.type-aliases-package}")
    private String str;

//    @Qualifier("propertyResolver")
//    @Autowired
//    private PropertyResolver propertyResolver;

    @Autowired
    private Environment environment;
    @Autowired
    private ConversionService conversionService;

    @Override
    public String toString() {
        return "Simon{" +
                "str='" + str + '\'' +
//                ", propertyResolver=" + propertyResolver +
                ", environment=" + environment +
                ", conversionService=" + conversionService +
                '}';
    }
}
