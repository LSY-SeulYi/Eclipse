package sec03;

public class Quiz04 {
	
	public static void main(String[] args) {
		
		int num1=0;
		int num2=0;
		int num3=0;
		int sum=0;
		for(int i=0;i<=100;i++) {
			num1=(int)(Math.random()*41)+60;
			num2=(int)(Math.random()*51)+50;
			num3=(int)(Math.random()*61)+40;
			sum += num1;
			System.out.print(num1+",\t");
			System.out.print(num2+",\t");
			System.out.print("\n"+num3+",");
		}
		System.out.println("\n합 :"+sum+", 평균 :"+sum/100.0);
	}

}
