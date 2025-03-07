package oop.basic1;

public class Test01 {
	public static void main(String[] args) {
		//세 명의 학생에 대한 정보가 다음과 같을 때 이것을 저장하고 출력해보세요
		//[1] 이름 - 홍길동, 국어점수 - 50점, 수학점수 - 60점, 영어점수 - 70점
		//[2] 이름 - 장보고, 국어점수 - 60점, 수학점수 - 90점, 영어점수 - 60점
		//[3] 이름 - 이순신, 국어점수 - 80점, 수학점수 - 80점, 영어점수 - 80점
		
		//인스턴스 생성
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		
		a.name = "홍길동";
		a.kor = 50;
		a.eng = 60;
		a.math = 70;
		b.name = "장보고";
		b.kor = 60;
		b.eng = 90;
		b.math = 60;
		c.name = "이순신";
		c.kor = 80;
		c.eng = 80;
		c.math = 80;
		
		System.out.println("이름 : " + a.name);
		System.out.println("국어 : " + a.kor);
		System.out.println("영어 : " + a.eng);
		System.out.println("수학 : " + a.math);
		System.out.println("이름 : " + b.name);
		System.out.println("국어 : " + b.kor);
		System.out.println("영어 : " + b.eng);
		System.out.println("수학 : " + b.math);
		System.out.println("이름 : " + c.name);
		System.out.println("국어 : " + c.kor);
		System.out.println("영어 : " + c.eng);
		System.out.println("수학 : " + c.math);
	}
}








