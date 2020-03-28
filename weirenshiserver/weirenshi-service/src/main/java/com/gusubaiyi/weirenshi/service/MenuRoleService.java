package com.gusubaiyi.weirenshi.service;

import com.gusubaiyi.weirenshi.entity.MenuRole;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (MenuRole)表服务接口
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@Service
public interface MenuRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MenuRole queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MenuRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param menuRole 实例对象
     * @return 实例对象
     */
    MenuRole insert(MenuRole menuRole);

    /**
     * 修改数据
     *
     * @param menuRole 实例对象
     * @return 实例对象
     */
    MenuRole update(MenuRole menuRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}