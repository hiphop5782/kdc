package api.lang.object;

public class Test02Object의특징 {
	public static void main(String[] args) {
		//Object의 특징과 활용
		//- Object는 최상위 클래스이다
		//- 따라서 어떤 종류의 자료형이든 Object 클래스를 상속받아야 한다
		//- 그렇다면 업캐스팅(up-casting)이 데이터의 종류와 상관없이 가능하다
		//- 결론적으로 Object는 "아무거나"라는 의미로도 사용할 수 있다
		
		Object a = new Object();
		Object b = 100;
		Object c = 1.234;
		Object d = 1000L;
		Object e = "hello";
		Object f = new int[] {10, 20, 30};
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		//a와 b가 같습니까? 
		System.out.println(a == b);//비추천
		System.out.println(a.equals(b));//권장되는 방법
		System.out.println(b.equals(100));
	}
}






