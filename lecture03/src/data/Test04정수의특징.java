package data;

public class Test04정수의특징 {
	public static void main(String[] args) {
		//정수의 특징
		//[1] 크기가 제한되어 있다
		int a = 100;
		//int b = 5000000000;
		
		//[2] 종류가 여러 가지가 있다 (byte, short, char, int, long)
		byte c = 127;//파일 제어
		short d = 32767;//과거에 만든 프로그램과의 호환 용도(실제로 잘 사용하지 않음)
		//int e = -2147483648;
		int e = 2147483647;//정수의 대표 자료형
		long f = 100000000000000L;//int로 표현할 수 없는 값
		System.out.println(f);
		
		//디지털 신호(0/1)를 이용하는 데이터 체계를 가지므로 2진수로 모든 값을 표현한다
		//1bit로는 두 가지(0과1) 데이터를 표현할 수 있다
		//비트들을 모아서 원하는 규격을 생성
		//8bit를 모으면 256(2^8)가지의 데이터 종류를 표현할 수 있는데 이것이 표준 단위이다(1byte)
		//byte(1), short(2), int(4), long(8)
		
		//[3] 데이터가 순환한다
		//- 범위를 벗어나는 값은 대입할 수 없으나 계산 중에 범위를 벗어날 경우 부호가 반대가 된다
		long g = 1234567L;
		long h = g * g;
		System.out.println(g);
		System.out.println(h);
		
		//[4] 정수끼리의 연산은 결과가 정수이다
		int s1 = 10;
		int s2 = 3;
		System.out.println(s1 + s2);//13(int)
		System.out.println(s1 - s2);//7(int)
		System.out.println(s1 * s2);//30(int)
		System.out.println(s1 / s2);//3(int)
		System.out.println(s1 % s2);//1(int)
	}
}











