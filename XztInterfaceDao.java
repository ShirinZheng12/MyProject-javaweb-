package com.neuq.dao.I;

import java.util.List;

import com.neuq.bean.Xzt;



/**
 * ѡ�������ݿ�ӿ���
 *
 */
public interface XztInterfaceDao {


	/**
	 * ����һ��ѡ����
	 * @param xzt
	 * @return
	 */
	public boolean insert(Xzt xzt);
	
	/**
	 * ɾ��һ��ѡ����
	 * @param xzt
	 * @return
	 */
	public boolean delete(Xzt xzt);
	
	/**
	 * �����޸�һ��ѡ����
	 * @param xzt
	 * @return
	 */
	public boolean update(Xzt xzt);
	
	/**
	 * ��ѯȫ��ѡ����
	 * @param ��
	 * @return ѡ���⼯��
	 */
	public List<Xzt> select();
	
	/**
	 * ��֪ʶ���ѯѡ����
	 * @param questionpoint ֪ʶ��
	 * @return ѡ���⼯��
	 */
	public List<Xzt> select(String questionpoint);
}