package com.qfedu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController07 {
	@RequestMapping(value = "/gatherparam", method = RequestMethod.GET)
	public void param1(@RequestParam("foods") List<String> foods, HttpServletResponse response) throws IOException {
		System.out.println("¼¯ºÏ£º" + foods);
		response.getWriter().print("OK");
	}
}
