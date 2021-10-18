package 과제2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Map<String,String> myEng = new TreeMap<>();
		myEng.put("bts","방탄소년단");
		myEng.put("honey","꿀물");
		myEng.put("flower","꽃");
		myEng.put("rain","雨");
		myEng.put("snow","雪");
		WordMachine 깜박이 = new WordMachine(myEng);
		깜박이.start();
	}

}
