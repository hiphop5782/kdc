package api.lang.string2;

public class Test02각종데이터검사 {
	public static void main(String[] args) {
		//여러 가지 데이터 검사
		
		String name = "홍길동";
		String regex = "^[가-힣]{2,7}$";
		if(name.matches(regex)) {
			System.out.println("올바른 이름입니다");
		}
		else {
			System.out.println("잘못된 이름 형식입니다");
		}
		
		String id = "testuser1";
		//regex = "^[a-z0-9]{8,20}$";
		regex = "^[a-z0-9\\-]{8,20}$";
		if(id.matches(regex)) {
			System.out.println("올바른 아이디입니다");
		}
		else {
			System.out.println("아이디가 형식에 맞지 않습니다");
		}
	}
}
