package api.util.collection;

import java.util.Arrays;
import java.util.List;

public class Test06불변리스트 {
	public static void main(String[] args) {
		//불변 리스트(immutable list)
		//- 배열처럼 크기가 변하지 않는 리스트
		//- 간편하게 만들어서 사용
		
		//Java 8+
		//String[] a = new String[]{"홍길동", "이순신", "장보고"};
		List<String> a = Arrays.asList("홍길동", "이순신", "장보고");
		for(int i=0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println("이름 = " + name);
		}
		
		System.out.println("---");
		
		//Java 9+
		List<String> b = List.of("홍길동", "이순신", "장보고");
		for(String name : b) {//확장 반복문(전체 반복만 가능하며 별도의 인덱스 없이 편하게 사용)
			System.out.println("이름 = " + name);
		}
	}
}












