package abstract_ex;
// 추상클래스의의 ~ 자손이 메소드의 내용을 결정해서 사용
public abstract class SuperC {

	public void eat() {
		System.out.println("이로 씹어서 섭취한다.");
	}
//	public void sound(); // 몸통이 없기 때문에 보이드 앞에 abstract를 붙여줘야함(위 클래스 앞에도 abstract 붙여줘야함)
	public abstract void sound();
	
}
