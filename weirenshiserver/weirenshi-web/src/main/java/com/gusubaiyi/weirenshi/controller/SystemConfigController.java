package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Menu;
import com.gusubaiyi.weirenshi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @作者:姑苏白衣
 * @微信号:zdf824780260
 * @个人博客:www.gusubaiyi.com
 * @时间:2020-02-20 15:51
 **/
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    @Autowired
    private MenuService menuService;

    @GetMapping("menu")
    public List<Menu> getMenusByHrId(){
        return menuService.getMenusByHrId();
    }
}
