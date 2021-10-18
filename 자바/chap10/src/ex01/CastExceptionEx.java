package ex01;

public class CastExceptionEx {

	public static void main(String[] args) {
		Dog jindo = new Dog();
		changeDog(jindo);
		Cat cat = new Cat();
//		changeDog(cat);
//		Exception in thread "main" java.lang.ClassCastException: class ex01.Cat cannot be cast to class ex01.Dog (ex01.Cat and ex01.Dog are in unnamed module of loader 'app')
//		at ex01.CastExceptionEx.changeDog(CastExceptionEx.java:12)
//		at ex01.CastExceptionEx.main(CastExceptionEx.java:9)
//		Dog를 animal로 바꾸는건 가능하지만 cat을 dog로 바꾸는 건 불가능함.
	}
	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
}
class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}