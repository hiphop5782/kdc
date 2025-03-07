package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test02리스트 {
	public static void main(String[] args) {
		//List(리스트)
		//- 순서를 중요시하는 가변 저장소
		//- 배열과 가장 비슷한 형태(차이는 크기의 변화 여부)
		//- Array(배열) 형태와 Linked(참조) 형태가 존재
		
		
		//프로그래밍 언어 이름들을 저장할 수 있는 ArrayList를 생성
		ArrayList a = new ArrayList();//Object가 저장됨(권장하지 않는 방법)
		ArrayList<Object> b = new ArrayList<Object>();//Object가 저장됨(권장하는 방법)
		ArrayList<String> c = new ArrayList<String>();//String이 저장됨
		ArrayList<String> d = new ArrayList<>();//오른쪽의 generic type 생략 가능
		
		List<String> e = new ArrayList<>();//업캐스팅(권장하는 형태)
		
		//메소드를 이용하여 추가, 확인, 삭제 등을 구현
		
		//데이터 추가
		//e.add(100);//설정한 저장 형태(generic type)과 일치하지 않아 오류 발생
		e.add("Java");//0
		e.add("python");//1
		e.add("C++");//2 → 3
		e.add("C#");//3 → 4
		e.add("Golang");//4 → 5
		
		e.add(2, "kotlin");//2
		
		//개수 확인
		System.out.println("데이터 개수 = " + e.size());//배열의 length와는 다름(실제 개수)
		
		//검색
		System.out.println("자바가 있나요? " + e.contains("Java"));
		System.out.println("루비가 있나요? " + e.contains("Ruby"));
		
		System.out.println("자바가 어디있나요? " + e.indexOf("Java"));
		System.out.println("루비가 어디있나요? " + e.indexOf("Ruby"));
		
		//삭제
		e.remove("python");//python을 지우세요
		e.remove(0);//0번위치를 지우세요
		
		System.out.println("e = " + e);
		
		//특정 위치의 데이터 추출
		System.out.println("0번 위치 = " + e.get(0));
		System.out.println("1번 위치 = " + e.get(1));
	}
}











