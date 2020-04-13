package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.SubItem;
import com.po.User;
import com.service.SubItemService;

public class SubItemAddAction extends ActionSupport {
	private SubItemService subItemService;	//����Ŀҵ��ӿ�
	
	private String subItemName;		//����Ŀ����
	private int itemID;				//������ĿID
	private String itemDescription;	//����Ŀ����
	private  String manager;			//����Ŀ����
	public String getSubItemName() {
		return subItemName;
	}
	public void setSubItemName(String subItemName) {
		this.subItemName = subItemName;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
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
	public SubItemService getSubItemService() {
		return subItemService;
	}
	public void setSubItemService(SubItemService subItemService) {
		this.subItemService = subItemService;
	}
	
	public String execute() throws Exception {
		SubItem subItem = new SubItem();		//��������Ŀ����
		subItem.setSubItemName(subItemName);	//��������Ŀ����
		subItem.setItemDescription(itemDescription);	//��������Ŀ����
		subItem.setItemID(itemID);				//����������ĿID	
		User user = new User();					//�����û�����
		user.setUsername(manager);				//�����û���
		subItem.setManager(user);				//��������Ŀ����
		if(subItemService.addSubItem(subItem)){	//����ɹ�
			this.addActionMessage("�������Ŀ�ɹ�!");
		}else{
			this.addActionMessage("����Ŀ��ռ�ã����߰��������ڣ�");
		}
		return SUCCESS;
	}
}
