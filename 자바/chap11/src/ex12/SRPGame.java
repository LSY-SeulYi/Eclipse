package ex12;

import java.util.Scanner;

// Scissiors , Rock , Paper
public class SRPGame {

	public int gameNums;	// 게임횟수 지정
	public String yourName;	// 게임하는 자 이름
	
	// 가위, 바위, 보 상수 지정
	private final static int SCISSIORS = 0;
	private final static int ROCK = 1;
	private final static int PAPER = 2;
	
	public int com;
	public int you;
	
	//어디서든지 사용할 수 있는 스캔 객체
	public Scanner scan = new Scanner(System.in);
	
	public SRPGame(int gameNums, String yourName) {
		this.gameNums = gameNums;
		this.yourName = yourName;
	}
	// 게임시작
	public void gameStart() {
		for(int i=0;i<this.gameNums;i++) {
			com = (int)(Math.random()*3)+0;
		}
		System.out.println("가위, 바위, 보>");
		String hand = scan.nextLine();
		switch(hand) {
		case "가위" :
			you = SCISSIORS;
			break;
		case "바위" :
			you = ROCK;
			break;
		case "보" :
			you = PAPER;
			break;
		}
		System.out.println(judgement(you));
	}


	
	public String judgement(int you) {
		String 판정 ="";
		if(com==SCISSIORS) {
			switch(you) {
			case SCISSIORS:
				판정 = "TIE!";
				break;
			case ROCK:
				판정 = "YOU WIN!";
				break;
			case PAPER:
				판정 = "YOU LOOSE!";
				break;
			}
		}
		if(com==ROCK) {
			switch(you) {
			case SCISSIORS:
				판정 = "YOU LOOSE!";
				break;
			case ROCK:
				판정 = "TIE!";
				break;
			case PAPER:
				판정 = "YOU WIN!";
				break;
			}
		}
		if(com==PAPER) {
			switch(you) {
			case SCISSIORS:
				판정 = "YOU WIN!";
				break;
			case ROCK:
				판정 = "YOU LOOSE!";
				break;
			case PAPER:
				판정 = "TIE!";
				break;
			}
		}
		return 판정;
	}
}
