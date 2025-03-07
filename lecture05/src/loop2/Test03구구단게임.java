package loop2;

import java.util.Random;
import java.util.Scanner;

public class Test03구구단게임 {
	public static void main(String[] args) {
		//(Q) 사용자에게 랜덤 구구단 문제를 계속 출제하고 3번 틀리면 프로그램 종료
		//- 반복 횟수를 파악할 수 없다
		//- 특정 시점까지 반복하는 while문을 사용하는 것이 적합
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			int left = r.nextInt(8) + 2;
			int right = r.nextInt(9) + 1;
			System.out.print(left + " X " + right + " = ");
			int user = sc.nextInt();
			
			if(left * right == user) {//문제의 답 == 사용자 입력값
				//System.out.println("정답");
			}
			else {
				count++;
				System.out.println("오답.." + count+"번 틀렸습니다");
				if(count == 3) {//3번 틀렸다면
					break;
				}
			}
		}
		
		sc.close();
		
	}
}





