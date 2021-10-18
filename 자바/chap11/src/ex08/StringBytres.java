package ex08;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringBytres {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String hello = new String("안녕하세요.");
		byte[] b = hello.getBytes();
		System.out.println(Arrays.toString(b));
		//
		String hello2 = new String(b);
		System.out.println(hello2);
		//
		String hello3 = new String("안녕하세요.");
		byte[] b2 = hello3.getBytes("EUC-KR");
		System.out.println(b2);
		
	}
}
