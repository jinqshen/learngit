package com.springboot.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.learn.service.TransferService;

/**
 * 银行控制层
 * @author jinqshen
 *
 */
@Controller
@RequestMapping("/bank")
public class BankController {

	@Autowired
	private TransferService transferService;
	
	@ResponseBody
	@RequestMapping("/transfer")
	public String tranfer() {
		try {
			transferService.transfer(1, 2, 500);
			return "转账成功";
		} catch (Exception e) {
			return "转账失败";
		}
		
	}
}
