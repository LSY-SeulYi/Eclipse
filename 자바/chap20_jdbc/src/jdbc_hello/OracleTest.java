package jdbc_hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// jdbc - Java DataBase Connectivity
// 4단계로 구분해서 설명할 수 있다.
// (1) db제작사마다 다를 수 있는 디비 연결을 통일된 인터페이스를 구현한 클래스 - 드라이버
// 드라이버를 점검하고, 메모리로 탑재하는 작업
// (2) Connection 객체 획득 단계
// (3) Connection 객체를 통하여 디비에 접근하고 CRUD 작업
// (4) 활용된 객체를 CLOSE() - 자원반납

public class OracleTest {

	public static void main(String[] args) {
		
		// 1단계 - 드라이브 점검 및 로딩 단계
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버가 없습니다.");
//			e.printStackTrace();
			System.exit(0);
		}
		
		// 2단계 - Connection 객체를 얻는 단계

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE",	// = url "jdbc:oracle:thin@127.0.0.1:1521:XE", = 이렇게 적어도 됨.
					"madang",	// ID = USER
					"madang"	// password
					);
		} catch (SQLException e) {
			System.err.println("2단계 예외(url,user,password 점검 바랍니다.)");
//			e.printStackTrace();
			System.exit(0);
		}
		
		// 3단계 - 활용하는 단계 (CRUD 단계 - 만들고,읽고,올리고,지우고)
		// 보통 DAO(DataBase Access Object-데이터에 접근하는 ) 클래스에서 3단계 담당
		try {
			String sql = "SELECT * FROM BOOK";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			// ------------------------- rs 확인
			while (rs.next()) {	// next 는 커서 나오게 해주는 메소드 - 한 레코드씩 접근해서 자료가 있으면 true를 리턴
				int bookid = rs.getInt("bookid");
				String bookname = rs.getString(2);	// 컬럼순서인데 (1번부터 시작)
				String publicher = rs.getString(3);
				int price = rs.getInt(4);
				System.out.println(bookid+","+bookname+","+publicher+","+price);
//				System.out.printf("%2d,%s,%s,%8d\n",bookid,bookname,publicher,price);
			}
		} catch (SQLException e) {
			System.err.println("3단계(질의 활용) 에러 발생!!");
//			e.printStackTrace();
			System.exit(0);
		}
		
		// 4단계 - 자원반납 단계
		
		try {
			if(conn != null && !conn.isClosed() ) conn.close();
		} catch (SQLException e) {
			System.err.println("4단계 에러 발생!");
			e.printStackTrace();
		}
	}
}
