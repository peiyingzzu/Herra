package com.peiying.herra.bo;

import java.util.Date;

public class TicketRecordBO {
    private Long id;

    private Long ticketid;

    private Long responseduration;

    private Long solvedduration;

    private Integer citicketclassid;

    private String createby;

    private Date createtime;

    private String updateby;

    private Date updatetime;

    private String solution;

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

    public Long getResponseduration() {
        return responseduration;
    }

    public void setResponseduration(Long responseduration) {
        this.responseduration = responseduration;
    }

    public Long getSolvedduration() {
        return solvedduration;
    }

    public void setSolvedduration(Long solvedduration) {
        this.solvedduration = solvedduration;
    }

    public Integer getCiticketclassid() {
        return citicketclassid;
    }

    public void setCiticketclassid(Integer citicketclassid) {
        this.citicketclassid = citicketclassid;
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

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution == null ? null : solution.trim();
    }
}