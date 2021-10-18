package ex05;

import java.util.Objects;

public class HashCodeTest {

	public static void main(String[] args) {
		
		Student st1 = new Student(1,"홍경래");
		Student st2 = new Student(1,"홍경래");
		
		System.out.println(st1 == st2);
		System.out.println(st1.equals(st2));
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
	}
	static class Student {
		
		int sno;
		String name;
		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Student(int sno, String name) {
			super();
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno,name);	// return Objects.hash => 해시값을 나열해주는 메소드
		}
		
	}
}
