package com.neuq.bean;

import java.io.Serializable;

/**
 * ѧ����
 */
public class Student extends User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String studentclass;
	private int ru=3;
	
	public Student(String username, String psd, String realname, String studentclass) {
		this.username = username;
		this.pwd = psd;
		this.name = realname;
		this.studentclass = studentclass;
		this.ru = 3;
	}
		

	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", pwd=" + pwd + ", name=" + name + ", sex=" + sex
				+ ", studentclass=" + studentclass + ", telephone=" + telephone + ", email=" + email + ", ru=" + ru
				+ "]";
	}


	/**
	 * @param username ѧ���û���
	 * @param pwd ѧ������
	 * @param name ѧ������
	 * @param sex ѧ���Ա�
	 * @param studentclass ѧ�����ڰ༶
	 * @param telephone ѧ���绰
	 * @param email ѧ������
	 * @param ru ����ԱȨ��1����ʦȨ��2��ѧ��3
	 */
	public Student(String username, String pwd, String name, String sex, String studentclass, String telephone,
			String email) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.studentclass = studentclass;
		this.telephone = telephone;
		this.email = email;
		this.ru = 3;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}



	public String getStudentclass() {
		return studentclass;
	}
	public void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
	}
	

}
