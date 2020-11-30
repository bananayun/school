package com.qfedu.controller;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController03 {
	@RequestMapping("exceptionapp3")
	public void handler(HttpServletResponse response) throws IOException {
		throw new NullPointerException("出异常啦");
	}	
}
