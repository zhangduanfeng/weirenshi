package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者:姑苏白衣
 * @微信号:zdf824780260
 * @个人博客:www.gusubaiyi.com
 * @时间:2020-02-20 13:19
 **/
@RestController
public class LoginController {
    @GetMapping
    public RespBean login(){
        return RespBean.error("尚未登录，请先登录!");
    }
}
