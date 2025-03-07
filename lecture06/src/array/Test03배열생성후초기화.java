package array;

import java.util.Scanner;

public class Test03배열생성후초기화 {
	public static void main(String[] args) {
		//비어있는 배열을 생성하는 방법
		//- 데이터를 처음 생성 시 채울 수 없는 경우 (ex : 입력 , 랜덤 , 계산 이후에 설정)
		
		Scanner sc = new Scanner(System.in);
		
		//int[] data = new int[] {10, 20, 30, 40, 50};
		int[] data = new int[5];
		
		for(int i=0; i < data.length; i++) {
			System.out.print("숫자 입력 : ");
			data[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i=0; i < data.length; i++) {
			System.out.println("데이터 = " + data[i]);
		}
	}
}
