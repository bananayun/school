package com.qfedu.demo03;

public class Service02 {
	public void service() throws Exception {
		System.out.println("执行service()方法");
		int num = 105;
		if (num > 100 || num < 0) {
			throw new MyException("您输入的不正确，请输入0--100之间的数字");
		} else {
			System.out.println("您输入的数字是" + num);
		}
	}
}
