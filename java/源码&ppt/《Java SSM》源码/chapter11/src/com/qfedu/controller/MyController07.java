package com.qfedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController07 {
	@RequestMapping(value = "/testRequestHeader")
	public String testRequestHeader(@RequestHeader(value = "Host") String host,
			@RequestHeader(value = "Connection") String connection) {
		System.out.println("Host:" + host);
		System.out.println("Connection:" + connection);
		return null;
	}
}
