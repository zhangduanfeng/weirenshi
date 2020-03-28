package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Employeeremove;
import com.gusubaiyi.weirenshi.service.EmployeeremoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Employeeremove)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("employeeremove")
public class EmployeeremoveController {
    /**
     * 服务对象
     */
    @Autowired
    private EmployeeremoveService employeeremoveService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Employeeremove selectOne(Integer id) {
        return this.employeeremoveService.queryById(id);
    }

}