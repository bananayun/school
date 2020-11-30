package com.qfedu.demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.qfedu.demo03.Service01;

public class TestRecord {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_record.xml");
		Service01 service01 = context.getBean("service01", Service01.class);
		service01.service();
	}
}
