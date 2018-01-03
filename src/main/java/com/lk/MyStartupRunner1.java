package com.lk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 服务启动执行
 *
 * @author   单红宇(365384722)
 * @myblog  http://blog.csdn.net/catoop/
 * @create    2016年1月9日
 */
@Component
@Order(value=2)
public class MyStartupRunner1 implements CommandLineRunner {

    static Logger logger = LoggerFactory.getLogger(MyStartupRunner1.class);

    @Override
    public void run(String... args) throws Exception {
        logger.debug(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 11111111 <<<<<<<<<<<<<");
        logger.debug(">>>>>>>>>>>>>>> LK Debug  <<<<<<<<<<<<<");
        logger.info(">>>>>>>>>>>>>>> LK info  <<<<<<<<<<<<<");
        logger.warn(">>>>>>>>>>>>>>> LK warn  <<<<<<<<<<<<<");
        logger.error(">>>>>>>>>>>>>>> LK err  <<<<<<<<<<<<<");

    }

}