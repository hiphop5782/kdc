package oop.keyword1;

public class Test01 {
	public static void main(String[] args) {
		//final 키워드의 사용
		//- 불변의 의미를 가지는 키워드
		//- 변수, 필드, 메소드, 클래스 등에 사용 가능
		//- 추가된 위치의 항목에 변화를 주는 행위를 금지함
		
		final int a = 10;
		//a = 20;
		//a = 30;
		System.out.println("a = " + a);
	}
}
