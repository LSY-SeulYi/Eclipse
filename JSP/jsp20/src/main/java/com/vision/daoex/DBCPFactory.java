package com.vision.daoex;
// DataBase Connection Pool

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBCPFactory {

	public static Connection getInstance() {
		Connection conn = null;
		try {
			Context context = new InitialContext();
			DataSource dataSource = (DataSource)context.lookup(
					"java:comp/env/jdbc/Oracle11g"
					);
			conn = dataSource.getConnection(); // ����ġ�� ������� Ŀ�ؼ� ��ü
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
