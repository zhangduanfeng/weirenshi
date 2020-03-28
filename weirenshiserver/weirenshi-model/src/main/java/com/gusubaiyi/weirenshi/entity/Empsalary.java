package com.gusubaiyi.weirenshi.entity;

import java.io.Serializable;

/**
 * (Empsalary)实体类
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
public class Empsalary implements Serializable {
    private static final long serialVersionUID = 288368014245757146L;
    
    private Integer id;
    
    private Integer eid;
    
    private Integer sid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

}