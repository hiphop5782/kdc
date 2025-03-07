package array;

public class Test01배열 {
	public static void main(String[] args) {
		//배열(array)
		//- 여러 개의 데이터를 묶어서 관리할 수 있는 도구
		//- 참조형 데이터
		
		//(ex) 70, 50, 80, 85, 65점을 저장한 뒤 출력
		
		//배열 생성
		int[] score = new int[] {70, 50, 80, 85, 65};
		//int score[] = new int[] {70, 50, 80, 85, 65};
		
		//(score) --------> [ 70 ][ 50 ][ 80 ][ 85 ][ 65 ]
		//System.out.println(score);//리모컨 정보
		//System.out.println(score[0]);//score가 쳐다보는 곳에서 +0칸 이동한 곳
		//System.out.println(score[1]);//score가 쳐다보는 곳에서 +1칸 이동한 곳
		//System.out.println(score[2]);//score가 쳐다보는 곳에서 +2칸 이동한 곳
		//System.out.println(score[3]);//score가 쳐다보는 곳에서 +3칸 이동한 곳
		//System.out.println(score[4]);//score가 쳐다보는 곳에서 +4칸 이동한 곳
		//System.out.println(score[5]);//score가 쳐다보는 곳에서 +5칸 이동한 곳(오류)
		
		//length는 자바에서 제공하는 배열의 길이(칸수)이며 자동으로 계산되어 저장된다
		System.out.println("length = " + score.length);
		
		for(int i=0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}
}







