package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.User;
import com.service.UserService;

import java.util.Date;

public class UserAddAction extends ActionSupport {
	private UserService userService;	//�û�ҵ��ӿ�����
	private String username;		//�û���
	private String password;		//����
	private String repassword;		//ȷ������
	private String sex;			//�Ա�
	private int age;				//����
	private Date birthDay;			//����
	private int popedom;			//Ȩ��
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
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
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
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String execute() throws Exception {
		User user = new User();			//�����û�����
		user.setUsername(username);		//�����û���
		user.setPassword(password);		//��������
		user.setSex(sex);				//�����Ա�
		user.setAge(age);				//��������
		user.setBirthDay(birthDay);		//��������
		user.setPopedom(popedom);		//����Ȩ��
		user.setIntegral(0);			//�����û����ֳ�ʼ��Ϊ0
		if(userService.addUser(user)){	//���������û�ҵ�񷽷����ж��Ƿ����ӳɹ�
			this.addActionMessage("����û��ɹ�!");
		}else{
			this.addActionMessage("�û���ռ�ã������������û���");
		}
		return SUCCESS;
	}
}
