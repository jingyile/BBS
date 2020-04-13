package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.User;
import com.service.UserService;

import java.util.List;

public class FindAllUserAction extends ActionSupport {
	private int popedom;				//Ȩ��
	private List<User> allUser;		//�û��б�
	private UserService userService;	//�û�ҵ��ӿ�����
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public List<User> getAllUser() {
		return allUser;
	}
	public void setAllUser(List<User> allUser) {
		this.allUser = allUser;
	}
	public int getPopedom() {
		return popedom;
	}
	public void setPopedom(int popedom) {
		this.popedom = popedom;
	}
	public String execute() throws Exception {
		allUser = userService.findAllUser(popedom);	//���ò��������û�ҵ�񷽷�
		return SUCCESS;
	}
}
