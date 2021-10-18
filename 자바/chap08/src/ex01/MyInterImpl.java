package ex01;

import java.sql.Date;

public class MyInterImpl implements MyInter{

	@Override
	public void disp() {
		System.out.println("MyInter를 구현한 구현체입니다.");
	}
	public static void main(String[] args) {
		MyInterImpl impl = new MyInterImpl();
		impl.disp();
		System.out.println(impl.PI);
		System.out.println(MyInter.PI);
		System.out.println(impl.sum(35, 40));
		System.out.println(new Date(MyInter.someMethod()));
	}
	
}
