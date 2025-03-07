package array;

import java.util.Scanner;

public class Test04수열계산기 {
	public static void main(String[] args) {
		//(Q) 사용자에게 5개의 숫자를 입력받아 합계, 평균을 구하여 출력하세요
		//- 배열 생성 시 데이터를 설정할 수 없음
		//- 생성 후 초기화 방식을 사용
		
		
		int[] data = new int[5];
		
		//입력
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < data.length; i++) {
			System.out.print("숫자입력 : ");
			data[i] = sc.nextInt();
		}
		sc.close();
		
		//출력
		for(int i=0; i < data.length; i++) {
			System.out.println("입력한 숫자 = " + data[i]);
		}
		
		//합계
		int total = 0;
		for(int i=0; i < data.length; i++) {
			total += data[i];
		}
		System.out.println("합계 = " + total);
		
		//평균
		double average = (double)total / data.length;
		System.out.println("평균 = " + average);
	}
}










