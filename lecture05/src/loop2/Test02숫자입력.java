package loop2;

import java.util.Scanner;

public class Test02숫자입력 {
	public static void main(String[] args) {
		//사용자가 0을 입력하기 전까지 계속해서 숫자를 입력받아 종료 후 합계, 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;//누적 합계
		int count = 0;//입력 횟수
		
		while(true) {
			System.out.print("숫자 입력(0 입력 시 종료) : ");
			int number = sc.nextInt();
			
			//count++;//0을 입력한 경우도 카운트
			
			//탈출 : 0이 입력된다면(number가 0이면)
			if(number == 0) {
				break;
			}
			
			count++;//0을 입력한 경우는 제외하고 카운트
			total += number;//0을 제외하고 누적 합계 계산
		}
		
		sc.close();
		
		System.out.println("입력 횟수 : " + count);
		System.out.println("누적 합계 : " + total);
		
		double average = (double)total / count;
		System.out.println("평균 : " + average);
	}
}







