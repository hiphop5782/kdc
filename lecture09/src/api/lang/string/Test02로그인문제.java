package api.lang.string;

import java.util.Scanner;

public class Test02로그인문제 {
	public static void main(String[] args) {
		//(Q) 사용자에게 아이디와 비밀번호를 입력받아 로그인 성공/실패를 출력하는 프로그램 구현
		//- 단, 아이디는 "testuser"이고 비밀번호는 "test1234"여야 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		sc.close();
		
//		if(id == "testuser" && pw == "test1234") {
		if(id.equals("testuser") && pw.equals("test1234")) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
}








