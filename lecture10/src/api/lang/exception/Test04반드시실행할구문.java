package api.lang.exception;

import java.util.Scanner;

public class Test04반드시실행할구문 {
	public static void main(String[] args) {
		//throw에서 경고가 뜨는 이유와 해결책 살펴보기
		//- finally 구문 사용 (예외 발생 여부와 관계없이 무조건 실행하는 구문)
		//- try with resource 구문 사용 (Java 8+)
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("총 금액 : ");
			int total = sc.nextInt();
			if(total <= 0) {
				throw new Exception("금액은 0보다 커야합니다");
			}
			
			System.out.print("인원 수 : ");
			int people = sc.nextInt();
			if(people < 0) { 
				throw new Exception("인원 수는 0보다 작을 수 없습니다");
			}
			
			int money = total / people;
			int remain = total % people;
			
			System.out.println("1인당 금액 : " + money);
			System.out.println("자투리 : " + remain);
		}
		catch(Exception e) {
			if(e.getMessage() == null) {
				System.err.println("프로그램에서 오류가 발생했습니다");
			}
			else {
				System.err.println("오류 : " + e.getMessage());
			}
		}
		//선택적으로 finally 구문을 추가할 수 있다
		finally {
			sc.close();
		}
	}
}
