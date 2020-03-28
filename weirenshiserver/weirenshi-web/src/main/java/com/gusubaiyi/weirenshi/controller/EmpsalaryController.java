package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Empsalary;
import com.gusubaiyi.weirenshi.service.EmpsalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Empsalary)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("empsalary")
public class EmpsalaryController {
    /**
     * 服务对象
     */
    @Autowired
    private EmpsalaryService empsalaryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Empsalary selectOne(Integer id) {
        return this.empsalaryService.queryById(id);
    }

}