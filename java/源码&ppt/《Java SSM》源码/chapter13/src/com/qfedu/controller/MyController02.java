package com.qfedu.controller;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController02 {
	@ExceptionHandler({Exception.class})       
    public String exception(Exception e,Model model) {       
        System.out.println(e.getMessage());  
        model.addAttribute("errorMsg", e.getMessage());
        return "error";       
    }
	@RequestMapping("exceptionapp2")
	public void handler(HttpServletResponse response) throws IOException {
		throw new RuntimeException("测试异常处理");
	}	
}
