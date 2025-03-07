package oop.inherit3;

public class Chrome extends Browser {

	//Browser의 생성자를 모두 충족
	public Chrome(String version) {
		super(version);
	}
	public Chrome(String url, String version) {
		super(url, version);
	}
	
	@Override
	public void move() {
		System.out.println("크롬 브라우저의 이동 기능 실행");
	}
	@Override
	public void refresh() {
		System.out.println("크롬 브라우저의 새로고침 기능 실행");
	}
	@Override
	public void info() {
		System.out.println("크롬 브라우저");
		System.out.println("버전 : " + this.version);
	}
	
	public void chromeStore() {
		System.out.println("크롬스토어 기능 실행");
	}
}







