package com.qfedu.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qfedu.pojo.Student;

@Controller
public class MyController04 {
	@RequestMapping(value = "/pojoparam", method = RequestMethod.POST)
	public void param1(Student stu, HttpServletResponse response) throws IOException {
		System.out.println("POJO£º" + stu);
		response.getWriter().print("OK");
	}
}
