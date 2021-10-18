package arrays;
// 배열 속에 배열 => 2차원
// 배열 속에 배열 속에 배열 => 3차원
public class ArrayInArray {
	
	public static void main(String[] args) {
		// TODO 만약 학생 5명의 성적을 처리한다고 가정
		
		int[] stdAscor = {67,89,90,78,72};
		int[] stdBscor = {78,99};
		int[] stdCscor = {78,78,90};
		int[] stdDscor = {77,88,99};
		int[] stdEscor = {67,76,89,90};
		//2차원 배열로 바꾼다면
		int[][] scores = {stdAscor,stdBscor,stdCscor,stdDscor,stdEscor};	// 1번째 방법 (위에 변수가 다 설정되어 있을때)
		int[][] scores2 = {	// 2번째 방법 (위처럼 변수 없이 점수만 있을때)
				{67,89,90,78,72},
				{78,99},
				{78,78,90},
				{77,88,99},
				{67,76,89,90}
		};
		int total = 0;
		for(int[] x:scores) {
			for(int num:x) {
				total += num;
			}
		}
		System.out.println("총점 :"+ total);
		total = 0;
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				total += scores[i][j];
			}
			System.out.println("총점 :"+ total);
		}
		
		
		
	}

}
