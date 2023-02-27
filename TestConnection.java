package test.db;

import java.sql.Connection;

import com.neuq.db.DBUtil;
/**
 * ��������Զ�����ݿ������Ƿ�����
 * @author chaizhi
 *
 */
public class TestConnection {
public static void main(String[] args) {
	Connection con=DBUtil.getConnection();
	System.out.println(con.toString());
}
}
