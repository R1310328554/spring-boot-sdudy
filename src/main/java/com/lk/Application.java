package com.lk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
//@MapperScan("com.lk.mapper")
//@Configuration
@ComponentScan
@EnableAutoConfiguration
@ServletComponentScan
//@EnableWebMvc
public class Application {

//    @InitBinder
//    public String aaa(WebDataBinder webDataBinder) {
////        webDataBinder.
//        System.out.println("InitBinderInitBinderInitBinder.");
//        return "hello";
//    }

//    @Bean
//    public InternalResourceViewResolver internalResourceViewResolver() {
//        System.out.println("internelView.");
//        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
//        internalResourceViewResolver.setPrefix("/jsps/");
//        internalResourceViewResolver.setSuffix(".jsp");
//
////        internalResourceViewResolver.setContentType();
////        internalResourceViewResolver.setViewClass(JstlView.class);
//        return internalResourceViewResolver;
//    }


    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        System.out.println("aa.");
        return new ServletRegistrationBean(new Lk2Servlet(), "/zxc/*");
    }

    @Bean
    public Object testBean(PlatformTransactionManager platformTransactionManager){
        System.out.println(">>>>>>>>>>" + platformTransactionManager.getClass().getName());
        return new Object();
    }

//    @Bean
//    public ServletRegistrationBean servletRegistrationBean() {
//        return new ServletRegistrationBean(new MyServlet(), "/xs/*");// ServletName默认值为首字母小写，即myServlet
//    }


    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        System.out.println("run = " + run);
    }

}
