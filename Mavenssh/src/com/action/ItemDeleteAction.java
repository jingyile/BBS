package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.ItemService;

public class ItemDeleteAction extends ActionSupport {
	private ItemService itemService;	//��Ŀҵ��ӿ�����
	private int itemID;		//��ĿID
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String execute() throws Exception {
		itemService.deleteItemByItemID(itemID);	//����ɾ��ָ����Ŀҵ�񷽷�
		return SUCCESS;
	}
}
