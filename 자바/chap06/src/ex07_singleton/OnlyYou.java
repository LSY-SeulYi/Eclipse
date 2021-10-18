package ex07_singleton;
// 싱글톤 클래스 - 오로지 하나밖에 없는 객체를 보장해 주는 클래스
// 3가지 룰
	// 1. 생성 메소드를 private으로 제한
	// 2. 싱글톤 객체를 선언 private으로 제한
	// 3. 싱글톤을 가져갈 메소드를 public으로 오픈
public class OnlyYou {
	private OnlyYou() {}
	private static OnlyYou me = new OnlyYou();
	public static OnlyYou getInstance() {
		return me;
	}
}
