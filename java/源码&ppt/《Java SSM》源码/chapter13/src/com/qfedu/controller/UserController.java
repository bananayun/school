package com.qfedu.controller;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userlogin")
	public String login(String username,String password,HttpSession session) {
		User user=userService.login(username, password);
		if(user!=null) {
			session.setAttribute("user", user);
			return "index";
		}else {
			return "login";
		}
	}
}
