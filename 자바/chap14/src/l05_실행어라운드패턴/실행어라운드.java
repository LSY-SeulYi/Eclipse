package l05_실행어라운드패턴;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class 실행어라운드 {
	// 사용할 data파일은 source fold에 두거나, 새로운 소스폴더를
	// 만들어 넣어면 실제배포는 bin루터 폴더내에 배치된다.
	public static void main(String[] args) throws IOException {
		// 람다사용전
		System.out.println("람다사용전 일반적인 방법");
		System.out.println(processFile());
		// 람다사용후
		System.out.println("람다사용후1 ");
		System.out.println(processFile(br->br.readLine()));
		// 
		System.out.println("람다사용후2 ");
		System.out.println(processFile(br->br.readLine()+"\n"+br.readLine()));
	}
	public static String processFile() throws IOException{
		try(BufferedReader br=new BufferedReader(new FileReader("bin/data.txt"))){
			return br.readLine();
		}
	}
	public static String processFile(BufferedReaderProcessor p) throws IOException{
		try(BufferedReader br = new BufferedReader(new FileReader("bin/data.txt"))){
			return p.process(br);
		}
	}
	public interface BufferedReaderProcessor{
		String process(BufferedReader b) throws IOException;
	}
}
