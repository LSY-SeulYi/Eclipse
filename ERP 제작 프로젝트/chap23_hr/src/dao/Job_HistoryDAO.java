package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import common.ConnectionFactory;
import vo.Job_History;

public class Job_HistoryDAO implements IDao<Job_History, String> {

	@Override
	public int insert(Job_History vo) throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "INSERT INTO JOB_HISTORY "
				+ "(EMPLOYEE_ID,START_DATE,END_DATE,JOB_ID,DEPARTMENT_ID) "
				+ "VALUES(?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, vo.getEmployee_id());
		pstmt.setDate(2, vo.getStart_date());
		pstmt.setDate(3, vo.getEnd_date());
		pstmt.setString(4, vo.getJob_id());
		pstmt.setInt(5, vo.getDepartment_id());
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
	}
	public Map<String,Object> getKeyMap(String key){
		Map<String,Object> keyMap = new HashMap<>();
		String[] compositeKey = key.split(",");
		int id = Integer.parseInt(compositeKey[0]);
		String[] ymd = compositeKey[1].split("-");
		int year = Integer.parseInt(ymd[0])-1900;
		int month = Integer.parseInt(ymd[1])-1;
		int day = Integer.parseInt(ymd[2]);
		Date startDay = new Date(year,month,day);
		keyMap.put("EMPLOYEE_ID",id);
		keyMap.put("START_DATE", startDay);
		return keyMap;
	}
	@Override
	public int delete(String key) throws SQLException {
		Map<String,Object> keyMap = getKeyMap(key);
		Connection conn = ConnectionFactory.create();
		String sql = "DELETE JOB_HISTORY WHERE EMPLOYEE_ID = ? AND START_DATE = ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, (int) keyMap.get("EMPLOYEE_ID"));
		pstmt.setDate(2, (Date) keyMap.get("START_DATE"));
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
	}

	@Override
	public int update(Job_History vo) throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "UPDATE JOB_HISTORY SET END_DATE=?,JOB_ID=?,DEPARTMENT_ID=? "
				+ "WHERE EMPLOYEE_ID=? AND START_DATE=? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setDate(1, vo.getEnd_date());
		pstmt.setString(2, vo.getJob_id());
		pstmt.setInt(3, vo.getDepartment_id());
		pstmt.setInt(4, vo.getEmployee_id());
		pstmt.setDate(5, vo.getStart_date());
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
	}

	@Override
	public Job_History select(String key) throws SQLException {
		Map<String,Object> keyMap = getKeyMap(key);
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT * FROM JOB_HISTORY WHERE EMPLOYEE_ID=? AND START_DATE=? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, (int) keyMap.get("EMPLOYEE_ID"));
		pstmt.setDate(2, (Date) keyMap.get("START_DATE"));
		ResultSet rs = pstmt.executeQuery();
		Job_History vo = new Job_History();
		while (rs.next()) {
			vo.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			vo.setStart_date(rs.getDate("START_DATE"));
			vo.setEnd_date(rs.getDate("END_DATE"));
			vo.setJob_id(rs.getNString("JOB_ID"));
			vo.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
		}
		conn.close();
		return vo;
	}

	@Override
	public List<Job_History> selectAll() throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT * FROM JOB_HISTORY ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<Job_History> data = new ArrayList<>();
		while (rs.next()) {
			Job_History vo = new Job_History();
			vo.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			vo.setStart_date(rs.getDate("START_DATE"));
			vo.setEnd_date(rs.getDate("END_DATE"));
			vo.setJob_id(rs.getNString("JOB_ID"));
			vo.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			data.add(vo);
		}
		conn.close();
		return data;
	}

	@Override
	public List<Job_History> selectByConditions(String conditions) throws SQLException {
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT * FROM JOB_HISTORY " + conditions;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<Job_History> data = new ArrayList<>();
		while (rs.next()) {
			Job_History vo = new Job_History();
			vo.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			vo.setStart_date(rs.getDate("START_DATE"));
			vo.setEnd_date(rs.getDate("END_DATE"));
			vo.setJob_id(rs.getNString("JOB_ID"));
			vo.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			data.add(vo);
		}
		conn.close();
		return data;
	}

	public long getMax() throws SQLException {
		long max = 0;
		Connection conn = ConnectionFactory.create();
		String sql = "SELECT MAX(EMPLOYEE_ID) FROM JOB_HISTORY ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		max = rs.getLong(1);
		return max;
	}
	
	public int deleteOrphanRecord(int empId) throws SQLException{
		Connection conn = ConnectionFactory.create();
		String sql = " DELETE JOB_HISTORY WHERE EMPLOYEE_ID=? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, empId);
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
		
	}
}
