package com.neuq.dao.I;

import java.util.List;

import com.neuq.bean.Tkt;



/**
 * ��������ݿ�ӿ���
 *
 */
public interface TktInterfaceDao {


	/**
	 * ����һ�������
	 * @param tkt
	 * @return
	 */
	public boolean insert(Tkt tkt);
	
	/**
	 * ɾ��һ�������
	 * @param tkt
	 * @return
	 */
	public boolean delete(Tkt tkt);
	
	/**
	 * �����޸�һ�������
	 * @param tkt
	 * @return
	 */
	public boolean update(Tkt tkt);
	
	/**
	 * ��ѯȫ�������
	 * @param tkt
	 * @return ����⼯��
	 */
	public List<Tkt> select();
	
	/**
	 * ��֪ʶ���ѯ�����
	 * @param questionpoint ֪ʶ��
	 * @return ����⼯��
	 */
	public List<Tkt> select(String questionpoint);
}