package ex06;

import java.util.Properties;
import java.util.Set;

public class SystemPropertyTest {

	public static void main(String[] args) {
		
		// 시스템의 메타정보를 자바프로그램내에서 얻고 싶을 때
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.version"));
//=============================================================================
		System.out.println("=============================================================================");
		// 일종의 자료 구조
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object x:keys) {
			String key = (String)x;
			System.out.println(key+":" + System.getProperty(key));
		}
		System.out.println("=============================================================================");
		
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("자바홈 : "+javaHome);
		String path = System.getenv("PATH");
		System.out.println("path : "+path);
	}
}
