package com.lk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e){
        System.out.println("req = [" + req + "], e = [" + e + "]");
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("exception",e);
        modelAndView.addObject("url",req.getRequestURI());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}