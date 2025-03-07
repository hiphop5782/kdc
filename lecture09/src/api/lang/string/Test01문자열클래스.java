package api.lang.string;

public class Test01문자열클래스 {
	public static void main(String[] args) {
		//String 클래스
		//- 성능과 효율 증가를 위해 문자열을 불변 처리한다
		
		//기존에 알고있는 방법과 생성자를 이용한 생성
		String a = "hello";
		String b = "hello";
		String c = new String("hello");
		char[] data = new char[] {'h','e','l','l','o'};
		String d = new String(data);
		
		//출력
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		//비교
		//- 비교연산은 "인스턴스"가 같은지 비교하기 때문에 적절한 연산이 아니다
		//- equals 메소드를 이용해서 인스턴스가 아닌 "내용물(글자)"가 같은지 비교할 수 있다(대소문자 구분)
		//- equalsIgnoreCase 메소드를 사용하면 대소문자를 무시하고 비교할 수 있다
		System.out.println("a와 b는 같습니까? " + (a == b));
		System.out.println("b와 c는 같습니까? " + (b == c));
		System.out.println("c와 d는 같습니까? " + (c == d));
		System.out.println("d와 a는 같습니까? " + (d == a));
		
		System.out.println("a와 b는 같습니까? " + (a.equals(b)));
		System.out.println("b와 c는 같습니까? " + (b.equals(c)));
		System.out.println("c와 d는 같습니까? " + (c.equals(d)));
		System.out.println("d와 a는 같습니까? " + (d.equals(a)));
		
		String e = "Hello";
		System.out.println("d와 e는 같습니까? " + (d.equals(e)));
		System.out.println("d와 e는 같습니까? " + (d.equalsIgnoreCase(e)));
	}
}
