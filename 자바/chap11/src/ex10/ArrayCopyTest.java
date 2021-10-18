package ex10;

import java.util.Arrays;

public class ArrayCopyTest {

	public static void main(String[] args) {
		
		char[] arr1 = {'J','A','V','A'};
		// 1방법
		char[] arr2 = Arrays.copyOf(arr1, 2);
		char[] arr3 = Arrays.copyOf(arr1, arr1.length);
		// 2방법
		char[] arr4 = Arrays.copyOfRange(arr1, 1, 2);
		// 3방법
		char[] arr5 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr5, 0, arr1.length);
	}
}
