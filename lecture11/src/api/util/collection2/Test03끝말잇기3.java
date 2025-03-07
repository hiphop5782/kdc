package api.util.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test03끝말잇기3 {
	public static void main(String[] args) {
		//(Q) 끝말잇기를 구현하세요 (같은 단어를 두 번 말하거나 연결되지 않으면 게임오버)
		
		Scanner sc = new Scanner(System.in);
		
		Set<String> history = new HashSet<>();
		
		//제시어 준비
		String given = "카센터";
		history.add(given);//제시어를 저장소에 미리 등록
		
		while(true) {
			//제시어 보여주고 입력받기
			System.out.print("제시어 : "+given);
			System.out.print(" → ");
			String input = sc.next();
			
			//형식검사
			String regex = "^[가-힣]{2,}$";
			//System.out.println("형식에 맞는가? " + input.matches(regex));
			if(input.matches(regex) == false) break;//형식에 맞지 않으면 나가세요!
			
			//연결검사
			char last = given.charAt(given.length()-1);
			char first = input.charAt(0);
			//System.out.println("연결되는가? " + (last == first));
			if(last != first) break;//연결되지 않으면 나가세요!
			
			//사용한 적이 있는지 검사
			if(history.contains(input)) break;
			
			//제시어 변경하며 기록에도 추가
			given = input;
			history.add(input);
		}
		
		sc.close();
		
		System.out.println("게임오버");
	}
}





