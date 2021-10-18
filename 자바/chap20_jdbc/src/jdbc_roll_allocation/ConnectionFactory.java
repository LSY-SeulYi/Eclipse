package jdbc_roll_allocation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// jdbc 1,2,4단계 커버 (드라이버 로딩단계, Connection객체생성 단계, 자원반납 단계)
// 싱글톤 패턴 - 오직 하나의 객체만 만들어 주는 클래스 패턴
// 하나의 응용 프로그램에서는 오직 하나의 통로만을 활용하는 것이 이점이 크다.
class ConnectionFactory {
	// synchronized = 여러 사람들이 한꺼번에 들어왔을때 줄을 세우기 위한 것 (싱크로나이즈드블럭=여러사람이동시에왔을때문제가생길수있는블럭)
	private static Connection conn;
	// 예외를 전가시키는 이유 - 해당 예외 발생을 클라이언트가 인식하게끔 
	public synchronized static Connection create() throws SQLException{
		// 1,2 단계
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "madang";
		String password = "madang";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn = DriverManager.getConnection(url,user,password);
		return conn;
	}
	// 4단계
	public static void close() throws SQLException {
		if(conn != null && !conn.isClosed()) {
			conn.close();
		}
	}
}
