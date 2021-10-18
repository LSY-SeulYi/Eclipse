package ex02;
// 내가 즐겨 사용하는 Enum 상수들의 집합 클래스
public class MyEnums {

	interface A{}
	enum LeeDunasty implements A{태조,정종,태종,세종,문종,단종,세조}
	enum Rainbow implements A{빨,주,노,초,파,남,보}
	enum Ganadala implements A{가,나,다,라,마,바,사,아,자,차,카,타,파,하}
	enum Gan implements A{갑,을,병,정,무,기,경,신,임,계}
	enum Jee implements A{자,축,인,묘,진,사,오,미,신,유,술,해}

	public int getOrdinal(A x) {
		return 0;
	}
}
