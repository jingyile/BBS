package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Item;
import com.po.User;
import com.service.ItemService;

public class ItemAddAction extends ActionSupport {
	private ItemService itemService;	//��Ŀҵ��ӿ�����
	private String itemName;			//��Ŀ����
	private String itemDescription;	//��Ŀ����
	private String manager;			//����
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	public String execute() throws Exception {
		Item item = new Item();			//������Ŀ����
		item.setItemName(itemName);		//������Ŀ����
		item.setItemDescription(itemDescription);	//������Ŀ����
		User user = new User();			//�����û�
		user.setUsername(manager);		//���������õ��û�������
		item.setManager(user);			//���ð����û�
		if(itemService.addItem(item)){		//����������Ŀҵ�񷽷�
			this.addActionMessage("�����Ŀ�ɹ�!");
		}else{
			this.addActionMessage("��Ŀ��ռ�ã����߰��������ڣ�");
		}
		return SUCCESS;
	}
}
