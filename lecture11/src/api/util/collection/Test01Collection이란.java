package api.util.collection;

import java.util.ArrayList;

public class Test01Collection이란 {
	public static void main(String[] args) {
		//JCF(Java Collection Framework)
		//- 가변적인 대용량 데이터를 처리하기 위한 도구의 집합
		//- 배열과 다른 점은 가변 데이터를 처리할 수 있다는 것
		//- 최상위 인터페이스는 Collection<E>
		//- <E>는 제네릭 타입(Generic type)이라고 부르며 내용물의 자료형 (성능 향상, Java 1.5+)
		//- 인덱스 기반으로 처리하는 배열과 달리 메소드 기반으로 처리
		
		//String[] data = new String[20];
		ArrayList<String> data = new ArrayList<String>();
	}
}
