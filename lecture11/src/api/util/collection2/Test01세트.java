package api.util.collection2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01세트 {
	public static void main(String[] args) {
		//Set
		//- List와 다르게 전체를 빠르게 접근하는 것을 목표로 삼는 저장소
		//- 개별적인 접근은 어려움
		//- 트리(Tree) 형태와 해시(Hash) 형태로 구현
		//- 둘 중 어느 방식으로 구현하더라도 중복은 불가능하다
		
		Set<String> tree = new TreeSet<>();
		Set<String> hash = new HashSet<>();
		
		tree.add("피카츄");		hash.add("피카츄");
		tree.add("라이츄");		hash.add("라이츄");
		tree.add("파이리");		hash.add("파이리");
		tree.add("꼬부기");		hash.add("꼬부기");
		tree.add("버터플");		hash.add("버터플");
		tree.add("버터플");		hash.add("버터플");//중복데이터(추가되지 않음)
		
		System.out.println("tree = " + tree);
		System.out.println("hash = " + hash);
	}
}










