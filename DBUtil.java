package com.neuq.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ���ݿ������࣬�����ļ�Ϊ��db.properties��
 *
 */
public class DBUtil {
	private static Properties prt = null;
	private static String driver = null;
	private static String url = null;
	private static String user = null;
	private static String pwd = null;
	
	static Connection con = null;
    static PreparedStatement pr = null;
	static ResultSet rs = null;
	
//	static {
//	
//		try {
//			prt = new Properties();
//			InputStream in = DBUtil.class.getClassLoader().getResourceAsStream("com/neuq/db/db.properties");
//            prt.load(in);
//			driver = prt.getProperty("driver");
//			url = prt.getProperty("url");
//			user = prt.getProperty("user");
//			pwd = prt.getProperty("pwd");
//			Class.forName(driver);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}

	public static Connection getConnection() {
		try {
			prt = new Properties();
			InputStream in = DBUtil.class.getClassLoader().getResourceAsStream("com/neuq/db/db.properties");
            prt.load(in);
			driver = prt.getProperty("driver");
			url = prt.getProperty("url");
			user = prt.getProperty("user");
			pwd = prt.getProperty("pwd");
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return con;
	}

	public static void CloseConnection(ResultSet rs, PreparedStatement pr, Connection con) {
		try {
			
			
			if (rs!= null)
				rs.close();
			if (pr != null)
				pr.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//System.out.println("�Ѿ��ر����ݿ�����");
		}
		
	}
	
	

}
