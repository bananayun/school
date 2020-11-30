package com.qfedu.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController01 {
	
	@RequestMapping(value="/defaultparam",method=RequestMethod.POST)
	public void param1(HttpServletRequest request,HttpServletResponse 
		response) throws IOException {
	 		String msg=request.getParameter("msg");
				System.out.println("HttpServletRequest£º"+msg);
			response.setContentType("text/html;charset=UTF-8");
	 		response.getWriter().print("HttpServletResponse£ºÏìÓ¦ÄÚÈÝ");
	 	}


}
