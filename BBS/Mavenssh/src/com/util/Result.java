package com.util;
import java.util.List;

public class Result {
	private Page page;			//��ҳ��Ϣ
	private List list;			//�б����
	public Page getPage() {		//��ȡ��ҳ��Ϣ
		return page;
	}
	public void setPage(Page page) {	//���÷�ҳ��Ϣ
		this.page = page;
	}
	public List getList() {		//��ȡ�б���Ϣ
		return list;
	}
	public void setList(List list) {	//�����б���Ϣ
		this.list = list;
	}
}
