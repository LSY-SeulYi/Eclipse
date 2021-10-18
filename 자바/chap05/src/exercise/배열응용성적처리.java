package exercise;

import java.util.Arrays;
import java.util.Scanner;

// 과제~~  학생수와 점수를 입력받아 점수리스트와 최고점수, 평균점수, 총점을 출력하는 프로그램을 작성하시오.
public class 배열응용성적처리 {
	// 멤버필드는 전역변수이므로 이 소스내의 모든 영역에서 사용할 수 있음.
	// static이 붙은 멤버필드를 클래스(object가아님) 멤버필드 라고 함.
	static int 학생수;	// 기본 초기값 0 할당됨.
	static int[] 성적;	// 배열 객체이기 때문에 초기값 null 할당됨.
	static boolean run = true;
	// 사용할 부품
	static Scanner scan = new Scanner(System.in);

	// static이 붙어 있는 메소드에서는 외부의 변수를 사용할 때 static변수만 사용 가능하다.
	public static void main(String[] args) {
		while (run) {
			System.out.println("=========================================");
			System.out.println("1.학생수입력 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("=========================================");
			System.out.println("선택>");
			int menu = scan.nextInt();
			switch(menu){
				case 1:
				System.out.print("성적 처리할 인원수:>");
				학생수 = scan.nextInt();
				break;
				case 2: 
				성적 = new int[학생수];
				for (int i = 0; i < 학생수; i++) {
					System.out.print(i+"번 학생 성적:>");
					성적[i] = scan.nextInt();
				}
				break;
				case 3:
				System.out.println(Arrays.toString(성적));
				break;
				case 4:
				System.out.println("응시인원:" + 학생수);
				System.out.println("최고점:" + getMax(성적));
				System.out.println("최저점:" + getMin(성적));
				System.out.println("평균값:" + getAvg(성적));
				break;
				case 5:
				System.out.println("bye~~~");
				run = false;
				default:
				}
			}
		}
		public static int getMax(int[] scores) {
			int max = 0;
			for (int x : scores) {
				if (x > max) {
					max = x;
				}
			}
			return max;
		}
		public static int getMin(int[] scores) {
			int min = 100;
			for (int x : scores) {
				if (x < min) {
					min = x;
				}
			}
			return min;
		}
		public static double getAvg(int[] scores) {
			int total = 0;
			for (int x : scores) {
				total += x;
			}
			return (double) total / scores.length;
		}
}