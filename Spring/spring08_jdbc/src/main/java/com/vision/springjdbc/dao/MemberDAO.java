package com.vision.springjdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.vision.springjdbc.dto.MemberDTO;

public class MemberDAO implements IDAO{

	JdbcTemplate template; // 하나의 멤버 필드 생성
	
	public MemberDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public void insert(MemberDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("자료삽입");
		this.template.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "INSERT INTO AIMEMBER (MEMID, MEMNAME, MEMPW) VALUES(?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dto.getMemid());
				pstmt.setString(2, dto.getMemname());
				pstmt.setString(3, dto.getMempw());
				
				return pstmt;
			}
			
		});
	}

	@Override
	public ArrayList<MemberDTO> list() {
		String sql = "SELECT * FROM AIMEMBER ORDER BY MEMNAME ASC ";
		ArrayList<MemberDTO> dtos = (ArrayList<MemberDTO>) template.query(sql, new BeanPropertyRowMapper<MemberDTO>(MemberDTO.class));
		return dtos;
	}

	@Override
	public void delete(final String memId) {
		System.out.println("자료삭제");
		String sql = "DELETE FROM AIMEMBER WHERE MEMID = ? ";
		this.template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, memId);
			}
		});
	}

}
