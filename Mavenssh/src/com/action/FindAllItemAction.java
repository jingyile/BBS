package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Item;
import com.service.ItemService;

import java.util.List;

public class FindAllItemAction extends ActionSupport {
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

	public String execute() throws Exception {
		items = itemService.findAllItem();	//���ò�ѯ������Ŀҵ�񷽷�
		return SUCCESS;
	}
}
