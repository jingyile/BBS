package com.dao;

import com.po.SubItem;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class SubItemDAOImpl extends HibernateDaoSupport implements SubItemDAO {
	public void deleteSubItem(SubItem subItem) {		//ɾ������Ŀ
		getHibernateTemplate().delete(subItem);
	}
	public List<SubItem> queryAllSubItem(int itemID) {	//��ѯָ����Ŀ�µ�����Ŀ
		List<SubItem> items = (List<SubItem>) getHibernateTemplate().find("from SubItem where itemID = ?",itemID);
		return items;
	}
	public SubItem querySubItemByID(int subItemID) {	//��ѯָ������Ŀ
		List<SubItem> items = (List<SubItem>) getHibernateTemplate().find("from SubItem where subItemID = ?",subItemID);
		if(items.size() == 0) {		//�ж��Ƿ��ѯ������Ŀ
			return null;
		}else {
			return items.get(0);	//��������Ŀ
		}
	}

	public SubItem querySubItemByName(String subItemName) {		//�������Ʋ�ѯ
		List<SubItem> items = (List<SubItem>) getHibernateTemplate().find("from SubItem where subItemName = ?",subItemName);
		if(items.size() == 0) {		//�ж��Ƿ��ѯ������Ŀ
			return null;
		}else {
			return items.get(0);
		}
	}

	public void saveSubItem(SubItem subItem) {		//��������Ŀ
		getHibernateTemplate().save(subItem);
	}
}
