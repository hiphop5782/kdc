package condition;

import java.util.Scanner;

public class Test02합격판정기 {
	public static void main(String[] args) {
		//(Q) 사용자의 국어, 영어, 수학점수를 입력받아 합격/불합격 판정을 하는 프로그램을 구현하세요
		// - 합격의 기준은 각각의 과목이 40점 이상이며 평균이 60점 이상인 경우입니다
		
		//입력 - Scanner로 변환
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		sc.close();
		
		//계산
		boolean koreanPass = korean >= 40;
		boolean englishPass = english >= 40;
		boolean mathPass = math >= 40;
		boolean subjectPass = koreanPass && englishPass && mathPass;
		
		int total = korean + english + math;
		float average = (float)total / 3;
		boolean averagePass = average >= 60;
		
		boolean allPass = subjectPass && averagePass;
		
		//출력
		if(allPass) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}
}
