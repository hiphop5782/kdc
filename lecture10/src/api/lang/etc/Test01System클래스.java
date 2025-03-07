package api.lang.etc;

public class Test01System클래스 {
	public static void main(String[] args) {
		//System 클래스
		//- 생성자가 없는 클래스 (private)
		//- 모든 필드와 메소드에 static이 붙어 있는 경우
		//- 생성을 금지하고 일회성 필드와 메소드를 직접 사용하도록 하는 형태 (편하게 아무데서나 쓰세요)
		//- 외부 환경의 정보를 보관하는 사용할 수 있도록 도와주는 클래스
		
		System.out.println("출력");//표준 출력 메세지
		System.err.println("출력");//에러 메세지
		
		//현재 시각을 ms로 반환 (기준시각 : 1970년 1월 1일 0시 0분 0초)
		//- 시간차이 계산, 최신 여부를 검증
		System.out.println(System.currentTimeMillis());//기준시각으로부터 1732006179805ms 지났음
		System.out.println(System.nanoTime());//기준시각이 없고 더 정밀한 시간(ns)를 측정하여 반환
		
		//외부 환경정보 읽기
		//- 자바에서 프로그램 실행 시 수집하여 정해둔 이름으로 보관
		//- 이름을 불러서 해당하는 정보를 확인할 수 있다
		//- System.getProperty("이름")
		String osName = System.getProperty("os.name");
		System.out.println("운영체제명 : " + osName);
		
		String javaVersion = System.getProperty("java.version");
		System.out.println("자바 버전 : " + javaVersion);
		
		String country = System.getProperty("user.country");
		System.out.println("국가 : " + country);
		
		String language = System.getProperty("user.language");
		System.out.println("언어 : " + language);
		
		String home = System.getProperty("user.home");
		System.out.println("홈 폴더 : " + home);
		
		String dir = System.getProperty("user.dir");
		System.out.println("프로그램 폴더 : " + dir);
		
		if(osName.startsWith("Windows")) {
			System.out.println("윈도우 사용중입니다");
		}
		else if(osName.startsWith("Mac")) {
			System.out.println("맥 OS 사용중입니다");
		}
		else {
			System.out.println("지원하지 않는 운영체제입니다");
		}
	}
}









