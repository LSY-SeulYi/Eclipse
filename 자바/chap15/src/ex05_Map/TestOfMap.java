package ex05_Map;

import java.util.*;

// Map ~ 키와 밸류를 한쌍으로 하는 자료를 저장하는 구조
// 키 부분은 Set성질
// 밸류 부분은 List성질
public class TestOfMap {

	public static void main(String[] args) {
		
		Map<String,String> dic = new HashMap<>();
		dic.put("boy", "소년");
		dic.put("boy", "호텔심부름소년");
		dic.put("girl generation", "소녀시대");
		dic.put("zoo", "동물원");
		dic.put("twenty", "20");
		dic.put("score", "98");
		
		// 키셑
		Set<String> keys = dic.keySet();
		System.out.println(keys);
		// 벨류 리스트
		Collection<String> values = dic.values();
		System.out.println(values);
		// 엔트리 셑
		Set<Map.Entry<String, String>> entry = dic.entrySet();
		System.out.println(entry);
		// 새로운 단어 등록
		boolean res = dic.containsKey("boy");
		if(res) System.out.println("boy는 이미 등록된 단어입니다.");
		res = dic.containsKey("girl");
		if(res) System.out.println("girl은 이미 등록된 단어입니다.");
		else dic.put("girl","소녀");
		
		System.out.println(dic);
	//--------------------------------------------------------------------------------------------
		for(String key:dic.keySet()) {
			System.out.println("["+key+"]");
			System.out.println("의미 : "+dic.get(key));
			System.out.println();
		}
		// 동물원 지우기
		dic.remove("zoo");
		System.out.println(dic);
		// 등록된 단어가 몇 개인지
		System.out.println("등록된 단어 수는? "+dic.size());
		
	}
}
