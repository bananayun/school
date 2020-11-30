package com.qfedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/claList/{cid}")
public class MyController05 {
	@RequestMapping(value = "/stuList/{sid}")
	public String findStudnt(@PathVariable(value = "cid") Integer cid, @PathVariable(value = "sid") Integer sid) {
		System.out.println("班级ID为：" + cid);
		System.out.println("学生ID为：" + sid);
		return null;
	}
}
