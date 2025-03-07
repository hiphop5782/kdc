package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02로그인프로그램 {
	public static void main(String[] args) {
		//(Q) 임의의 아이디와 비밀번호를 저장해두고 사용자에게 입력받아 로그인을 판정하는 프로그램을 구현하세요
		//- 아이디는 유일해야 하며, 비밀번호는 유일하지 않아도 된다
		//- 아이디와 비밀번호는 세트이다
		
		//아이디, 비밀번호 준비
		Map<String, String> database = new HashMap<>();
		database.put("test", "test1234");
		database.put("admin", "admin1234");
		database.put("student", "student1234");
		database.put("master", "master1234");
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.next();
		System.out.print("비밀번호 : ");
		String userPw = sc.next();
		sc.close();
		
		//판정
		//if(아이디가 있으면서 비밀번호가 맞으면) {
		//if(database.containsKey(userId) && database.containsValue(userPw)) {//문제가 심각한 코드
		if(database.containsKey(userId) && userPw.equals(database.get(userId))) {//정상적인 코드
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
}








