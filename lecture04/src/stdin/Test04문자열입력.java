package stdin;

import java.util.Scanner;

public class Test04문자열입력 {
	public static void main(String[] args) {
		//문자열 입력
		//- 스캐너에는 두 종류의 문자열 입력 명령이 존재
		//- .next()는 한 단어를 입력받는 명령 (잘 안치우는 명령, 입력을 받고 난 뒤의 남은 값들을 방치)
		//- .nextLine()은 한 줄을 입력받는 명령 (잘 치우는 사람, 입력을 받고 난 뒤 남은 \n를 제거)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단어 하나를 입력하세요");
		String word = sc.next();
		
		//만약 next() 계열의 명령 뒤에 nextLine()을 써야할 상황이 온다면?
		sc.nextLine();//청소를 위하여 비어있는 입력을 한번 더 받는다!
		
		System.out.println("문장 하나를 입력하세요");
		String line = sc.nextLine();
		
		sc.close();
		
		System.out.println("word = " + word);
		System.out.println("line = " + line);
	}
}





