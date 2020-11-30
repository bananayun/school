package com.qfedu.demo01;

public class TestCGLlib {
	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();
		// 创建代理对象
		LoginServiceImpl userService = (LoginServiceImpl) cglibProxy.getProxy(LoginServiceImpl.class);
		userService.login();
	}
}
