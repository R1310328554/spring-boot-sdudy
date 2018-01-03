package com.lk;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:config/spring/spring-*.xml",
        "classpath:config/spring/service-mybatis.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseControllerTest extends AbstractTransactionalJUnit4SpringContextTests {

}