package com.po;

public class Item {		//��Ŀ
	private int itemID;				//��ĿID
	private String itemName;			//��Ŀ����
	private String itemDescription;	//��Ŀ����
	private User manager;				//��Ŀ����
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
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
	public User getManager() {
		return manager;
	}
	public void setManager(User manager) {
		this.manager = manager;
	}
}
