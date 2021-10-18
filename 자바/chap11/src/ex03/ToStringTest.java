package ex03;

public class ToStringTest {

	public static void main(String[] args) {
		
		// 실무에서 일반적방법(setter 통해서 값 넣어주기) => 아이디나 비밀번호같은경우가 있는 경우 그런 암호문의 규칙등을 점검하기위해 사용하기 위해 사용
		CellrulerPhone myphone = new CellrulerPhone();
		myphone.setCompany("LG");
		myphone.setModel("XXX");
		myphone.setOs("Android");
		myphone.setPrice(450000);
		
		// 직접 객체 생성하면서 값도 함께 넣어주기
		CellrulerPhone yourphone = new CellrulerPhone("Samsung","A31","Android",1500000);
		
		// 화면 출력 (println => 오버로딩)
		System.out.println(myphone.toString());
		System.out.println(yourphone);
		
//--------------------------------------------------------------------------------------------------------------------------------------
		Score[] scores = new Score[] {
			new Score(),
			new Score(),
			new Score()
		};
		scores[0].setKor(78);scores[0].setEng(88);scores[0].setMath(99);scores[0].setName("소정방");
		scores[1].setKor(68);scores[1].setEng(98);scores[1].setMath(89);scores[1].setName("소배압");
		scores[2].setKor(58);scores[2].setEng(78);scores[2].setMath(79);scores[2].setName("소리나");
		for(Score x:scores) {
			System.out.println(x);
			
		}
	}
}
