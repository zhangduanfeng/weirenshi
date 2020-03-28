package com.gusubaiyi.weirenshi.entity;

import java.io.Serializable;

/**
 * (Sysmsg)实体类
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
public class Sysmsg implements Serializable {
    private static final long serialVersionUID = -85560262761014010L;
    
    private Integer id;
    /**
    * 消息id
    */
    private Integer mid;
    /**
    * 0表示群发消息
    */
    private Integer type;
    /**
    * 这条消息是给谁的
    */
    private Integer hrid;
    /**
    * 0 未读 1 已读
    */
    private Integer state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getHrid() {
        return hrid;
    }

    public void setHrid(Integer hrid) {
        this.hrid = hrid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}