package oop.basic2;

public class Item {
	//멤버 필드
	String name;
	String type;
	int price;
	
	//멤버 메소드
	//- 공통된 코드를 보관하는 도구
	//- 형태 : void 이름(준비물){코드}
	//- 메소드에서 this를 사용할 수 있으며 "주인공"을 의미한다
	void init(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}

	void show() {
		System.out.println("이름 : " + this.name);
		System.out.println("분류 : " + this.type);
		System.out.println("가격 : " + this.price+"원");
	}
}
