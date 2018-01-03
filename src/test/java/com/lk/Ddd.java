package com.lk;

import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.Enumeration;

/**
 * Created by root on 2017/11/9.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AATest.class,
        BbTest.class,
        CcTest.class,
        TestSuite2.class
})
public class Ddd {
    @Test
    public void testAll() {

        System.out.println("testAll.");

        TestSuite suite = new TestSuite();
        suite.addTest(new TestSuite("aa"));
        suite.addTest(new TestSuite(BbTest.class));

        Enumeration<junit.framework.Test> tests = suite.tests();
        TestResult re = new TestResult();

        suite.run(re);

        while (tests.hasMoreElements()) {
            junit.framework.Test test = tests.nextElement();

            System.out.println("test = " + test);
        }
    }

    public void asd() {

        System.out.println("asd.");

    }

}
