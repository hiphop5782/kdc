package stdin;

import java.util.Scanner;

public class Test02생년월일분석 {
	public static void main(String[] args) {
		//(Q) 사용자가 8자리 숫자로 생년월일을 입력했을 때, 이를 분석하여 연도/월/일로 구분하여 출력하세요
		//(EX) 19990517을 입력하면 연도(1999), 월(5), 일(17)로 나눠서 출력
		
		//도구 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생년월일을 (-) 없이 8자리로 입력하세요");
		int birth = sc.nextInt();
		
		sc.close();
		
		System.out.println("사용자가 입력한 값 : " + birth);
		
		//생년 : 8자리 숫자에서 만 단위에 해당하는 값 (1999만)이기 때문에 /10000으로 계산
		//월 : 8자리 숫자에서 만보다 작은 자리의 값 중 백 단위(05)이기 때문에 %10000 /100으로 계산
		//일 : 8자리 숫자에서 백보다 작은 자리의 값 (17)이므로 %100으로 계산
		int year = birth / 10000;
		int month = birth % 10000 / 100;
		int day = birth % 100;
		
		System.out.println("출생연도 : " + year);
		System.out.println("출생월 : " + month);
		System.out.println("출생일 : " + day);
	}
}
