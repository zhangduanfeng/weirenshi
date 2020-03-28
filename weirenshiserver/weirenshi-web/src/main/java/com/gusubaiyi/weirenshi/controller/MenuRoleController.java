package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.MenuRole;
import com.gusubaiyi.weirenshi.service.MenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MenuRole)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("menuRole")
public class MenuRoleController {
    /**
     * 服务对象
     */
    @Autowired
    private MenuRoleService menuRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MenuRole selectOne(Integer id) {
        return this.menuRoleService.queryById(id);
    }

}