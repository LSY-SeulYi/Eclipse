package exercise;

import java.util.Arrays;

// 과제~~  학생수와 점수를 입력받아 점수리스트와 최고점수, 평균점수, 총점을 출력하는 프로그램을 작성하시오.
public class 성적처리 {

	public static void main(String[] args) {
		
		String[] students = {"학생1","학생2","학생3","학생4","학생5"};
		int[][] scores = {
				{88,77,89},
				{91,94,99},
				{78,91,68},
				{95,79,92},
				{100,100,98},
		};
		
		scoreList(students,scores);

		System.out.println("총 점수 합계 :" + sum(scores));
		System.out.println("총 점수 평균 :" + avg(scores));
		System.out.println("총 최고 점수 :" + max(scores));
		System.out.println("총 최저 점수 :" + min(scores));
	}
	public static void scoreList(String[] students, int[][] scores) {// return 문장 안쓸때 void 넣어줌
		for(int i=0;i<students.length;i++) {
			System.out.print(students[i]+"\t");
			for(int score:scores[i]) {
				System.out.print(score+"\t");
			}
			System.out.println();
		}
		
	}
	public static int sum(int[][] arr) {
		int sum = 0;
		int cnt = 0;
		for(int[] x:arr) {
			for(int value:x) {
				cnt++;
				sum += value;
			}
		}
		return sum;
	}
	public static double avg(int[][] arr) {
		int avg = 0;
		int sum = 0;
		for(int[] x:arr) {
			for(int value:x) {
				avg++;
				sum += value;
			}
		}
		return (double)sum/avg;
	}
	public static int max(int[][] arr) {
		int max = 0; 
		int cnt = 0;
		for (int[] x:arr) {
			for(int value:x) {
				if (value>max) {
					 max = value;
			}

			 }
		}
		return max;
	}
	public static int min(int[][] arr) {
		int min = 0; 
		int cnt = 0;
		for (int[] x:arr) {
			for(int value:x) {
				if (value>min) {
					min = value;
			}

			 }
		}
		return min;
	}
}
