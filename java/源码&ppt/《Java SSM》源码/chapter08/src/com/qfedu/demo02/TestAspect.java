package com.qfedu.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspect {
	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");*/
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext_aop.xml");

		UserService userService = context.getBean("userService", UserService.class);
		userService.select();
	}
}
