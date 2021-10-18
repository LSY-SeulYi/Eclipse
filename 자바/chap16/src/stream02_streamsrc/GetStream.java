package stream02_streamsrc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림 얻는 방법 - 배열, 컬렉션, 지정한 숫자 범위, 파일, 운영체제디렉토리로부터 얻을 수 있음.
public class GetStream {

	public static void main (String[] args) throws IOException {
		
		IntStream stream = IntStream.rangeClosed(1, 45);
		stream.forEach(System.out::println);
		// 파일로부터 스트림얻기
		Path path = Paths.get("src/stream02_streamsrc/Untitled 1.txt");
		Stream<String> stream2;
		stream2 = Files.lines(path, Charset.defaultCharset());
		stream2.forEach(s->System.out.print(s));

		// 다른 방법
		File file = path.toFile();
//		// 데코레이션 패턴
		FileReader fileReader = new FileReader (file);
		BufferedReader br = new BufferedReader (fileReader);
//		//
		stream2 = br.lines();
		// 디렉토리 정보를 스트림으로 얻기
		path = Paths.get("C:/Windows");
		Stream<Path> stream3 = Files.list(path);
		stream3.forEach(d->System.out.println(d.getFileName()));
	}
}
