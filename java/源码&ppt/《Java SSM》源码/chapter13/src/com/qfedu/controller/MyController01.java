package com.qfedu.controller;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController01 {
	@RequestMapping("exceptionapp1")
	public void handler(HttpServletResponse response) throws IOException {
		System.out.println(1/0);
		response.getWriter().print("OK");
	}	
}
