package stdin;

//현재 프로그램에서 사용할 도구들을 미리 준비시키는 명령(import 구문)
//자동완성 (ctrl+shift+O)
import java.util.Scanner;

public class Test01표준입력 {
	public static void main(String[] args) {
		//표준 입력
		//- 시스템에서 제공하는 표준 입력 통로(System.in)를 이용하여 사용자가 입력한 메세지를 받아들이는 행위
		//- 표준 입력은 키보드, 키패드와 같은 시스템의 기본 장치에서 발생한 메세지를 받아들임
		//- 시스템은 무엇인지 알 수 없음(ex : Windows, Linux, Mac, ...)
		//- 사용자가 언제, 몇글자를 입력할지 알 수 없기 때문에 코드를 구현하기가 어렵다
		//- Scanner 등 자바에서 제공하는 도구를 이용하여 모아서 입력받도록 구현
		
		//도구 생성
		//- 자바에서 기본적으로 제공되는 도구가 아닌 제 3의 도구를 사용할 경우 반드시 "생성"이라는 절차를 거쳐야 함
		//- 리모컨 = new 본체(준비물)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("실수 2개를 입력하세요");
		float c = sc.nextFloat();
		double d = sc.nextDouble();
		
		sc.close();//입력이나 출력에 사용한 도구들만큼은 메모리 절약을 위해 사용한 뒤 꼭 정리하라!(컴퓨터 전원을 끄는것과 같음)
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}
