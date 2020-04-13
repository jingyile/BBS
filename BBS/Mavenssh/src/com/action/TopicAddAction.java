package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Topic;
import com.po.User;
import com.service.TopicService;

import java.util.Date;

public class TopicAddAction extends ActionSupport {
	private TopicService topicService;		//����ҵ��ӿ�����
	private String title;		//�������
	private String content;	//��������
	private String username;	//�������û���
	private int subItemID;		//��������ĿID
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSubItemID() {
		return subItemID;
	}
	public void setSubItemID(int subItemID) {
		this.subItemID = subItemID;
	}
	public void setTopicService(TopicService topicService) {
		this.topicService = topicService;
	}
	public String execute() throws Exception {
		Topic topic = new Topic();		//�����������
		topic.setTitle(title);			//�����������
		topic.setContent(content);		//������������
		User user = new User();			//�����û�����
		user.setUsername(username);		//�����û���
		topic.setUser(user);			//���÷�����
		topic.setDate(new Date());		//���÷���ʱ��
		topic.setSubItemID(subItemID);	//������������ĿID
		topic.setHasread(0);			//���ñ��鿴����
		if(topicService.addTopic(topic)){	//��������ҵ�񷽷�
			this.addActionMessage("�������ӳɹ�!");
		}else{
			this.addActionMessage("��������ʧ��!");
		}
		return SUCCESS;
	}
}
