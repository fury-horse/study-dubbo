package com.liangjun.study.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @desc    启动程序
* @version 1.0
* @author  Liang Jun
* @date    2020年04月03日 13:32:14
**/
@Slf4j
@EnableDubbo
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        new SpringApplication(ConsumerApplication.class).run(args);
        log.info("service started successfully");
    }

}