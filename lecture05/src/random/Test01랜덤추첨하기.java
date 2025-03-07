package random;

import java.util.Random;

public class Test01랜덤추첨하기 {
	public static void main(String[] args) {
		//랜덤(Random)
		//- 결과를 예측할 수 없는 값 (주사위, 로또, 동전던지기, ...)
		//- 자연적인 랜덤은 완벽하게 예측이 어렵지만 프로그래밍으로 만들어낸 랜덤값을 사용
		//- Random 도구 사용
		
		
		//도구 생성
		Random r = new Random();//r이라는 리모컨이 본체를 참조하는 형태
		
		int a = r.nextInt();//int의 범위에서 무작위로 한 개 추첨
		System.out.println("a = " + a);
		
		//주사위는 1부터 6까지의 범위를 가진다 (단, 1부터 6개로 생각하고 식을 작성)
		int b = r.nextInt(6/*개*/) + 1/*부터*/;
		System.out.println("b = " + b);
		
		//(ex) 두 자리 정수 중 한 개를 추첨 (10부터 99까지 = 10부터 90개)
		int c = r.nextInt(90) + 10;
		System.out.println("c = " + c);
		
		long d = r.nextLong();
		System.out.println("d = " + d);
		
		boolean e = r.nextBoolean();
		System.out.println("e = " + e);
		
		//실수의 경우는 0이상 1미만 (0.xxx)의 범위 내에서만 추첨이 가능
		float f = r.nextFloat();
		System.out.println("f = " + f);
	}
}
















