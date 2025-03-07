package oop.constructor2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//입력이 필요한 경우 main 메소드에서 미리 입력받아 생성하도록 구현
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		sc.close();
		
		//인스턴스 생성
		Member a = new Member(id, pw);
		a.show();
	}
}
