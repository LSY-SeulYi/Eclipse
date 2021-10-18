package ex01_extends;

public class 도로주행 {

	public static void main(String[] args) {
		Vehicle[] runner = {
			new Sonata(),
			new Tico(4,800),
			new Truck(10,"Hyundai",4000),
			new Tico(4,850)
		};
		for(Vehicle x:runner) {
			passTennel(x);
		}
	}
	public static void passTennel(Vehicle x) {
		System.out.println(x.model+"이(가) 바퀴 "+x.wheelNum+"개를 굴리면서 터널을 통과합니다.");
	}
}
