package ex05;

import java.util.Objects;

public class DeepEqualsTest {

	public static void main(String[] args) {
		
		Integer o1 = 1000;
		Integer o2 = new Integer(1000);	// deprecated
		System.out.println(Objects.equals(o1, o2));	// true
		System.out.println(Objects.deepEquals(o1, o2));	// true
		
		// 배열로 잡을때
		Integer[] arr1 = {100,200};
		Integer[] arr2 = {100,200};
		System.out.println(Objects.equals(arr1, arr2));	// false
		System.out.println(Objects.deepEquals(arr1, arr2));	// true
	}
}
