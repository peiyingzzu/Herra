package com.peiying.herra.po;

import java.util.Date;

public class TicketStatus {
    private Long id;

    private Long ticketid;

    private Integer level;

    private Integer status;

    private String owneruserno;

    private String watcheduserlist;

    private Date responsetime;

    private Date solvedtime;

    private String createby;

    private Date createtime;

    private String updateby;

    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTicketid() {
        return ticketid;
    }

    public void setTicketid(Long ticketid) {
        this.ticketid = ticketid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOwneruserno() {
        return owneruserno;
    }

    public void setOwneruserno(String owneruserno) {
        this.owneruserno = owneruserno == null ? null : owneruserno.trim();
    }

    public String getWatcheduserlist() {
        return watcheduserlist;
    }

    public void setWatcheduserlist(String watcheduserlist) {
        this.watcheduserlist = watcheduserlist == null ? null : watcheduserlist.trim();
    }

    public Date getResponsetime() {
        return responsetime;
    }

    public void setResponsetime(Date responsetime) {
        this.responsetime = responsetime;
    }

    public Date getSolvedtime() {
        return solvedtime;
    }

    public void setSolvedtime(Date solvedtime) {
        this.solvedtime = solvedtime;
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