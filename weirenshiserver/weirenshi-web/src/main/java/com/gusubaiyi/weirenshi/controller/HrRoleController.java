package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.HrRole;
import com.gusubaiyi.weirenshi.service.HrRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (HrRole)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("hrRole")
public class HrRoleController {
    /**
     * 服务对象
     */
    @Autowired
    private HrRoleService hrRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public HrRole selectOne(Integer id) {
        return this.hrRoleService.queryById(id);
    }

}