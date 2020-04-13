package com.dao;

import com.po.User;

import java.util.List;

public interface UserDAO {
	public void saveUser(User user);//�����û�
	public User queryByUsername(String username);//�����û��������û�
	public List<User> queryAll(int popedom);//���������û�
	public void deleteUser(User user);//ɾ���û�
}