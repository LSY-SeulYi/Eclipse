package fx_orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdersDAO implements IDao<Orders,Integer>{

	@Override
	public int insert(Orders vo) throws SQLException {
		String sql = " INSERT INTO ORDERS(orderid,custid,bookid,saleprice,orderdate) "
				+ " VALUES(?,?,?,?,?) ";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, vo.getOrderid());
		pstmt.setInt(2, vo.getCustid());
		pstmt.setInt(3, vo.getBookid());
		pstmt.setInt(4, vo.getSaleprice());
		pstmt.setTimestamp(5, vo.getOrderdate());
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
	}

	@Override
	public int delete(Integer key) throws SQLException {
		String sql = " DELETE ORDERS WHERE ORDERID = ? ";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, key);
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
	}

	@Override
	public int update(Orders vo) throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "UPDATE ORDERS SET CUSTID = ?, BOOKID = ?, SALEPRICE = ?, ORDERDATE = ? "
				+ " WHERE ORDERID = ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, vo.getCustid());
		pstmt.setInt(2, vo.getBookid());
		pstmt.setInt(3, vo.getSaleprice());
		pstmt.setTimestamp(4, vo.getOrderdate());
		pstmt.setInt(5, vo.getOrderid());
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
	}

	@Override
	public Orders select(Integer key) throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT * FROM ORDERS WHERE ORDERID = ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, key);
		ResultSet rs = pstmt.executeQuery();
		Orders vo = new Orders();
		while(rs.next()) {
			vo.setOrderid(rs.getInt("orderid"));
			vo.setCustid(rs.getInt("custid"));
			vo.setBookid(rs.getInt("bookid"));
			vo.setSaleprice(rs.getInt("saleprice"));
			vo.setOrderdate(rs.getTimestamp("orderdate"));
		}
		conn.close();
		return vo;
	}

	@Override
	public List<Orders> selectAll() throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT * FROM ORDERS ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<Orders> data = new ArrayList<>();
		while(rs.next()) {
			Orders vo = new Orders();
			vo.setOrderid(rs.getInt("orderid"));
			vo.setCustid(rs.getInt("custid"));
			vo.setBookid(rs.getInt("bookid"));
			vo.setSaleprice(rs.getInt("saleprice"));
			vo.setOrderdate(rs.getTimestamp("orderdate"));
			data.add(vo);
		}
		conn.close();
		return data;
	}

	@Override
	public List<Orders> selectByConditions(String conditions) throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT * FROM ORDERS "+conditions;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<Orders> list = new ArrayList<>();
		while(rs.next()) {
			Orders vo = new Orders();
			vo.setOrderid(rs.getInt("orderid"));
			vo.setCustid(rs.getInt("custid"));
			vo.setBookid(rs.getInt("bookid"));
			vo.setSaleprice(rs.getInt("saleprice"));
			vo.setOrderdate(rs.getTimestamp("orderdate"));
			list.add(vo);
		}
		conn.close();
		return list;
	}

	@Override
	public int getMaxNum() throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT MAX(ORDERID) FROM ORDERS ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		int max = 0;
		while (rs.next()) {
			max = rs.getInt(1);
		}
		conn.close();
		return max;
	}

	@Override
	public int getMinNum() throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT MIN(ORDERID) FROM ORDERS ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		int min = 0;
		while (rs.next()) {
			min = rs.getInt(1);
		}
		conn.close();
		return min;
	}
}
