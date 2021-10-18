package fx_orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements IDao<Customer,Integer>{

	@Override
	public int insert(Customer vo) throws SQLException {
		String sql = "INSERT INTO CUSTOMER(custid,name,address,phone) "
				+ "VALUES(?,?,?,?)";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1,vo.getCustid());
		pstmt.setString(2, vo.getName());
		pstmt.setString(3, vo.getAddress());
		pstmt.setString(4, vo.getPhone());
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
	}

	@Override
	public int delete(Integer key) throws SQLException {
		String sql = "DELETE CUSTOMER WHERE CUSTID = ?";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, key);
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
	}

	@Override
	public int update(Customer vo) throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "UPDATE CUSTOMER SET NAME = ?, ADDRESS = ?, PHONE = ? "
				+ " WHERE CUSTID = ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getName());
		pstmt.setString(2, vo.getAddress());
		pstmt.setString(3, vo.getPhone());
		pstmt.setInt(4, vo.getCustid());
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
	}

	@Override
	public Customer select(Integer key) throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT * FROM CUSTOMER WHERE CUSTID = ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, key);
		ResultSet rs = pstmt.executeQuery();
		Customer vo = new Customer();
		while(rs.next()) {
			vo.setCustid(rs.getInt("custid"));
			vo.setName(rs.getNString("name"));
			vo.setAddress(rs.getNString("address"));
			vo.setPhone(rs.getNString("phone"));
		}
		conn.close();
		return vo;
	}

	@Override
	public List<Customer> selectAll() throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT * FROM CUSTOMER ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<Customer> list = new ArrayList<>();
		while(rs.next()) {
			Customer vo = new Customer();
			vo.setCustid(rs.getInt("custid"));
			vo.setName(rs.getNString("name"));
			vo.setAddress(rs.getNString("address"));
			vo.setPhone(rs.getNString("phone"));
			list.add(vo);
		}
		conn.close();
		return list;
	}

	@Override
	public List<Customer> selectByConditions(String conditions) throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT * FROM CUSTOMER "+conditions;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<Customer> list = new ArrayList<>();
		while(rs.next()) {
			Customer vo = new Customer();
			vo.setCustid(rs.getInt("custid"));
			vo.setName(rs.getNString("name"));
			vo.setAddress(rs.getNString("address"));
			vo.setPhone(rs.getNString("phone"));
			list.add(vo);
		}
		conn.close();
		return list;
	}

	@Override
	public int getMaxNum() throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT MAX(CUSTID) FROM CUSTOMER ";
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
		String sql = "SELECT MIN(CUSTID) FROM CUSTOMER ";
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
