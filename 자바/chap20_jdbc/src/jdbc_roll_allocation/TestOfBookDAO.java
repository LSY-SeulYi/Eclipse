package jdbc_roll_allocation;

import java.sql.SQLException;
import java.util.List;

public class TestOfBookDAO {

	public BookDAO dao = new BookDAO();	// 전역변수
	
	public static void main (String[] args) {
		
		new TestOfBookDAO().test();
		
	}
	public void test() {
//		testOfInsert();
//		testOfDelete();
//		testOfUpdate();
//		testOfSelectByConditions();
		
	}
	
	// test case
	public void testOfInsert() {
		// 새로운 책을 등록하는 테스트
		Book vo = new Book();
		int bookid = -1;
		int res = -1;
		try {
			bookid = dao.getMaxNum()+1;
			vo.setBookid(bookid);
			vo.setBookname("데이터베이스 개론과 실습");
			vo.setPublicher("한빛아카데미");
			vo.setPrice(29000);
			res = dao.insert(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(res > 0) System.out.println("입력 성공~!!");
		else System.out.println("입력 실패~!!");
	}
	
	public void testOfDelete() {
		
		try {
			List<Book> allData = dao.selectAll();
			int bookid = -1;
			int res = -1;
			for(Book x:allData) {
				if(x.getBookname().equals("데이터베이스 개론과 실습")) {
					bookid = x.getBookid();
				}
				res = dao.delete(bookid);
			}
			allData=dao.selectAll();
			for(Book x:allData) {
				System.out.println(x.getBookname());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void testOfUpdate() {	// test는 원본에 손상을 주지 말아야 함.
		// 첫 자료의 price를 0원으로 수정 했다가 원위치 시킴
		try {
			Book vo = dao.select(dao.getMinNum());
			int price = vo.getPrice();
			vo.setPrice(7);
			dao.update(vo);
			vo = dao.select(dao.getMinNum());
			System.out.println("수정 후 반영 된 가격 :"+vo.getPrice());
			vo.setPrice(price);
			dao.update(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void testOfSelectByConditions() {
		try {
			List<Book> data = dao.selectByConditions("WHERE PRICE>10000");
			for(Book x:data) {
				System.out.println(x.getBookname()+":"+x.getPrice());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
