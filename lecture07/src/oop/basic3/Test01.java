package oop.basic3;

public class Test01 {
	public static void main(String[] args) {
		//인스턴스 생성
		Country c1 = new Country();
		Country c2 = new Country();
		Country c3 = new Country();
		
		//정보 초기화
		c1.init("한국", "서울", 50000000);
		c2.init("일본", "도쿄", 120000000);
		c3.init("중국", "베이징", 1400000000);
		
		//출력
		c1.show();
		c2.show();
		c3.show();
	}
}
