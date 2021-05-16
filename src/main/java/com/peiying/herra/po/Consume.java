package com.peiying.herra.po;

public class Consume {
	private Integer coid;
	private Integer pid;
	private Integer cid;
	private Integer consnum;
	public Integer getCoid() {
		return coid;
	}
	public void setCoid(Integer coid) {
		this.coid = coid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getConsnum() {
		return consnum;
	}
	public void setConsnum(Integer consnum) {
		this.consnum = consnum;
	}
	@Override
	public String toString() {
		return "Consume [coid=" + coid + ", pid=" + pid + ", cid=" + cid + ", consnum=" + consnum + "]";
	}
	
}
