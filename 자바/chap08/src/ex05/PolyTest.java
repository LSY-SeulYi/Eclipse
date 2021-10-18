package ex05;
// 폴리모피즘 테스트
public class PolyTest {
	public static void main(String[] args) {
		동창회 x = new 동창회();
		서울대졸업생[] arr = {
				new Student(),
				new Worker(),
				new Profess()
		};
		for(서울대졸업생 s:arr) {
			x.entrance(s);
		}
		
//		Student a = new Student();
//		Worker b = new Worker();
//		서울대졸업생 c = new Profess();
//		동창회 x = new 동창회();
//		x.entrance(a);
//		x.entrance(b);
//		x.entrance(c);
//		서울대졸업생[] arr = {
//				a,b,c
//		};
}
}
