package jdbc_roll_allocation;

import java.sql.SQLException;
import java.util.List;

// 인터페이스다오 - 사용법 통일 (다양한 Entity를 다루지만)
public interface IDao<T,K> {	// T = 사용할 vo타입, K = Key타입 (프라이머리키와연관)
	
	// CRUD 종류별로 추상메소드를 만든다.
	public int insert(T vo) throws SQLException;	// int = 자료 들어가면 1개 들어갔을때 1개, 2개면 2개 이런식으로 숫자 표기해줌
	public int delete(K key) throws SQLException;
	public int update(T vo) throws SQLException;	// 수정
	public T select(K key) throws SQLException;	// 검색
	public List<T> selectAll() throws SQLException;
	public List<T> selectByConditions(String conditions) throws SQLException;	// String타입을 조건으로 넣어서 리스트 검색
	public int getMaxNum() throws SQLException;
	public int getMinNum() throws SQLException;
}
