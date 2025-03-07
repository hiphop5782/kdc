package api.lang.exception;

import java.util.Scanner;

public class Test02통합예외처리 {
	public static void main(String[] args) {
		//예외를 통합하여 처리하는 방법
		//- 공통된 상속 관계일 경우 상위 클래스로 통합하여 처리할 수 있다(다형성의 원리)
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
//		catch(Object e) {//안됨
//		catch(Throwable e) {//Error + Exception을 통합 처리할 경우
		catch(Exception e) {//모든 예외를 통합 처리할 수 있는 구문
//		catch(RuntimeException e) {
			System.out.println("프로그램에서 오류가 발생했습니다");
		}
	}
}
