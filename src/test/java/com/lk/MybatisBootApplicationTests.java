//package com.lk;
//
//import com.lk.boot.JackConfigurationProperties;
//import com.lk.boot.Simon;
//import com.lk.test.RedisProps;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Import;
//import org.springframework.context.annotation.ImportSelector;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootConfiguration
//@SpringBootTest(classes = Application.class)
//@Import(AutoConfigurationImportSelector.class)
//@EnableAutoConfiguration
//@EnableWebMvc
//@WebAppConfiguration
//public class MybatisBootApplicationTests extends AbstractJUnit4SpringContextTests {
//
//
//    @Autowired
////	@Qualifier(value = "lkentity")
//            LkEntity userEntity;
//
//    @Autowired
//    @Qualifier(value = "userEntity2")
//    UserEntity userEntity2;
//
//    @Autowired
//    @Qualifier("getRedisTemplate")
//    RedisTemplate getRedisTemplate;
//
//    @Autowired
//    RedisProps redisProps;
//
//    @Autowired
//    JackConfigurationProperties jackConfigurationProperties;
//
//    @Autowired
//    private Simon simon;
//
//
//    @Test
//    public void contextLoads() {
//        System.out.println("userEntity = " + userEntity);
//
//        System.out.println("userEntity2 = " + userEntity2);
//
//        System.out.println("getRedisTemplate = " + getRedisTemplate);
//
////        List clientList = getRedisTemplate.getClientList();
////        for (int i = 0; i < clientList.size(); i++) {
////            Object o =  clientList.get(i);
////            System.out.println("o = " + o);
////        }
//
//
//        System.out.println("redisProps = " + redisProps);
//        System.out.println("jackConfigurationProperties = " + jackConfigurationProperties);
//        System.out.println("simon = " + simon);
//
//    }
//
//
//}
