package com.qfedu.interceptor;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;
public class MyWebRequestInterceptor implements WebRequestInterceptor{
	@Override
	public void afterCompletion(WebRequest request, Exception ex) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterCompletion:执行了");
	}
	@Override
	public void postHandle(WebRequest request, ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("postHandle:ִ执行了");
	}
	@Override
	public void preHandle(WebRequest request) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHandle:执行了");
	}
}