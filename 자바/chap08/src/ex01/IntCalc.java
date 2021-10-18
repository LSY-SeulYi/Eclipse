package ex01;

public class IntCalc implements SomeInter<Double>{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public Double add(Double a, Double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public Double sub(Double a, Double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public Double mul(Double a, Double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public Double div(Double a, Double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public static void main(String[] args) {
		
		System.out.println();
	}
}
