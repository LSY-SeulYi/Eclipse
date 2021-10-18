package ex01;

public class NumberFormatEx {

	public static void main(String[] args) {
		String numStr = "123456";
		int num = Integer.parseInt(numStr);
		String numStr2 = "l234";
		int num2 = 0;
		try {
			num2 = Integer.parseInt(numStr2);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage() + " 숫자가 아닌 문자가 들어갔습니다. 예외!");
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		System.out.println(num2);
	}
}
