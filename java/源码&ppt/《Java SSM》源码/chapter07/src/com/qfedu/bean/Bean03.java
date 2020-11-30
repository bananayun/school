package com.qfedu.bean;

public class Bean03 {
	private String bid;
	private String name;

	public Bean03() {
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bean03 [bid=" + bid + ", name=" + name + "]";
	}

	public void close() {
		System.out.println("Bean实例即将销毁，调用close()方法");
		System.out.println(this.toString());
	}
}
