package oop.keyword3;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//상수(constant variable)의 필요성
		
		//(ex) 가위바위보를 랜덤으로 출력하는 프로그램		
		Random r = new Random();
		
		int choice = r.nextInt(RSP.SIZE);
		//System.out.println("choice = " + choice);
		
		switch(choice) {
		case RSP.SCISSORS:
			System.out.println("가위");
			break;
		case RSP.ROCK:
			System.out.println("바위");
			break;
		case RSP.PAPER:
			System.out.println("보");
			break;
		}
		
	}
}
