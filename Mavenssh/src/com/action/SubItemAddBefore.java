package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Item;
import com.service.ItemService;

import java.util.List;

public class SubItemAddBefore extends ActionSupport {	//��������Ŀǰ������е���Ŀ��Ϣ
	private ItemService itemService;		//��Ŀҵ��ӿ�����
	private List<Item> items;				//��Ŀ�б�
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void validate() {
		items = itemService.findAllItem();
	}

	public String execute() throws Exception {
		items = itemService.findAllItem();	//���ò�ѯ������Ŀҵ�񷽷�
		return SUCCESS;
	}
}
