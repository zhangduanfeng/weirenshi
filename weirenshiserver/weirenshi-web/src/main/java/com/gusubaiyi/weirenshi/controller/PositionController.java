package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Position;
import com.gusubaiyi.weirenshi.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Position)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("position")
public class PositionController {
    /**
     * 服务对象
     */
    @Autowired
    private PositionService positionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Position selectOne(Integer id) {
        return this.positionService.queryById(id);
    }

}