package api.lang.string2;

public class Test04비밀번호검사 {
	public static void main(String[] args) {
		//비밀번호를 검사하려면?
		//- 글자수 8~16글자
		//- 대문자, 소문자, 숫자, 특수문자를 반드시 1개이상 포함 (긍정탐색)
		
		String password = "Testuser1!";
//		String regex = "^[A-Za-z0-9!@#$]{8,16}$"; //반드시 1개가 처리되지 않음
		String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#$])[A-Za-z0-9!@#$]{8,16}$";
		if(password.matches(regex)) {
			System.out.println("올바른 비밀번호입니다");
		}
		else {
			System.out.println("잘못된 비밀번호 형식입니다");
		}
	}
}
