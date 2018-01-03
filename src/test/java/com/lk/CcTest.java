package com.lk;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by root on 2017/11/9.
 */
public class CcTest {

    static {
        System.out.println("CcTest.static initializer");
    }

    @Test
    public void asd() {
        System.out.println("asd.");
//        Assert.fail("asf");
    }

    @Test(expected = RuntimeException.class)
    public void aaaa() {

        System.out.println("aaaa.");

        throw new RuntimeException("saf");
    }


}
