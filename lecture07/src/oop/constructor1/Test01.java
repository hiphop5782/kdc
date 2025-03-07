package oop.constructor1;

public class Test01 {
	public static void main(String[] args) {
		//생성자(constructor)
		//- 인스턴스를 생성하면서 정보를 초기화할 수 있는 도구
		
		Player p1 = new Player("테스트유저", "전사", 50, 300);
		p1.show();
		
		Player p2 = new Player("일반사용자", "마법사");
		p2.show();
		
//		Player p3 = new Player();//허락되지 않은 생성방법
//		p3.show();
	}
}
