package ex04_method;

public class GugudanTest {
	// 메소드 4가지 -
	// 1. 매개 변수가 없고 반환값도 없는 것
	// 2. 매개 변수가 없고 반환값이 있는 것
	// 3. 매개 변수가 있고 반환값은 없는 것
	// 4. 매개 변수도 있고 반환값도 있는 것

	// type 1
	public void printLine() {
	System.out.println("======================================");
	}

	// type 3
	public void printHeadLine(String title) {
	System.out.println(">>> " + title + " <<<");
	}

	// type2
	public float getPi() {
	return 3.141592f;
	}

	// type4
	public double add(double a, double b) {
	double sum = a + b;
	return sum;
	}

	// ----------------------구구단 출력하는 메소드
	// type 1로 만들기
	public void dispGugudan() {
	for (int i = 2; i <= 9; i++) {
	printHeadLine(i + "단");
	for (int j = 1; j <= 9; j++) {
	System.out.println(i + "*" + j + "=" + (i * j));
	}
	System.out.println();
	}
	}

	// type 2로 만들기 - 매개 변수가 없고 반환값이 있는 것
	public String getGugudan() {
	String res = "";
	for (int i = 2; i <= 9; i++) {
	res += i + "단\n";
	for (int j = 1; j <= 9; j++) {
	res += i + "*" + j + "=" + (i * j) + "\n";
	}
	res += "\n";
	}
	return res;
	}

	// type 3로 만들기
	public void dispGugudan(int dan) {
	System.out.println(dan + "단");
	for (int j = 1; j <= 9; j++) {
	System.out.println(dan + "*" + j + "=" + (dan * j));
	}
	}

	// type 4으로 만들기
	public String getGugudan(int dan) {
	String res = "";

	res += dan + "단\n";
	for (int j = 1; j <= 9; j++) {
	res += dan + "*" + j + "=" + (dan * j) + "\n";
	}
	return res;
	}

	public static void main(String[] args) {
		GugudanTest mycom = new GugudanTest();
	// type1 호출
	mycom.dispGugudan();
	// type2 호출
	System.out.println(mycom.getGugudan());
	// type3 호출
	mycom.dispGugudan(99);
	// type4 호출
	System.out.println(mycom.getGugudan(99));

	}
	}