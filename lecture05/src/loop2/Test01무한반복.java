package loop2;

import java.util.Random;

public class Test01무한반복 {
	public static void main(String[] args) {
		//while 반복문
		//- 특정 조건에 만족하면 계속해서 실행하는 반복문
		//- 횟수가 불확실한 경우에도 사용할 수 있다
		
		Random r = new Random();
		
		while(true) {
			int number = r.nextInt(100) + 1;//1부터 100개
			System.out.println("number = " + number);
			
			if(number == 100) {
				break;//그만 반복해라!
			}
		}
		
	}
}
