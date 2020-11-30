package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.qfedu.service.AccountService;

public class TestAccountService01 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_1.xml");
		AccountService accountService = context.getBean("accountService", AccountService.class);
		accountService.transfer(1, 2, 1000.0);
	}
}
