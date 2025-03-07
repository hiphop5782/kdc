package oop.inherit3;

//모든 브라우저의 공통점을 보관하기 위한 상위 클래스
//- 인스턴스 생성 금지 및 여러가지 개발 편의를 위해 추상(abstract) 클래스로 생성
public abstract class Browser {
	//필드
	protected String url;
	protected String version;
	//setter & getter
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	//생성자
	public Browser(String version) {
		this.setUrl("");
		this.setVersion(version);
	}
	public Browser(String url, String version) {
		this.setUrl(url);
		this.setVersion(version);
	}
	
	//메소드
	
	//+추상메소드
	public abstract void move();
	public abstract void refresh();
	public abstract void info();
}







