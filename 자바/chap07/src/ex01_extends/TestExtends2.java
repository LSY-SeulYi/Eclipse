package ex01_extends;
// 조상클래스에는 가능한 한기본 생성자를 두자!

//조상클래스로 선언하고 자손객체를 생성할수 있다!
//이럴 경우 조상에 없는 형질(필드와 메소드)은 사용할 수 없다.
//주의! 이럴 경우라도 오버라이딩 된 메소드가 있다면 자손의 오버라이딩 된 메소드가 실행된다.
public class TestExtends2 {

	public static void main(String[] args) {
		AA a = new AA();
		
		// 선언 : 자손클래스, 생성 : 자손클래스
		BBB b = new BBB(18,"유관순","병천");
		System.out.println(b.addr);
		System.out.println(b.age);
		System.out.println(b.name);
		
		// 선언 : 조상클래스, 생성 : 자손클래스
		AA aa = new BBB(18,"유관순","병천");
		//System.out.println(aa.addr);
		System.out.println(aa.age);
		System.out.println(aa.name);
		aa.speech();
	}

	@Override
	public String toString() {
		return "TestExtends2 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
class AA{
	int age;
	String name;
	public AA() {}
	public AA(int age,String name) {
		this.age = age;
		this.name = name;
	}
	public void speech() {
		System.out.println("유창하다.");
	}
}
class BBB extends AA{
	String addr;
	public BBB() {}
	public BBB(int age,String name,String addr) {
		super(age,name);
		this.addr = addr;
	}
}
