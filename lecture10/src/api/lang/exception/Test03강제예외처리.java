package api.lang.exception;

import java.util.Scanner;

public class Test03강제예외처리 {
	public static void main(String[] args) {
		//자바에서 인지하지 못하는 예외를 강제적으로 처리
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("총 금액 : ");
			int total = sc.nextInt();
			if(total <= 0) {
				throw new Exception("금액은 0보다 커야합니다");
			}
			
			System.out.print("인원 수 : ");
			int people = sc.nextInt();
			if(people < 0) { 
//				Exception e = new Exception("인원 수는 0보다 작을 수 없습니다");
//				throw e;
				throw new Exception("인원 수는 0보다 작을 수 없습니다");
			}
			
			sc.close();
			
			int money = total / people;
			int remain = total % people;
			
			System.out.println("1인당 금액 : " + money);
			System.out.println("자투리 : " + remain);
		}
		catch(Exception e) {
			//System.out.println("프로그램에서 오류가 발생했습니다");
			
			//예외 정보가 담긴 인스턴스 e를 분석해서 여러 가지 정보들을 확인할 수 있다.
			if(e.getMessage() == null) {
				System.err.println("프로그램에서 오류가 발생했습니다");
			}
			else {
				System.err.println("오류 : " + e.getMessage());
			}
		}
	}
}





