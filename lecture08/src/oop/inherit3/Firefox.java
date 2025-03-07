package oop.inherit3;

public class Firefox extends Browser {

	public Firefox(String url, String version) {
		super(url, version);
	}

	public Firefox(String version) {
		super(version);
	}

	@Override
	public void move() {
		System.out.println("파이어폭스의 이동 기능 실행");
	}
	@Override
	public void refresh() {
		System.out.println("파이어폭스의 새로고침 기능 실행");
	}
	@Override
	public void info() {
		System.out.println("파이어폭스 브라우저 정보");
		System.out.println("버전 : " + this.version);
	}
	
	public void firefoxAddon() {
		System.out.println("파이어폭스 부가기능센터 실행");
	}
}
