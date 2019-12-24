package com.gcc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcc.entity.User;
import com.gcc.service.G40004Service;

@Controller
public class G40004Controller {

	@Autowired
	private G40004Service g40004Service;

	@RequestMapping("/g40004")
	public String index(HttpSession session){
		User user = (User)session.getAttribute("user");
		g40004Service.getBaseInfo(user.getUserid());
		g40004Service.getCompanyInfo(user.getUserid());
		g40004Service.getPersonalInfo(user.getUserid());
		return "g400/g40004";
	}
}
