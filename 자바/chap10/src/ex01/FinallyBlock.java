package ex01;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class FinallyBlock {

	public static void main(String[] args) {
		// NumberFormatExcaption 발생하리라고 예견
		int someNum = 0; // 초기값 반드시 줄것
		try {
			someNum = Integer.parseInt(JOptionPane.showInputDialog("어떤 수를 입력하세요."));
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException!!!");
		}catch (Exception e) {
			System.out.println("예외가 발생했습니다..");
//			e.printStackTrace();	개발 단계에서는 보통 그냥 살려둡니다.
		} finally {// 예외 발생유무와 관계없이 무조건 수행해야 할 부분
			System.out.println("예외유무와 관계없이 수고했어요.");
		}
		System.out.println("입력받은 어떤숫자 :" + someNum);
	}
}
