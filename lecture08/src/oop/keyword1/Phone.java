package oop.keyword1;

//클래스에 final을 추가
//- 상속을 받을 수 없도록 처리
//public final class Phone{
public class Phone {
	//멤버 필드에 final을 추가
	//- 필드 생성 시 초기값을 부여하거나 (모든 인스턴스가 동일한 값을 가지며 변경은 불가)
	//- 생성자에서 반드시 해당 항목을 초기화하도록 구현 (모든 인스턴스가 다른 값을 가질 수 있고 변경은 불가)
	final String serialId;
	
	Phone(String serialId) {
		this.serialId = serialId;
	}
	
	//멤버 메소드에 final 추가
	//- 재정의(변경) 금지 처리
	final void info() { 
		System.out.println("시리얼 번호 : " + this.serialId);
	}
}
