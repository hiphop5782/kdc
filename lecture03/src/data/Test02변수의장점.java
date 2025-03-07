package data;

public class Test02변수의장점 {
	public static void main(String[] args) {
		//(Q) 자장면 금액이 7천원, 짬뽕이 8천원일 때 자장면 3그릇과 짬뽕 2그릇의 가격은?
		//(A) 자장면 7000*3=21000, 짬뽕 8000*2=16000 , 합계 = 21000+16000=37000
		
		//(A) 변수를 사용하지 않았을 때
		//- 금액이 변경될 경우 수정이 쉽지 않다
		//- 가독성이 낮다(알아보기 불편하다)
		System.out.println(7000 * 3);//자장면 금액 합계 출력
		System.out.println(8000 * 2);//짬뽕 금액 합계 출력
		System.out.println(7000 * 3 + 8000 * 2);//총 합계 출력
		
		//(A) 변수를 사용했을 때
		int jjajang = 7000;
		int champon = 8000;
		int jjajangCount = 3;
		int champonCount = 2;
		
		int jjajangPrice = jjajang * jjajangCount;
		int champonPrice = champon * champonCount;
		int total = jjajangPrice + champonPrice;
		
		System.out.println(jjajangPrice);
		System.out.println(champonPrice);
		System.out.println(total);
	}
}




