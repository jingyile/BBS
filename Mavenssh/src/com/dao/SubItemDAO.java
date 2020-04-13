package com.dao;

import com.po.SubItem;

import java.util.List;

public interface SubItemDAO {
	public void saveSubItem(SubItem subItem);			//��������Ŀ
	public SubItem querySubItemByName(String subItemName);//��������Ŀ���Ʋ�������Ŀ
	public SubItem querySubItemByID(int subItemID);//��������ĿID��������Ŀ
	public List<SubItem> queryAllSubItem(int itemID);			//��ѯ��������Ŀ
	public void deleteSubItem(SubItem subItem);			//ɾ������Ŀ
}
