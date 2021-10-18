package ex02;

import java.util.Arrays;

public class Student implements Cloneable{

	public String name;
	public int age;
	public int[] scores;
	public Student(String name,int age,int[] scores) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", scores=" + Arrays.toString(scores) + "]";
	}
	public Student Clone() throws CloneNotSupportedException{
		Student cloned = (Student)super.clone();
		// 참조형이지만 다른 주소를 참조하도록 새로이 만들어줌. (deep copy)
		cloned.scores = Arrays.copyOf(this.scores,this.scores.length);
		return cloned;
	}
	public Student getStudent() {
		Student cloned = null;
		try {
			cloned = (Student)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cloned;
	}
}
