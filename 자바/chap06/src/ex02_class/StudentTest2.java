package ex02_class;

public class StudentTest2 {

	public static void main(String[] args) {
		
		Student a = new Student("홍길동",25,"010-0000-0000");
		Student b = new Student("유관순",18,"010-1000-1000");
		Student c = new Student("강감찬",35,"010-2000-2000");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		Student[] students = {
			new Student("홍길동",25,"010-0000-0000"),
			new Student("유관순",18,"010-1000-1000"),
			new Student("강감찬",35,"010-2000-2000"),
			new Student("유재석",45,"010-3000-3000"),
			new Student("홍춘이",43,"010-4000-4000"),
			new Student("계월향",19,"010-5000-5000"),
		};
		for(Student x:students) {
			System.out.println(x);
		}
	}
}
