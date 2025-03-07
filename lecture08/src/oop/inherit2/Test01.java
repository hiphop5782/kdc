package oop.inherit2;

public class Test01 {
	public static void main(String[] args) {
		//추상클래스는 인스턴스 생성이 불가능하다
		//Phone p = new Phone("010-1212-3434");
		
		Galaxy p1 = new Galaxy("010-1212-3434");
		p1.call();
		p1.sms();
		p1.camera();
		
		IPhone p2 = new IPhone("010-1234-5678");
		p2.call();
		p2.sms();
		p2.camera();
	}
}
