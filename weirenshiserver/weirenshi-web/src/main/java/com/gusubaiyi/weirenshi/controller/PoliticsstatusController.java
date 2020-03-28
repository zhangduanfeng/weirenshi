package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Politicsstatus;
import com.gusubaiyi.weirenshi.service.PoliticsstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Politicsstatus)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("politicsstatus")
public class PoliticsstatusController {
    /**
     * 服务对象
     */
    @Autowired
    private PoliticsstatusService politicsstatusService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Politicsstatus selectOne(Integer id) {
        return this.politicsstatusService.queryById(id);
    }

}