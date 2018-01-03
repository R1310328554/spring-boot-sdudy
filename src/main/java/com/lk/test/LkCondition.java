package com.lk.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

public class LkCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        System.out.println("conditionContext = [" + conditionContext + "], annotatedTypeMetadata = [" + annotatedTypeMetadata + "]");


        boolean annotated = annotatedTypeMetadata.isAnnotated(Component.class.getName());
        System.out.println("annotated = " + annotated);

        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();

        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        System.out.println("beanDefinitionNames = " + beanDefinitionNames);
//        Object bean = beanFactory.getBean("conditionBean");
        Object bean = null;
        try {
            bean = beanFactory.getBean("conditionBean");
//            bean = beanFactory.getBean("bean");

        } catch (BeansException e) {
            e.printStackTrace();
//            return true;
        }

        System.out.println("bean = " + bean);

        if (bean == null) {
            return false;
        }
        return true;
    }
}