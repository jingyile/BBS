package com.dao;

import com.po.Topic;
import com.util.Page;

import java.util.List;

public interface TopicDAO {
	public void saveTopic(Topic topic);//��������
	public Topic queryTopicByID(int topicID);//����ID��������
	public List<Topic> queryTopicBySubItemID(int subItemID, Page page);//��������ĿID��ҳ��������
	public int queryTopicCount(int subItemID);//��ѯ����Ŀ��������
	public void updateTopic(Topic topic);//��������
}
