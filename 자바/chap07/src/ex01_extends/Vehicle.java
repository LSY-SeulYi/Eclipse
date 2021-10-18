package ex01_extends;
// 탈것
public class Vehicle {

	public int wheelNum;
	public String model;
	public int cc;
	
	public Vehicle() {}
	public Vehicle(int wheelNum,String model,int cc) {
		this.wheelNum = wheelNum;
		this.model = model;
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Vehicle [휠수 : "+ wheelNum + ", 모델명 : " + model + ", cc : " + cc + "]";
	}
	public static void main(String[] args) {
		Vehicle a = new Vehicle();
		
		System.out.println(a.wheelNum);
	}
}
