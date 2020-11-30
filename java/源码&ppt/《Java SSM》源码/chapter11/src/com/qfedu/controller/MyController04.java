package com.qfedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController04 {
	// 访问page03.jsp
	@RequestMapping(value = "/toLogin")
	public ModelAndView toLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("page03");
		return mv;
	}

	// 处理登录请求
	@RequestMapping(value = "/login")
	public ModelAndView login(@RequestParam(value = "username", defaultValue = "xiaofeng") String username,
			@RequestParam(value = "password", defaultValue = "123abc") String password) {
		System.out.println("用户名：" + username);
		System.out.println("密码：" + password);
		return null;
	}
}
