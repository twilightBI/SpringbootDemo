package com.example.demo.test;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义starter，根据具体业务场景和需求进行扩展
 * 一般不需要自定义，springboot已经封装好了常用的starter
 * */

@Configuration
@ConditionalOnProperty(name = "enabled.autoConfiguration",matchIfMissing = true)
public class MyStarter {
    static {
        System.out.println( "mystarter init ......" );
    }
}
