package oop.basic3;

public class Country {
	//멤버 필드
	String name;
	String capital;
	int population;
	
	//멤버 메소드
	void init(String name, String capital, int population) {
		this.name = name;
		this.capital = capital;
		this.population = population;
	}
	void show() {
		System.out.println("<국가 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("수도 : " + this.capital);
		System.out.println("인구 : " + this.population);
	}
}
