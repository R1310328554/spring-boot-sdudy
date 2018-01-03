package com.lk.test;

import com.lk.UserEntity;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

/**
 * Created by luokai on 2017/11/14.
 */
//@Configuration
@Component      // @Bean 至少需要 @Component来注解 类
//@ComponentScan
//@Conditional(LkCondition.class)// 这里应该慎重。 此时 还没有解析完 Component，condition的conditionContext 对应的 beanfactory 几乎没有内容，不能或取component配置的bean。
public class LkConditionConfig {

    private String str;

    @Bean
    @Conditional(LkCondition.class)
    public UserEntity userEntity2() {

        UserEntity userEntity = new UserEntity();
        userEntity.setNickName("nick ");
        System.out.println("user.");

        return userEntity;
    }

}