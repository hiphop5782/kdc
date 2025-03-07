package data2;

public class Test01실수의특징 {
	public static void main(String[] args) {
		//실수
		// - 소수점이 있는 숫자
		// - 고정소수점, 부동소수점(자바는 부동소수점 방식 사용)
		// - 표현 범위는 넓으나 표현 가능한 자리(정확도)가 부족함
		// - float(4), double(8) 두 가지로 나눠지며 double 이 기본 형태
		// - 실수가 포함된 계산의 결과는 실수이다
		
		//float a = 1.2345;
		float a = 1.2345f;
		double b = 1.2345;
		System.out.println(a);
		System.out.println(b);
		
		float c = 1.234131353195981239812938123f;
		double d = 1.234131353195981239812938123;
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(10 + 1.5);//int + double => double
		System.out.println(10 - 1.5);//int - double => double
		System.out.println(1.5 + 2.5);//double + double => double
		System.out.println(10 / 3);//int / int => int
		System.out.println(10.0 / 3);//double / int => double
	}
}
