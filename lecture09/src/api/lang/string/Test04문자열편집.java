package api.lang.string;

public class Test04문자열편집 {
	public static void main(String[] args) {
		//문자열 편집을 위한 각종 메소드
		//- 문자열은 불변(immutable)이라는 특성을 가진다
		//- 메소드를 사용하여 문자열을 편집하고 난 결과는 기존 문자열이 아닌 신규 문자열이다
		
		String a = "Hello";
		String b = a.concat("World");//a + "World" 와 동일
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("대문자변환 = " + b.toUpperCase());
		System.out.println("소문자변환 = " + b.toLowerCase());
		
		String c = a.substring(0, 4);//a를 0부터 4 바로 앞까지 잘라내어 신규 문자열 생성
		System.out.println("c = " + c);
		
		String d = "저는 사탕을 좋아합니다";
		String e = d.replace("사탕", "수박");
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		
		String star = "★";
		//System.out.println(star * 10);
		System.out.println(star.repeat(10));//10번 반복
		
		String text = "     안녕하세요 반갑습니다!     ";
		System.out.println(text.trim());
		
		String text2 = "　　　　안녕하세요 반갑습니다!　　　　　";
		System.out.println(text2.trim());
		System.out.println(text2.strip());//Java 11+
	}
}








