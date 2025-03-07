package array;

public class Test02성적계산기 {
	public static void main(String[] args) {
		//(Q) 우리반 학생 10명의 성적이 다음과 같습니다
		// - 77점, 85점, 92점, 90점, 62점, 67점, 75점, 82점, 85점, 90점
		// 1. 모든 학생의 점수를 출력하세요
		// 2. 우리 반 총점과 평균 점수를 출력하세요
		// 3. 70점 이상이 통과일 때, 통과한 인원수를 출력하세요
		// 4. 77점인 학생이 몇 등인지 구하여 출력하세요
		
		// 배열 생성
		int[] score = new int[] { 77, 85, 92, 90, 62, 67, 75, 82, 85, 90 };
		//System.out.println("배열 크기 = " + score.length);
		
		// 1. 점수 출력
		for(int i=0; i < score.length; i++) {
			System.out.println("점수 = " + score[i]);
		}
		
		System.out.println();
		
		// 2. 총점 평균 출력
		//int total = score[0] + score[1] + score[2] + score[3] 
		//				+ score[4] + score[5] + score[6] + score[7]
		//				+ score[8] + score[9];
		
		int total = 0;
		for(int i=0; i < score.length; i++) {
			total += score[i];
		}
		System.out.println("총점 = " + total);
		
		float average = (float)total / score.length;
		System.out.println("평균 = " + average);
		
		System.out.println();
		
		//3. 통과 인원 수 출력
		int pass = 0;
		for(int i=0; i < score.length; i++) {//배열의 전체 범위
			if(score[i] >= 70) {
				//System.out.println("통과자 = " + score[i]);
				pass++;
			}
		}
		System.out.println("통과자 수 = " + pass);
		
		System.out.println();
		
		//4. 77점의 등수 계산
		//- 등수는 1 + (나보다 높은 점수의 인원수)
		int count = 0;
		for(int i=0; i < score.length; i++) {//배열의 전체 범위
			if(score[i] > 77) {//77점보다 높은 점수를 찾아서
				//System.out.println("더 높은 점수 = " + score[i]);
				count++;
			}
		}
		//System.out.println("더 높은 점수를 가진 사람 = " + count);
		int rank = 1 + count;
		System.out.println("77점의 등수 = " + rank);
	}
}


















