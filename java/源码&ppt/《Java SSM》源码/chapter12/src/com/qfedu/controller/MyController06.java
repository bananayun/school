package com.qfedu.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController06 {
	@RequestMapping(value = "/arrayparam", method = RequestMethod.GET)
	public void param1(String[] hobby, HttpServletResponse response) throws IOException {
		System.out.println("您的爱好：" + Arrays.toString(hobby));
		response.getWriter().print("OK");
	}
}

 /*	package com.qfedu.controller;
 	import java.util.Map;
 	import org.springframework.stereotype.Controller;
 	import org.springframework.web.bind.annotation.RequestMapping;
 	import org.springframework.web.bind.annotation.ResponseBody;
 	import com.qfedu.annotation.MyParam;
 	@Controller
 	public class MyController06 {
 		 @ResponseBody
 		 @RequestMapping("/data")
 		 public Map<String, Object> data(@MyParam(name="a") String a) {
 		     System.out.println("参数信息："+a);
 		     return null;
 		 }
 	}
*/