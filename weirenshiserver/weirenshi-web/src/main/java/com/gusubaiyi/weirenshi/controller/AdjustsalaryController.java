package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Adjustsalary;
import com.gusubaiyi.weirenshi.service.AdjustsalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Adjustsalary)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:54
 */
@RestController
@RequestMapping("adjustsalary")
public class AdjustsalaryController {
    /**
     * 服务对象
     */
    @Autowired
    private AdjustsalaryService adjustsalaryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Adjustsalary selectOne(Integer id) {
        return this.adjustsalaryService.queryById(id);
    }

}