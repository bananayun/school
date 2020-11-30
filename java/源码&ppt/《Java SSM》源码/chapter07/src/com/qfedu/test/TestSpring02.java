package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.qfedu.bean.Teacher;

public class TestSpring02 {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
		// 输出Teacher类对象信息
		System.out.println(teacher);
	}
}
