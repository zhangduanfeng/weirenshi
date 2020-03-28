package com.gusubaiyi.weirenshi.entity;

import java.io.Serializable;

/**
 * (Politicsstatus)实体类
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
public class Politicsstatus implements Serializable {
    private static final long serialVersionUID = -54239978000719496L;
    
    private Integer id;
    
    private String name;


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

}