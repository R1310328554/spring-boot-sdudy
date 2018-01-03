package com.lk.test;

import org.springframework.stereotype.Component;

/**
 * Created by luokai on 2017/11/14.
 */
@Component(value = "conditionBean")
public class SomeConditionBean {

    private String str = "aabbbcc";

    @Override
    public String toString() {
        return "SomeConditionBean{" +
                "str='" + str + '\'' +
                '}';
    }
}
