package stream16_operator;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	
	// T -> T 
	// UnaryOperator
	// IntUnaryOperator
	// LongUnaryOperator
	// DoubleUnaryOperator
	// 주요 메소드 apply()
		
	public static void main(String[] args) {
		IntUnaryOperator x = n->n*n;	// 한줄이라 리턴 생략
		System.out.println(x.applyAsInt(3));	// x=3*3
		//
		UnaryOperator<Long> xx = longNum -> longNum*longNum;
		System.out.println(xx.apply(99L));	// xx=99*99
		//
		UnaryOperator<String> y = n->n.toUpperCase();	// toUpperCase=>대문자
		System.out.println(y.apply("I am a boy"));
		// 
		UnaryOperator<String> z = n->n.toLowerCase();	// toLowerCase=>소문자
		System.out.println(z.apply("I am a boy"));
		
		
		
	}

}
