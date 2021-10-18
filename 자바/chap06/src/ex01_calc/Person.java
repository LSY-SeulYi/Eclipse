package ex01_calc;

public class Person {
	private String name;	// 캡슐화(encapsulation)
	private int age;	// 캡슐화(encapsulation)
	
	// 개방
	public void setName(String name) {
		if(name.length()>5) {
			System.out.println("이름이 너무 길어요!");
			return;	// 메소드를 종료하는 의미
		}
		this.name = name;
		System.out.println("이름 : "+name);
	}
	// 개방
	public void setAge(int age) {
		if(age>120) {
			System.out.println("나이를 점검하세요!");
			return;	// 메소드를 종료하는 의미
		}
		this.age = age;
		System.out.println("나이 : "+age);
		
	}
	// 개방
	public void calculate(double a, double b) {	// 계산하는 기능을 갖고 있는 사람
		Calc calc = new Calc();
		System.out.println(calc.add(a, b));
		System.out.println(calc.sub(a, b));
		System.out.println(calc.mul(a, b));
		System.out.println(calc.div(a, b));
	}

}
