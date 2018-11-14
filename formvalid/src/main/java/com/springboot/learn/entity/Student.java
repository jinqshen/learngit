package com.springboot.learn.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "student")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7653806058459701810L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@NotEmpty(message = "姓名不能为空!")
	@Column(length = 50)
	private String name;
	/**
	 * Integer类型只需判断notnull，String类型需要判断notempty
	 */
	@NotNull(message = "年龄不能为空!")
	@Min(message = "年龄不能小于18", value = 18)
	@Column(length = 20)
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
