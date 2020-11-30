package com.qfedu.pojo;

import java.util.List;

public class StuClass {
	private Integer cid;
	private String cname;
	private Integer sum;
	private List<StuInfo> stuInfoList;

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

	public List<StuInfo> getStuInfoList() {
		return stuInfoList;
	}

	public void setStuInfoList(List<StuInfo> stuInfoList) {
		this.stuInfoList = stuInfoList;
	}
}
