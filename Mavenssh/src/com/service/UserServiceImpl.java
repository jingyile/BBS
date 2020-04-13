package com.service;

import com.dao.UserDAO;
import com.po.User;

import java.util.List;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;	//�û�DAO�ӿ�����
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public boolean addUser(User user) {		//�����û�
		String username = user.getUsername();	//����û���
		if(userDAO.queryByUsername(username) == null) {		//�ж��û����Ƿ�ռ��
			userDAO.saveUser(user);		//�����û�
			return true;				//����ɹ�
		}else{
			return false;				//����ʧ��
		}
	}

	public List<User> findAllUser(int popedom) {	//����Ȩ�޲�ѯ�û�
		return userDAO.queryAll(popedom);		//��ѯ����
	}

	public boolean deleteUser(String username) {	//ɾ��ָ���û�
		User user = userDAO.queryByUsername(username);	//�����û�����ѯ�û�
		if(user == null) {		//�����ڸ��û�
			return false;		//ɾ��ʧ��
		}else{
			userDAO.deleteUser(user);	
			return true;		//ɾ���ɹ�
		}
	}
	public boolean isLogin(User user) {
		//�����ж��û��Ƿ����
		User query_user = userDAO.queryByUsername(user.getUsername());
		if(query_user == null) {
			return false;
		} else {
			//�Ƚ�����
			String query_password = query_user.getPassword();
			if(user.getPassword().equals(query_password)){
				return true;
			}
			return false;
		}
	}
}
