package com.service;

import com.dao.ReplayDAO;
import com.dao.UserDAO;
import com.po.Replay;
import com.po.User;
import com.util.Page;
import com.util.PageUtil;
import com.util.Result;

import java.util.List;

public class ReplayServiceImpl implements ReplayService{
	private ReplayDAO replayDAO;		//�ظ�DAO�ӿ�����
	private UserDAO userDAO;			//�û�DAO�ӿ�����
	public void setReplayDAO(ReplayDAO replayDAO) {
		this.replayDAO = replayDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public boolean addReplay(Replay replay) {		//���ӻظ�
		User user = userDAO.queryByUsername(replay.getUser().getUsername());//�����û������Ҹ��û�
		if(user != null){		//���û��Ѿ�����
			user.setIntegral(user.getIntegral() + 1);	//�û����ּ�1
			replay.setUser(user);	//�����û�
			replayDAO.saveReplay(replay);	//����ظ�
			return true;			//����ɹ�
		}
	return false;
	}

	public Result findReplayByTopicID(int topicID, Page page) {	//��������ID��ѯ�ظ�
		page = PageUtil.createPage(page, replayDAO.queryReplayCount(topicID));	//������ҳ��
		List<Replay> peplays = replayDAO.queryReplayByTopicID(topicID, page);	//��ȡ�ظ��б�
		Result result = new Result();	//������ҳ�������
		result.setPage(page);			//���÷�ҳ��Ϣ
		result.setList(peplays);		//���ûظ��б�
		return result;
	}

	public int findReplayCont(int topicID) {		//��ȡ����Ļظ���
		return replayDAO.queryReplayCount(topicID);
	}
}
