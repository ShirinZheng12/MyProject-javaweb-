package com.neuq.bean;

import java.io.Serializable;

/**
 * ��ʦ��
 */
public class Teacher extends User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int ru=2;
	
	public int getRu() {
		return ru;
	}

	public void setRu(int ru) {
		this.ru = ru;
	}

	public Teacher() {
		this.ru = 2;
	}
	
	
	
	
	/**
	 * @param username ��ʦ�û���
	 * @param pwd ��ʦ����
	 * @param name ��ʦ����
	 * @param sex ��ʦ�Ա�
	 * @param telephone ��ʦ�绰
	 * @param email ��ʦ����
	 * @param ru ����ԱȨ��1����ʦȨ��2��ѧ��3
	 */
	public Teacher(String username, String pwd, String name, String sex, String telephone, String email) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.telephone = telephone;
		this.email = email;
		this.ru = 2;
	}

	
	
}
