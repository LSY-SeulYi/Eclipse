package sec02;

import javax.swing.JOptionPane;

public class NonBreakSwitch {

	public static void main(String[] args) {
		// TODO break없는 switch문
		int 출근시간 = Integer.parseInt(JOptionPane.showInputDialog("출근한시간대"));
		switch(출근시간) {
		case 9:
			System.out.println("회의참석");
		case 10:
			System.out.println("업무시작");
		case 11:
			System.out.println("매장순회");
		case 12:
			System.out.println("뭘로채울까?");

		}
	}

}
