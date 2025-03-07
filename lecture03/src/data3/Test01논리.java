package data3;

public class Test01논리 {
	public static void main(String[] args) {
		//논리
		//- true(참), false(거짓)을 저장할 수 있는 형태
		//- 자료형의 이름은 boolean
		//- 판정 결과를 저장하기 위한 형태
		//- 비교연산과 같이 사용
		boolean a = false;
		System.out.println("a = " + a);
		
		//내가 가진 돈이 만원이고, 자장면이 6천원, 만두가 3천원일 경우
		//(Q) 자장면 1그릇과 만두 1인분을 주문하면 거스름돈이 얼마입니까? 10000 - (6000 + 3000) => 1000원
		//(Q) 자장면 1그릇과 만두 1인분을 주문할 수 있습니까? true/false
		
		int myMoney = 8000;
		int jjajang = 6000, dimsum = 3000;
		//boolean canOrder = 내가 가진 돈이 (자장면+만두)가격보다 많습니까?
		//boolean canOrder = 내가가진돈 >= (자장면+만두)
		boolean canOrder = myMoney >= jjajang+dimsum;
		System.out.println("canOrder = " + canOrder);
		
		//비교 연산
		//- 숫자로 논리를 만들어 낼 수 있는 연산
		//- 크다(>) , 작다(<) , 이상(>=) , 이하(<=) , 같다(==) , 다르다(!=)
	}
}
