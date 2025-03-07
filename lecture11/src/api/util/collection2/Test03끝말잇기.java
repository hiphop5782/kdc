package api.util.collection2;

import java.util.Scanner;

public class Test03끝말잇기 {
	public static void main(String[] args) {
		//(Q) 끝말잇기를 구현하세요 (같은 단어를 두 번 말하거나 연결되지 않으면 게임오버)
		
		Scanner sc = new Scanner(System.in);
		
		//제시어 준비
		String given = "카센터";
		
		System.out.println("제시어 : "+given);
		System.out.print("입력 : ");
		String input = sc.next();
		
		String regex = "^[가-힣]{2,}$";
		System.out.println("형식에 맞는가? " + input.matches(regex));
		
		char last = given.charAt(given.length()-1);
		char first = input.charAt(0);
		System.out.println("연결되는가? " + (last == first));
		
		sc.close();
	}
}





