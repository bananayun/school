package com.qfedu.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController02 {
	@RequestMapping(value = "/defaultparam2", method = RequestMethod.GET)
	public String param2(HttpSession session, Model model, Map<String, Object> map) throws IOException {
		session.setAttribute("session1", "JAVA核心框架");
		model.addAttribute("model1", "SpringMVC");
		map.put("map1", "参数绑定");
		return "page03";
	}
}
