package jdbc_roll_allocation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO implements IDao<Book, Integer>{

	@Override
	public int insert(Book vo) throws SQLException {
		String sql = "INSERT INTO BOOK(bookid,bookname,publicher,price) "
				+ "VALUES(?,?,?,?)";
		Connection conn = ConnectionFactory.create();	// 커넥션 항상 선언하는건 그때그때닫아주기 위해서(부하를 막아줌)
		// ? 표가 없어도 되는 질의 - 정적인 질의를 사용할 때에는 Statement
		// ? 표가 있는 질의  - 동적인 질의를 사용할 때에는 PreparedStatement 사용
		PreparedStatement pstmt = conn.prepareStatement(sql);	// 질의를 실어 보낼 객체
		
		pstmt.setInt(1,vo.getBookid());
		pstmt.setString(2, vo.getBookname());
		pstmt.setString(3, vo.getPublicher());
		pstmt.setInt(4, vo.getPrice());	// 질의를 실어 보낼 객체 완성
		//////////////////////////////////////////////
		int res = pstmt.executeUpdate();	// 질의 전송, 수행을 못한 경우 -1이 옴
		conn.close();	// 잊지말자!
		return res;
	}

	@Override
	public int delete(Integer key) throws SQLException {
		String sql = "DELETE BOOK WHERE BOOKID = ?";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, key);
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
	}

	@Override
	public int update(Book vo) throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "UPDATE BOOK SET BOOKNAME = ?, PUBLICHER = ?, PRICE = ? "
				+ " WHERE BOOKID = ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getBookname());
		pstmt.setString(2, vo.getPublicher());
		pstmt.setInt(3, vo.getPrice());
		pstmt.setInt(4, vo.getBookid());
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
	}

	@Override	// 자료를 찾을 때 사용
	public Book select(Integer key) throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT * FROM BOOK WHERE BOOKID = ? ";	// * = 전부 다
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, key);
		ResultSet rs = pstmt.executeQuery();	// 여러개의 레코드 정보가 리턴 될 수 있음
		Book vo = new Book();	// 빈껍데기 기본생성자 만듦.
		while(rs.next()) {	// NEXT = 커서 옮기는것
			vo.setBookid(rs.getInt("bookid"));	//1(위치 바뀔수 있어서 이름쓰는게 더 안전)
			vo.setBookname(rs.getNString("bookname"));
			vo.setPublicher(rs.getNString("publicher"));
			vo.setPrice(rs.getInt("price"));
		}
		conn.close();
		return vo;
	}

	@Override
	public List<Book> selectAll() throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT * FROM BOOK ";	// * = 전부 다
		PreparedStatement pstmt = conn.prepareStatement(sql);	// ? 없더라도 쓰면 편함
		ResultSet rs = pstmt.executeQuery();	// 여러개의 레코드 정보가 리턴 될 수 있음
		List<Book> list = new ArrayList<>();
		while(rs.next()) {
			Book vo = new Book();	// 빈껍데기 기본생성자 만듦.
			vo.setBookid(rs.getInt("bookid"));	//1(위치 바뀔수 있어서 이름쓰는게 더 안전)
			vo.setBookname(rs.getNString("bookname"));
			vo.setPublicher(rs.getNString("publicher"));
			vo.setPrice(rs.getInt("price"));
			list.add(vo);
		}
		conn.close();
		return list;
	}

	@Override	// conditions 작성 예 = "WHERE PRICE>7000"
	public List<Book> selectByConditions(String conditions) throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT * FROM BOOK "+conditions;	// 컨디션에 WHERE 포함해야함
		PreparedStatement pstmt = conn.prepareStatement(sql);	// ? 없더라도 쓰면 편함
		ResultSet rs = pstmt.executeQuery();	// 여러개의 레코드 정보가 리턴 될 수 있음
		List<Book> list = new ArrayList<>();
		while(rs.next()) {
			Book vo = new Book();	// 빈껍데기 기본생성자 만듦.
			vo.setBookid(rs.getInt("bookid"));	//1(위치 바뀔수 있어서 이름쓰는게 더 안전)
			vo.setBookname(rs.getNString("bookname"));
			vo.setPublicher(rs.getNString("publicher"));
			vo.setPrice(rs.getInt("price"));
			list.add(vo);
		}
		conn.close();
		return list;
	}

	@Override
	public int getMaxNum() throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT MAX(BOOKID) FROM BOOK ";
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
		String sql = "SELECT MIN(BOOKID) FROM BOOK ";
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
