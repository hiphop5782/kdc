package loop3;

import java.util.Scanner;

public class Test01DoWhile반복문 {
	public static void main(String[] args) {
		//do-while 반복문
		//- for, while과는 다르게 먼저 한 번 실행을 한 뒤 반복 여부를 결정하는 구조
		//- (ex) 입력을 한번 받아봐야 검사가 가능한 경우
		
		//do {
		// 		실행할 코드
		//}
		//while(조건);
		
		//(ex) 사용자가 0에서 100점 사이의 점수를 입력하도록 만드는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int score;
		do {
			System.out.print("점수 입력 : ");
			score = sc.nextInt();
		}
		while(score < 0 || score > 100);
		
		System.out.println("입력한 점수는 "+score+"점 입니다");
		
		sc.close();
	}
}











