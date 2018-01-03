package com.lk.test;

import com.lk.LkEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by luokai on 2017/11/14.
 */
@Configuration
@Component
//@ConditionalOnClass(SomeConditionBean.class)
@ConditionalOnClass(SomeConditionBean.class)
//@ConditionalOnMissingBean
//@ConditionalOnBean
public class LkOnClassCondition  {

    @Bean
    public LkEntity lkentity() {
        System.out.println(".");

        LkEntity asdf = new LkEntity();
        asdf.setBank_reservemobile("1234   *********");

        return asdf;
    }

}
