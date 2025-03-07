package stdout;

public class Test01표준출력 {
	public static void main(String[] args) {
		//표준 출력
		//- 시스템에서 제공하는 표준 출력 통로를 이용하여 메세지를 결과화면에 내보내는 행위
		//- 시스템은 무엇인지 알 수 없음(ex : Windows, Linux, Mac, ...)
		//- 자바에서 System 이라는 도구(클래스)를 제공하여 이를 이용하는 형태로 프로그래밍을 구현
		
		System.out.println("한 줄에 걸쳐서 메세지를 출력하는 명령");
		System.out.println("한 줄에 걸쳐서 메세지를 출력하는 명령");
		
		System.out.print("메세지를");
		System.out.print("이어서");
		System.out.print("출력합니다");
		
		//줄바꿈
		System.out.print("\n");
		System.out.println();
		
		int a = 100;
		System.out.println("a = " + a);
		System.out.printf("a = %d\n", a);
		
		//C언어 스타일 출력구문
		//- 미완성된 형식이 포함된 문자열과 값을 조합하여 완성된 구문을 만들어낸다
		//- %d (decimal, 정수 자리)
		//- %f (float, 실수 자리)
		//- %c (char, 글자 자리)
		//- %s (String, 문자열 자리)
		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		System.out.printf("%d + %f = %f\n", 5, 1.5, 6.5);
	}
}




