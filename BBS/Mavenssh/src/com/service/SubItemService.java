package com.service;

import com.po.SubItem;

import java.util.List;

public interface SubItemService {
	public boolean addSubItem(SubItem subItem);	//�������Ŀ
	public List<SubItem> findAllSubItem(int itemID);//��ѯ��������Ŀ
	public boolean deleteItemBySubItemID(int subItemID);//��������ĿIDɾ����Ŀ
	public SubItem findSubItemByID(int subItemID);
}
