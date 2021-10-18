package fx_orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {
	// 지정한 기간의 주문조회
	public List<Integer> getTermOrderids(Timestamp a, Timestamp b) throws SQLException{
		
		List<Integer> data = new ArrayList<>();
		Connection conn = ConnectionFactory.create();
		String sql = " SELECT ORDERID FROM ORDERS "
				+ " WHERE ORDERDATE BETWEEN ? AND ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setTimestamp(1, a);
		pstmt.setTimestamp(2, b);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			data.add(rs.getInt("orderid"));
		}
		conn.close();
		return data;
	}
	// 판매 목록 전부 조회 (고객이름, 책이름, 정가, 판매가격, 할인액 모두 표기)
	public List<Map<String,String>> getSaleList() throws SQLException {
		List<Map<String,String>> data = new ArrayList<>();
		String sql = "SELECT CUSTOMER.name 고객이름, BOOK.bookname 책이름, BOOK.price 정가,ORDERS.saleprice 판매가격, (BOOK.price-ORDERS.saleprice) 할인액 \r\n"
				+ "FROM CUSTOMER, BOOK, ORDERS \r\n"
				+ "WHERE orders.custid = customer.custid \r\n"
				+ "AND orders.bookid = book.bookid ";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		while(rs.next()) {
			Map<String,String> map = new HashMap();
			for(int i=0; i<rsmd.getColumnCount(); i++) {
				map.put(rsmd.getColumnName(i+1), rs.getString(i+1));
			}
			data.add(map);
		}
		conn.close();
		return data;
	}
	// 지목한 고객(custid)의 주문한 도서 목록얻기
	public List<Map<String,String>> getList() throws SQLException {
		List<Map<String,String>> data = new ArrayList<>();
		String sql = "SELECT CUSTOMER.name 고객이름, BOOK.bookname 책이름 \r\n"
				+ "FROM Customer, Orders, Book  \r\n"
				+ "WHERE Customer.custid = Orders.custid \r\n"
				+ "AND Orders.bookid = Book.bookid \r\n"
				+ "AND customer.custid LIKE '1' ";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		while(rs.next()) {
			Map<String,String> map = new HashMap();
			for(int i=0; i<rsmd.getColumnCount(); i++) {
				map.put(rsmd.getColumnName(i+1), rs.getString(i+1));
			}
			data.add(map);
		}
		conn.close();
		return data;
	}
	// 지정한 가격 이상의 도서를 구매한 고객이름과 도서이름을 구하는 서비스
	public List<Map<String,String>> getPrice() throws SQLException {
		List<Map<String,String>> data = new ArrayList<>();
		String sql = "SELECT CUSTOMER.name 고객이름, BOOK.bookname 책이름, ORDERS.saleprice 판매가격 \r\n"
				+ "FROM Customer, Orders, Book \r\n"
				+ "WHERE Customer.custid = Orders.custid \r\n"
				+ "AND Orders.bookid = Book.bookid \r\n"
				+ "AND price >= 15000 ";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		while(rs.next()) {
			Map<String,String> map = new HashMap();
			for(int i=0; i<rsmd.getColumnCount(); i++) {
				map.put(rsmd.getColumnName(i+1), rs.getString(i+1));
			}
			data.add(map);
		}
		conn.close();
		return data;
	}
	// 고객별로 구매한 도서의 총액을 얻기
	public List<Map<String,String>> getSum() throws SQLException {
		List<Map<String,String>> data = new ArrayList<>();
		String sql = "SELECT CUSTOMER.name 고객이름, SUM(saleprice)  AS 총구매액 \r\n"
				+ "FROM Orders, Customer \r\n"
				+ "WHERE Orders.custid = Customer.custid \r\n"
				+ "GROUP BY name ";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		while(rs.next()) {
			Map<String,String> map = new HashMap();
			for(int i=0; i<rsmd.getColumnCount(); i++) {
				map.put(rsmd.getColumnName(i+1), rs.getString(i+1));
			}
			data.add(map);
		}
		conn.close();
		return data;
	}
	
	public static void main(String[] args) {
		OrderService service = new OrderService();
		service.test();
	}
	
	public void test () {
//		try {
//			Timestamp a = new Timestamp(114,01,01,00,00,00,00);
//			Timestamp b = new Timestamp(120,12,31,00,00,00,00);
//			List<Integer> list = getTermOrderids(a,b);
//			System.out.println(list);
//			OrderDAO dao = new OrderDAO();
//			for( int x:list) {
//				System.out.println(x);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	try {
//		List<Map<String,String>> data = getSaleList();
//		for(Map<String,String> x:data) {
//			System.out.println(x);
//		}
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	}
//	try {
//		List<Map<String,String>> data = getList();
//		for(Map<String,String> x:data) {
//			System.out.println(x);
//		}
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	}
//	try {
//		List<Map<String,String>> data = getPrice();
//		for(Map<String,String> x:data) {
//			System.out.println(x);
//		}
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	}
	try {
		List<Map<String,String>> data = getSum();
		for(Map<String,String> x:data) {
			System.out.println(x);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}