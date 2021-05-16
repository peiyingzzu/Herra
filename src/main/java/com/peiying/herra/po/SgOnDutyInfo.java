package com.peiying.herra.po;

import java.util.Date;

public class SgOnDutyInfo {
    private Integer id;

    private Integer sgid;

    private String userno;

    private Integer dutystatus;

    private Date currentdutystarttime;

    private Date currentdutyendtime;

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

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public Integer getDutystatus() {
        return dutystatus;
    }

    public void setDutystatus(Integer dutystatus) {
        this.dutystatus = dutystatus;
    }

    public Date getCurrentdutystarttime() {
        return currentdutystarttime;
    }

    public void setCurrentdutystarttime(Date currentdutystarttime) {
        this.currentdutystarttime = currentdutystarttime;
    }

    public Date getCurrentdutyendtime() {
        return currentdutyendtime;
    }

    public void setCurrentdutyendtime(Date currentdutyendtime) {
        this.currentdutyendtime = currentdutyendtime;
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