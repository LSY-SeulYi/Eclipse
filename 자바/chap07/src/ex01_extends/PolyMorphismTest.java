package ex01_extends;

public class PolyMorphismTest {

	public static void main(String[] args) {
		AA[] children = {
			new BBB(18,"유관순","병천"),
			new BBB(23,"유시완","상주"),
			new BBB(45,"유시덕","서울"),
			new BBB(57,"유시민","경주"),
			new AA(78,"홍경래")
		};
		for(AA x:children) {
			묘사참석(x);
		}
		
	}
	// 다양한 형질 (제한: 조상이 같거나, 인터페이스가 같아야 한다.)을 사용할 수 있다.
	// 이걸 폴리 모피즘 이라고 함.
	public static void 묘사참석(AA aa) {
		System.out.println("묘사에 "+aa.name+"이 참석했습니다.");
	}
}
