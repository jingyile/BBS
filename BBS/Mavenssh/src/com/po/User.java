package com.po;

import java.util.Date;

public class User {
	private int userID;		//�û�ID
	private String username;	//�û���
	private String password;	//����
	private String sex;		//�Ա�
	private int age;			//����
	private Date birthDay;		//����
	private int popedom;		//Ȩ��
	private int integral;		//����
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public int getPopedom() {
		return popedom;
	}
	public void setPopedom(int popedom) {
		this.popedom = popedom;
	}
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
}
