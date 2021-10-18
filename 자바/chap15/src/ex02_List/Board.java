package ex02_List;

import java.util.Calendar;

// 게시판 클래스
public class Board {

	String subject;
	String writer;
	Calendar day;
	String content;
	
	
	public Board(String subject, String writer, Calendar day, String content) {
		super();
		this.subject = subject;
		this.writer = writer;
		this.day = day;
		this.content = content;
	}
}
