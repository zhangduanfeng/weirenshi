package com.gusubaiyi.weirenshi.service;

import com.gusubaiyi.weirenshi.entity.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Menu)表服务接口
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
@Service
public interface MenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Menu queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Menu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    Menu insert(Menu menu);

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    Menu update(Menu menu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /*
     * @作者:姑苏白衣
     * @描述:根据用户登录id查询所能访问的菜单
     * @参数:
     * @返回值:
     * @时间:2020-02-22 06:58
     **/
    List<Menu> getMenusByHrId();

    /*
     * @作者:姑苏白衣
     * @描述:根据用户角色查询所能访问的菜单
     * @参数:
     * @返回值:
     * @时间:2020-02-22 06:58
     **/
    List<Menu> getAllMenusWithRole();
}