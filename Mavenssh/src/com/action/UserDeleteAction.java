package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class UserDeleteAction extends ActionSupport {
	private String username;			//�û���
	private UserService userService;	//�û�ҵ��ӿ�

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() throws Exception {
		if(userService.deleteUser(username)) {		//����ɾ���û�ҵ�񷽷�
			this.addActionMessage("ɾ���û��ɹ�!");
		}else {
			this.addActionMessage("ɾ���û�ʧ��!");
		}
		return SUCCESS;
	}
}
