package oop.inherit1;

//휴대폰 클래스 - 아이폰과 갤럭시 휴대폰의 공통점들을 보관할 공용 클래스
public class Phone {
	public void call() {
		System.out.println("전화 걸기");
	}
	public void sms() {
		System.out.println("문자 보내기");
	}
	public void camera() {
		System.out.println("카메라 사용하기");
	}
}
