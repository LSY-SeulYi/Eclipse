package sec03;

public class ForLoopEx04 {

	public static void main(String[] args) {
		// TODO 임의의 수 생성하기 => 로또번호 추출하기
		
		// 1~45 정수 중 임의의 수 6개를 끄집어 내는 로직
		
		// 1단계 학습 (1~45 숫자 중 하나를 생성)
		// Math.random() 이 발생시키는 수는 1~0.99999999까지만 나옴
		int lottoNum1 = (int)(Math.random()*45)+1;
		int lottoNum2 = (int)(Math.random()*45)+1;
		int lottoNum3 = (int)(Math.random()*45)+1;
		int lottoNum4 = (int)(Math.random()*45)+1;
		int lottoNum5 = (int)(Math.random()*45)+1;
		int lottoNum6 = (int)(Math.random()*45)+1;
		//System.out.println(lottoNum1);
		//System.out.println(lottoNum2);
		//System.out.println(lottoNum3);
		//System.out.println(lottoNum4);
		//System.out.println(lottoNum5);
		//System.out.println(lottoNum6);
		
		//
		for(int i=0;i<=6;i++) {
			//System.out.print((int)(Math.random()*45));
			//System.out.print("\t");
		}
		//System.out.println();
		// 중복발생을 제거하는 아이디어
		for(int k=0;k<10;k++) {
			boolean[] filled = new boolean[45];
			for(int i=0;i<6;i++) {
				int lotto = (int)(Math.random()*45)+1;
				if(filled[lotto-1]) {
					i--;
					continue;
				}else {
					filled[lotto-1] = true;
					System.out.print(lotto);
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
