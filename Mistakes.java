package com.neuq.bean;

import java.io.Serializable;

/**
 * ���⼯��
 */
public class Mistakes implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String username;
	private int questiontype;
	private int questionid;
	
	
	public Mistakes() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	
	/**
	 * @param username ѧ���û���
	 * @param questiontype ��Ŀ���ͣ�ѡ���⡢����⡢����⣩
	 * @param questionid ����ID
	 */
	public Mistakes(String username, int questiontype, int questionid) {
		super();
		this.username = username;
		this.questiontype = questiontype;
		this.questionid = questionid;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getQuestiontype() {
		return questiontype;
	}
	public void setQuestiontype(int questiontype) {
		this.questiontype = questiontype;
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	
	
}
