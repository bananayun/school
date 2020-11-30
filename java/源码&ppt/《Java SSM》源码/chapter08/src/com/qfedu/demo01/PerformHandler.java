package com.qfedu.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformHandler implements InvocationHandler {
	// 目标对象
	private Object target;

	public PerformHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 增强的方法
		System.out.println("方法开始执行");
		// 执行被代理类的原方法
		Object invoke = method.invoke(target, args);
		// 增强的方法
		System.out.println("方法执行完毕");
		return invoke;
	}
}
