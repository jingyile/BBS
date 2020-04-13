package com.dao;

import com.po.Item;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class ItemDAOImpl extends HibernateDaoSupport implements ItemDAO {
	public Item queryItemByName(String itemName) {	//������Ŀ���Ʋ�ѯ��Ŀ
		List<Item> item = (List<Item>) getHibernateTemplate().find("from Item where itemName = ?",itemName);
		if(item.size() == 0) {		//�ж��Ƿ��ѯ����Ŀ
			return null;
		}else {
			return item.get(0);		//���ص�һ����Ŀ
		}
	}
	public void saveItem(Item item) {		//������Ŀ����
		getHibernateTemplate().save(item);
	}
	public List<Item> queryAllItem() {		//��ѯ������Ŀ
		List<Item> item = (List<Item>) getHibernateTemplate().find("from Item");
		return item;
	}
	public void deleteItem(Item item) {	//ɾ��ָ����Ŀ
		getHibernateTemplate().delete(item);
	}
	public Item queryItemByID(int itemID) {	//������ĿID��ѯ��Ŀ
		List<Item> item = (List<Item>) getHibernateTemplate().find("from Item where itemID = ?",itemID);
		if(item.size() == 0) {		//�ж��Ƿ��ѯ����Ŀ
			return null;
		}else {
			return item.get(0);		//�����ѯ����������Ŀ
		}
	}
}
