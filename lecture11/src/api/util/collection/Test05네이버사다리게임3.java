package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test05네이버사다리게임3 {
	public static void main(String[] args) {
		//(Q) 네이버 사다리 게임을 참고하여 콘솔 형태로 구현하세요
		//- 진행순서 : 인원수설정 → 이름/항목 입력 → 섞기 → 결과표시
		//- 난이도를 낮추기 위해 인원수는 3명으로 고정하고 항목도 직접 정하여 처리		
		
		
		List<String> names = new ArrayList<>();//이름이 저장될 저장소
		List<String> items = new ArrayList<>();//당첨항목이 저장될 저장소
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수(2~24) : ");
		int people = sc.nextInt();
		if(people < 2 || people > 24) {
			System.err.println("인원수를 2~24명으로 정하세요");
			System.exit(0);//프로그램 종료 명령(0은 정상종료를 의미)
		}

		for(int i=0; i < people; i++) {
			System.out.print("이름 : ");
			names.add(sc.next());
		}
		
		for(int i=0; i < people; i++) {
			System.out.print("항목 : ");
			items.add(sc.next());
		}
		
		sc.close();
		
		Collections.shuffle(items);//items 뒤섞기
		
		for(int i=0; i < people; i++) {
			System.out.println(names.get(i) + " → " + items.get(i));
		}
	}
}










