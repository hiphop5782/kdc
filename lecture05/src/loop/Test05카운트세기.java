package loop;

public class Test05카운트세기 {
	public static void main(String[] args) {
		//(Q) 1부터 10 사이의 홀수가 몇개인가요?
		//(A) 1, 3, 5, 7, 9 ... 총 5개
		int count = 0;
		for(int i=1; i <= 10; i++) {
			if(i % 2 != 0) {//홀수라면
				count++;
			}
			//System.out.println("현재 = " + i + " , 홀수 개수 = " + count);
		}
		System.out.println("홀수 개수 = " + count);
	}
}
