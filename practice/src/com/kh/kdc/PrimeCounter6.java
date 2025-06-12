package com.kh.kdc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeCounter6 {
	public static void main(String[] args) {
		//입력 도구 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하세요 (A B, A ≤ B) : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a > b) {
			System.out.println("작은 수를 먼저 입력하세요");
			return;//메인 메소드 중지(사실상 프로그램 종료와 같음)
		}
		
		//소수 판정
		int primeCount = 0;
		List<Integer> numbers = new ArrayList<>();
		for(int i=a; i <= b; i ++) {
			if(isPrime(i)) {
				primeCount++;
				numbers.add(i);
			}
		}
		System.out.println(a+"~"+b+" 사이에 소수는 총 "+primeCount+"개 있습니다");
		System.out.println("숫자 : " + numbers);
	}
	//소수를 판정하는 메소드(static)
	//(1) 1과 자기자신으로 나누면 어떤 숫자든 0이 나온다 (할 필요 없다)
	//(2) 1은 무조건 소수가 아니어야 한다
	//(3) 1과 자기자신을 제외하고 나누어 떨어지는 숫자가 한개라도 나오면 그 뒤의 작업을 하지 않고 소수가 아니라고 판정
	public static boolean isPrime(int number) {
		if(number < 2) return false;//(2)
		for(int i=2; i < number; i++) {
			if(number % i == 0) {//나누어 떨어진다면
				return false;//(3)
			}
		}
		return true; 
	}
}
