package com.qfedu.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController05 {
	@RequestMapping(value = "/packageparam", method = RequestMethod.GET)
	public void param1(Integer param1, Long param2, Double param3, Character param4, HttpServletResponse response)
			throws IOException {
		System.out.println("Integer��" + param1);
		System.out.println("Long��" + param2);
		System.out.println("Double��" + param3);
		System.out.println("Character" + param4);
		response.getWriter().print("OK");
	}
}
