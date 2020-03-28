package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Appraise;
import com.gusubaiyi.weirenshi.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Appraise)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("appraise")
public class AppraiseController {
    /**
     * 服务对象
     */
    @Autowired
    private AppraiseService appraiseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Appraise selectOne(Integer id) {
        return this.appraiseService.queryById(id);
    }

}