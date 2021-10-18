package jdbc_roll_allocation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MadangService {

	public List<Map<String, Object>> orderDetail() throws SQLException {
		List<Map<String, Object>> data = new ArrayList<>();
		Connection conn = ConnectionFactory.create();
		String sql = " SELECT ORDERS.ORDERDATE, CUSTOMER.NAME, BOOK.BOOKNAME, ORDERS.SALEPRICE "
				+ "FROM ORDERS, CUSTOMER, BOOK WHERE ORDERS.CUSTID = CUSTOMER.CUSTID "
				+ "AND ORDERS.BOOKID = BOOK.BOOKID ORDER BY ORDERS.ORDERDATE ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Map<String, Object> mapData = new HashMap<>();
			mapData.put("일자", rs.getTimestamp(1));
			mapData.put("구매자", rs.getString(2));
			mapData.put("도서명", rs.getString(3));
			mapData.put("판매가격", rs.getInt(4));
			data.add(mapData);
		}
		conn.close();
		return data;
	}
	public static void main(String[] args) {
		try {
			List<Map<String, Object>> data = new MadangService().orderDetail();
			for(Map<String, Object> x:data) {
				System.out.print(x.get("일자")+"\t");
				System.out.print(x.get("구매자")+"\t");
				System.out.print(x.get("도서명")+"\t");
				System.out.print(x.get("판매가격")+"\n");
			}
//			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
