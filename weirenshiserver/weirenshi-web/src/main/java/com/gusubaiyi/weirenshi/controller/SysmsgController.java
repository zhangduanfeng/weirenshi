package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Sysmsg;
import com.gusubaiyi.weirenshi.service.SysmsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Sysmsg)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("sysmsg")
public class SysmsgController {
    /**
     * 服务对象
     */
    @Autowired
    private SysmsgService sysmsgService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Sysmsg selectOne(Integer id) {
        return this.sysmsgService.queryById(id);
    }

}