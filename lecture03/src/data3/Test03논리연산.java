package data3;

public class Test03논리연산 {
	public static void main(String[] args) {
		//논리 연산
		
		//(ex) 나이를 이용해서 청소년인지 아닌지 판정하는 프로그램
		//- 청소년 : 중학교 1학년(14세) 부터 고등학교 3학년(19세) 까지
		//- 조건1 : 14세 이상
		//- 조건2 : 19세 이하
		//- 최종판정 : 조건1 그리고 조건2 모두 만족 (AND연산, &&)
		int age = 3;
		
		boolean q1 = age >= 14;
		boolean q2 = age <= 19;
		System.out.println("q1 = " + q1);
		System.out.println("q2 = " + q2);
		
		boolean teen = q1 && q2;
		System.out.println("청소년인가요? "+teen);
		
		//(ex) 나이를 이용해서 지하철 무임승차 대상인지 판정
		//- 영유아 : 6세 이하
		//- 어르신 : 65세 이상
		//- 무임승차 대상 : 6세 이하 또는 65세 이상 (OR 연산, ||)
		boolean q3 = age <= 6;
		boolean q4 = age >= 65;
		System.out.println("q3 = " + q3);
		System.out.println("q4 = " + q4);
		
		boolean free = q3 || q4;
		System.out.println("무임승차 대상인가요? " + free);
	}
}
