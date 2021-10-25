package com.vision.front;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vision.common.DBCPFactory;

// 싱글톤 패턴으로 디자인
// 테이블 하나당 하나의 다오가 필요
// 서비스는 여러 서비스를 하나의 다오에 연결해서 씀
public class MemberDAO {
//	싱글톤 만들기 코딩
	private static MemberDAO instance = new MemberDAO();
	private MemberDAO() {} // 외부에서 객체를 직접 만들지 못하게 막아둠
	public static MemberDAO getInstance() {
		return instance;
	}
//	CRUD 관련 메소드 코딩
//	회원 등록 -> 유효한 아이디인지 체크 -> 로그인 정보 체크 -> 아이디로 색인 (한사람 자료 정보획득) -> 어떤 사람의 정보를 수정 -> 가입된 모든 회원 정보를 얻기
//	1. 유효한 아이디인지 체크
	public int confirmId(String id) {
		int res = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT ID FROM MYMEMBER WHERE ID = ?";
		
		try {
			conn = DBCPFactory.getInstance();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				// 사용하는 아이디가 있다면 안으로 들어와 작업
				res = 1;
			}else {
				res = 0;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null && !rs.isClosed()) rs.close();
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return res;
	}
	
//	2. 회원등록
	public int insertMember(MemberDTO dto) {
		int res = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO MYMEMBER (ID,PW,NAME,EMAIL,RDATE,ADDRESS) VALUES (?,?,?,?,?,?)";
		try {
			conn = DBCPFactory.getInstance();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getEmail());
			pstmt.setTimestamp(5, dto.getRdate());
			pstmt.setString(6, dto.getAddress());
			res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return res;
	}

//	3. 로그인정보 체크
	public int userCheck(String id,String pw) {
		int res = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT PW FROM MYMEMBER WHERE ID = ?";
		try {
			conn = DBCPFactory.getInstance();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(pw.equals(rs.getString("pw"))) {
					res = 1;
				}else {
					res = -1; // 자료, 로그인 아이디가 등록되어 있지 않은 경우
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null && !rs.isClosed()) rs.close();
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return res;
	}
	
//	4. 아이디로 색인 (한 사람의 정보 획득)
	public MemberDTO getMember(String id) {
		MemberDTO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MYMEMBER WHERE ID = ?";
		try {
			conn = DBCPFactory.getInstance();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new MemberDTO();
				dto.setId(rs.getString("ID"));
				dto.setPw(rs.getString("PW"));
				dto.setName(rs.getString("NAME"));
				dto.setEmail(rs.getString("EMAIL"));
				dto.setRdate(rs.getTimestamp("RDATE"));
				dto.setAddress(rs.getString("ADDRESS"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null && !rs.isClosed()) rs.close();
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}

//	5. 어떤 사람의 정보를 수정
	public int updateMember(MemberDTO dto) {
		int res = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE MYMEMBER SET PW =?, NAME =?, EMAIL =?, ADDRESS =? WHERE ID =?";
		try {
			conn = DBCPFactory.getInstance();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getPw());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getAddress());
			pstmt.setString(5, dto.getId());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return res;
	}
	
//	6. 가입된 모든 회원 정보를 얻기
	public ArrayList<MemberDTO> selectAll() {
		ArrayList<MemberDTO> data = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MYMEMBER";
		try {
			conn = DBCPFactory.getInstance();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("ID"));
				dto.setPw(rs.getString("PW"));
				dto.setName(rs.getString("NAME"));
				dto.setEmail(rs.getString("EMAIL"));
				dto.setRdate(rs.getTimestamp("RDATE"));
				dto.setAddress(rs.getString("ADDRESS"));
				data.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null && !rs.isClosed()) rs.close();
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return data;
	}
	
//	Connaction 객체 얻기 ==> 별도의 클래스로 대체 (DBCPFactry)
	
}
