package loop;

import java.util.Scanner;

public class Test02이름입력받기 {
	public static void main(String[] args) {
		//(Q) 사용자에게 5명의 이름을 입력받아 출력하는 프로그램을 구현하세요
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i < 5 ; i++) {//5번(x5)
			System.out.print("이름 입력 : ");
			String name = sc.next();
			System.out.println("입력한 이름 : " + name);
		}
		
		sc.close();
	}
}
