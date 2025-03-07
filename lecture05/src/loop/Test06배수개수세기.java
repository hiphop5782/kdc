package loop;

public class Test06배수개수세기 {
	public static void main(String[] args) {
		//(Q) 1부터 100 사이에 2, 3, 5, 7의 배수가 각각 몇 개 있는지 세어서 출력하세요
		//세어야 할 카운트 개수 = 4종류 = 변수가 4개 필요
		//개수를 세기 위해서는 반복문이 이미 구현되어 있어야 함
		int count2 = 0;
		int count3 = 0;
		int count5 = 0;
		int count7 = 0;
		
		for(int i=1; i <= 100; i++) {
			if(i % 2 == 0) {
				count2++;
			}
			if(i % 3 == 0) {
				count3++;
			}
			if(i % 5 == 0) {
				count5++;
			}
			if(i % 7 == 0) {
				count7++;
			}
		}
		
		System.out.println("2의 배수 개수 = " + count2);
		System.out.println("3의 배수 개수 = " + count3);
		System.out.println("5의 배수 개수 = " + count5);
		System.out.println("7의 배수 개수 = " + count7);
	}
}
