package data2;

public class Test03체질량지수계산기 {
	public static void main(String[] args) {
		//키가 180cm , 체중이 80kg인 사람의 체질량지수(BMI)를 구하여 출력하세요
		
		//입력
		int height = 180;//신장(cm)
		int weight = 80;//체중(kg)
		
		//계산
		//BMI = 체중(kg) / 키(m)²
		
		//double heightMeter = height / 100;//잘못된 코드(정수끼리의 연산)
		//double heightMeter = height / 100.0;
		//double heightMeter = height / 100d;
		double heightMeter = (double)height / 100;//변환 연산
		System.out.println("heightMeter = " + heightMeter);
		//double bmi = weight / heightMeter^2;//잘못된 수식(^은 제곱이 아님)
		//double bmi = weight / heightMeter / heightMeter;
		double bmi = weight / (heightMeter * heightMeter);
		
		//출력
		System.out.println("BMI = "+bmi);
		
	}
}
