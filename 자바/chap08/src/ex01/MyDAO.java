package ex01;
// DAO => Data Access Object
public interface MyDAO<VO, KEY> {	// generic type => 일반화된 타입, 실제 구현할 때 구체적 타입을 결정
	void insert(VO vo);
	void delete(KEY key);
	void update(VO vo);
	VO[] selectAll();
	
	
}
