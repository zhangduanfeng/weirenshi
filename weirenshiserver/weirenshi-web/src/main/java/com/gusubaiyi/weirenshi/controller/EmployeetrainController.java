package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Employeetrain;
import com.gusubaiyi.weirenshi.service.EmployeetrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Employeetrain)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("employeetrain")
public class EmployeetrainController {
    /**
     * 服务对象
     */
    @Autowired
    private EmployeetrainService employeetrainService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Employeetrain selectOne(Integer id) {
        return this.employeetrainService.queryById(id);
    }

}