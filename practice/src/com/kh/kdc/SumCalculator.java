package com.kh.kdc;

import java.util.Scanner;

public class SumCalculator {
	public static void main(String[] args) {
		//사용자에게 두 개의 정수를 입력받는 코드
		
		//입력 도구 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 정수를 입력하세요(A B) : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();//정리
		
		if(a < b) {//정상적으로 입력이 이루어진 경우
			//누적 합 계산
			//int sum = a + (a+1) + (a+2) + (a+3) + ... + (b-2) + (b-1) + b;
			int sum = 0;
			for(int i=a; i <= b; i++) {
				sum += i;
			}
			
			System.out.println(a+"부터 "+b+"까지의 합계 = " + sum);
		}
		else {//비정상적인 입력이 이루어진 경우
			System.out.println("작은 수를 먼저 입력하세요");
		}
		
	}
}





