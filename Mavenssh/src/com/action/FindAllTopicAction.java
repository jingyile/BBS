package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Topic;
import com.service.SubItemService;
import com.service.TopicService;
import com.util.Page;
import com.util.Result;

import java.util.List;

public class FindAllTopicAction extends ActionSupport {
	private TopicService topicService;			//����ҵ��ӿ�����
	private SubItemService subItemService;		//����Ŀҵ��ӿ�����
	private int subItemID;				//����ĿID
	private List<Topic> allTopic;		//�����б�
	private String subItemName;		//����Ŀ����
	private int currentPage;			//��ǰҳ
	private Page page;					//��ҳ
	public int getSubItemID() {
		return subItemID;
	}
	public void setSubItemID(int subItemID) {
		this.subItemID = subItemID;
	}


	
	
	public List<Topic> getAllTopic() {
		return allTopic;
	}

	public void setAllTopic(List<Topic> allTopic) {
		this.allTopic = allTopic;
	}



	public String getSubItemName() {
		return subItemName;
	}

	public void setSubItemName(String subItemName) {
		this.subItemName = subItemName;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public void setTopicService(TopicService topicService) {
		this.topicService = topicService;
	}
	public void setSubItemService(SubItemService subItemService) {
		this.subItemService = subItemService;
	}
	
	public String execute() throws Exception {
		Page zPage = new Page();			//���÷�ҳ��Ϣ
		zPage.setCurrentPage(currentPage);	//���õ�ǰҳ
		zPage.setEveryPage(10);				//����ÿҳ��ʾ
		subItemName = subItemService.findSubItemByID(subItemID).getSubItemName();	//��ȡ����Ŀ����
		Result result = topicService.findTopicBySubItemID(subItemID,zPage);	//��ȡ��ѯ���
		page = result.getPage();		//��ȡ��ҳ��Ϣ
		allTopic = result.getList();	//��ȡ�����б�
		return SUCCESS;
	}
}
