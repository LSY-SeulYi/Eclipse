package l02_fundamental;

import java.util.function.BinaryOperator;

// BinaryOperator<T> 함수적 인터페이스는 minBy() 와 maxBy() 정적 메소드를
// 제공한다. 이 두 메소드는 매개값으로 제공되는 Comparator를 이용해서 최대 T와
// 최소 T를 얻는 BinaryOperator<T> 를 리턴한다.
public class L08BinaryOperatorExam {

	public static void main(String[] args) {
		// 2중 싼 과일 찾기
		//BinaryOperator<Fruit> bop =BinaryOperator.minBy(
		// 2중 비싼 과일 찾기
		BinaryOperator<Fruit> bop =BinaryOperator.maxBy(	// (maxBy = static메소드)
			(f1,f2)->{//Comparator 인터페이스의 compare
				return Integer.compare(f1.price, f2.price);
			}
		);
		Fruit fruit =  bop.apply(new Fruit("딸기",10000),new Fruit("참외",15000));
		System.out.println(fruit.name);
	}
}
class Fruit{
	public String name;
	public int price;
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}
