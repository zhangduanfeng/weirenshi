package com.gusubaiyi.weirenshi.config;

import com.gusubaiyi.weirenshi.entity.Menu;
import com.gusubaiyi.weirenshi.entity.Role;
import com.gusubaiyi.weirenshi.service.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.lang.model.element.VariableElement;
import java.util.Collection;
import java.util.List;

/**
 * @作者:姑苏白衣
 * @微信号:zdf824780260
 * @个人博客:www.gusubaiyi.com
 * @时间:2020-02-22 06:44
 *
 *
 * 这个类的作用：根据用户传来的请求地址，分析出请求需要的角色
 **/
@Component
public class MyFilter implements FilterInvocationSecurityMetadataSource {
    @Autowired
    private MenuServiceImpl menuService;
    //比对url的工具
    AntPathMatcher antPathMatcher = new AntPathMatcher();
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        //获取当前请求的url
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        //获取当前角色所能看到的菜单
        List<Menu> menus = menuService.getAllMenusWithRole();
        for (Menu menu : menus) {
            //与之前获取的url匹配是否一样
            if (antPathMatcher.match(menu.getUrl(),requestUrl)){
                //当前请求需要的角色
                List<Role> roles = menu.getRoles();
                String[] str = new String[roles.size()];
                for (int i = 0; i < str.length; i++) {
                    str[i]= roles.get(i).getName();
                }
                //需要返回角色数组
                return SecurityConfig.createList(str);
            }
        }
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
