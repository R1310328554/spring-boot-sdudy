package com.lk.test;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by luokai on 2017/11/14.
 */
public class LkValue {

    @Value("${spring.str}")
    private String str;


}
