package com.qfedu.demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_msg.xml");
		Service02 service02 = context.getBean("service02", Service02.class);
		service02.service();
	}
}
