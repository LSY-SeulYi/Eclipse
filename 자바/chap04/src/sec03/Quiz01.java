package sec03;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO 임의의 학생점수 100개를 만들어서 평균 내기 (for문, while문 활용)
		// 루프문(2종류)활용하여 임의의 점수 100개를 평균
		// 0~100 => 101가지
		// int avg = 0;
		// int sum = 0;
		// int rndScore = (int)(Math.random()*101);
		// System.out.println(rndScore);
		// for(int i=0;i<=100;i++) {
			// System.out.print("\n"+(int)(Math.random()*101));
			// sum= rndScore;
			// if(+sum)+=1;
			// System.out.println("\n합 :"+sum);
			// System.out.println("\n평균 :" +avg);
		int sum = 0;
		int score = 0;
		int avg = 0;
		for(int i=0;i<=100;i++) {
			score = (int)(Math.random()*101);
			sum += score;
			System.out.print(score+",");
			//avg = sum / score;
		}
		System.out.println("\n for문활용: 임의의점수 100개 합:"+sum+ "평균 :"+sum/100.0);
		
		
			
	}

}
