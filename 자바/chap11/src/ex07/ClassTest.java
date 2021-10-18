package ex07;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 'Class' 라는 class 
public class ClassTest {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz = car.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		// 생성메소드 정보 
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor x:constructors) {
			System.out.println(x.getName());
		}
		System.out.println("-----------------------------------");
		// 멤버필드 정보 
		Field[] fields = clazz.getDeclaredFields();
		for(Field x:fields) {
			System.out.println(x.getName());
		}
		System.out.println("-----------------------------------");
		// 메소드 정보 
		Method[] methods = clazz.getDeclaredMethods();
		for(Method x:methods) {
			System.out.println(x.getName());
		}
	}

}
class Car{
	int doorNum;
	int wheelNum;
	String color;
	int cc;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void start() {
		System.out.println("부르릉 ~ 출발합니다.");
	}

}
