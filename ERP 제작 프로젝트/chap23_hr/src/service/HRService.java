package service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import dao.DepartmentsDAO;
import dao.EmployeesDAO;
import dao.Job_HistoryDAO;
import dao.JobsDAO;
import vo.Employees;

public class HRService {
	EmployeesDAO edao; 
	DepartmentsDAO ddao;
	Job_HistoryDAO jhdao;
	JobsDAO jdao;
	////////////////////////////////////////////// 
	public HRService() {
		this.edao = new EmployeesDAO();
		this.ddao = new DepartmentsDAO();
		this.jhdao = new Job_HistoryDAO();
		this.jdao = new JobsDAO();
	}
	// 1. 주어진 기간의 입사자 목록찾기 
	public List<Employees> getEmpListByHireDate(Date a,Date b){
		List<Employees> result = null;
		try {
			Predicate<Employees> bt= m->{
				Date x = m.getHire_date();
				return (x.after(a) && x.before(b))
						|| x.equals(a) || x.equals(b);
			};
			result = (List<Employees>) edao.selectAll().stream().filter(bt).sorted((da1,da2)->da1.getHire_date().compareTo(da2.getHire_date())).collect(Collectors.toList());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	// 2. 근무부서별 직원 목록 
	public List<Employees> getEmpListByDep(int depId){
		List<Employees> result = null;
		try {
			Predicate<Employees> bt= m->{
				return m.getDepartment_id()==depId;
			};
			result = (List<Employees>) edao.selectAll().stream().filter(bt).sorted((a,b)->a.getEmployee_id()-b.getEmployee_id()).collect(Collectors.toList());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	// 3. 많이 받는 급여순으로 본 직원 목록
	public List<Employees> getEmpListOrderbyPay(){
		List<Employees> result = null;
		try {
			result = (List<Employees>) edao.selectAll().stream().sorted(
					(em,em2) ->em2.getSalary() - em.getSalary()
					).collect(Collectors.toList());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
//	 4. 급여 10000달러 이상 직원 목록 
	public List<Employees> getEmpListSalaryBy(){
		List<Employees> result = null;
		try {
			result = (List<Employees>) edao.selectAll().stream().filter(h->h.getSalary()>=10000).sorted((a,b) ->b.getSalary() - a.getSalary())
					.collect(Collectors.toList());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

//	 5. 직업id별로 본 직원 목록 
	public List<Employees> getEmpListByJob(String job){
		List<Employees> result = null;
		try {
			Predicate<Employees> bt = m->{
				return m.getJob_id().equals(job);
			};
			result = (List<Employees>) edao.selectAll().stream().filter(bt).sorted((a,b)->a.getEmployee_id()-b.getEmployee_id()).collect(Collectors.toList());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	// 6. First_name으로 직원 찾기( 
	public List<Employees> getName(String name){
	      List<Employees> result = null;
	      try {
	         result = (List<Employees>) edao.selectAll().stream().filter(t->t.getFirst_name().equalsIgnoreCase(name))
	               .collect(Collectors.toList());
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      return result;
	   }
	// 7. 전화번호로 직원 찾기
	
	public List<Employees> getPhone(String phone){
	      List<Employees> result = null;
	      try {
	         result = (List<Employees>) edao.selectAll().stream().filter(t->t.getPhone_number().equals(phone))
	               .collect(Collectors.toList());
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      return result;
	   }
	// 8. 커미션율
	public List<Employees> getcommiss(){
		List<Employees> result = null;
		try {
			result = (List<Employees>) edao.selectAll().stream().sorted(
					(em,em2) ->(int)(em2.getCommission_pct()*100) - (int)(em.getCommission_pct()*100)
					).collect(Collectors.toList());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
		
	// 9. 직원 이름 순 목록
	public List<Employees> getFirstName(){
		List<Employees> result = null;
		try {
			result = (List<Employees>) edao.selectAll().stream().sorted(
					(em,em2) ->em.getFirst_name().compareTo(em2.getFirst_name())
					).collect(Collectors.toList());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	 
	public static void main(String[] args) {
		new HRService().test();
	}
	public void test() {
		//1 테스트 2005년도 입사직원 목록 
		Date a = new Date(105,0,1);
		Date b = new Date(105,11,31);
		getEmpListByHireDate(a,b).stream().forEach(e->System.out.println(e+":"+e.getHire_date()));
		
	}
	//----------------------------------------------
}
