package api.lang.string2;

public class Test03날짜검사 {
	public static void main(String[] args) {
		
		String date = "2000-02-29";
		
//		String regex = "^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[01])$";
		String regex = "^(19[0-9]{2}|20[0-9]{2})-((02-(0[1-9]|1[0-9]|2[0-8]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01])))$";
		if(date.matches(regex)) {
			System.out.println("올바른 날짜입니다");
		}
		else {
			System.out.println("잘못된 날짜입니다");
		}
		
	}
}
