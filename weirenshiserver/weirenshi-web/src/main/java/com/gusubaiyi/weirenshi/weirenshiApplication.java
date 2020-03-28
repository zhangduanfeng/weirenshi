package com.gusubaiyi.weirenshi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @作者:姑苏白衣
 * @微信号:zdf824780260
 * @个人博客:www.gusubaiyi.com
 * @时间:2020-02-19 00:06
 **/

@SpringBootApplication
@MapperScan(basePackages = "com.gusubaiyi.weirenshi.dao")
@EnableCaching
public class weirenshiApplication {
    public static void main(String[] args) {
        SpringApplication.run(weirenshiApplication.class,args);
    }
}
