package ex12;

import java.util.Scanner;

// 0~100 사이의 임의의 숫자 (난수)를 발생시키고 이를 맞추는 게임
public class GuessGame {

	public static void main(String[] args) {
		
		// 만약 로또번호 라면 (int)(Math.random()*45)+1;
		int score = (int)(Math.random()*101)+0;
		int guess = 0;
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			cnt++;
			System.out.print(cnt+" : 추측하는 값 > ");
			guess = scan.nextInt();
			if(score>guess) {
				System.out.println("점수를 올려주세요~!");
			}else if(score<guess) {
				System.out.println("점수를 낮춰주세요~!");
			}else {
				System.out.println("축하합니다! 맞추셨습니다!");
				break;
			}
		}
		System.out.println("수고하셨습니다~! 게임종료~!");
	}
}
