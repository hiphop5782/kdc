package oop.keyword2;

public class Test01 {
	public static void main(String[] args) {
		//static 키워드가 필요한 상황
		//- 인스턴스가 필요하지 않은 경우(일회성 계산)
		
		int a = 10;
		int b = 20;
		
		int c = Calculator.plus(a, b);
		System.out.println("c = " + c);
		
		int d = Calculator.minus(a, b);
		System.out.println("d = " + d);
		
		float e = Calculator.div(a, b);
		System.out.println("e = " + e);
	}
}
