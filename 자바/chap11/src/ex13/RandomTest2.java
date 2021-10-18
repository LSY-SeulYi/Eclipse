package ex13;

import java.util.Arrays;
import java.util.Random;
// 로또 당첨 번호 생성
public class RandomTest2 {

	public static void main(String[] args) {
		
	// 로또 복권 사는 사람의 번호
		int[] selectNumber = new int[6];
		Random random = new Random();	// seed값은 그냥 임의로 줘도 됨
		System.out.println("선택번호 : ");
		for(int i=0;i<6;i++) {
			selectNumber[i] = random.nextInt(45)+1;	// 1~45까지의 난수 발생
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
	// 로또 복권 사는 사람의 번호
		int[] winNumber = new int[6];
		random = new Random(5);	// seed값은 그냥 임의로 줘도 됨
		System.out.println("당첨번호 : ");
		for(int i=0;i<6;i++) {
			winNumber[i] = random.nextInt(45)+1;	// 1~45까지의 난수 발생
			System.out.print(winNumber[i]+" ");
		}
		System.out.println();
				
	// 당첨 여부 확인 방법
		Arrays.sort(selectNumber);
		Arrays.sort(winNumber);
		boolean res = Arrays.equals(selectNumber, winNumber);
		if(res) {
			System.out.println("당첨을 축하 합니다~!!");
		}else {
			System.out.println("당첨되지 않았습니다...");
		}
		
	// 로또복권을 몇 장사야 당첨되는지 알아보는 법
		long cnt = 0;
		int[] mylotto = new int[6];
		while(true) {
			cnt++;
			random = new Random();
			for(int i=0;i<6;i++) {
				mylotto[i] = random.nextInt(45)+1;
			}
			Arrays.sort(winNumber);
			Arrays.sort(mylotto);
//			System.out.println(Arrays.toString(mylotto));
			if(Arrays.equals(mylotto, winNumber)) {
				System.out.println(cnt+"만에 당첨 되었습니다;;;");
				break;
			}
		}
	}
}
