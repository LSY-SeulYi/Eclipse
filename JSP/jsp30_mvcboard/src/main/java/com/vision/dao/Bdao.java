package com.vision.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.vision.common.DBCPFactory;
import com.vision.dto.BDto;

public class Bdao {
//  �Խñ� ���
//	�Խñ� ���
//	�Խñ� �󼼺�
//	�Խñ� ����(�ڽ��� �͸�)
//	�Խñ� ����(�ڽ��� �͸�)
//	�Խñ� �ȿ� ��� �ޱ�
//	�Խñ� �ȿ� ��� ����
//	�Խñ� �ȿ� ��� ����(��������)
//	�Խñ� ��ȸ�� ����(��Ʈ��)
	
//  ó�� �Խñ� ���
	public void write(String bname, String btitle, String bcontent) {
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		// ��Ʈ���� ������ڴ� �ڵ����� �� (��� ����� ����Ʈ ������ 0�� sysdata�� ��)
		String sql = "INSERT INTO MVC_BOARD (BID,BNAME,BTITLE,BCONTENT,BGROUP,BSTEP,BINDENT) VALUES (MVC_BOARD_SEQ.NEXTVAL,?,?,?,MVC_BOARD_SEQ.CURRVAL,0,0)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bname);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			int res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
//	�Խñ� ���
	public ArrayList<BDto> list(){
		ArrayList<BDto> list = new ArrayList();
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// ���������� �ԽõǴ� ������ ��� (�ֱٰź��� ������ ���ź��� ������) -> ������ ��������, �Խñ��� ������������ ����
		String sql = "SELECT * FROM MVC_BOARD ORDER BY BGROUP DESC,BSTEP ASC";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int bid = rs.getInt("BID");
				String bname = rs.getString("BNAME");
				String btitle = rs.getString("BTITLE");
				String bcontent = rs.getString("BCONTENT");
				Timestamp bdate = rs.getTimestamp("BDATE");
				int bhit = rs.getInt("BHIT");
				int bgroup = rs.getInt("BGROUP");
				int bstep = rs.getInt("BSTEP");
				int bindent = rs.getInt("BINDENT");
				// �����̳� �ɷ������ϴ� ���� �Ҷ��� �Ʒ��� ������ ����� �� ����. �׷����� ���͸� ���ؼ� ���
				BDto dto = new BDto(bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent);
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null && !rs.isClosed()) rs.close();
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		return list;
	}
	
//	�Խñ� �󼼺�
	public BDto contentView(String strId) {
	// ��ȸ���� �����ϱ�
		upHit(strId);
		BDto dto = null;
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MVC_BOARD WHERE BID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int bid = rs.getInt("BID");
				String bname = rs.getString("BNAME");
				String btitle = rs.getString("BTITLE");
				String bcontent = rs.getString("BCONTENT");
				Timestamp bdate = rs.getTimestamp("BDATE");
				int bhit = rs.getInt("BHIT");
				int bgroup = rs.getInt("BGROUP");
				int bstep = rs.getInt("BSTEP");
				int bindent = rs.getInt("BINDENT");
				dto = new BDto(bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null && !rs.isClosed()) rs.close();
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		return dto;
	}
	// ��ȸ�� ����
	private void upHit(String strId) {
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		// ��Ʈ���� ������ڴ� �ڵ����� �� (��� ����� ����Ʈ ������ 0�� sysdata�� ��)
		String sql = "UPDATE MVC_BOARD SET BHIT = BHIT+1 WHERE BID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strId);
			int res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
	
//	�Խñ� ����(�ڽ��� �͸�)
	public void modify(String bid, String bname, String btitle, String bcontent) {
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		String sql = "UPDATE MVC_BOARD SET BNAME =?, BTITLE =?, BCONTENT =? WHERE BID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bname);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			pstmt.setString(4, bid);
			int res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
	
//	�Խñ� ����(�ڽ��� �͸�)
	public void delete(String bid) {
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM MVC_BOARD WHERE BID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bid);
			int res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
	
//	�Խñ� �ȿ� ��� �ޱ� (���۰� ��۵���� ���̰� �ִ� - ��ȸ���� ��� ��¥�� �ڵ����� ��)
	public void reply(String bid, String bname, String btitle, String bcontent, String bgroup, String bstep, String bindent) {
		// �� ��۰� ���� �׷��� ����߿��� bstep�� �� ����� bstep���� ū ����� 1�� �������� ���´�. �׷��� �� ����� ���� �տ� ������ ��.
		replyShape(bgroup,bstep);
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO MVC_BOARD (BID,BNAME,BTITLE,BCONTENT,BGROUP,BSTEP,BINDENT) VALUES (MVC_BOARD_SEQ.NEXTVAL,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bname);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			pstmt.setInt(4, Integer.parseInt(bgroup));
			pstmt.setInt(5, Integer.parseInt(bstep)+1);
			pstmt.setInt(6, Integer.parseInt(bindent)+1);
			int res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
	
//	�Խñ� �ȿ� ��� ����
	public BDto reply_view(String strId) {
		upHit(strId);
		BDto dto = null;
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MVC_BOARD WHERE BID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int bid = rs.getInt("BID");
				String bname = rs.getString("BNAME");
				String btitle = rs.getString("BTITLE");
				String bcontent = rs.getString("BCONTENT");
				Timestamp bdate = rs.getTimestamp("BDATE");
				int bhit = rs.getInt("BHIT");
				int bgroup = rs.getInt("BGROUP");
				int bstep = rs.getInt("BSTEP");
				int bindent = rs.getInt("BINDENT");
				dto = new BDto(bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null && !rs.isClosed()) rs.close();
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
			return dto;
		}
	
//	�Խñ� �ȿ� ��� ����(��������)
	private void replyShape(String bgroup, String bstep) {
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		String sql = "UPDATE MVC_BOARD SET BSTEP = BSTEP+1 WHERE BGROUP = ? AND BSTEP > ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(bgroup));
			pstmt.setInt(2, Integer.parseInt(bstep));
			int res = pstmt.executeUpdate();
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		}
}
