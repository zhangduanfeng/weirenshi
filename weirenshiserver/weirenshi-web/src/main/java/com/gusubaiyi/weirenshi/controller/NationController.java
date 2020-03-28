package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Nation;
import com.gusubaiyi.weirenshi.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Nation)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("nation")
public class NationController {
    /**
     * 服务对象
     */
    @Autowired
    private NationService nationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Nation selectOne(Integer id) {
        return this.nationService.queryById(id);
    }

}