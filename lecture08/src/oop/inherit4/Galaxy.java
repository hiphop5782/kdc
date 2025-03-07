package oop.inherit4;

//갤럭시는 
//- 휴대폰이기도 하고 (메인상속)
//- 전자제품이기도 하고 (서브상속)
//- 카메라이기도 하고 (서브상속)
//- 오디오이기도 하고 (서브상속)
//- 녹음기이기도 하다 (서브상속)

//(Q) 누구를 상위클래스로 둬야 할까요?
//(A) 상위클래스는 딱 하나만 설정이 가능합니다. 단, 클래스가 아니라 인터페이스라면 여러 개 상속을 받을 수 있습니다.
public class Galaxy extends Phone implements Camera, Audio, Recoder {
	@Override
	public void call() {
		System.out.println("갤럭시의 통화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("갤럭시의 문자 기능 실행");
	}
	@Override
	public void on() {
		System.out.println("갤럭시의 전원 ON");
	}
	@Override
	public void off() {
		System.out.println("갤럭시의 전원 OFF");
	}
	@Override
	public void charge() {
		System.out.println("갤럭시 충전 기능");
	}
	@Override
	public void voiceRecord() {
		System.out.println("갤럭시의 음성녹음 기능");
	}
	@Override
	public void play() {
		System.out.println("갤럭시의 음원재생 기능");
	}
	@Override
	public void skip() {
		System.out.println("갤럭시의 음원 건너뛰기 기능");
	}
	@Override
	public void photo() {
		System.out.println("갤럭시의 사진촬영 기능");
	}
	@Override
	public void video() {
		System.out.println("갤럭시의 동영상촬영 기능");
	}
}
