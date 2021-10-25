package com.vision.front;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vision.common.DBCPFactory;

// �̱��� �������� ������
// ���̺� �ϳ��� �ϳ��� �ٿ��� �ʿ�
// ���񽺴� ���� ���񽺸� �ϳ��� �ٿ��� �����ؼ� ��
public class MemberDAO {
//	�̱��� ����� �ڵ�
	private static MemberDAO instance = new MemberDAO();
	private MemberDAO() {} // �ܺο��� ��ü�� ���� ������ ���ϰ� ���Ƶ�
	public static MemberDAO getInstance() {
		return instance;
	}
//	CRUD ���� �޼ҵ� �ڵ�
//	ȸ�� ��� -> ��ȿ�� ���̵����� üũ -> �α��� ���� üũ -> ���̵�� ���� (�ѻ�� �ڷ� ����ȹ��) -> � ����� ������ ���� -> ���Ե� ��� ȸ�� ������ ���
//	1. ��ȿ�� ���̵����� üũ
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
				// ����ϴ� ���̵� �ִٸ� ������ ���� �۾�
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
	
//	2. ȸ�����
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

//	3. �α������� üũ
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
					res = -1; // �ڷ�, �α��� ���̵� ��ϵǾ� ���� ���� ���
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
	
//	4. ���̵�� ���� (�� ����� ���� ȹ��)
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

//	5. � ����� ������ ����
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
	
//	6. ���Ե� ��� ȸ�� ������ ���
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
	
//	Connaction ��ü ��� ==> ������ Ŭ������ ��ü (DBCPFactry)
	
}
