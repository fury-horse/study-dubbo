package com.liangjun.study.dubbo.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.liangjun.study.dubbo.service.DemoService;

/**
* @desc    示范服务实现类
* @version 1.0
* @author  Liang Jun
* @date    2020年04月03日 13:54:12
**/
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String hello(String name) {
        String ret = "hello:" + name;
        System.out.println(ret);

        return ret;
    }
}