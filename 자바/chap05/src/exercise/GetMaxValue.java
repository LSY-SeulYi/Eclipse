package exercise;
// 주어진 배열에서 가장 큰 값을 찾아서 맅ㄴ시켜주는 메소드 만들기
public class GetMaxValue {

	public static void main(String[] args) {
		
		int[] values = {66,77,88,99,123,56};
		System.out.println("최대값 :"+getMaxValue(values));
		System.out.println("최대값1 :"+getMaxValue1(values));
		
	}
	public static int getMaxValue(int[] arr) {
		int max = arr[0]; 
		for (int i = 0; i<arr.length; i++) {
				if (arr[i]>max) {
				 max = arr[i];
			 }
		}
		return max;
	}
		public static int getMaxValue1(int[] arr) {
			int max1 = 0; 
			for (int x:arr) {
					if (x>max1) {
					 max1 = x;
				 }
			}
			return max1;
		
	}
}
