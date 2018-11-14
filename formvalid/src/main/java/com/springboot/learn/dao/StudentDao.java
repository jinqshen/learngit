package com.springboot.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.learn.entity.Student;
/**
 * 学生dao层
 * @author jinqshen
 *
 */
public interface StudentDao extends JpaRepository<Student, Integer> {

}
