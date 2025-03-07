package api.lang.etc;

public class Test03Wrapper클래스 {
	public static void main(String[] args) {
		//Wrapper 클래스 (하이브리드 클래스)
		//- 원시형 8종류를 매핑시킨 클래스
		//- byte(Byte), short(Short), char(Character), int(Integer)
		//- long(Long), float(Float), double(Double), boolean(Boolean)
		
		//int가 더 편리한 상황(단순계산)
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("c = " + c);
		
//		Integer d = new Integer(10);
		Integer d = Integer.valueOf(10);
		Integer e = Integer.valueOf(20);
		Integer f = Integer.sum(d, e);
		System.out.println("f = " + f.toString());
		
		//Integer가 더 편리한 상황(복잡한 계산)
		//- 어떤 숫자를 2진수, 8진수, 16진수로 변환하여 출력
		int number = 100;
		System.out.println("2진수 : " + Integer.toBinaryString(number));
		System.out.println("8진수 : " + Integer.toOctalString(number));
		System.out.println("16진수 : " + Integer.toHexString(number));
		
		//원시형으로..? 반복문이나 StringBuffer 등이 필요
		
		//(참고) int와 Integer는 특수한 상황이 아니면 호환이 가능하다
		Integer v1 = 10;//int를 Integer 형태로 변환하여 보관 (auto-boxing)
		Integer v2 = 20;
		Integer v3 = v1 + v2;
		System.out.println(v3);
		
		//(중요) int와 Integer가 절대로 호환되지 않는 경우가 존재
		//- null이 존재할 수 있는 상황이라면 반드시 Integer를 사용해야 하며 나머지 상황은 원하는 형태를 선택하여 사용
		Integer x = null;
		System.out.println("x = " + x);
		//int y = x;//Integer를 int 형태로 변환하여 보관(auto-unboxing)
		//System.out.println("y = " + y);
	}
}





