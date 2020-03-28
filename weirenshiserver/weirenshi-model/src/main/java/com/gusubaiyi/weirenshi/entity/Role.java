package com.gusubaiyi.weirenshi.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
public class Role implements Serializable {
    
    private Integer id;
    
    private String name;

    private String nameZh;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamezh() {
        return nameZh;
    }

    public void setNamezh(String namezh) {
        this.nameZh = namezh;
    }

}