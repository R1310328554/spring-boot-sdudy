package com.example.demo;

import org.springframework.util.MultiValueMap;

/**
 * Created by luokai on 2017/10/22.
 */
public class CustomError extends Exception {
    public CustomError(String s, String s1) {
        System.out.println("s = [" + s + "], s1 = [" + s1 + "]");
    }
}
