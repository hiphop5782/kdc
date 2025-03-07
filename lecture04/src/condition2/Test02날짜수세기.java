package condition2;

public class Test02날짜수세기 {
	public static void main(String[] args) {
		//(Q) 사용자가 입력한 달이 몇일까지 있는지 알아내는 프로그램을 구현해보세요
		//(단, 2월은 28일까지 있다고 가정합니다)
		
		//(A) 총 3가지 경우로 구분할 수 있다(큰달/작은달/2월)
		//큰달 - 31일까지 있는 달(1,3,5,7,8,10,12월)
		//작은달 - 30일까지 있는 달(4,6,9,11월)
		//2월 - 28일까지로 가정
		
		//입력
		int month = 3;
		
		//int days = 28 or 30 or 31;
		int days;
		
		switch(month) {
		case 1,3,5,7,8,10,12: //Java 8,11 버전에서는 작동하지 않음
			days = 31;
			break;
		case 4,6,9,11:
			days = 30;
			break;
		//case 2:
		default:
			days = 28;
			//break;
		}
		
		System.out.println("날짜 수 = " + days);
	}
}










