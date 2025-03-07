package array;

public class Test05다양한형태의배열 {
	public static void main(String[] args) {
		//int가 아닌 다른 데이터의 배열 생성
		//- double은 0.0으로 초기값이 설정된다
		//- long은 0L로 초기값이 설정된다
		
		//int[] data = new int[] {1, 2, 3, 4, 5};
		//int[] data = new int[5];
		
		//double[] a = new double[] {1.2, 3.4, 5.6};
		double[] a = new double[3];
		
		a[0] = 3.14;
		
		//출력
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		//long[] b = new long[] {10L, 20L, 30L};
		long[] b = new long[3];
		
		b[1] = 50L;
		b[2] = 30;//묵시적형변환(자동변환)
				
		for(int i=0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		//null은 참조변수(리모컨)만 존재하고 본체가 없는 경우를 말함
		//- 즉, 대상 없음을 의미
		
		//String[] c = new String[] {"hello", "goodbye", "java"};
		String[] c = new String[3];
		
		c[0] = "hello";
		c[1] = "goodbye";
		//c[2] = 10;
		
		for(int i=0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}










