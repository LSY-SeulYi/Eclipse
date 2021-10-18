package ex02_class;

public class ScoreTest {

	public static void main(String[] args) {
		
		Score a = new Score();
		Score b = new Score("홍길동",89,90,95);
		Score c = new Score("유관순",88,95,99);
		a.setName("유관순");
		a.setKor(88);
		a.setEng(95);
		a.setMath(99);
		a.setTotal(a.getKor()+a.getEng()+a.getMath());
		a.setAvg(a.getTotal()/3.0);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
