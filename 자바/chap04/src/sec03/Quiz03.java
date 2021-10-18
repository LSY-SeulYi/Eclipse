package sec03;

public class Quiz03 {
	
	public static void main(String[]args) {
		// score = (int)(Math.random()*41)+60;(60~100점)
		int score = 0;
		int sum = 0;
		int avg = 0;
		for(int i=0;i<=100;i++) {
			score = (int)(Math.random()*61)+40;
			sum += score;
			System.out.print(score+",");
		}
		System.out.println("\n점수합계:"+sum+", 평균:"+sum/100.0);
	}

}
