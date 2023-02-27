package com.neuq.bean;

import java.io.Serializable;

/**
 * ����Ա��
 */
public class Manager extends User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int ru=1;
	
	public int getRu() {
		return ru;
	}

	public void setRu(int ru) {
		this.ru = ru;
	}


	
	public Manager() {
		this.ru = 1;
	}
	
	
	/**
	 * @param managername ����Ա�û���
	 * @param pwd ����Ա����
	 * @param name ����Ա����
	 * @param sex ����Ա�Ա�
	 * @param telephone ����Ա�绰
	 * @param email ����Ա����
	 * @param ru ����ԱȨ��1����ʦȨ��2��ѧ��3
	 */
	public Manager(String username, String pwd, String name, String sex, String telephone, String email) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.telephone = telephone;
		this.email = email;
		this.ru = 1;
	}
	
	
	
}
