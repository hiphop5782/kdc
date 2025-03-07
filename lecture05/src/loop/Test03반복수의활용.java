package loop;

public class Test03반복수의활용 {
	public static void main(String[] args) {
		//반복에 사용되는 변수(i)의 활용
		//- 꼭 i라고 이름을 지을 필요는 없지만 보통 i부터 시작하여 j, k와 같이 작성
		//- 반복문 내에서만 이 변수를 사용할 수 있음
		//- 원하는 구간 혹은 횟수를 반복수 설정으로 구현할 수 있음
		
		//1부터 10까지 출력
		for(int i=1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("---");
		//10부터 1까지 출력
		for(int i=10; i >= 1; i--) {
			System.out.println("i = " + i);
		}
		System.out.println("---");
		//1부터 10까지 홀수만 출력
		//- 1, 3, 5, 7, 9 (1부터 9이하일동안 2씩 증가)
		for(int i=1; i <= 9; i+=2) {
			System.out.println("홀수 = " + i);
		}
		System.out.println("---");
		for(int i=1; i <= 10; i++) {//1부터 10까지
			if(i % 2 != 0) {//i가 홀수라면
				System.out.println("홀수 = " + i);
			}
		}
		
		System.out.println("---");
		//(Q) 두 자리 이하의 양의 정수 중에서(1~99) 5가 포함된 숫자를 출력하세요
		//- 5, 15, 25, 35, 45, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 65, 75, 85, 95
		//- 총 19개
		for(int i=5; i <= 45; i+=10) {
			System.out.println("5가 포함된 숫자 = " + i);
		}
		for(int i=50; i <= 59; i++) {
			System.out.println("5가 포함된 숫자 = " + i);
		}
		for(int i=65; i <= 95; i+=10) {
			System.out.println("5가 포함된 숫자 = " + i);
		}
		
		System.out.println("---");
		for(int i=1; i < 100; i++) {//두 자리 정수 범위에서
			int ten = i / 10;//십의 자리를 구하고
			int one = i % 10;//일의 자리를 구해서
			boolean five = ten == 5 || one == 5;//10의자리 또는 1의자리 검사
			if(five) {
				System.out.println("5가 포함된 숫자 = " + i);
			}
		}
		
	}
}












