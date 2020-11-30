package com.qfedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class MyController06{
	@RequestMapping(value="/testCookie")
	public String testCookie(@CookieValue(value="JSESSIONID")String cookie){
		System.out.println("JSESSIONID:"+cookie);
		return null;
	}
}
