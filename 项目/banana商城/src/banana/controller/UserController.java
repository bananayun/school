package banana.controller;

import banana.common.vo.ResultBean;
import banana.common.utils.EmailUtils;
import banana.common.utils.MD5Utils;
import banana.common.utils.RandomUtils;
import banana.common.utils.StrUtils;
import banana.pojo.Cart;
import banana.pojo.User;
import banana.service.CartService;
import banana.service.UserService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private CartService cartService;

	// 登陆
	@RequestMapping("userlogin")
	public String login(String username, String password, Model model, HttpSession session) {
		if (!StrUtils.empty(username, password)) {
			User user = userService.getUserByName(username);
			if (user != null) {
				// 校验密码
				if (user.getPassword().equals(MD5Utils.md5(password))) {
					// 正确
					// 记录登录信息到会话中
					session.setAttribute("user", user);
					Cart cart = cartService.queryByUid(user.getId());
					if(cart == null) {
						cart = new Cart();
						cart.setUid(user.getId());
						cart.setMoney((double)0);
						cartService.createCart(cart);
					}
					session.setAttribute("cart", cartService.queryByUid(user.getId()));
					// 页面跳转
					return "index";
				}
			}
		}
		model.addAttribute("loginMsg", "用户名或密码错误");
		return "login";
	}

	// 注册
	@RequestMapping("userregister")
	public String register(User user, Model model, HttpSession session) {
		// 创建激活码
		String acode = RandomUtils.createActive();
		user.setActivatecode(acode);
		if (userService.save(user)) {
			// 新增成功
			session.setAttribute("acode", acode);
			// 发送激活码
			EmailUtils.sendEmail(user);
			return "registerSuccess";
		} else {
			model.addAttribute("registerMsg", "服务器开小差，请稍后再来");
			return "register";
		}
	}

	// 注销
	@RequestMapping("userloginout")
	public String loginout(String t, HttpSession session) {
		if (t != null) {
			session.removeAttribute("adminuser");
			return "admin/login";
		} else {
			session.removeAttribute("user");
			return "index";
		}
	}
	// 校验用户名是否可用
	@RequestMapping("usercheckname")
	@ResponseBody
	public ResultBean checkname(String name) {
		// 创建激活码
		if (userService.checkName(name)) {
			return ResultBean.setSuccess("OK");
		} else {
			return ResultBean.setError("ERROR");
		}
	}

	// 删除用户
	@RequestMapping("userdel")
	@ResponseBody
	public int checkname(int id) {
		return userService.deleteById(id);
	}
	
	// 用户搜索
	@RequestMapping("usersearch")
	@ResponseBody
	public List<User> usersearch(String username,String sex) {
		List<User> users = userService.usersearch(username, sex);
		 return users;
	}

	// 校验邮箱是否可用
	@RequestMapping("usercheckemail")
	@ResponseBody
	public ResultBean chakeemail(String email) {
		// 创建激活码
		if (userService.checkEmail(email)) {
			return ResultBean.setSuccess("OK");
		} else {
			return ResultBean.setError("ERROR");
		}
	}

	// 用户列表
	@RequestMapping("userlist")
	@ResponseBody
	public List<User> list() {
		return userService.selectAll();
	}

	// 管理员登录
	@RequestMapping("adminLogin")
	public String adminLogin(String username, String password, HttpServletRequest request) {
		if (!StrUtils.empty(username, password)) {
			User user = userService.getUserByName(username);
			if (user != null) {
				// 校验密码
				if (user.getPassword().equals(MD5Utils.md5(password)) && user.getRole()==0) {
					// 正确
					// 记录登录信息到会话中
					request.getSession().setAttribute("adminuser", user);
					// 页面跳转
					return "admin/admin";
				}
				System.out.println("你不是管理员");
				if(user.getRole() != 0)
					request.setAttribute("loginMsg", username + "不是管理员");
				else request.setAttribute("loginMsg", "用户名或密码错误");
				return "admin/login";
			}
			request.setAttribute("loginMsg", "用户不存在");
			return "admin/login";
		}
		request.setAttribute("loginMsg", "用户名或密码不能为空");
		return "admin/login";
	}
	//激活激活码
	@RequestMapping("/activate")
	public String checkCode(String e, String c, HttpSession session) {
		if (userService.activateUser(e, c)) {
			// 激活成功
			return "login";
		} else {
			return "index";
		}
	}
}