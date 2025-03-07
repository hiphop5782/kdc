package api.lang.exception;

import java.util.Scanner;

public class Test05예외정보출력하기 {
	public static void main(String[] args) {
		//예외 처리하기 전처럼 스택 추적 결과(stack trace)를 출력하고 싶다면?
		try (
			Scanner sc = new Scanner(System.in);
		) {
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
			//e.printStackTrace();//예외처리를 안한것처럼 스택 추적결과를 출력
			if(e.getMessage() == null) {
				System.err.println("프로그램에서 오류가 발생했습니다");
			}
			else {
				System.err.println("오류 : " + e.getMessage());
			}
		}
		
	}
}
