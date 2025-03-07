package api.lang.string2;

public class Test01정규표현식 {
	public static void main(String[] args) {
		//정규표현식(Regular Expresion)의 필요성
		//- 휴대전화 번호 검사하기
		//- 복잡한 문자열을 검사하기 위한 식
		
		String phone = "010-1234-5678";
		String regex = "^010-[123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789]$";
		System.out.println(phone.matches(regex));
	}
}
