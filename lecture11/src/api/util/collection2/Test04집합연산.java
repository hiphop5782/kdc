package api.util.collection2;

import java.util.HashSet;
import java.util.Set;

public class Test04집합연산 {
	public static void main(String[] args) {
		//Set과 집합연산
		//- 합집합, 교집합, 차집합을 계산하기 위하여 Set을 사용할 수 있다.
		//- addAll(), retainAll(), removeAll()
		
		//(ex) 철수와 영희가 각각 좋아하는 색상은 다음과 같다.
		//- 철수 : 빨강, 주황, 보라
		//- 영희 : 노랑, 초록, 파랑, 보라
		
		//[합집합] 철수와 영희가 한 명이라도 좋아하는 색상을 모두 나열해보세요
		//[교집합] 철수와 영희가 둘 다 좋아하는 색상을 모두 나열해보세요
		//[차집합] 철수만 좋아하고 영희는 좋아하지 않는 색상을 모두 나열해보세요 (반대도 가능)
		
		//샘플 집합 생성 (불변 집합 생성) Java 9+
		Set<String> a = Set.of("빨강", "주황", "보라");
		Set<String> b = Set.of("노랑", "초록", "파랑", "보라");
		
		//[합집합]
		Set<String> union = new HashSet<>();
		union.addAll(a);//a의 모든 요소를 union에 추가
		union.addAll(b);//b의 모든 요소를 union에 추가
		System.out.println("union = " + union);
		
		//[교집합]
		Set<String> intersect = new HashSet<>();
		intersect.addAll(a);//a의 모든 요소를 intersect에 추가
		intersect.retainAll(b);//b와 겹치는 요소만 intersect에 추가
		System.out.println("intersect = " + intersect);
		
		//[차집합]
		Set<String> minus = new HashSet<>();
		minus.addAll(a);//a의 모든 요소를 minus에 추가
		minus.removeAll(b);//b와 겹치는 요소를 minus에서 제거
		System.out.println("minus = " + minus);
	}
}











