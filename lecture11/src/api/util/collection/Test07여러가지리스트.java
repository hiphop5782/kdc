package api.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test07여러가지리스트 {
	public static void main(String[] args) {
		//여러가지 리스트 종류들
		//- 종류와 상관없이 "순서"를 중요시하는 특징이 있다
		//- Array는 배열처럼 연속된 공간을 사용하며, Linked는 연속되지 않은 공간을 참조로 연결하여 사용한다
		//- 사용 명령은 같으며 구조가 다르기 때문에 용도에 맞는 저장소 선택이 중요하다!
				
		List<String> a = new ArrayList<>();
		List<String> b = new LinkedList<>();
		
		a.add("홍길동");		b.add("홍길동");
		a.add("이순신");		b.add("이순신");
		a.add("장보고");		b.add("장보고");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
