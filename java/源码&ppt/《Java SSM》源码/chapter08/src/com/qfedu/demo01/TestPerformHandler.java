package com.qfedu.demo01;

import java.lang.reflect.Proxy;

public class TestPerformHandler {
	public static void main(String[] args) {
		LoginService loginService = new LoginServiceImpl();
		PerformHandler performHandler = new PerformHandler(loginService);
		// 创建代理对象
		loginService = (LoginService) Proxy.newProxyInstance(loginService.getClass().getClassLoader(),
				loginService.getClass().getInterfaces(), performHandler);
		loginService.login();
	}
}
