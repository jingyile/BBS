package com.service;

import com.dao.SubItemDAO;
import com.dao.UserDAO;
import com.po.SubItem;
import com.po.User;

import java.util.List;

public class SubItemServiceImpl implements SubItemService{
	private SubItemDAO subItemDAO;		//����ĿDAO�ӿ�����
	private UserDAO userDAO;			//�û�DAO�ӿ�����
	public void setSubItemDAO(SubItemDAO subItemDAO) {
		this.subItemDAO = subItemDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public boolean addSubItem(SubItem subItem) {		//��������Ŀ
		String subItemName = subItem.getSubItemName();	//�������Ŀ����
		if(subItemDAO.querySubItemByName(subItemName) == null) {	//����Ŀ�����Ƿ�ռ��
			User user = userDAO.queryByUsername(subItem.getManager().getUsername());//�����û��������û�
			if(user != null){				//���û��Ѿ�����
				subItem.setManager(user);	//�����û�
				subItemDAO.saveSubItem(subItem);	//��������Ŀ
				return true;				//����ɹ�
			}
		}
		return false;		//����ʧ��
	}

	public boolean deleteItemBySubItemID(int subItemID) {		//ɾ��ָ��ID����Ŀ
		SubItem subItem = subItemDAO.querySubItemByID(subItemID);	//����ID��ѯ����Ŀ
		if(subItem == null) {		//�ж��Ƿ���ڸ�����Ŀ
			return false;			//ɾ��ʧ��
		}else{
			subItemDAO.deleteSubItem(subItem);		//ɾ������Ŀ
			return true;			//ɾ���ɹ�
		}
	}

	public List<SubItem> findAllSubItem(int itemID) {	//��ѯָ����Ŀ������Ŀ
		return subItemDAO.queryAllSubItem(itemID);
	}
	public SubItem findSubItemByID(int subItemID) {	//��������ĿID��ѯ
		return subItemDAO.querySubItemByID(subItemID);
	}

}
