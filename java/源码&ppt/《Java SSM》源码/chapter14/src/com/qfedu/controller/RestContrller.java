package com.qfedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestContrller {
	// 新增
	@RequestMapping(value = "user/{name}/{pass}", method = RequestMethod.POST)
	@ResponseBody
	public String add(@PathVariable String name, @PathVariable String pass) {
		System.out.println("Post请求--新增：" + name + "_" + pass);
		return "新增成功";
	}

	// 修改
	@RequestMapping(value = "user/{id}/{name}", method = RequestMethod.PUT)
	@ResponseBody
	public String update(@PathVariable int id, @PathVariable String name) {
		System.out.println("Put请求--修改：" + id + "_" + name);
		return "修改成功";
	}

	// 删除
	@RequestMapping(value = "user/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String del(@PathVariable int id, @PathVariable String name) {
		System.out.println("Delete请求--删除：" + id);
		return "删除成功";
	}

	// 修改
	@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String select(@PathVariable int id) {
		System.out.println("GET请求--查询：" + id);
		return "查询成功";
	}
}
