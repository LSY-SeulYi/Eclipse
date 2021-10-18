package ex03_overloading;
// 접근 제한자를 생략하면 default 제한자라고 함.(이 패키지 내에서 자유로이 호출 가능)
public class Car {

	String model;
	String color;
	int maxSpeed;
	
	// 생성 메소드의 오버로딩
	public Car() {	// default constructor (기본생성자)
		this("Sonata","yellow",250);
	}
	public Car(String model) {	// (일반생성자)
		this(model,"yellow",250);
	}
	public Car(String model,String color) {	// (일반생성자)
		this.model = model;
		this.color = color;				
		this.maxSpeed = 250;
	}
	public Car(String model,String color,int maxSpeed) {	// (일반생성자)
		this.model = model;
		this.color = color;				
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {
		Car a = new Car();
		System.out.println("모델 : "+a.model);
		System.out.println("색상 : "+a.color);
		System.out.println("속도 : "+a.maxSpeed);
		
		Car b = new Car("Genesis");
		System.out.println("모델 : "+b.model);
		System.out.println("색상 : "+b.color);
		System.out.println("속도 : "+b.maxSpeed);
	}
}
