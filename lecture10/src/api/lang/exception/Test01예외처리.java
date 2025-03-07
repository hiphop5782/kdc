package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01예외처리 {
	public static void main(String[] args) {
		//에러(Error)와 예외(Exception)
		//- 에러는 프로그램 실행에 치명적인 문제상황 (ex : 오타, 메모리 부족, ...)
		//- 예외는 프로그램 실행 중에 발생하는 돌발상황 (ex : 입력오류, 배열범위초과, ...)
		
		//문제점 조사
		//- "1000원" 입력하니 java.util.InputMismatchException 발생
		//- "1.5" 입력하니 java.util.InputMismatchException 발생
		//- "128371823781237812738172" 입력하니 java.util.InputMismatchException 발생
		//- 인원수에 0을 입력하니 java.lang.ArithmeticException 발생
		
		//try에는 정상적인 실행 코드를 작성(Plan A)
		//catch에는 돌발 상황에 대한 대처 코드를 작성(Plan B)
		
		//n분의 1 계산기
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("총 금액 : ");
			int total = sc.nextInt();
			System.out.print("인원 수 : ");
			int people = sc.nextInt();
			sc.close();
			
			int money = total / people;
			int remain = total % people;
			
			System.out.println("1인당 금액 : " + money);
			System.out.println("자투리 : " + remain);
		}
		catch(InputMismatchException e) {
			System.out.println("금액을 잘못 입력하셨습니다");
		}
		catch(ArithmeticException e) {
			System.out.println("인원 수는 0일 수 없습니다");
		}
	}
}







