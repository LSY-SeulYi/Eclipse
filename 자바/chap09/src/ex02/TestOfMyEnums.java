package ex02;

public class TestOfMyEnums {

	public static void main(String[] args) {
		MyEnums.Gan gan = MyEnums.Gan.갑;
		MyEnums.Jee jee = MyEnums.Jee.오;
		MyEnums.Rainbow red = MyEnums.Rainbow.빨;
		MyEnums.LeeDunasty first = MyEnums.LeeDunasty.태조;
		MyEnums.Ganadala kor = MyEnums.Ganadala.나;

		System.out.println(gan);
		System.out.println(MyEnums.Gan.values());
	}
}
