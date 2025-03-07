package random;

import java.util.Random;
import java.util.Scanner;

public class Test02랜덤구구단 {
	public static void main(String[] args) {
		//(Q) 랜덤으로 구구단 문제 하나를 출력하고 사용자가 입력하여 맞추도록 구현하세요
		//- 가장 작은 단수의 첫 번째 문제 2 x 1
		//- 가장 큰 단수의 마지막 문제 9 x 9
		//- 단과 숫자를 각각 추첨해야 하며 단은 2~9 , 숫자는 1~9의 범위를 가진다
		
		//도구 생성
		Random r = new Random();
		
		//값 추첨
		int left = r.nextInt(8) + 2;
		int right = r.nextInt(9) + 1;
		int answer = left * right;
		System.out.print(left + " X " + right + " = ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		if(answer == input) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		
	}
}







