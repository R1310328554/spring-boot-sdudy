package com.lk.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kevin
 * @description
 * @date 2016/7/1
 */
@Configuration
@ComponentScan("com.lk.condition")
public class ConditionConfig {
    @Bean
// 通过该注解，符合WindowsCondition条件则实例化
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }
}