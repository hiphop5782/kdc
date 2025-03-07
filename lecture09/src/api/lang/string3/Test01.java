package api.lang.string3;

public class Test01 {
	public static void main(String[] args) {
//		문자열 합성
//		- 문자열과 문자열을 더하는 것
//		- 문자열이 불변이라는 특성 때문에 성능저하가 극심하다.
//		- 문자열 합성을 위해 가변 문자열인 StringBuffer와 StringBuilder를 제공

//		System.out.println(System.currentTimeMillis());//현재시각을 밀리초 단위로 반환(시간차를 계산)
		
//		String star = "";
//		StringBuffer buffer = new StringBuffer();//멀티스레드에서 안전하게
		StringBuilder builder = new StringBuilder();//싱글스레드에서 빠르게
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i < 10000; i++) {
//			star += "*";
//			buffer.append("*");
			builder.append("*");
		}
		
		long finish = System.currentTimeMillis();
		//System.out.println(star);
		System.out.println(finish - start);
	}
}
