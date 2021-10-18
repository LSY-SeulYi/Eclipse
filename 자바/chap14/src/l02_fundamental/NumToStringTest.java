package l02_fundamental;

public class NumToStringTest {

	public static void main(String[] args) {
		
		NumToString numToString = (x) -> {
			
			String numStr = x+"";	// 숫자 1933이면 문자로 바뀌게 해줌
			int lt = numStr.length();
			String[] strs = new String[lt];
			String res ="一金";
			for(int i=0; i<lt; i++) {
				strs[i] = numStr.substring(i,i+1);	// 숫자 1933을 앞에서부터 하나씩 넣어줌
//				strs[i] = numStr.charAt(i)+""; => 사용가능
				switch(strs[i]) {
				case "0": res+="영";break;
				case "1": res+="일";break;
				case "2": res+="이";break;
				case "3": res+="삼";break;
				case "4": res+="사";break;
				case "5": res+="오";break;
				case "6": res+="육";break;
				case "7": res+="칠";break;
				case "8": res+="팔";break;
				case "9": res+="구";break;
				}
			}
			return res+"圓";
		};
		System.out.println(numToString.change(1933));
		System.out.println(numToString.change(50000));
	}
}
