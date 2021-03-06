package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Joblevel;
import com.gusubaiyi.weirenshi.service.JoblevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Joblevel)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("joblevel")
public class JoblevelController {
    /**
     * 服务对象
     */
    @Autowired
    private JoblevelService joblevelService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Joblevel selectOne(Integer id) {
        return this.joblevelService.queryById(id);
    }

}