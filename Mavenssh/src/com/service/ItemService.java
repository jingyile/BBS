package com.service;

import com.po.Item;

import java.util.List;

public interface ItemService {
	public boolean addItem(Item item);	//�����Ŀ
	public List<Item> findAllItem();//��ѯ������Ŀ
	public boolean deleteItemByItemID(int itemID);//������ĿIDɾ����Ŀ
}
