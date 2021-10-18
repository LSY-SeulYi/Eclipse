package ex02_class;
// 학생 객체를 만들어 주는 틀
public class Student {
	// 멤버필드 - 객체의 속성을 담는 전역변수
	private String name;	// private 입력하면 캡슐화
	private int age;
	private String phone;
	
	// 생성메소드가 없다면 기본생성자(메소드)가 있는 것이다.
	// class 만들때 기본 생성자를 그냥 명시적으로 존재시키는게 좋다.
	// 즉, public Student(){} 이 생략된 것임.
	public Student() {}	// 기본 생성자
	public Student(String name, int age, String phone) {	// 일반 생성자
		this.name = name;
		this.age = age;
		this.phone = phone;
	}	
	
	//	멤버 메소드 - 객체의 동작을 실행시키는 것
	//	특히 메소드 중 객체의 속성값을 세팅시키는 것을 setter 하고 함.
	//	객체의 속성값을 읽어 올 수 있게 만든 메소드를 getter 라고 함.
	//	getters와 setters는 접근 제한자가 public.
	public void setName(String name) {	// public void setXx(){this.xx = xx;} => set의 기본 공식
		this.name = name;
	}
	public void setAge(int age) {	
		this.age = age;
	}
	public void setPhone(String phone) {	
		this.phone = phone;
	}
	
	public String getName() {
		return this.name;	// this 안넣어도 됨 (지역변수가 아닌 전역변수의 name으로 리턴시키기 때문)
	}
	public int getAge() {
		return this.age;
	}
	public String getPhone() {
		return this.phone;
	}
	// 객체의 모든 정보를 표현해 주는 방법
	public String toString() {
		return "이름:"+name +","+ "나이:"+age + "," + "폰번호:"+phone;
	}
}
