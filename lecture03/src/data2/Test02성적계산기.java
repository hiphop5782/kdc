package data2;

public class Test02성적계산기 {
	public static void main(String[] args) {
		//(Q) 국어점수가 80점, 영어점수가 90점, 수학점수가 95점인 학생의 총점 그리고 평균을 구하세요
		//(A) 총점 = 80+90+95=265점, 평균 = 265/3 = 88.33333...점
		
		//준비
		int korean = 80;
		int english = 90;
		int math = 95;
		
		//계산
		int total = korean + english + math;
		//float average = total / 3;//잘못된 계산(소수점 손실)
		//float average = total / 3.0f;//오른쪽을 실수로 변경
		//float average = total / 3f;//오른쪽을 실수로 변경
		//float average = total / (float)3;//오른쪽을 실수로 변경
		float average = (float)total / 3;//왼쪽을 실수로 변경(강제변환, cast연산)
		
		//출력
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
	}
}
