package data4;

public class Test01문자 {
	public static void main(String[] args) {
		//문자(char)
		//- 2byte 크기를 가짐
		//- 글자를 숫자에 연결해놓은 형태(글자 or 숫자 아무거나 사용 가능)
		//- 국제 표준 규격에 의해서 정의(ASCII, Unicode)
		//- ASCII는 미국인이 키보드로 입력할 수 있는 값들을 정의한 규격
		//- ISO-8859-1은 미국과 라틴유럽(서유럽) 사람이 키보드로 입력할 수 있는 값들을 정의한 규격 (총 256글자)
		//- Unicode(ISO 10646)는 전 세계의 글자를 모두 포함시켜 정의한 규격 (총 65,536글자)
	
		char a = 'C';
		char b = 67;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		char c = '가';
		System.out.println("c = " + c);
		System.out.println("c = " + (int)c);
		
		char d = '힣';
		System.out.println("d = " + d);
		System.out.println("d = " + (int)d);
		
		int count = d - c + 1;
		System.out.println("한글 글자 수 = " + count);
	}
}
