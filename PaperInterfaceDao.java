package com.neuq.dao.I;

import java.util.List;

import com.neuq.bean.Paper;



/**
 * �Ծ����ݿ�ӿ���
 *
 */
public interface PaperInterfaceDao {


	/**
	 * ����һ���Ծ�
	 * @param paper
	 * @return
	 */
	public boolean insert(Paper paper);
	
	/**
	 * ɾ��һ���Ծ�
	 * @param paper
	 * @return
	 */
	public boolean delete(Paper paper);
	
	/**
	 * �����޸�һ���Ծ�
	 * @param paper
	 * @return
	 */
//	public boolean update(Paper paper);
	
	/**
	 * ��ѯȫ���Ծ�
	 * @param ��
	 * @return  Paper �Ծ�����
	 */
	public List<Paper> select();
	
	/**
	 * ��֪ʶ���ѯ�Ծ�
	 * @param questionpoint
	 * @return  Paper �Ծ�����
	 */
	public List<Paper> select(String questionpoint);
	/**
	 * ֮ǰ�Ѿ������Ŀ���
	 * @param username 
	 * @return
	 */
	public List<Paper> showbeforePaper(String username);
	/**
	 * ��Ҫ���еĿ���
	 * @return
	 */
	public List<Paper> showafterPaper(String username);
	

	
	/**
	 * �����Ծ������ҵ�ǰ��Ӧ���Ծ�����
	 * @param papername
	 * @return  Paper ����
	 */
	public Paper selectInstance(String papername);
     
	 /**
	 * ���ڽ��еĿ���
	 * @return
	 */
	public List<Paper> shownowPaper(String username);

	
	/**
	 * ��ֹ��ǰ����ʱ��bug����ѯ���Կ��Ե��Ծ�ǰ�ж��Ƿ���ڼ�¼
	 * Ϊ�棬���ڼ�¼��Ϊ�٣������ڼ�¼
	 * @param username
	 * @param papername
	 * @return
	 */
	public boolean IsDone(String username, String papername);
}