package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Replay;
import com.po.Topic;
import com.service.ReplayService;
import com.service.SubItemService;
import com.service.TopicService;
import com.util.Page;
import com.util.Result;

import java.util.List;

public class FindTopicAction extends ActionSupport {
	private int topicID;					//����ID
	private Topic topic;					//����
	private int subItemID;					//����ĿID
	private String subItemName;			//����Ŀ����
	private List<Replay> replays;			//�ظ��б�
	private int currentPage;				//��ǰҳ
	private Page page;						//��ҳ��Ϣ
	private TopicService topicService;		//����ҵ��ӿ�����
	private SubItemService subItemService;	//����Ŀҵ��ӿ�����
	private ReplayService replayService;	//�ظ�ҵ��ӿ�����
	public int getTopicID() {
		return topicID;
	}
	public void setTopicID(int topicID) {
		this.topicID = topicID;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public int getSubItemID() {
		return subItemID;
	}
	public void setSubItemID(int subItemID) {
		this.subItemID = subItemID;
	}
	public String getSubItemName() {
		return subItemName;
	}
	public void setSubItemName(String subItemName) {
		this.subItemName = subItemName;
	}
	public List<Replay> getReplays() {
		return replays;
	}
	public void setReplays(List<Replay> replays) {
		this.replays = replays;
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
	public void setReplayService(ReplayService replayService) {
		this.replayService = replayService;
	}
	public String execute() throws Exception {
		topic = topicService.findTopicByID(topicID);	//���ò�ѯ����ҵ�񷽷�
		topic.setHasread(topic.getHasread() + 1);		//�������ӣ�Ϊ���ӷ�������1
		topicService.updateTopic(topic);				//��������
		subItemName = subItemService.findSubItemByID(subItemID).getSubItemName();	//��ȡ����Ŀ����
		Page zPage = new Page();			//���÷�ҳ��Ϣ
		zPage.setCurrentPage(currentPage);	//���õ�ǰҳ
		zPage.setEveryPage(5);				//����ÿҳ��ʾ�ظ�
		Result result = replayService.findReplayByTopicID(topicID, zPage);	//��ȡ���������лظ�
		page = result.getPage();		//��ȡ��ҳ��Ϣ
		replays = result.getList();		//��ȡ�ظ��б�
		return SUCCESS;
	}
}
