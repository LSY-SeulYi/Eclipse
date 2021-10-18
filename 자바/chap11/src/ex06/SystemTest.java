package ex06;

public class SystemTest {

	public static void main(String[] args) {
		
		// 보안 관리자 설정
		SecurityManager manager = new SecurityManager() {
			
			@Override
			public void checkExit(int status) {
				if(status !=9) {
					throw new SecurityException();
				}
			}
		};
		
		System.setSecurityManager(manager);
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				System.exit(i);	// 9일때만 수행(프로그램종료)됨
			} catch (SecurityException e) {}
		}
		
		
	}
}
