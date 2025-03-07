package random;

import java.util.Random;
import java.util.Scanner;

public class Test02랜덤구구단2 {
	public static void main(String[] args) {
		//(Q) 랜덤으로 구구단 문제 하나를 출력하고 사용자가 입력하여 맞추도록 구현하세요
		//- 가장 작은 단수의 첫 번째 문제 2 x 1
		//- 가장 큰 단수의 마지막 문제 9 x 9
		//- 단과 숫자를 각각 추첨해야 하며 단은 2~9 , 숫자는 1~9의 범위를 가진다
		
		//도구 생성
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int correct = 0;
		int incorrect = 0;
		
		for(int i=1; i <= 10; i++) {//10번
			//값 추첨
			int left = r.nextInt(8) + 2;
			int right = r.nextInt(9) + 1;
			int answer = left * right;
			System.out.print(left + " X " + right + " = ");
			
			int input = sc.nextInt();
			
			if(answer == input) {
				//System.out.println("정답");
				correct++;
			}
			else {
				//System.out.println("오답");
				incorrect++;
			}
		}
		
		sc.close();
		
		System.out.println("정답 개수 = " + correct);
		System.out.println("오답 개수 = " + incorrect);
		
	}
}







