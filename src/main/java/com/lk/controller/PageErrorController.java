//package com.lk.controller;
//
//import java.util.Map;
//
//
//import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.context.request.RequestAttributes;
//import org.springframework.web.context.request.RequestContextHolder;
//
///**
// *
// * <p>Title: PageErrorController</p>
// * <p>Description: 页面异常进行处理</p>
// * @date 2016年1月21日
// */
//@Controller
//public class PageErrorController extends DefaultErrorAttributes   {
//
//
//    @RequestMapping("/404")
//    public String aaa404() {
//        RequestAttributes requestAttr = RequestContextHolder.currentRequestAttributes();
//        Map<String, Object> body = this.getErrorAttributes(requestAttr, false);
//
//        System.out.println(body);
//        return "404.jsp";
//    }
//
//    @RequestMapping("/500")
//    public String assaa404() {
//        RequestAttributes requestAttr = RequestContextHolder.currentRequestAttributes();
//        Map<String, Object> body = this.getErrorAttributes(requestAttr, false);
//
//        System.out.println(body);
//        return "500.jsp";
//    }
//
//
//
//
//}
