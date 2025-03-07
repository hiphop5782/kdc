package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test02Set기본명령 {
	public static void main(String[] args) {
		//Set의 주요 명령
		
		Set<String> tree = new TreeSet<>();
		
		//데이터 추가
		tree.add("한국");
		tree.add("일본");
		tree.add("중국");
		tree.add("미국");
		tree.add("호주");
		tree.add("호주");//중복 데이터 추가 불가
		
		//개수 확인
		System.out.println("데이터 개수 = " + tree.size());
		
		//검색
		System.out.println("한국이 있습니까? " + tree.contains("한국"));
		System.out.println("영국이 있습니까? " + tree.contains("영국"));
		
		//삭제
		tree.remove("중국");
		
		//출력
		System.out.println(tree);
		
		//System.out.println(tree.get(0));//index가 없기 때문에 불가
		for(String name : tree) {//확장 반복으로 전체 순회는 가능
			System.out.println("나라명 = " + name);
		}
	}
}








