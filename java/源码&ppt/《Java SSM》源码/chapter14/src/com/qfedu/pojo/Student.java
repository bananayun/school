package com.qfedu.pojo;

public class Student {
	private String no;
	private String classNo;
	private String name;

	public Student(String no, String classNo, String name) {
		super();
		this.no = no;
		this.classNo = classNo;
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", classNo=" + classNo + ", name=" + name + "]";
	}

}
