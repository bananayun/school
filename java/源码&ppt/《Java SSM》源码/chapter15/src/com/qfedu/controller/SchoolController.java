package com.qfedu.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.qfedu.pojo.School;
import com.qfedu.service.SchoolService;
@Controller
public class SchoolController {
	@Autowired
	private SchoolService schoolService;
	//����
	@RequestMapping(value="/schooladd",method=RequestMethod.POST)
	public String save(School school,Model model) {
		if(schoolService.save(school)>0) {
			return "page02";
		}else {
			model.addAttribute("msg", "服务器异常，新增学校信息有误！");
			return "page01";
		}
	}
	//��ѯ
	@RequestMapping(value="/schoolall",method=RequestMethod.GET)
	public String all(Model model) {
		model.addAttribute("schools", schoolService.queryAll());
		return "page02";
	}
}