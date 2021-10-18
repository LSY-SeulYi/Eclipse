package sec03;

import javax.swing.JOptionPane;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO 문자열을 입력받아 출력해 주는 ECO 기능 구현
		String msg ="";
		do {
			msg =JOptionPane.showInputDialog("메세지/q 입력 :");
			System.out.println("산울림:"+msg);
		}while (!msg.equals("q"));
		System.out.println("프로그램 종료.");

	}

}
