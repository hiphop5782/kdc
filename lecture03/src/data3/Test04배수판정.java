package data3;

public class Test04배수판정 {
	public static void main(String[] args) {
		//(Q) 3의 배수면서 짝수가 아닌 숫자를 찾아라!
		//- 배수란 나눗셈의 나머지가 0이 되는 숫자
		//- 짝수(2의 배수)란 두 개씩 묶었을 때 나머지가 없는 수(2, 4, 6, 8, ...)
		//- 3의 배수란 세 개씩 묶었을 때 나머지가 없는 수(3, 6, 9, 12, ...)
		
		int number = 123;
		
		//boolean condition1 = number % 2 == 1;
		boolean condition1 = number % 2 != 0;
		boolean condition2 = number % 3 == 0;
		System.out.println("condition1 = " + condition1);
		System.out.println("condition2 = " + condition2);
		
		boolean result = condition1 && condition2;
		System.out.println("짝수가 아닌 3의배수 ? " + result);
	}
}
