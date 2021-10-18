package ex03;

// 사용 후 반드시 닫아야 하는 객체의 예외처리
public class TryWithSource {

	public static void main(String[] args) {
		// 일반 사용
		MyFileInputStream fis = new MyFileInputStream("file.txt");
		fis.read();
		try {
			fis.close(); // 누락될 소지가 있음. 향상된 try block을 이용
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//-- 개선후 ----------------------------------------------------------------------------------------------
		try (MyFileInputStream fis2 = new MyFileInputStream("file.txt")) {
			fis.read();
			// 예외가 발생해도 fis2.close()가 자동으로 수행된다.
			throw new Exception(); // 예외를 강제로 발생시킴.
		} catch (Exception e) {
			System.out.println("예외발생!!!");
		}
		// TODO Auto-generated catch block
//			e.printStackTrace();
	}
}
