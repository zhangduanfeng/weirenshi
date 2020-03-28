package com.gusubaiyi.weirenshi.service.impl;

import com.gusubaiyi.weirenshi.entity.Hr;
import com.gusubaiyi.weirenshi.entity.Menu;
import com.gusubaiyi.weirenshi.dao.MenuDao;
import com.gusubaiyi.weirenshi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import sun.plugin.liveconnect.SecurityContextHelper;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Menu)表服务实现类
 *
 * @author makejava
 * @since 2020-02-19 11:53:44
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDao menuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Menu queryById(Integer id) {
        return this.menuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Menu> queryAllByLimit(int offset, int limit) {
        return this.menuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    @Override
    public Menu insert(Menu menu) {
        this.menuDao.insert(menu);
        return menu;
    }

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    @Override
    public Menu update(Menu menu) {
        this.menuDao.update(menu);
        return this.queryById(menu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.menuDao.deleteById(id) > 0;
    }

    /*
     * @作者:姑苏白衣
     * @描述:根据用户登录id查询所能访问的菜单
     * @参数:
     * @返回值:
     * @时间:2020-02-22 06:58
     **/
    @Override
    public List<Menu> getMenusByHrId() {
        Hr principal = (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return menuDao.getMenusByHrId(principal.getId());
    }

    /*
     * @作者:姑苏白衣
     * @描述:根据用户角色查询所能访问的菜单
     * @参数:
     * @返回值:
     * @时间:2020-02-22 06:58
     **/
    @Override
    //@Cacheable
    public List<Menu> getAllMenusWithRole() {
        return menuDao.getAllMenusWithRole();
    }
}