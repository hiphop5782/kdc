package data;

public class Test03술값계산기 {
	public static void main(String[] args) {
		//(Q) 소주 한병에 5천원, 맥주 한병에 6천원, 콜라 한병에 2천원일 때 소주2병+맥주3병+콜라1병=?
		
		//입력
		int soju = 5000, beer = 6000, coke = 2000;//가격
		int sojuCount = 2, beerCount = 3, cokeCount = 1;//개수
				
		//연산
		int sojuPrice = soju * sojuCount;//소주금액합계
		int beerPrice = beer * beerCount;//맥주금액합계
		int cokePrice = coke * cokeCount;//콜라금액합계
		
		int price = sojuPrice + beerPrice + cokePrice;//총 금액 합계
		
		//출력
		System.out.println(sojuPrice);
		System.out.println(beerPrice);
		System.out.println(cokePrice);
		System.out.println(price);
	}
}
