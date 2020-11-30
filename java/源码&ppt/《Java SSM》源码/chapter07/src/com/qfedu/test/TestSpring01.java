package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.qfedu.bean.Student;

public class TestSpring01 {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = applicationContext.getBean("student", Student.class);
		// 输出Student类对象信息
		System.out.println(student);
	}
}
