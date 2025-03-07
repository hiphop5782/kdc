package condition;

public class Test01조건문 {
	public static void main(String[] args) {
		//조건문(IF)
		//- 상황에 따라 다른 코드를 실행하는 구문
		//- 상황이란 논리적인 판정을 의미
		
		//입력
		int number = 6;
		
		//계산
		boolean odd = number % 2 == 1;
		
		//출력
		//if(조건판정식) { 코드 }
		if(odd == true){
			System.out.println("홀수");
		}
		else {
			System.out.println("짝수");
		}
	}
}
