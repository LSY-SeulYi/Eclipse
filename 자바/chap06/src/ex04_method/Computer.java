package ex04_method;
// 메소드 만드는 방법 연습
public class Computer {
	// 메소드 4가지
	//	1. 매개 변수가 없고 반환값도 없는 것.
	//	2. 매개 변수가 없고 반환값이 있는 것.
	//	3. 매개 변수가 있고 반환값은 없는 것.
	//	4. 매개 변수가 있고 반환값도 있는 것.
	
	// type 1
	public void printLine() {
		System.out.println("===================================================");
	}
	// type 3
	public void printHeadLine(String title) {
		System.out.println(">>> "+title+" <<<");
	}
	// type 2
	public float getPi() {
		return 3.141592f;
	}
	// type 4
	public double add(double a, double b) {
		double sum = a+b;
		return sum;
	}
	// 구구단 출력 메소드 =========================================================
	// type 1로 만들기
	public void dispGugudan() {
		for(int i=2;i<=9;i++) {
			printHeadLine(i+"단");
			for( int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
	}
	// type 2로 만들기
	public String getGugudan() {
		String res = "";
		for(int i=2;i<=9;i++) {
			res += i+"단\n";
			for( int j=1;j<=9;j++) {
				res += i+"*"+j+"="+(i*j);
			}
			res += "\n";
		}
		return res;
	}
	// type 3로 만들기 = 매개 변수가 있고 반환값은 없는 것.
	public void test1Gugudan(String title) {
		for(int i=2;i<=9;i++) {
			title = (i+"단");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
	}
	// type 4로 만들기 = 매개 변수가 있고 반환값도 있는 것.
	public String test2Gugudan(String title1) {
		for(int i=2;i<=9;i++) {
			title1 += i+"단\n";
			for( int j=1;j<=9;j++) {
				title1 += i+"*"+j+"="+(i*j);
			}
			title1 += "\n";
		}
		return title1;
	}
	
	public static void main(String[] args) {
		Computer a = new Computer();
		Computer b = new Computer();
		Computer c = new Computer();
		Computer d = new Computer();
		//a.dispGugudan();
		//b.getGugudan();
		c.test1Gugudan(null);
		//d.test2Gugudan(null);
		//System.out.println(b.getGugudan());
		//System.out.println(d.test2Gugudan(null));
	}
}
