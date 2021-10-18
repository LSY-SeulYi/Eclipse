package ex02_class;

public class StudentTest {

	public static void main(String[] args) {
		
		Student a = new Student();
		Student b = new Student();
		a.setName("유관순");
		a.setAge(18);
		a.setPhone("010-3131-3333");
		b.setName("홍길동");
		b.setAge(20);
		b.setPhone("010-4541-4444");
		
		System.out.println(a.hashCode());	// 같은 Student라고 해도 해쉬코드에 저장된 곳이 다름.
		System.out.println(b.hashCode());	// 같은 Student라고 해도 해쉬코드에 저장된 곳이 다름.
		System.out.println(a==b);	// 같은 Student라고 해도 해쉬코드에 저장된 곳이 다름.
		System.out.println(a.equals(b));	// 같은 Student라고 해도 해쉬코드에 저장된 곳이 다름.
		System.out.println("학생 1 : "+a+"\n");
		System.out.println("학생 2 : "+b+"\n");
	}
}
