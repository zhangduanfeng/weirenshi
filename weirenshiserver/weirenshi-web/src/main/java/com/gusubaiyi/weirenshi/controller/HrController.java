package com.gusubaiyi.weirenshi.controller;

import com.gusubaiyi.weirenshi.entity.Hr;
import com.gusubaiyi.weirenshi.service.impl.HrServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Hr)表控制层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@RestController
@RequestMapping("hr")
public class HrController {
    /**
     * 服务对象
     */
    @Autowired
    private HrServiceImpl hrServiceImpl;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Hr selectOne(Integer id) {
        return this.hrServiceImpl.queryById(id);
    }

}