package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/")
    public String hello(){
        logger.error("error logback for project");
        logger.info("info logback for project");
        return "hello springboot!";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        System.out.println( "这是控制台日志！" );
        return "hello bug !!!";
    }

    @RequestMapping(value = "/conn", method = RequestMethod.GET)
    public String testConnection(){
        System.out.println( "idea自动化部署Docker镜像测试" );
        return "hello docker" ;
    }

}
