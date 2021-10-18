package ex10_vo;

public class VoTest {
	
	public static void main(String[] args) {
		
		MyMember[] members = {
			new MyMember("홍길동",45,"대전","010-111-1111","1234"),
			new MyMember("윤길자",45,"대구","010-222-2222","2345"),
			new MyMember("이기자",34,"부산","010-333-3333","3456"),
			new MyMember("우슬자",33,"울산","010-444-4444","4567"),
			new MyMember("김치국",21,"전주","010-555-5555","5678")
		};
		// 멤버 모두의 리스트 출력
		for(MyMember x:members) {
			System.out.println(x);
		}
	}
}
