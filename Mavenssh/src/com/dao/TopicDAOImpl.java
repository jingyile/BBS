package com.dao;

import com.po.Topic;
import com.util.Page;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class TopicDAOImpl extends HibernateDaoSupport implements TopicDAO{
	public Topic queryTopicByID(int topicID) {	//����ID��ѯ����
		Topic topic = (Topic) getHibernateTemplate().get(Topic.class, topicID);
		return topic;
	}

	public List<Topic> queryTopicBySubItemID(int subItemID, Page page) {	//��ѯ����Ŀ����������
		Session session = getSession();
		Query query = session.createQuery("from Topic where subItemID = :id");	//ִ�в�ѯ
		query.setInteger("id", subItemID);			//����ID����
		query.setFirstResult(page.getBeginIndex());	//���÷�ҳ��Ϣ
		query.setMaxResults(page.getEveryPage());
		return query.list();		//���ز�ѯ���
	}

	public void saveTopic(Topic topic) {		//��������
		getHibernateTemplate().save(topic);
	}

	public int queryTopicCount(int subItemID) {	//��ѯ����Ŀ����������
		List<Topic> topics = (List<Topic>) getHibernateTemplate().find("from Topic where subItemID = ?",subItemID);
		return topics.size();
	}

	public void updateTopic(Topic topic) {			//��������
		getHibernateTemplate().update(topic);
	}
	
}
