package ex04_method;

public class OverLoadingTest {

	public void add(int...a ) {	// ...은 알아서 보내고 싶은 만큼 보내라는 뜻.(가변형 인수)
		int sum = 0;
		for(int x:a) {
			sum += x;
		}
		System.out.println("합계 : "+sum);
	}
	public void add(String...a ) {
		String res = "";
		for(String x:a) {
			res += x;
		}
		System.out.println(res);
	}
	//public void add(int...b ) {}
	public void add(int a, int b ) {}
	public float add(int a, float b ) {
		return a+b;
	}
	public float add(float a, float b) {
		return a+b;
	}
	public void add(int a, int b ,int c) {
		System.out.println("합계 : "+(a+b+c));
	}
	public static void main(String[] args) {
		OverLoadingTest obj = new OverLoadingTest();
		obj.add(1,2,3,4,5,6,7,8,9,10);
		obj.add("청산은","나를보고","말없이","살라하네");
		System.out.println(obj.add(100, 3.14f));
		System.out.println(obj.add(3.14f, 6.10f));
		obj.add(1, 2, 3);
	}
}
