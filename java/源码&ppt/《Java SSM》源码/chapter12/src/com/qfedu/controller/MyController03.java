package com.qfedu.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController03 {

	@RequestMapping(value = "/simpleparam", method = RequestMethod.GET)
	public void param1(int param1, float param2, double param3, char param4, boolean param5, long param6,
			HttpServletResponse response) throws IOException {
		System.out.println("int£º" + param1);
		System.out.println("float£º" + param2);
		System.out.println("double£º" + param3);
		System.out.println("char£º" + param4);
		System.out.println("boolean£º" + param5);
		System.out.println("long£º" + param6);
		response.getWriter().print("OK");
	}
}
