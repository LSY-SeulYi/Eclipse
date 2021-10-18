package sec03;

public class ForLoopEx01 {

	public static void main(String[] args) {
		// TODO 동일한 라인을 여러번 출력
		for(int i=0;i<1000;i+=3) {
			System.out.println(i+"----------------------------------------");
		}
		//
		for(int i=1000;i>=0;i-=3) {
			System.out.println(i+"----------------------------------------");
		}
		//실수로 증감변수 사용가능
		for(float i=0f;i<=1.0f;i+=0.1f) {
			System.out.println(i);
		}

	}

}
