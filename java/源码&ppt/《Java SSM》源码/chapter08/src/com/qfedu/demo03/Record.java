package com.qfedu.demo03;

import java.util.Date;

public class Record {
	private String className; // 类名称
	private String methodName; // 方法名称
	private Date recordTime; // 记录时间
	private Long expendTime; // 程序执行耗费的时间

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Date getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	public Long getExpendTime() {
		return expendTime;
	}

	public void setExpendTime(Long expendTime) {
		this.expendTime = expendTime;
	}

	@Override
	public String toString() {
		return "Record [className=" + className + ", methodName=" + methodName + ", recordTime=" + recordTime
				+ ", expendTime=" + expendTime + "]";
	}
}
