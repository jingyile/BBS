package com.dao;

import com.po.Item;

import java.util.List;

public interface ItemDAO {
	public void saveItem(Item item);			//������Ŀ
	public Item queryItemByName(String itemName);//������Ŀ���Ʋ�����Ŀ
	public Item queryItemByID(int itemID);//������ĿID������Ŀ
	public List<Item> queryAllItem();			//��ѯ������Ŀ
	public void deleteItem(Item item);			//ɾ����Ŀ
}
