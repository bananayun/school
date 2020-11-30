package com.qfedu.pojo;

import java.util.List;

public class TeachInfo {
	private Integer tid;
	private String tname;
	private String age;
	private String course;
	private List<ClassInfo> classInfoList;

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<ClassInfo> getClassInfoList() {
		return classInfoList;
	}

	public void setClassInfoList(List<ClassInfo> classInfoList) {
		this.classInfoList = classInfoList;
	}

	@Override
	public String toString() {
		return "TeachInfo [tid=" + tid + ", tname=" + tname + ", age=" + age + ", course=" + course + ", classInfoList="
				+ classInfoList + "]";
	}
}
