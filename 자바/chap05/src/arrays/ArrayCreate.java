package arrays;

public class ArrayCreate {

	public static void main(String[] args) {
		// TODO 배열 생성시 어떤 타입의 배열을 만들지 생각.
		int[] scores = {45,78,90};
		//
		int scores2[] = new int[3];
		scores2[0] = 45;
		scores2[1] = 78;
		scores2[2] = 90;
		// 기본 for문으로 scores 계산
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum +=scores[i];
		}
		System.out.println("합: "+ sum);
		System.out.println("평균: "+ sum/(double)scores.length);
		// 향상된 for문으로 scores2 계산
		sum = 0;
		for(int x:scores2) {
			sum += x;
		}
		System.out.println("합2: "+ sum);
		System.out.println("평균2: "+ sum/(double)scores2.length);
	}

}
