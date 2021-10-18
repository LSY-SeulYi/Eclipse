package ex13;

import java.util.Random;

public class RandomTest {
// Random 클래스의 활용법 알아보기

	public static void main(String[] args) {
		
		Random rnd = new Random();	// 씨앗이 없는 경우
		Random rnd2 = new Random(5);	// 씨앗이 있음 (5와 같은 값을 seed라고 한다)
		for(int i=0;i<10;i++) {
			System.out.print(rnd.nextInt());
			System.out.print("\t");
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			System.out.print(rnd2.nextInt());
			System.out.print("\t");
		}
	}
}
