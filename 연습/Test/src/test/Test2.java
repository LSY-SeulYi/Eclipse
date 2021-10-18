package test;

public class Test2 {

	public static void main(String[] args) {
		Test1 a = new Test1("홍길동",45,"대전","010-111-1111","1234",89,77,91,0,0){

		};
		Test1 b = new Test1("윤길자",45,"대구","010-222-2222","2345",92,76,99,0,0){
										
		};
		Test1 c = new Test1("이기자",34,"부산","010-333-3333","3456",88,85,94,0,0){
			
		};
		Test1 d = new Test1("우슬자",33,"울산","010-444-4444","4567",76,89,93,0,0){
			
		};
		Test1 e = new Test1("김치국",21,"전주","010-555-5555","5678",98,79,100,0,0){
			
		};
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}