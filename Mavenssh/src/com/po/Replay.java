package com.po;

import java.util.Date;

public class Replay {
	private int Id;			//�ظ�ID
	private int topicID;		//��������ID
	private String content;	//�ظ�����
	private User user;			//�ظ���������Ϣ
	private Date date;			//�ظ�����ʱ��
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getTopicID() {
		return topicID;
	}
	public void setTopicID(int topicID) {
		this.topicID = topicID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
