package sec03;

import javax.swing.JOptionPane;

public class ForLoopEx02 {

	public static void main(String[] args) {
		// TODO 직각 삼각형 그리기 - 주어진 크기에 따라
		int size = Integer.parseInt(JOptionPane.showInputDialog("직각삼각형의 크기 :"));
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		// 1~100 사이의 숫자 중 3의 배수의 합을 구하시오.
		int sum=0;
		for(int i=0;i<100;i++) {
			if(i%3==0)sum+=1;
			System.out.println("3의 배수의 합"+sum);
		}

	}

}
