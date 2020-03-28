package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Menu;
import com.gusubaiyi.weirenshi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Menu)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("menu")
public class MenuController {
    /**
     * 服务对象
     */
    @Autowired
    private MenuService menuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Menu selectOne(Integer id) {
        return this.menuService.queryById(id);
    }

}