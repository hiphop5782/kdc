package oop.modifier3;

//호텔 클래스
public class Hotel {
	//필드
	private String name;//이름
	private String region;//지역
	private int star;//성급
	
	//필드를 제외한 요소들은 가급적 공개처리(public)
	//- 다른 패키지에서도 이용 가능
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}

	public void show() {
		System.out.println("<호텔 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("지역 : " + this.region);
		System.out.println("성급 : " + this.star);
	}
	
	public Hotel(String name, String region, int star) {
		this.setName(name);
		this.setRegion(region);
		this.setStar(star);
	}
}


