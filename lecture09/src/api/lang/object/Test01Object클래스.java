package api.lang.object;

//java.lang에 있는 내용들은 자동으로 모두 import가 되어 사용할 수 있다
//java.lang은 프로그램에 반드시 있어야 하는 필수적인 도구들로 이루어져 있기 때문

public class Test01Object클래스 {
	public static void main(String[] args) {
		//Object 클래스
		
		//인스턴스 생성
		Object a = new Object();
		Object b = new Object();
		
		//메소드 호출
		System.out.println("hashcode a = " + a.hashCode());
		System.out.println("hashcode b = " + b.hashCode());
		
		System.out.println("toString a = " + a.toString());
		System.out.println("toString b = " + b.toString());
		
		//toString()은 출력 시 생략 가능
		System.out.println("toString a = " + a);
		System.out.println("toString b = " + b);
	}
}









