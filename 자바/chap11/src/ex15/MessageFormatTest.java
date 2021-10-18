package ex15;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {
		
		String id = "jaain";
		String name = "성주원";
		String tel = "010-111-1111";
		
		System.out.println("회원 id : "+id+ ", 회원이름 : "+name+ ", 회원전화 : "+tel);
		String text = "회원 id : {0}, 회원이름 : {1}, 회원전화 : {2}";
		String res = MessageFormat.format(text, id, name, tel);
		System.out.println(res);
		// 데이터베이스 등을 활용할 때에 유용하게 활용할 수 있음.
		
		String sql = "INSRT INTO MYMWMBER VALUES({0},{1},{2})";
		String[] argz = {"'jaain', '성주원', '010-111-1111'"};
		res = MessageFormat.format(sql, argz);
		System.out.println(res);
	}
}
