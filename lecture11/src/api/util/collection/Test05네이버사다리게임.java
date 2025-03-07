package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test05네이버사다리게임 {
	public static void main(String[] args) {
		//(Q) 네이버 사다리 게임을 참고하여 콘솔 형태로 구현하세요
		//- 진행순서 : 인원수설정 → 이름/항목 입력 → 섞기 → 결과표시
		//- 난이도를 낮추기 위해 인원수는 3명으로 고정하고 항목도 직접 정하여 처리		
		
		List<String> names = new ArrayList<>();//이름이 저장될 저장소
		List<String> items = new ArrayList<>();//당첨항목이 저장될 저장소
		
		names.add("홍길동");	names.add("이순신");	names.add("장보고");
		items.add("점심사기");	items.add("저녁사기");	items.add("얻어먹기");
		
		Collections.shuffle(items);//items 뒤섞기
		
		System.out.println(names.get(0) + " → " + items.get(0));
		System.out.println(names.get(1) + " → " + items.get(1));
		System.out.println(names.get(2) + " → " + items.get(2));
	}
}










