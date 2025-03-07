package condition;

public class Test03다중조건 {
	public static void main(String[] args) {
		//조건이 여러 개인 경우에 대한 처리
		
		//(Q) 월이 주어졌을 때 계절을 구하여 출력
		//(ex) 1 - 겨울 , 4 - 봄, ...
		
		//겨울 - 12, 1, 2월 / 봄 - 3, 4, 5월 / 여름 - 6, 7, 8월 / 가을 - 9, 10, 11월
		
		int month = 7;
		
		if(month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		}
		else if(month == 6 || month == 7 || month == 8) {
			System.out.println("여름");
		}
		else if(month == 9 || month == 10 || month == 11) {
			System.out.println("가을");
		}
		else {
			System.out.println("겨울");
		}
	}
}



