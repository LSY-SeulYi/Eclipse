package chap04;

import javax.swing.JOptionPane;

public class TreeHangEx {

	public static void main(String[] args) {
		// TODO 3항 연산의 활용
		int score = Integer.parseInt(
			JOptionPane.showInputDialog("성적입력")
			);
		boolean isPass = (score>=60)?true:false;
		if(isPass) {
			System.out.println("합격을 축하합니다~~");
		}else {
			System.out.println("불합격입니다.");
		}
		
		String grade =
			((score<60))?"불통":
			((score<70))?"양":
			((score<80))?"미":
			((score<90))?"우":"수";

		System.out.println("당신의 등급은 \'"+grade+"\'입니다.");
	}

}
