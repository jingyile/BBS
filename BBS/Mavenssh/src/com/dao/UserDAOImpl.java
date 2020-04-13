package com.dao;

import com.po.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{
	public void saveUser(User user) {		//�����û�����
		this.getHibernateTemplate().save(user);
	}
	public User queryByUsername(String username) {	//�����û�������
		List<User> list = (List<User>) this.getHibernateTemplate().
				find("from User where username = ?",username);
		if(list.size() == 0){		//�жϲ�ѯ�����Ƿ�Ϊ��
			return null;
		}else {
			return list.get(0);		//���ص�һ���û�
		}
	}

	public List<User> queryAll(int popedom) {	//����Ȩ�޲�ѯ�û�
		List<User> list = (List<User>) this.getHibernateTemplate().find("from User where popedom = ?",popedom);
		return list;
	}

	public void deleteUser(User user) {		//ɾ���û�
		this.getHibernateTemplate().delete(user);
	}
}
