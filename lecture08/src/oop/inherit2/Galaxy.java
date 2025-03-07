package oop.inherit2;

public class Galaxy extends Phone {

	public Galaxy(String number) {
		super(number);
	}
	
	//상속 받은 추상 메소드는 반드시 구현(implement)한다
	//- 메소드 재정의(override)
	@Override//애노테이션(annotation), 역할을 명시하는 도구
	public void call() {
		System.out.println("갤럭시의 전화걸기 기능");
	}
	@Override
	public void sms() {
		System.out.println("갤럭시의 문자 기능");
	}
	@Override
	public void camera() {
		System.out.println("갤럭시의 카메라 기능");
	}
	
}
