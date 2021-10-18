package ex08_constant;
// 상수 만들기 - final static
public class ConstantEx {

	
	
	public static void main(String[] args) {
		int selectColor = Mycon.BLUE;
		switch(selectColor) {
		case Mycon.BLACK:
			System.out.println("검정색입니다.");
			break;
		case Mycon.RED:
			System.out.println("붉은색입니다.");
			break;
		}
		// 매입세액 공제가 없는 사업자입니다. 이번 분기의 총 매출액은 8_000_000원인경우 부가가치세액은 얼마인가?
		int vatAmt = (int)(8_000_000*Mycon.VAT);
		System.out.println("납부할 부가세 : "+ vatAmt);
	}
	class Mycon{
		public final static int BLACK = 0;	// 나중에 값을 바꿀때 상수만 바꾸면 됨. (0,1,2,3)
		public final static int RED = 1;
		public final static int BLUE = 2;
		public final static int GREEN = 3;
		
		public final static float VAT = 0.1F;
	}
}
