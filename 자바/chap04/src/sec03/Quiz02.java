package sec03;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt = 0;
		int sum = 0;
		int score = 0;
		while(cnt<100) {
			score =(int)(Math.random()*101);
			sum += score;
			System.out.println(score+",");
			cnt++;
		}
		System.out.println("\nfor문활용: 임의의점수 100개 합:"+sum+ "평균 :"+sum/100.0);
	}

}
