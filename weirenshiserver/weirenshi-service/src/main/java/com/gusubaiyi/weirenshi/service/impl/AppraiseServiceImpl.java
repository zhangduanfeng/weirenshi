package com.gusubaiyi.weirenshi.service.impl;

import com.gusubaiyi.weirenshi.entity.Appraise;
import com.gusubaiyi.weirenshi.dao.AppraiseDao;
import com.gusubaiyi.weirenshi.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Appraise)表服务实现类
 *
 * @author makejava
 * @since 2020-02-19 11:51:45
 */
@Service("appraiseService")
public class AppraiseServiceImpl implements AppraiseService {
    @Autowired
    private AppraiseDao appraiseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Appraise queryById(Integer id) {
        return this.appraiseDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Appraise> queryAllByLimit(int offset, int limit) {
        return this.appraiseDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param appraise 实例对象
     * @return 实例对象
     */
    @Override
    public Appraise insert(Appraise appraise) {
        this.appraiseDao.insert(appraise);
        return appraise;
    }

    /**
     * 修改数据
     *
     * @param appraise 实例对象
     * @return 实例对象
     */
    @Override
    public Appraise update(Appraise appraise) {
        this.appraiseDao.update(appraise);
        return this.queryById(appraise.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.appraiseDao.deleteById(id) > 0;
    }
}