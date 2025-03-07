package api.util.collection4;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Test01특수저장소 {
	public static void main(String[] args) {
		//이용방법이 정해져 있는 특수 저장소들
		//- Stack, Queue, Deque 등
		//- 주어진 작업만으로 모든 처리를 구현
		
		//stack : 후입선출(LIFO, Last-In-First-Out) 형태의 구조
		//- 최신 이력을 관리하기에 적합한 저장소
		//- 프로그램의 메소드 구동원리와 같은 구조의 저장소
		Stack<String> stack = new Stack<>();
		
		//데이터 추가
		stack.push("자바");//1
		stack.push("JSP");//2
		stack.push("스프링");//3
		
		System.out.println("맨 앞 데이터 = " + stack.peek());
		
		//데이터 제거
		stack.pop();//3 제거
		System.out.println("맨 앞 데이터 = " + stack.peek());
		stack.pop();//2 제거
		System.out.println("맨 앞 데이터 = " + stack.peek());
		stack.pop();//1 제거
	
		System.out.println("데이터 개수 = " + stack.size());
		
		
		System.out.println("-----------");
		
		//Queue : 선입선출(FIFO, First-In-First-Out) 형태의 구조
		//- 현실에서 줄 서있는 형태와 같음(먼저 줄스면 먼저 나갈 수 있다)
		Queue<String> queue = new LinkedBlockingQueue<>();//업캐스팅
		
		queue.offer("자바");//1
		queue.offer("JSP");//2
		queue.offer("스프링");//3
		
		System.out.println("맨 앞 데이터 = " + queue.peek());
		
		queue.poll();//1 제거
		System.out.println("맨 앞 데이터 = " + queue.peek());
		queue.poll();//2 제거
		System.out.println("맨 앞 데이터 = " + queue.peek());
		queue.poll();//3 제거
		System.out.println("데이터 개수 = " + queue.size());
		
		//Deque : 양방향으로 추가/제거가 가능한 저장소 (Queue의 확장)
	}
}














