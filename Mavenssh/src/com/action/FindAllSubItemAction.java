package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Item;
import com.po.SubItem;
import com.service.ItemService;
import com.service.SubItemService;

import java.util.List;

public class FindAllSubItemAction extends ActionSupport {
	private int titemID;				//��ĿID
	private List<SubItem> subItems;	//����Ŀ�б�
	private ItemService itemService;	//��Ŀҵ��ӿ�����
	private List<Item> items;			//��Ŀ�б�
	private SubItemService subItemService;		//����Ŀҵ��ӿ�����
	public void setSubItemService(SubItemService subItemService) {
		this.subItemService = subItemService;
	}

	public List<SubItem> getSubItems() {
		return subItems;
	}

	public void setSubItems(List<SubItem> subItems) {
		this.subItems = subItems;
	}

	public ItemService getItemService() {
		return itemService;
	}

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getTitemID() {
		return titemID;
	}

	public void setTitemID(int titemID) {
		this.titemID = titemID;
	}

	public String execute() throws Exception {
		subItems = subItemService.findAllSubItem(titemID);	//������ĿID��ѯ����Ŀ
		items = itemService.findAllItem();	//��ѯ������Ŀ
		return SUCCESS;
	}
}
