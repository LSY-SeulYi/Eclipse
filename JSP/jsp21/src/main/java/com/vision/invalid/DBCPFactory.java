package com.vision.invalid;
import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

// DataBase Connection Pool 
public class DBCPFactory {

	public static Connection getInstance() {
		Connection conn = null;
		try {
			Context context = new InitialContext();
			DataSource dataSource = (DataSource)context.lookup(
				"java:comp/env/jdbc/Oracle11g"	
				);
			conn = dataSource.getConnection();//����ġ�� ������� ���ؼǰ�ü
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
