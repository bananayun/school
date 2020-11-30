package com.qfedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController02 {
	@RequestMapping("/execute")
	public ModelAndView execute() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Hello Word");
		mv.setViewName("page01");
		return mv;
	}
}
