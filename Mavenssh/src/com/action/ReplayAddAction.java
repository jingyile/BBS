package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Replay;
import com.po.User;
import com.service.ReplayService;

import java.util.Date;

public class ReplayAddAction extends ActionSupport {
	private ReplayService replayService;	//�ظ�ҵ��ӿ�����
	private int topidID;			//��������ID
	private String content;		//�ظ�����
	private String username;		//����ظ��û�

	public void setReplayService(ReplayService replayService) {
		this.replayService = replayService;
	}

	public int getTopidID() {
		return topidID;
	}

	public void setTopidID(int topidID) {
		this.topidID = topidID;
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

	public String execute() throws Exception {
		Replay replay = new Replay();		//�����ظ�����
		replay.setTopicID(topidID);			//������������ID
		replay.setContent(content);			//���ûظ�����
		replay.setDate(new Date());			//���ûظ�ʱ��
		User user = new User();				//�����û�
		user.setUsername(username);			//�����û���
		replay.setUser(user);				//���÷�����
		if(replayService.addReplay(replay)){	//���ӻظ�
			this.addActionMessage("����ظ��ɹ�!");
		}else{
			this.addActionMessage("����ظ�ʧ��!");
		}
		return SUCCESS;
	}
}
