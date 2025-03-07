package oop.keyword2;

//계산기
public class Calculator {
	//일회성 메소드
	//- 매개변수로 전달받은 데이터를 계산하여 반환
	//- 필드에 저장하거나 필드값을 불러오지 않음
	//- static 키워드를 붙여 인스턴스 없이도 접근 가능하도록 구현
	//- static 키워드가 붙은 항목은 시작과 동시에 메모리에 등록됨
	public static int plus(int left, int right) {
		int result = left + right;
		return result;
	}
	public static int minus(int left, int right) {
		int result = left - right;
		return result;
	}
	public static float div(int left, int right) {
		return (float)left / right;
	}
}




