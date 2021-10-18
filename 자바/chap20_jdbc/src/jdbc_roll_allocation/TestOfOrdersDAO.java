package jdbc_roll_allocation;

import java.sql.SQLException;
import java.util.List;

public class TestOfOrdersDAO {

	public OrdersDAO dao = new OrdersDAO();
	
	public static void main (String[] args) {
		
		new TestOfOrdersDAO().test();
		
	}
	public void test() {
		
		try {
			List<Orders> data = dao.selectAll();
			for(Orders x:data) {
				System.out.println(x);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		testOfInsert();
//		testOfDelete();
//		testOfUpdate();
//		testOfSelectByConditions();
		
	}
	
//	public void testOfInsert() {
//		
//		Orders vo = new Orders();
//		int orderid = -1;
//		int res = -1;
//		try {
//			orderid = dao.getMaxNum()+1;
//						
//			vo.setOrderid(orderid);
//			vo.setCustid(2);
//			vo.setBookid(5);
//			vo.setSaleprice(7000);
//			vo.setOrderdate("2021-06-21");
//			
//			res = dao.insert(vo);
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//		if(res > 0) System.out.println("입력 성공~!!");
//		else System.out.println("입력 실패~!!");
//	}
//	
//	public void testOfDelete() {
//		
//		try {
//			List<Orders> allData = dao.selectAll();
//			int orderid = -1;
//			int res = -1;
//			for(Orders x:allData) {
//				if(x.get {
//					orderid = x.getOrderid();
//				}
//				res = dao.delete(orderid);
//			}
//			allData=dao.selectAll();
//			for(Orders x:allData) {
//				System.out.println(x.getSaleprice());
//			}
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//	}
//	public void testOfUpdate() {
//		try {
//			Orders vo = dao.select(dao.getMinNum());
//			int saleprice = vo.getSaleprice();
//			vo.setSaleprice(5000);
//			dao.update(vo);
//			vo = dao.select(dao.getMinNum());
//			System.out.println("수정 후 반영 된 가격 :"+vo.getSaleprice());
//			vo.setSaleprice(saleprice);
//			dao.update(vo);
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//	}
//	public void testOfSelectByConditions() {
//		try {
//			List<Orders> data = dao.selectByConditions("WHERE SALEPRICE = 10000");
//			for(Orders x:data) {
//				System.out.println(x.getBookid()+x.getSaleprice());
//			}
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//	}
}
