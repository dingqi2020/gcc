package com.gcc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gcc.entity.User;
import com.gcc.service.UserService;

@Controller
public class UserController {

	private final static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userServivce;
	
	//正常访问login页面
	@RequestMapping("/login")
	public String login(){
		return "login/login";
	}

	//表单提交过来的路径
	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> checkLogin(HttpServletRequest request, User user){
		//调用service方法
		user = userServivce.checkLogin(user.getUserid(), user.getPassword());
		Map<String, Object> map = new HashMap<>();
		//若有user则添加到session里
		if(user != null){
			map.put("code", 0);
			request.getSession().setAttribute("user", user);
			logger.info(user.getUsername() + "成功登录");
		} else {
			map.put("code", 1);
			map.put("errorInfo","用户名户密码错误");
			logger.error("用户名户密码错误，登录失败");
		}
		return map;
	}

	@RequestMapping("/regist")
	public String regist(){
		return "login/regist";
	}

	@RequestMapping(value = "/doRegist", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> doRegist(User user, Model model){
		// 确认用户名是否已注册
		int result = userServivce.checkRegisted(user.getUserid());
		Map<String, Object> map = new HashMap<>();
		if (result != 0) {
			map.put("code", 1);
			map.put("errorInfo",user.getUserid() + "已被注册，请重新注册");
			logger.error(user.getUserid() + "已被注册，请重新注册");
		} else {
			map.put("code", 0);
			map.put("info","注册成功");
			userServivce.regist(user);
			logger.error(user.getUserid() + "注册成功");
		}
		return map;
	}

	//注销方法
	@RequestMapping("/outLogin")
	public String outLogin(HttpSession session){
		//通过session.invalidata()方法来注销当前的session
		session.invalidate();
		return "login/login";
	}
}
