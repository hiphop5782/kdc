package oop.modifier2;

//과목 클래스
public class Subject {
	//멤버 필드 (잠금)
	private String title;
	private String type;
	private int duration;
	private int price;
	
	//멤버 메소드 (setter/getter)
	void setTitle(String title) {
		this.title = title;
	}
	void setType(String type) {
		this.type = type;
	}
	void setDuration(int duration) {
		if(duration <= 0) return;//0 이하면 차단
		if(duration % 30 != 0) return;//30의 배수가 아니면 차단
		this.duration = duration;
	}
	void setPrice(int price) {
		if(price < 0) return;//음수면 차단
		this.price = price;
	}
	
	String getTitle() {
		return this.title;
	}
	String getType() {
		return this.type;
	}
	int getDuration() {
		return this.duration;
	}
	int getPrice() {
		return this.price;
	}
	int getPricePerHour() {
		return this.getPrice() / this.getDuration();
	}
	
	void show() {
		System.out.println("<과목 정보>");
		System.out.println("과목명 : " + this.getTitle());
		System.out.println("유형 : " + this.getType());
		System.out.println("강의시간 : " + this.getDuration());
		System.out.println("수강료 : " + this.getPrice()+"원");
		System.out.println("수강료(시간당) : " + this.getPricePerHour() + "원");
	}
	
	//생성자
	Subject(String title, String type, int duration, int price) {
		this.setTitle(title);
		this.setType(type);
		this.setDuration(duration);
		this.setPrice(price);
	}
}










