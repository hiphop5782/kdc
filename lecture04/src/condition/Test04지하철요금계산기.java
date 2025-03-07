package condition;

import java.util.Scanner;

public class Test04지하철요금계산기 {
	public static void main(String[] args) {
		//(Q) 출생년도를 입력받아 지하철 요금을 계산하여 출력하세요
		//- 나이는 연도로만 구하는 한국나이를 기준으로 하며, 모든 이용자는 카드 보증금 500원을 내야 한다
		//- 노인(65세 이상) : 무료
		//- 성인(20~64세) : 1400원
		//- 청소년(14~19세) : 800원
		//- 어린이(8~13세) : 500원
		//- 영유아(8세 미만) : 무료
		
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("출생년도 4자리 입력 : ");
		int birth = sc.nextInt();
		sc.close();
		
		int card = 500;

		//계산
		int age = 2024 - birth + 1;
		//System.out.println("age = " + age);
		
		//변수를 외부에 만들고 조건별로 다른 값이 들어가도록 처리
		//int price = 0 or 1400 or 800 or 500;
		int price;
		if(age >= 65 || age <= 7) {//노인 or 영유아
			price = 0;
		}
		else if(age >= 20) {//성인
			price = 1400;
		}
		else if(age >= 14) {//청소년
			price = 800;
		}
		else {//어린이
			price = 500;
		}
		
		//price = price + card;//카드 보증금 추가
		price += card;//복합 연산자(더해 넣어라, +=)
		
		//출력
		System.out.println("요금은 총 "+price+"원 입니다");
	}
}
