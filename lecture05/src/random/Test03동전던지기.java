package random;

import java.util.Random;

public class Test03동전던지기 {
	public static void main(String[] args) {
		//(Q) 동전을 던지는 프로그램 구현 (화면에 앞 또는 뒤를 출력)
		//가위바위보, 윷놀이, ...
		//Random을 이용해서 문자열을 추첨하는 방법은 없음(정수를 추첨해서 치환)
		
		//도구 생성
		Random r = new Random();
		
		//약속 - 앞(0), 뒤(1) - 0부터 2개
		int coin = r.nextInt(2);
		//System.out.println("coin = " + coin);
		if(coin == 0) {
			System.out.println("앞");
		}
		else {
			System.out.println("뒤");
		}
	}
}
