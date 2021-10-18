package ex01;

public class EqualTest {

	public static void main(String[] args) {
		MyMember name1 = new MyMember("김치국");
		MyMember name2 = new MyMember("김치국");
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		// 다른것으로 나오는 경우
		// hashCode가 틀리게 나오거나
		// hashCode가 같더라도 equals() 결과가 false인 경우
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		// ---------------------------------------------------------------------
		
		Student a = new Student("홍길동",25);
		Student b = new Student("홍길동",25);
		Student c = new Student("유관순",18);
		Student d = new Student("유관순",18);
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(c == d);
		System.out.println(c.equals(d));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
	}
}
