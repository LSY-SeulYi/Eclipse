package sec03;

public class ForLoopEx03 {

	public static void main(String[] args) {
		// TODO 방정식 풀기
		// y = 4x + 7;
		for(int x=1;x<=100;x++) {
			for(int y=1;y<=100;y++) {
				if(y-4*x==7) {
					System.out.println("x :"+x+", y :"+y);
				}
			}
		}

	}

}
