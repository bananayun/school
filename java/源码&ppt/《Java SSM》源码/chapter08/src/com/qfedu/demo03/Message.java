package com.qfedu.demo03;

import java.util.Date;

public class Message {
	private String className;
	private String methodName;
	private Date recordTime; // 异常记录时间
	private String exceptionMsg; // 异常信息

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

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	@Override
	public String toString() {
		return "Message [className=" + className + ", " + "methodName=" + methodName + ", recordTime=" + recordTime
				+ ", exceptionMsg=" + exceptionMsg + "]";
	}
}
