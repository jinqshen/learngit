package com.springboot.aop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/aop")
public class AopController {

	@ResponseBody
	@RequestMapping("/test")
	public String test() {
		System.out.println("方法执行");
		return "ok";
	}
}
