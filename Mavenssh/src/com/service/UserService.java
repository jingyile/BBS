package com.service;

import com.po.User;

import java.util.List;

public interface UserService {
	public boolean addUser(User user);//�����û�
	public List<User> findAllUser(int popedom);//���������û�
	public boolean deleteUser(String username);//ɾ���û�
	public boolean isLogin(User user);//�Ƿ������¼
}
