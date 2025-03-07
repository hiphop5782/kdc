package api.util.collection3;

import java.util.HashMap;
import java.util.Map;

public class Test01KeyValue저장소 {
	public static void main(String[] args) {
		//Map<K, V>를 상속받는 클래스 그룹
		//- 데이터를 key=value 형태로 저장하는 저장소
		//- HashMap, TreeMap 등이 존재
		//- key만 놓고보면 set과 동일(중복 불가)
		//- value는 중복이 가능
		//- 데이터 전체를 다루기보다 개별적인 데이터들을 효율적으로 빠르게 관리하는것에 초점을 맞추고 있는 저장소
		
		Map<String, Integer> data = new HashMap<>();
		
		//데이터 추가 - add()가 아닌 put(k,v)
		data.put("철수", 16);
		data.put("영수", 17);
		data.put("영희", 16);
		data.put("준호", 18);
		data.put("철수", 17);//기존의 철수의 나이를 덮어쓰기(이름은 중복이 불가하다)
		
		//데이터 개수 - size()
		System.out.println("데이터 개수 = " + data.size());
		
		//데이터 검색 - containsKey(), containsValue()
		System.out.println("철수가 있나요? " + data.containsKey("철수"));
		System.out.println("민수가 있나요? " + data.containsKey("민수"));
		System.out.println("16살이 있나요? " + data.containsValue(16));
		System.out.println("15살이 있나요? " + data.containsValue(15));
		
		//데이터 삭제 - key를 이용하여 삭제
		data.remove("철수");
		
		//데이터 찾기 - get(key)
		System.out.println("영희의 나이는 몇살입니까? " + data.get("영희"));
		System.out.println("다희의 나이는 몇살입니까? " + data.get("다희"));
		
		//출력
		System.out.println(data);
	}
}











