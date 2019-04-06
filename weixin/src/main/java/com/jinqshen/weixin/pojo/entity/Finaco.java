package com.jinqshen.weixin.pojo.entity;

import java.io.Serializable;
/**
 * 体测信息类
 * @author jinqshen
 *
 */
public class Finaco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6964899733202220958L;
	
	private Integer finacono;
	
	private String studentnumber;
	
	private String project;
	
	private float grade;
	
	private boolean isqualified;

	public Integer getFinacono() {
		return finacono;
	}

	public void setFinacono(Integer finacono) {
		this.finacono = finacono;
	}

	public String getStudentnumber() {
		return studentnumber;
	}

	public void setStudentnumber(String studentnumber) {
		this.studentnumber = studentnumber;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public boolean isIsqualified() {
		return isqualified;
	}

	public void setIsqualified(boolean isqualified) {
		this.isqualified = isqualified;
	}

}
