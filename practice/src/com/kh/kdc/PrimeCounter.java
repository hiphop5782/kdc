package com.kh.kdc;

public class PrimeCounter {
	public static void main(String[] args) {
		//소수 판정 방법
		
		int number = 6;
		
		int count = 0;
		
		for(int i=1; i <= number; i++) {
			System.out.println(number + " % "+i+" = " + number%i);
			if(number % i == 0) {//나누어 떨어진다면
				count++;
			}
		}
		
		System.out.println("count = " + count);
		
	}
}
