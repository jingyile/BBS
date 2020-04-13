package com.service;

import com.dao.ItemDAO;
import com.dao.SubItemDAO;
import com.dao.UserDAO;
import com.po.Item;
import com.po.SubItem;
import com.po.User;

import java.util.List;

public class ItemServiceImpl implements ItemService {
	private ItemDAO itemDAO;			//��ĿDAO�ӿ�����
	private UserDAO userDAO;			//�û�DAO�ӿ�����
	private SubItemDAO subItemDAO;		//����ĿDAO�ӿ�����
	
	public ItemDAO getItemDAO() {
		return itemDAO;
	}
	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public SubItemDAO getSubItemDAO() {
		return subItemDAO;
	}
	public void setSubItemDAO(SubItemDAO subItemDAO) {
		this.subItemDAO = subItemDAO;
	}
	public boolean addItem(Item item) {	//������Ŀҵ�񷽷�
		String itemName = item.getItemName();	//�����Ŀ����
		if(itemDAO.queryItemByName(itemName) == null) {		//�ж������Ƿ�ռ��
			User user = userDAO.queryByUsername(item.getManager().getUsername());//�����û��������û�
			if(user != null){			//���û��Ѿ�����
				item.setManager(user);	//�����û�
				itemDAO.saveItem(item);	//������Ŀ
				return true;			//����ɹ�
			}
		}
		return false;		//����ʧ��
	}
	public List<Item> findAllItem() {	//��ѯ������Ŀҵ�񷽷�
		return itemDAO.queryAllItem();
	}
	public boolean deleteItemByItemID(int itemID) {	//ɾ��ָ��ID��Ŀ
		Item item = itemDAO.queryItemByID(itemID);	//����ID��ѯ��Ŀ
		if(item == null) {		//��������ڸ���Ŀ
			return false;		//ɾ��ʧ��
		}else{
			itemDAO.deleteItem(item);	//ɾ����Ŀ
			List<SubItem> subItems =
				subItemDAO.queryAllSubItem(itemID);	//��ø���Ŀ�µ���������Ŀ
			for(SubItem subItem : subItems){		//�����õ���������Ŀ
				subItemDAO.deleteSubItem(subItem);	//ɾ������Ŀ
			}
			return true;		//ɾ���ɹ�
		}
	}
}
