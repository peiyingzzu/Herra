package com.peiying.herra.vo;

import java.util.Date;

public class SgOnDutyConfigVO {
    private Integer id;

    private Integer sgid;

    private Integer dutytype;

    private String dutysequence;

    private Integer dutyswitchtype;

    private String createby;

    private Date createtime;

    private String updateby;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSgid() {
        return sgid;
    }

    public void setSgid(Integer sgid) {
        this.sgid = sgid;
    }

    public Integer getDutytype() {
        return dutytype;
    }

    public void setDutytype(Integer dutytype) {
        this.dutytype = dutytype;
    }

    public String getDutysequence() {
        return dutysequence;
    }

    public void setDutysequence(String dutysequence) {
        this.dutysequence = dutysequence == null ? null : dutysequence.trim();
    }

    public Integer getDutyswitchtype() {
        return dutyswitchtype;
    }

    public void setDutyswitchtype(Integer dutyswitchtype) {
        this.dutyswitchtype = dutyswitchtype;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}