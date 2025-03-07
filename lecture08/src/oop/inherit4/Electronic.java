package oop.inherit4;

//인터페이스(interface)
//- 다중상속을 위한 전용 클래스
//- super로 지칭할 수 없음
public interface Electronic {
	//필드 - 불변(final)만 가능. 사실상 불가능
	//생성자 - 만들 수 없음
	//메소드 - 추상만 가능(키워드 생략 가능)
	//무조건 공개로 만들어야 한다(키워드 생략 가능)
	void on();
	void off();
	void charge();
}
