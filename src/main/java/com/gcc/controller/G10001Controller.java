package com.gcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class G10001Controller {

	@RequestMapping("/index")
	public String index(){
		return "g100/index";
	}

	@RequestMapping("/g10001")
	public String home(){
		return "g100/g10001";
	}
}
