package com.kh.kdc;

public class PrimeCounter2 {
	public static void main(String[] args) {
		//소수 판정 방법
		int number = 7;
		boolean result = isPrime(number);
		System.out.println("소수? " + result);
	}
	//소수를 판정하는 메소드(static)
	public static boolean isPrime(int number) {
		int count = 0;
		for(int i=1; i <= number; i++) {
			if(number % i == 0) {//나누어 떨어진다면
				count++;
			}
		}
		return count == 2;//count가 2인가요(1과 자기자신으로만 나누어 떨어지나요)? 
	}
}
