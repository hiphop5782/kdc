package api.util.collection3;

import java.util.Map;
import java.util.Set;

public class Test03Map전체출력 {
	public static void main(String[] args) {
		//Map의 전체 출력
		//- 개별 접근에 특화되어 있으나 원한다면 전체 출력도 가능
		//- Map의 key만 보면 Set과 같다
		
		Map<String, Integer> map = Map.of("영수", 17, "철수", 18, "영희", 16, "민수", 16, "민지", 17);
		
		//System.out.println(map);
		
		Set<String> keys = map.keySet();//map의 key만 Set 형태로 추출
		for(String name : keys) {
			System.out.println("이름 = " + name);
			System.out.println("나이 = " + map.get(name));
		}
		
	}
}
