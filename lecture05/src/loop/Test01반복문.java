package loop;

public class Test01반복문 {
	public static void main(String[] args) {
		//반복문
		//- 같은 작업을 반복적으로 실행할 수 있도록 도와주는 구문(for, while, do-while)
		//- 구문마다 약간의 차이가 존재
		//- 같은 작업은 유사한 작업을 포함(1,1,1,1,1 뿐 아니라 1,2,3,4,5도 처리가능)
		
		//(Q) Hello Java를 10번 출력하세요!
		
		//for(시작; 종료; 증가){
		//for(int i=1; i <= 10; i=i+1){//10번
		//for(int i=0; i < 10; i+=1) {//복합대입연산
		for(int i=0; i < 10; i++) {//증감연산
			System.out.println("Hello Java");
		}
		
		for(int i=0; i < 5; i++) {
			System.out.println("안녕 자바");
			System.out.println("i = " + i);
		}
		
	}
}
