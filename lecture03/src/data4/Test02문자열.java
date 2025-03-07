package data4;

public class Test02문자열 {
	public static void main(String[] args) {
		//문자열(String)
		//- 참조형 데이터(reference type)
		//- 쌍따옴표를 이용하여 글자를 감싸 표현하는 데이터
		//- 참조형의 반대말은 원시형(raw type)
		//- 액자 vs TV
		//- 액자는 단순한 저장 기능만 제공(원시형의 특징과 같음)
		//- TV의 경우는 복잡하고 다양한 기능을 제공해야 하므로 본체 외에도 쉽게 조작할 수 있는 리모컨을 제공(참조형과 같음)
		
		String a = "Hello";
		System.out.println("a = " + a);
		System.out.println(a.length());//a의 글자수(a 리모컨의 length 버튼을 눌러라!)
		System.out.println(a.charAt(0));//a의 가장 앞 지점의 글자를 추출(a 리모컨의 charAt 버튼을 누르면서 0을 전달해라!)
		
		//문자열의 특징
		//- 사칙연산(산술연산) 중에서 유일하게 덧셈만 가능
		//- 어떠한 데이터든 문자열과 더해지면 문자열이 나옴
		String b = "Java";
		String c = "Programming";
		System.out.println(b + c);//연결되는 연산
		//System.out.println(b - c);
		//System.out.println(b * c);
		//System.out.println(b / c);
		//System.out.println(b % c);
		
		int number = 123;
		System.out.println("number = " + number);
		
		//- 특수문자(Escape sequence)를 사용할 수 있다
		//- \n : 줄바꿈(new line)
		//- \t : 탭 이동(tab)
		System.out.println("안녕\n하세요");
		
		System.out.println("피자		떡볶이		라면");//권장하지 않음
		System.out.println("피자\t\t떡볶이\t\t라면");//권장
		
		//(Q) 나는 "피자"를 점심에 먹을 예정입니다 를 화면에 출력
		//System.out.println("나는 "피자"를 점심에 먹을 예정입니다");
		System.out.println("나는 \"피자\"를 점심에 먹을 예정입니다");
	}
}



