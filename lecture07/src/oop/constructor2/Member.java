package oop.constructor2;

//회원 클래스
public class Member {
	//멤버 필드(데이터)
	String id;
	String pw;
	String grade;
	int point;
	
	//멤버 메소드(코드)
	void show() {
		System.out.println("아이디 : " + this.id);
		//System.out.println("비밀번호 : " + this.pw);
		System.out.println("등급 : " + this.grade);
		System.out.println("포인트 : " + this.point);
	}
	
	//생성자(초기화)
	Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
		this.grade = "일반회원";
		this.point = 100;
	}
	//Member(String id, String pw, String grade){}
	//Member(String id, String pw, String grade, int point){}
	
}
