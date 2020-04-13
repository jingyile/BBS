package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.SubItemService;

public class SubItemDeleteAction extends ActionSupport {
	private SubItemService subItemService;	//����Ŀҵ��ӿ�����
	private int subItemID;					//����ĿID
	public void setSubItemService(SubItemService subItemService) {
		this.subItemService = subItemService;
	}

	public int getSubItemID() {
		return subItemID;
	}

	public void setSubItemID(int subItemID) {
		this.subItemID = subItemID;
	}

	public String execute() throws Exception {
		subItemService.deleteItemBySubItemID(subItemID);	//����ɾ��ҵ�񷽷�
		return SUCCESS;
	}

}
