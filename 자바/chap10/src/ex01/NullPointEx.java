package ex01;
// 객체의 구체적 할당없이 참조하려 할때ㅔ 발생되는 예외
public class NullPointEx {

	public static void main(String[] args) {
		String name = null;
		String name2 = "";
		System.out.println(name);
		System.out.println(name2);
		try {
			System.out.println(name.toString());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage()+ " 예외가 발생!");
//			e.printStackTrace();
		}
		System.out.println(name2.toString());
	
		int a = 30/ 0;
		int b = 50*0;
		String c = null;
		String d = "null";
		try {
			System.out.println(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
	
	
	}
}
