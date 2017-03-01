//package com.example;
//
//import org.apache.catalina.servlet4preview.http.HttpServletRequest;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// * Created by liguohua on 01/03/2017.
// */
//@ControllerAdvice
//class GlobalExceptionHandler {
//    //return模板文件的名称，对应src/main/resources/templates/error.html
//    public static final String DEFAULT_ERROR_VIEW = "error";
//
//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", "错误的url="+req.getRequestURL());
//        mav.setViewName(DEFAULT_ERROR_VIEW);
//        return mav;
//    }
//}