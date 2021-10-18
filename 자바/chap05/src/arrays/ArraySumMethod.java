package arrays;
// 전달받은 배열값을 합산해서 돌려주는 메소드 만들기
public class ArraySumMethod {

	public static void main(String[] args) {
		// TODO 
		int[] scores = {78,89,90,55,99,87};
		int res = sum(scores); // 메소드호출
		double avg = res/(double)scores.length;
		System.out.println("성적합계 : " +res);
		System.out.println("성적평균 : " +avg);
	}
	// 배열을 받아 합산해서 리턴시킴
	public static int sum(int[] arr) {
		int sum=0;
		for(int x:arr) {
			sum += x;
		}
		return sum;
	}
}
