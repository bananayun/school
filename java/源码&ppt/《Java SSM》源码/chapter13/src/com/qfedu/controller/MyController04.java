package com.qfedu.controller;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController04 {
	@RequestMapping("interceptorapp1")
	public void handler(HttpServletResponse response) throws IOException {
		System.out.println("通过拦截器进来了吗？");
	}	
}
