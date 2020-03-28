package com.gusubaiyi.weirenshi.dao;

import com.gusubaiyi.weirenshi.entity.Oplog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Oplog)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@Mapper
public interface OplogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Oplog queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Oplog> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param oplog 实例对象
     * @return 对象列表
     */
    List<Oplog> queryAll(Oplog oplog);

    /**
     * 新增数据
     *
     * @param oplog 实例对象
     * @return 影响行数
     */
    int insert(Oplog oplog);

    /**
     * 修改数据
     *
     * @param oplog 实例对象
     * @return 影响行数
     */
    int update(Oplog oplog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}