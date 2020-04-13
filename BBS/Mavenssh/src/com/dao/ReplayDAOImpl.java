package com.dao;

import com.po.Replay;
import com.po.Topic;
import com.util.Page;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class ReplayDAOImpl extends HibernateDaoSupport implements ReplayDAO {

	public List<Replay> queryReplayByTopicID(int topicID, Page page) {	//��ѯ��������лظ�
		Session session = getSession();
		Query query = session.createQuery("from Replay where topicID = :id");	//ִ�в�ѯ
		query.setInteger("id", topicID);			//��������ID
		query.setFirstResult(page.getBeginIndex());	//���÷�ҳ��Ϣ
		query.setMaxResults(page.getEveryPage());
		return query.list();		//���ز�ѯ���
	}

	public int queryReplayCount(int topicID) {		//��ѯ����ظ���
		List<Topic> topics = (List<Topic>) getHibernateTemplate().find("from Replay where topicID = ?",topicID);
		return topics.size();
	}

	public void saveReplay(Replay replay) {		//����ظ�
		getHibernateTemplate().save(replay);
	}
}
