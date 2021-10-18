package stream13_consumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	// (T,U) -> void 
	// accept(i)
	public static void main(String[] args) {
		BiConsumer<Integer,Integer> bc = (a,b)->{
			System.out.println(a+"*"+b+"="+(a*b));
		};
		bc.accept(8, 9);
	}

}

