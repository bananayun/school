package com.qfedu.demo01;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.*;

public class CglibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer();

	// 生成代理对象的方法
	public Object getProxy(Class clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	// 回调方法
	@Override
	public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("CGLig代理之前");
		Object invoke = methodProxy.invokeSuper(obj, objects);
		System.out.println("CGLig代理之后");
		return invoke;
	}
}
