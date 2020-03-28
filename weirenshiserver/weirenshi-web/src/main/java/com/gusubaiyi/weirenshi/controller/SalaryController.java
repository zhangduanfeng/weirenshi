package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Salary;
import com.gusubaiyi.weirenshi.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Salary)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("salary")
public class SalaryController {
    /**
     * 服务对象
     */
    @Autowired
    private SalaryService salaryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Salary selectOne(Integer id) {
        return this.salaryService.queryById(id);
    }

}