package api.lang.object;

public class Test03내가만든클래스와Object {
	public static void main(String[] args) {
		//내가 만든 클래스는 Object와 관계가 있을까?
		
		//인스턴스 생성
		Student a = new Student("홍길동", 50);
		Student b = new Student("홍길동", 60);
		
		//검증 - hashCode(), toString() 등을 쓸 수 있다면 Object와 상속관계
		System.out.println("a = " + a.hashCode());
		System.out.println("b = " + b.hashCode());
		
		System.out.println("a = " + a.toString());
		System.out.println("b = " + b.toString());
		
		//(Q) a와 b는 같습니까?
		//(A) 프로그래밍 관점에서는 다른 인스턴스
		System.out.println(a == b);//같은 인스턴스?
		System.out.println(a.equals(b));//oo가 같습니까?
	}
}
