package com.lk.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by luokai on 2017/11/21.
 */
@Configuration
@Controller
public class ErrContrller implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error123";
    }

    @RequestMapping("/error")
//    @ResponseBody
    public String  err(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("request = [" + request + "], response = [" + response + "]");
        return "someErr";
    }

    @RequestMapping("/eeeeeeeeee")
//    @ResponseBody
    public String  login(HttpServletRequest request, HttpServletResponse response) {
        return "login";
    }

    @RequestMapping("/error2/4xx")
//    @ResponseBody
    public String  eeeeee(HttpServletRequest request, HttpServletResponse response) {
        return "login";
    }

//    @RequestMapping("/500")
//    @ResponseBody
//    public String  err500(HttpServletRequest request, HttpServletResponse response) {
//        System.out.println("request = [" + request + "], response = [" + response + "]");
//        return "500";
//    }
//
//    @RequestMapping("/404")
//    @ResponseBody
//    public String  err404(HttpServletRequest request, HttpServletResponse response) {
//        System.out.println("request = [" + request + "], response = [" + response + "]");
//        return "404";
//    }
}
