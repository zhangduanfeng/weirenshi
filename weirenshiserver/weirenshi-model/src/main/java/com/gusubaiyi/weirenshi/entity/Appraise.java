package com.gusubaiyi.weirenshi.entity;

import java.io.Serializable;

/**
 * (Appraise)实体类
 *
 * @author makejava
 * @since 2020-02-18 23:34:56
 */
public class Appraise implements Serializable {
    private static final long serialVersionUID = 269117589359470829L;
    
    private Integer id;
    
    private Integer eid;
    /**
    * 考评日期
    */
    private Object appdate;
    /**
    * 考评结果
    */
    private String appresult;
    /**
    * 考评内容
    */
    private String appcontent;
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

    public Object getAppdate() {
        return appdate;
    }

    public void setAppdate(Object appdate) {
        this.appdate = appdate;
    }

    public String getAppresult() {
        return appresult;
    }

    public void setAppresult(String appresult) {
        this.appresult = appresult;
    }

    public String getAppcontent() {
        return appcontent;
    }

    public void setAppcontent(String appcontent) {
        this.appcontent = appcontent;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}