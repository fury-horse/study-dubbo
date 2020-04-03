package com.liangjun.study.dubbo.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.liangjun.study.dubbo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @desc    示范接口
* @version 1.0
* @author  Liang Jun
* @date    2020年04月03日 14:59:05
**/
@RestController
public class DemoController {
    @Reference
    private DemoService demoService;

    @GetMapping("hello")
    public String hello(String name) {
        String ret = demoService.hello(name);
        System.out.println(ret);
        return ret;
    }
}