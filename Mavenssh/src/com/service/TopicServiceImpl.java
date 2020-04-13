package com.service;

import com.dao.TopicDAO;
import com.dao.UserDAO;
import com.po.Topic;
import com.po.User;
import com.util.Page;
import com.util.PageUtil;
import com.util.Result;

import java.util.List;

public class TopicServiceImpl implements TopicService {
	private TopicDAO topicDAO;		//����DAO�ӿ�����
	private UserDAO userDAO;		//�û�DAO�ӿ�����
	public void setTopicDAO(TopicDAO topicDAO) {
		this.topicDAO = topicDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public boolean addTopic(Topic topic) {		//��������
		User user = userDAO.queryByUsername(topic.getUser().getUsername());//�����û������Ҹ��û�
			if(user != null){			//���û��Ѿ�����
				user.setIntegral(user.getIntegral() + 5);	//�û����ּ�5
				topic.setUser(user);	//�����û�
				topicDAO.saveTopic(topic);	//��������
				return true;			//����ɹ�
			}
		return false;
	}

	public Topic findTopicByID(int topicID) {	//��ѯָ��ID����
		return topicDAO.queryTopicByID(topicID);
	}

	public Result findTopicBySubItemID(int subItemID,Page page) {	//��ѯ����Ŀ����������
		page = PageUtil.createPage(page, topicDAO.queryTopicCount(subItemID));	//������ҳ����
		List<Topic> topics = topicDAO.queryTopicBySubItemID(subItemID, page);	//ִ�в�ѯ
		Result result = new Result();	//�����������
		result.setPage(page);			//���÷�ҳ��Ϣ
		result.setList(topics);			//���������б���Ϣ
		return result;
	}
	public void updateTopic(Topic topic) {		//��������
		topicDAO.updateTopic(topic);
	}
}
