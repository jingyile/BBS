package com.dao;

import com.po.Replay;
import com.util.Page;

import java.util.List;

public interface ReplayDAO {
	public void saveReplay(Replay replay);//����ظ�
	public List<Replay> queryReplayByTopicID(int topicID, Page page);//��������ID��ҳ���һظ�
	public int queryReplayCount(int topicID);//��ѯ�����»ظ���
}
