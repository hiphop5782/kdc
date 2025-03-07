package oop.inherit1;

//Phone 클래스의 모든 내용을 가져와서 시작! (상속)
public class IPhone extends Phone {
	//상속받은 메소드 3개 + 추가로 만든 메소드 2개 = 5개
	public void siri() {
		System.out.println("음성인식 기능 실행");
	}
	public void itunes() {
		System.out.println("아이튠즈 실행");
	}
}
