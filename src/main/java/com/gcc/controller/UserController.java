package com.gcc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gcc.entity.User;
import com.gcc.service.UserService;

@Controller
public class UserController {

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
	public Map<String, Object> checkLogin(User user,Model model){
		//调用service方法
		user = userServivce.checkLogin(user.getUsername());
		Map<String, Object> map = new HashMap<>();
		//若有user则添加到model里并且跳转到成功页面
		if(user != null){
			map.put("code", 0);
		} else {
			map.put("code", 1);
			map.put("errorInfo","用户名户密码错误");
		}
		return map;
	}

	@RequestMapping("/regist")
	public String regist(){
		return "login/regist";
	}

	@RequestMapping(value = "/doRegist", method = RequestMethod.POST)
	public String doRegist(User user, Model model){
		userServivce.regist(user);
		return "login/login";
	}

	//注销方法
	@RequestMapping("/outLogin")
	public String outLogin(HttpSession session){
		//通过session.invalidata()方法来注销当前的session
		session.invalidate();
		return "login/login";
	}
}
