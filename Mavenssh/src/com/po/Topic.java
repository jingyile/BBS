package com.po;

import java.util.Date;
import java.util.Set;

public class Topic {//����
	private int topicID;			//����ID
	private String title;			//�������
	private String content;		//��������
	private User user;				//���ⷢ������Ϣ
	private Date date;				//���ⷢ��ʱ��
	private int hasread;			//����鿴����
	private int subItemID;			//������������ĿID
	private Set<Replay> replays;	//�����»ظ��б�
	public int getTopicID() {
		return topicID;
	}
	public void setTopicID(int topicID) {
		this.topicID = topicID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public int getHasread() {
		return hasread;
	}
	public void setHasread(int hasread) {
		this.hasread = hasread;
	}
	public int getSubItemID() {
		return subItemID;
	}
	public void setSubItemID(int subItemID) {
		this.subItemID = subItemID;
	}
	public Set<Replay> getReplays() {
		return replays;
	}
	public void setReplays(Set<Replay> replays) {
		this.replays = replays;
	}
}
