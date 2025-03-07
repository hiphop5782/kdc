package oop.inherit3;

public class Safari extends Browser {

	public Safari(String url, String version) {
		super(url, version);
	}

	public Safari(String version) {
		super(version);
	}

	@Override
	public void move() {
		System.out.println("사파리 브라우저의 이동 기능 실행");
	}

	@Override
	public void refresh() {
		System.out.println("사파리 브라우저의 새로고침 기능 실행");
	}

	@Override
	public void info() {
		System.out.println("사파리 브라우저 정보");
		System.out.println("버전 : " + this.version);
	}
	
	public void safariExtension() {
		System.out.println("사파리 확장 기능 관리센터 실행");
	}
}
