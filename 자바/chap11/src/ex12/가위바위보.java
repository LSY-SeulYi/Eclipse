package ex12;
import java.util.Scanner;
//Scissiors , Rock, Paper

public class 가위바위보 {



public int gameNums;// 게임횟수 지정
public String yourName;// 게임하는 자 이름
//가위, 바위, 보 상수 지정 
public final static int SCISSORS = 0;
public final static int ROCK = 1;
public final static int PAPER = 2;

public int com;
public int you;
//어디서든지 사용할 수 있는 스켄객체 
public Scanner scan = new Scanner(System.in);

public 가위바위보(int gameNums,String yourName) {
this.gameNums = gameNums;
this.yourName = yourName;
}
//게임시작 
public void gameStart() {

for(int i=0;i<this.gameNums;i++) {
com = (int)(Math.random()*3)+0;//0~2
System.out.print("가위,바위,보>");
String hand = scan.nextLine();
switch(hand) {
case "가위":
you = SCISSORS;
break;
case "바위":
you = ROCK;
break;
case "보":
you = PAPER;
break;
}
System.out.println(judgement());

}
System.out.println("게임종료");
}

public String judgement() {
	String 판정 ="";
	if((com==SCISSORS & you==ROCK)||
	(com==ROCK & you==PAPER)||
	(com==PAPER & you==SCISSORS)
	) {
	판정 = "YOU WIN~";
	}else if(
	(com==SCISSORS & you==PAPER)||
	(com==ROCK & you==SCISSORS)||
	(com==PAPER & you==ROCK)
	) {
	판정 = "YOU LOSE!";
	}else {
	판정 = "TIE";
	}
	return 판정;
}


public static void main(String[] args) {
	가위바위보 game = new 가위바위보(5,"홍길동");
game.gameStart();

}

}