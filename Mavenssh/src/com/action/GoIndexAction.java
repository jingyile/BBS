package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Item;
import com.po.SubItem;
import com.service.ItemService;
import com.service.SubItemService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoIndexAction extends ActionSupport {
	private SubItemService subItemService;	//����Ŀҵ��ӿ�����
	private List<SubItem> subItems;		//����Ŀ�б�
	private ItemService itemService;		//��Ŀҵ��ӿ�����
	private List<Item> items;				//��Ŀ�б�
	private Map<Item, List> map;			//��Ŀ�µ�����Ŀ
	public void setSubItemService(SubItemService subItemService) {
		this.subItemService = subItemService;
	}
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	public List<SubItem> getSubItems() {
		return subItems;
	}
	public void setSubItems(List<SubItem> subItems) {
		this.subItems = subItems;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Map<Item, List> getMap() {
		return map;
	}
	public void setMap(Map<Item, List> map) {
		this.map = map;
	}
	public String execute() throws Exception {
		items = itemService.findAllItem();		//��ѯ������Ŀ
		//����һ��Map���������Ӧ����Ŀ�������������Ŀ
		map = new HashMap<Item, List>();
		for(Item item:items){		//����Ŀѭ������
			subItems = subItemService.findAllSubItem(item.getItemID());	//��ȡ��Ŀ������Ŀ
			map.put(item,subItems);	//���õ�map��
		}
		return SUCCESS;
	}
}
