package data;

public class Test01 {
	public static void main(String[] args) {
		//자료(data) - 측정 등을 통해 수치화가 가능한 값 (7000원, 2그릇)
		//정보(information) - 자료를 이용해서 만들어낸 의미 있는 값 (14000원)
		
		System.out.println("7000 * 2");//글자를 있는 그대로 화면에 출력
		System.out.println(7000 * 2);//수식을 계산하여 결과를 화면에 출력(=계산기)
		
		//변수(variable) - 데이터를 저장할 수 있는 도구
		//형태 이름 = 값;
		int a = 7000;
		System.out.println(a);//변수에 저장된 값을 화면에 출력
		int b = 2;
		System.out.println(b);
		System.out.println(a * b);//변수에 저장된 값을 불러와서 계산한 뒤 화면에 출력
		int c = a * b;//변수의 계산 결과를 저장
		System.out.println(c);
		int d;//변수를 만들었지만 어떠한 값도 넣지 않았다(사용하지 않았다)
		d = 10;
		d = 20;
		d = 30;//여러 번 값을 넣으면 앞의 값이 사라진다
		System.out.println(d);
	}
}
