package com.gusubaiyi.weirenshi.service;

import com.gusubaiyi.weirenshi.entity.Empsalary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Empsalary)表服务接口
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@Service
public interface EmpsalaryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Empsalary queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Empsalary> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param empsalary 实例对象
     * @return 实例对象
     */
    Empsalary insert(Empsalary empsalary);

    /**
     * 修改数据
     *
     * @param empsalary 实例对象
     * @return 实例对象
     */
    Empsalary update(Empsalary empsalary);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}