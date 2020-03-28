package com.gusubaiyi.weirenshi.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Joblevel)实体类
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
public class Joblevel implements Serializable {
    private static final long serialVersionUID = -81506054840404077L;
    
    private Integer id;
    /**
    * 职称名称
    */
    private String name;
    
    private Object titlelevel;
    
    private Date createdate;
    
    private Object enabled;


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

    public Object getTitlelevel() {
        return titlelevel;
    }

    public void setTitlelevel(Object titlelevel) {
        this.titlelevel = titlelevel;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Object getEnabled() {
        return enabled;
    }

    public void setEnabled(Object enabled) {
        this.enabled = enabled;
    }

}