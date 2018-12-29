package com.weixin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class WeixinDevelopApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeixinDevelopApplication.class, args);
        log.info("微信开发启动成功。。。。");
    }

}

