package com.vision.invalid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactory {
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "ai403";
	private static String pw = "java";
	private static Connection conn;
	static {
		try {
			conn = DriverManager.getConnection(url,user,pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	public static Connection getInstance() {
		return conn;
	}
	
	
	
}
