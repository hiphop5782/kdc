package oop.basic2;

public class Test01 {
	public static void main(String[] args) {
		//클래스를 만들고 인스턴스를 생성하여 다음 정보를 저장한 뒤 출력하세요
		//1. 이름 - 초코송이, 분류 - 과자, 가격 - 1000원
		//2. 이름 - 빼빼로, 분류 - 과자, 가격 - 1200원
		//3. 이름 - 코카콜라, 분류 - 음료, 가격 - 2000원
		
		//인스턴스 생성
		Item a = new Item();
		Item b = new Item();
		Item c = new Item();
		
		//정보 초기화
		a.init("초코송이", "과자", 1000);
		b.init("빼빼로", "과자", 1200);
		c.init("코카콜라", "음료", 2000);
		
		//출력
		a.show();
		b.show();
		c.show();
	}
}
