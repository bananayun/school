package com.qfedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController03 {
	// 访问page02.jsp
	@RequestMapping(value = "/toWelcome")
	public ModelAndView toWelcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("page02");
		return mv;
	}

	// 访问page01.jsp
	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Hello Word");
		mv.setViewName("page01");
		return mv;
	}
}
