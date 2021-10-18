package ex04_method;
// static - 정적 멤버 만드는 법 - 클래스에만 붙어있는 메모리를 할당받는다.
// 용도 : 객체 생성 없이 사용할때
public class StaticEx {

	public static int cnt;
	public int someValue;
	
	public StaticEx() {
		cnt++;
	}
	public StaticEx(int someValue) {
		this.someValue = someValue;
		cnt++;
	}
	public static int getSerialNo() {
		return cnt;
	}
	public static void main(String[] args) {
	new StaticEx();
	new StaticEx(2323232);
	new StaticEx();
	new StaticEx(56985641);
	System.out.println("현재까지 객체 발생 수 : "+StaticEx.getSerialNo());
	}
}