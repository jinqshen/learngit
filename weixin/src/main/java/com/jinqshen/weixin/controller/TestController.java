package com.jinqshen.weixin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jinqshen.weixin.service.TestService;

/**
 * 接口测试控制层
 * @author jinqshen
 *
 */
@Controller
@RequestMapping("/")
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/importData")
	public String importData() {
		return "import";
	}
	
	@ResponseBody
	@RequestMapping("/saveExcelData")
	public String saveExcelData() {
		return "数据导入成功";
	}
}
