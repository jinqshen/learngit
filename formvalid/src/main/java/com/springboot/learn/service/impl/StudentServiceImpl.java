package com.springboot.learn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.learn.dao.StudentDao;
import com.springboot.learn.entity.Student;
import com.springboot.learn.service.StudentService;
@Service("studentservice")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void add(Student student) {
		studentDao.save(student);
	}

}
