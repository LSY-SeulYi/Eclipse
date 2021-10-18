package ex08;

public class StringIndexOf {

	public static void main(String[] args) {
		
		String gasa = "궁노루 산울림 달빛타고 달빛타고 흐르는 밤";
		int pos = gasa.indexOf("달빛");
		System.out.println(pos);
		
		pos = gasa.indexOf("사랑");
		System.out.println(pos);
		if(pos==-1) { // 존재하지 않는 다면
			System.out.println("이 가사에는 '사랑'이라는 단어가 나오지 않습니다.");
			
		// 가사의 글자수가 알고 싶을 때
			System.out.println(gasa.length());
			
		// 가사 수정하고 싶을 때
			gasa = gasa.replace("달빛", "별빛");
			System.out.println(gasa);
			
		// 가사가 영문인 경우 (대, 소문자로 바꾸기)
			gasa = "Four score and Seven years ago. Our fathers brought...";
			System.out.println(gasa.toUpperCase());
			System.out.println(gasa.toLowerCase());
			
		// 같은 뜻의 영문 대소문자를 같게 볼때
			String word = "EGG";
			String wprd2 = "egg";
			System.out.println(word == wprd2);
			System.out.println(word.equals(wprd2));
			System.out.println(word.equalsIgnoreCase(wprd2));

		// 스페이스 잘못 들어가서 다르게 들어간 경우
			String name = " LEE SUN SHIN ";
			String name2 = "LEE SUN SHIN ";
			System.out.println(name == name2);
			System.out.println(name.equals(name2));
			System.out.println(name.equalsIgnoreCase(name2));
			name = name.trim();
			name2 = name2.trim();
			System.out.println(name == name2);
			System.out.println(name.equals(name2));
			System.out.println(name.equalsIgnoreCase(name2));
			
		// 숫자를 문자열로 바꾸기
			double someNum = 10.5;
			String someStr = someNum+"";	// 간단하게 문자열로 바뀜
			String someStr2 = String.valueOf(someNum);
			System.out.println(someNum);
			System.out.println(someStr);
			System.out.println(someStr2);
			boolean iswhat = false;
			String iswhatStr = iswhat+"";
			String iswhatStr2 = String.valueOf(iswhat);
			System.out.println(iswhat);
			System.out.println(iswhatStr);
			System.out.println(iswhatStr2);
			
		}
		
	}
}
