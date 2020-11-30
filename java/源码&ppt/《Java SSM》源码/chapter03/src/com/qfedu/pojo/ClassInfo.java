package com.qfedu.pojo;

import java.util.List;

public class ClassInfo {
	private Integer cid;
	private String cname;
	private Integer sum;
	private List<TeachInfo> teachInfoList;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public List<TeachInfo> getTeachInfoList() {
		return teachInfoList;
	}

	public void setTeachInfoList(List<TeachInfo> teachInfoList) {
		this.teachInfoList = teachInfoList;
	}

	@Override
	public String toString() {
		return "ClassInfo [cid=" + cid + ", cname=" + cname + ", sum=" + sum + ", teachInfoList=" + teachInfoList + "]";
	}
}
