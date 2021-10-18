package chap04;

public class StringEx {

	public static void main(String[] args) {
		// TODO 문자열의 결합시 주의
		System.out.println(3+4+"는 행운의 숫자이다.");
		System.out.println("행운의 숫자는"+3+4+"이다.");	// 괄호안에 숫자 계산 해줘야 함
		System.out.println("행운의 숫자는"+(3+4)+"이다.");
	}

}
