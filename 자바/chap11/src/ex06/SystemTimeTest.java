package ex06;

public class SystemTimeTest {
// 정밀도가 다른 컴퓨터 시간 가져오는 메소드
// System.currentTimeMillis();
// System.nanoTime();
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		long startTime2 = System.nanoTime();
		long sum = 0;
		
		for(long i=1;i<=100_000_000;i++) {
			sum += i;
		}
		
		long endTime = System.currentTimeMillis();
		long endTime2 = System.nanoTime();
		System.out.println("걸린시간 : "+ (endTime - startTime) +"ms");
		System.out.println("걸린시간 : "+ (endTime2 - startTime2) +"ns");
		System.out.println("합친값 : "+ sum);
		
		
	}
}
