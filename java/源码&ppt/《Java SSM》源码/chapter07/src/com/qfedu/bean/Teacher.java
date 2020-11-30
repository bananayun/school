package com.qfedu.bean;

public class Teacher {
	private int tid;
	private String name;

	public void setTid(int tid) {
		this.tid = tid;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", name=" + name + "]";
	}
}
