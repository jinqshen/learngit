package com.jinqshen.weixin.pojo.entity;

import java.io.Serializable;
/**
 * 学生信息实体类
 * @author jinqshen
 *
 */
public class StudentInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3110531295806192965L;
	
	private String studentnumber;
	
	private String name;
	
	private String sex;
	
	private String major;
	
	private String academy;

	public String getStudentnumber() {
		return studentnumber;
	}

	public void setStudentnumber(String studentnumber) {
		this.studentnumber = studentnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

}
