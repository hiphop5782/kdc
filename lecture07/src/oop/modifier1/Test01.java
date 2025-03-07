package oop.modifier1;

public class Test01 {
	public static void main(String[] args) {
		
		//객체 지향 프로그래밍에서의 권장사항
		//- main에서 인스턴스를 처리할 때 가급적이면 메소드를 이용해서 처리하세요!
		
		Student a = new Student("홍길동", 50, 60, 70);
		a.show();
	}
}
