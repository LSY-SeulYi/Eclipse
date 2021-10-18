package ex03;
// 사용하고 난 뒤 닫아줘야 하는 클래스를 만든다면 인터페이스인 AutoCloseable 을 구현해야 함.
public class MyFileInputStream implements AutoCloseable{
	private String file;
	public MyFileInputStream(String file) {
		this.file = file;
	}
	public void read() {
		System.out.println(file + "을 읽습니다...");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다...");
		
	}
}
