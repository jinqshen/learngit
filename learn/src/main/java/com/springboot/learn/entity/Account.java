package com.springboot.learn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 账户实体类
 * @author jinqshen
 *
 */
@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue
	private Integer id;
	@Column(length = 50, nullable = false)
	private String name;

	private float money;

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

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}
	
}
