package l02_fundamental;

import java.util.function.BiFunction;
import java.util.function.Function;

// 생성자 참조 
// (a,b) ->{return new 클래스(a,b)};
// 클래스 :: new 
public class L11ConstructReferenceExam {

	public static void main(String[] args) {
		
		// 매개변수가 1개인 일반생성자 참조(생성자1부분)
		//Function<String,Member> function1 = 	Member :: new;
		Function<String,Member> function1 = id -> {return new Member(id);};
		Member m1 = function1.apply("hgd");
		m1.setName("홍길동");
		System.out.println(m1);
		
		// 매개변수가 2개인 일반생성자 참조(생성자2부분)
		//BiFunction<String,String,Member> function2 = 	Member :: new;
		BiFunction<String,String,Member> function2 = 	(id,name)->{return new Member(id,name);};
		Member m2 = function2.apply("hgd", "홍길동");
		System.out.println(m2);
		
	}
	static class Member{
		
		private String id;
		private String name;
		// 생성자 1부분 
		public Member(String id) {
			super();
			this.id = id;
		}
		
		// 생성자 2부분
		public Member(String id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Member [id=" + id + ", name=" + name + "]";
		}
		
	}

}
