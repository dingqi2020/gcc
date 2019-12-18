package com.gcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class G20001Controller {

	@RequestMapping("/g20001")
	public String index(){
		return "g200/g20001";
	}
}
