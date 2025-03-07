package api.lang.exception;

public class Test06예외전가 {
	public static void main(String[] args) {
		//객체 지향 프로그래밍에서의 좋은 예외 처리 방법
		//- 가급적이면 try구문은 사용을 최소화하는 것이 좋다
		
		try {
			int a = 10;
			int b = 0;
			int c = Calculator.div(a, b);
			System.out.println("c = " + c);
		}
		catch(Exception e) {
			System.err.println("오류 발생");
		}
	}
}
