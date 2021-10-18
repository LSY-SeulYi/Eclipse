package jdbc_hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleCostomerTest {

	public static void main (String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 확인해 주세요~~!!");
//			e.printStackTrace();
			System.exit(0);
		}
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE",	// = url "jdbc:oracle:thin@127.0.0.1:1521:XE", = 이렇게 적어도 됨.
						"madang",	// ID = USER
						"madang"	// password
						);
		} catch (SQLException e) {
			System.out.println("url, id, password를 확인해 보세요~~");
//			e.printStackTrace();
			System.exit(0);
		}
		
		try {
			String sql = "SELECT * FROM CUSTOMER";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int custid = rs.getInt(1);
				String name = rs.getString(2);
				String adress = rs.getString(3);
				String phone = rs.getString(4);
				System.out.println(custid+"번 이름 : "+name+", 주소 : "+adress+", 폰번호 : "+phone);
			}
		} catch (SQLException e) {
			System.err.println("데이터 베이스 확인 바랍니다~");
//			e.printStackTrace();
			System.exit(0);
		}
		try {
			if(conn != null && !conn.isClosed() ) conn.close();
		} catch (SQLException e) {
			System.err.println("4단계 에러 발생!");
			e.printStackTrace();
		}
	}
}
