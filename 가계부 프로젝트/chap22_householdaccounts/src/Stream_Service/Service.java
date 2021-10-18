package Stream_Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import homebook.dao.HomeBookDAO;
import homebook.dao.IDao;
import homebook.tools.ConnectionFactory;
import homebook.vo.HomeBook;

// 복잡한 질의없이 Stream을 이용한 서비스 개발 예제
public class Service {
	
	private Connection conn;
	private IDao dao;
	public Service () {
		try {
			this.conn = ConnectionFactory.create();
			this.dao = new HomeBookDAO();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// 서비스 테스트
	public static void main(String[] args) throws SQLException {
		Service service = new Service();
//		Connection conn = ConnectionFactory.create();
//		HomeBookDAO dao = new HomeBookDAO();
		service.test(service.conn, service.dao);
		
	}
	// 범용 서비스를 위한 메소드 만들어 보기
	
	// allData 얻는 메소드 먼저 만들어 놓기
	public List<HomeBook> getAllData() {
		List<HomeBook> data = null;
		try {
			data = dao.selectAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	// 지정한 날짜의 자료를 출력해 주는 서비스
	public List<HomeBook> getSumedayData(int year, int month, int day) {

			Predicate<HomeBook> pre = h->{Timestamp ts = h.getDay();
			boolean a = ts.getYear()==year-1900;	// 지금 년도에서 1900을 뺀 값
			boolean b = ts.getMonth()==month-1;	// 월은 1을 뺀 값
			boolean c = ts.getDate()==day;	// 날짜는 원하는 날짜
			return a&&b&&c;
			};
			return getAllData().stream().filter(pre).collect(Collectors.toList());
		}

	// 지정 기간의 자료를 출력해주는 서비스
	public List<HomeBook> getTermData(Timestamp a, Timestamp b) {
		Predicate<HomeBook> pre = h->{
			Timestamp ts = h.getDay();
		return (ts.after(a) && ts.before(b) || ts.equals(a) || ts.equals(b));
		};
		return getAllData().stream().filter(pre).collect(Collectors.toList());
	}
	// 지정한 금액 이상의 수익 목록
	public List<HomeBook> moreThanData(long amount) {
		return getAllData().stream().filter(h->h.getSection().equals("수입")).filter(h->h.getRevenue()>=amount).collect(Collectors.toList());
	}
	// 지정한 계정과목 데이터 목록
	public List<HomeBook> certainAccountTitle(String title) {
		return getAllData().stream().filter(h->h.getAccounttitle().equals(title)).collect(Collectors.toList());
	}
	// 지정한 계정과목의 합계 얻기
	public long certainAccountTileSum(String title) {
		return getAllData().stream()
				.filter(h->h.getAccounttitle().equals(title))
				.mapToLong(h->(h.getSection().equals("수입"))?h.getRevenue():h.getExpense()).sum();
	}
	// 사용된 계정과목 추출하기
	public List<String> getUsedTitle() {
		return getAllData().stream().map(h->h.getAccounttitle()).distinct().collect(Collectors.toList());
	}
	
	// 가계부 데이터를 계정과목 별로 분류하여 집계하는 서비스
	public void sumPrintService() {
		List<String> usedT = getUsedTitle();
		for(String x:usedT) {
			System.out.println(x+":"+certainAccountTileSum(x));
		}
	}
	
	public int test(Connection conn, IDao dao) {
		int res = 0;
//		try {
//			List<HomeBook> allData = dao.selectAll();
//			allData.stream().forEach(x->System.out.println(x));
//			getAllData().stream().forEach(System.out::println);
			System.out.println("1==================================================================================================================================================================");
//			// 차변(수입)합계
			long 차변합계 = getAllData().stream().mapToLong(h->h.getRevenue()).sum();
			System.out.println("차변합계:"+차변합계);
			System.out.println("2==================================================================================================================================================================");
//			// 대변(지출)합계
			long 대변합계 = getAllData().stream().mapToLong(h->h.getExpense()).sum();
			System.out.println("대변합계:"+대변합계);
			System.out.println("3==================================================================================================================================================================");
//			// 사용된 지출 과목 리스트 얻기
			getUsedTitle().stream().forEach(System.out::println);
//			List<String> 지출계정목록 = allData.stream().filter(h->h.getSection().equals("지출")).map(h->h.getAccounttitle()).distinct().collect(Collectors.toList());		
////			List<String> 지출계정목록 = allData.stream().filter(h->h.getSection().equals("지출")).map(h->h.getAccounttitle()).collect(Collectors.toList());
//			지출계정목록.stream().forEach(n->System.out.println(n));
			System.out.println("4==================================================================================================================================================================");
			// 지정한 날짜의 가계부 목록들
		getSumedayData(2021,6,25).stream().forEach(System.out::println);
		System.out.println("5==================================================================================================================================================================");
			// 지정 기간의 자료를 출력해주는 서비스
		Timestamp a = new Timestamp(121,5,1,0,0,0,0);
		Timestamp b = new Timestamp(121,5,30,0,0,0,0);
		getTermData(a,b).stream().distinct().forEach(System.out::println);
//			List<Timestamp> 날짜목록 = allData.stream().filter(h->h.getDay().equals("2021-06-28 hh:mm:ss")).map(h->h.getDay()).collect(Collectors.toList());
//			날짜목록.stream().forEach(n->System.out.println(n));
//			Predicate<HomeBook> pre = h->{Timestamp ts = h.getDay();
//			boolean a = ts.getYear()==121;	// 지금 년도에서 1900을 뺀 값
//			boolean b = ts.getMonth()==5;	// 월은 1을 뺀 값
//			boolean c = ts.getDate()==28;	// 날짜는 원하는 날짜
//			return a&&b&&c;
//			};
//			allData.stream().filter(pre).forEach(System.out::println);
//			System.out.println("==================================================================================================================================================================");
			// 수익금액이 50000원 이상인 목록
//			allData.stream().filter(h->h.getSection().equals("수입")).filter(h->h.getRevenue()>50000).forEach(n->System.out.println(n));
			moreThanData(50000).stream().forEach(System.out::println);
			System.out.println("6==================================================================================================================================================================");
			// 주어진 수익 계정 과목만 출력하기
			certainAccountTitle("상여금").stream().forEach(System.out::println);
//			allData.stream().filter(h->h.getAccounttitle().equals("상여금")).forEach(n->System.out.println(n));
			System.out.println("7==================================================================================================================================================================");
			// 주어진 수익 계정 과목의 합계
//			Long sum = allData.stream().filter(h->h.getAccounttitle().equals("상여금")).mapToLong(h->h.getRevenue()).sum();
			System.out.println("급료 합계 : "+ certainAccountTileSum("급료"));
			System.out.println("8==================================================================================================================================================================");
			// 계정과목별 집계
			sumPrintService();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return res;
	}
}
