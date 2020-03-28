package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Oplog;
import com.gusubaiyi.weirenshi.service.OplogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Oplog)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("oplog")
public class OplogController {
    /**
     * 服务对象
     */
    @Autowired
    private OplogService oplogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Oplog selectOne(Integer id) {
        return this.oplogService.queryById(id);
    }

}