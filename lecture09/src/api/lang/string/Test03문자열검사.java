package api.lang.string;

public class Test03문자열검사 {
	public static void main(String[] args) {
		//문자열을 검사하기 위한 각종 메소드
		
		String str = "Windows 11";
		
		System.out.println("Windows로 시작? " + str.startsWith("Windows"));
		System.out.println("11로 종료? " + str.endsWith("11"));
		System.out.println("글자수? " + str.length());
		System.out.println("3번위치의 글자? " + str.charAt(3));
		
		System.out.println("띄어쓰기가 있습니까? " + str.contains(" "));
		System.out.println("띄어쓰기가 어디 있습니까? " + str.indexOf(" "));//없으면 -1
		System.out.println("띄어쓰기가 어디 있습니까? " + str.lastIndexOf(" "));//없으면 -1
		
		//(ex) 닉네임 검사
		//- 2~10글자 이내로 작성해야 합니다
		//- 운영자라는 글자를 포함할 수 없습니다
		
		String nickname = "나는운영자다";
		
		boolean lengthValid = nickname.length() >=2 && nickname.length() <= 10;
		boolean keywordValid = !nickname.contains("운영자");
		//boolean keywordValid = nickname.indexOf("운영자") == -1;
		
		if(lengthValid && keywordValid) {
			System.out.println("올바른 닉네임입니다");
		}
		else {
			System.out.println("잘못된 닉네임입니다");
		}
		
	}
}







