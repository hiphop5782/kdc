package oop.inherit2;

public class IPhone extends Phone {

	public IPhone(String number) {
		super(number);
	}

	@Override
	public void call() {
		System.out.println("아이폰의 전화걸기 기능");
	}
	@Override
	public void sms() {
		System.out.println("아이폰의 문자 기능");
	}
	@Override
	public void camera() {
		System.out.println("아이폰의 카메라 기능");
	}

}
