package com.qfedu.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.qfedu.pojo.Page;
import com.qfedu.pojo.Student;

@Controller
public class JsonController {
	@ResponseBody
	@RequestMapping("jsonapp1")
	public List<Student> json1(@RequestBody Page obj) {
// 			List<Student> list=new ArrayList<Student>();
// 			int start=(obj.getPage()-1)*obj.getLimit()+1;
// 			for(int i=start;i<=obj.getPage()*obj.getLimit();i++) {
// 				Student stu=new Student();
// 				stu.setNo("qf-"+i);
// 				stu.setClassNo("qfjava1801");
// 				stu.setName("วงทๆ"+i);
// 				list.add(stu);
// 			}
//			return list;
		return null;
	}
}
