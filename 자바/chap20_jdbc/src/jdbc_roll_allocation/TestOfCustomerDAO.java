package jdbc_roll_allocation;

import java.sql.SQLException;
import java.util.List;

public class TestOfCustomerDAO {

	public CustomerDAO dao = new CustomerDAO();
	
	public static void main (String[] args) {
		
		new TestOfCustomerDAO().test();
		
	}
	public void test() {
//		testOfInsert();
//		testOfDelete();
//		testOfUpdate();
		testOfSelectByConditions();
		
	}
	
	public void testOfInsert() {
		
		Customer vo = new Customer();
		int custid = -1;
		int res = -1;
		try {
			custid = dao.getMaxNum()+1;
			vo.setCustid(custid);
			vo.setName("홍길동");
			vo.setAddress("대한민국");
			vo.setPhone("010-0000-0000");
			res = dao.insert(vo);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(res > 0) System.out.println("입력 성공~!!");
		else System.out.println("입력 실패~!!");
	}
	
	public void testOfDelete() {
		
		try {
			List<Customer> allData = dao.selectAll();
			int custid = -1;
			int res = -1;
			for(Customer x:allData) {
				if(x.getName().equals("홍길동")) {
					custid = x.getCustid();
				}
				res = dao.delete(custid);
			}
			allData=dao.selectAll();
			for(Customer x:allData) {
				System.out.println(x.getName());
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void testOfUpdate() {
		try {
			Customer vo = dao.select(dao.getMinNum());
			String name = vo.getName();
			vo.setName("유관순");
			dao.update(vo);
			vo = dao.select(dao.getMinNum());
			System.out.println("수정 후 반영 된 이름 :"+vo.getName());
			vo.setName(name);
			dao.update(vo);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void testOfSelectByConditions() {
		try {
			List<Customer> data = dao.selectByConditions("WHERE ADDRESS LIKE '%대한민국%'");
			for(Customer x:data) {
				System.out.println(x.getName());
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
