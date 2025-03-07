package oop.modifier1;

//학생 클래스
public class Student {
	//멤버 필드 - 클래스 외부의 직접 접근을 차단(private)
	private String name;
	private int korean;
	private int english;
	private int math;
	
	//멤버 메소드
	//setter 메소드
	void setName(String name) {
		this.name = name;
	}
	void setKorean(int korean) {
		if(korean >= 0 && korean <= 100) {
			this.korean = korean;
		}
	}
	void setEnglish(int english) {
		if(english < 0 || english > 100) {
			return;//메소드 종료
		}
		this.english = english;
	}
	void setMath(int math) {
		if(math < 0 || math > 100) return;
		this.math = math;
	}
	//getter 메소드
	//- return 키워드를 통해 가진 값을 반환하며 종료
	//- void는 반환할 데이터가 없다는 의미
	//- void 반환할 데이터의 형태를 작성해야 한다
	String getName() {
		return this.name;//주인공의 이름을 반환
	}
	int getKorean() {
		return this.korean;
	}
	int getEnglish() {
		return this.english;
	}
	int getMath() {
		return this.math;
	}
	//- 가진 데이터로 계산하여 결과를 만들 수 있다
	int getTotal() {
		return this.korean + this.english + this.math;
	}
	float getAverage() {
		return (float)this.getTotal() / 3;
	}
	
	void show() {
		//System.out.println("이름 : " + this.name);
		System.out.println("이름 : " + this.getName());
		System.out.println("국어 : " + this.getKorean());
		System.out.println("영어 : " + this.getEnglish());
		System.out.println("수학 : " + this.getMath());
		System.out.println("총점 : " + this.getTotal());
		System.out.println("평균 : " + this.getAverage());
	}
	
	//생성자
	Student(String name, int korean, int english, int math) {
		this.setName(name);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
}














