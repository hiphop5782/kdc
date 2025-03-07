package oop.inherit2;

//상위 클래스 구현 시 주의사항
//1. 생성자가 있으면 상속받을 때 반드시 생성자를 구현!
//2. 의미없이 형태만 존재하는 메소드가 필요하다
//- 추상(abstract) 키워드를 사용
public abstract class Phone {//추상클래스
	private String number;//전화번호
	
	public Phone(String number) {
		this.number = number;
	}
	
	//추상 메소드
	public abstract void call();
	public abstract void sms();
	public abstract void camera();
}
