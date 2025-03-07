package stdin;

import java.util.Scanner;

public class Test03주유소 {
	public static void main(String[] args) {
		//(Q) 주유소에서 휘발유가 1리터(L)당 1521원일 때 
		//사용자가 금액을 입력하면(ex : 50000) 몇 L가 주유되는지 계산하여 출력
		
		int today = 1521;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘의 휘발유 가격은 " + today + "원 입니다");
		System.out.println("주유할 금액을 원단위로 입력하세요");
		int money = sc.nextInt();
		sc.close();
		
		double pricePerLiter = 1 / (double)today;
		//System.out.println("pricePerLiter = " + pricePerLiter);
		
		double liter = pricePerLiter * money;
		System.out.println("주유될 리터 = " + liter);
	}
}
