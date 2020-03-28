package com.gusubaiyi.weirenshi.entity;

import java.io.Serializable;

/**
 * (Adjustsalary)实体类
 *
 * @author makejava
 * @since 2020-02-18 23:34:51
 */
public class Adjustsalary implements Serializable {
    private static final long serialVersionUID = 918067147899950936L;
    
    private Integer id;
    
    private Integer eid;
    /**
    * 调薪日期
    */
    private Object asdate;
    /**
    * 调前薪资
    */
    private Integer beforesalary;
    /**
    * 调后薪资
    */
    private Integer aftersalary;
    /**
    * 调薪原因
    */
    private String reason;
    /**
    * 备注
    */
    private String remark;


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

    public Object getAsdate() {
        return asdate;
    }

    public void setAsdate(Object asdate) {
        this.asdate = asdate;
    }

    public Integer getBeforesalary() {
        return beforesalary;
    }

    public void setBeforesalary(Integer beforesalary) {
        this.beforesalary = beforesalary;
    }

    public Integer getAftersalary() {
        return aftersalary;
    }

    public void setAftersalary(Integer aftersalary) {
        this.aftersalary = aftersalary;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}