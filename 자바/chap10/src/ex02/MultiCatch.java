package ex02;

import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수치입력1:>");
		String data1 = scan.nextLine();
		System.out.println("수치입력2:>");
		String data2 = scan.nextLine();

		int result = 0;
		int[] data = new int[2];
		// 예외 catch블럭이 여러개인 경우 그 예외들이 조손관계에 있지 않은 이상 배치 순서는 전후가 없다
		// 조손관계에 있는 경우는 자손클래스가 먼저 배치되어야 함.
		try {
			data[0] = Integer.parseInt(data1);
			data[1] = Integer.parseInt(data2);
			result = data[0] + data[1];
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("두수의 합 :" + result);
	}

}
