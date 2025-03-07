package oop.inherit3;

public class Edge extends Browser {

	public Edge(String url, String version) {
		super(url, version);
	}

	public Edge(String version) {
		super(version);
	}

	@Override
	public void move() {
		System.out.println("엣지 브라우저의 이동 기능 실행");
	}

	@Override
	public void refresh() {
		System.out.println("엣지 브라우저의 새로고침 기능 실행");
	}

	@Override
	public void info() {
		System.out.println("엣지 브라우저 정보");
		System.out.println("버전 : " + this.version);
	}
	
	public void edgeAppCenter() {
		System.out.println("엣지 앱 센터 기능 실행");
	}
}









