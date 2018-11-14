package com.springboot.learn.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learn.entity.Student;
import com.springboot.learn.service.StudentService;

/**
 * 学生Controller
 * @author jinqshen
 *
 */
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/add")
	public String add(@Valid Student student, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return bindingResult.getFieldError().getDefaultMessage();
		}
		else {
			studentService.add(student);
			return "添加成功";
		}
	}
	
}
