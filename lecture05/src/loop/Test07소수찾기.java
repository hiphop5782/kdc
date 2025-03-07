package loop;

public class Test07소수찾기 {
	public static void main(String[] args) {
		//어떤 정수가 주어졌을 때 이 정수가 "소수"인지 판정하여 출력하세요
		//- 소수는 1과 자기자신을 제외하고 나누어 떨어지는 수가 없는 숫자
		//- 2, 3, 5, 7, 11, 13, ...
		
		int number = 11;
		int count = 0;
		
		for(int i=1; i <= number; i++) {//number번
			if(number % i == 0) {
				//System.out.println(number+" % "+i+" → " + (number%i));
				count++;
			}
		}
		
		//System.out.println("약수 개수 = " + count);
		if(count == 2) {
			System.out.println(number+"는 소수입니다");
		}
		else {
			System.out.println(number+"는 소수가 아닙니다");
		}
		
	}
}
