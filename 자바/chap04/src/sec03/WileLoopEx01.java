package sec03;

import java.util.Scanner;

public class WileLoopEx01 {

	public static void main(String[] args) {
		// TODO While loop문
		Scanner scan = new Scanner(System.in);
		int balance =0;
		while(true) {
			System.out.println("\n1.입금 2.출금 3.잔액 4.종료 >");
			int menu = scan.nextInt();
			int amt = 0;
			switch(menu) {
			case 1:
				System.out.println("입금할 금액 :");
				amt = scan.nextInt();
				balance += amt;
				break;
			case 2:
				System.out.println("출금할 금액 :");
				amt = scan.nextInt();
				balance -= amt;
				break;
			case 3:
				System.out.println("잔액 :"+balance);
				break;
			}
			if(menu==4) break;
		}
		System.out.println(">>>다시 봐요.<<<");

	}

}
