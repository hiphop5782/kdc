package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test04컬렉션도우미클래스 {
	public static void main(String[] args) {
		//Collections(컬렉션 도우미 클래스)
		//- 별도의 생성자 없이 일회성 메소드만 존재
		//- List의 순서와 관련된 여러가지 작업을 수행할 수 있다
		
		List<Integer> list = new ArrayList<>();
		for(int i=1; i <= 10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		//뒤집기(reverse)
		Collections.reverse(list);
		System.out.println(list);
		
		//뒤섞기(shuffle)
		Collections.shuffle(list);
		System.out.println(list);
		
		//정렬(sort) - 오름차순
		Collections.sort(list);
		System.out.println(list);
		
		
		//이전 로또 문제를 다시 한번 풀이
		list.clear();//전체 삭제
		for(int i=1; i <= 45; i++) {
			list.add(i);
		}
		
		Collections.shuffle(list);
		System.out.println(list);
		for(int i=0; i < 6; i++) {
			System.out.println("번호 = " + list.get(i));
		}
	}
}










