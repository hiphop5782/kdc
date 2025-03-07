package api.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01시간다루기 {
	public static void main(String[] args) {
		//자바에서 시간 다루기
		//1. System.currentTimeMillis() 사용
		//- 기준시각(1970/1/1 00:00:00) 부터 지금까지 흘러온 밀리초
		//- 현재시각보다는 소요시간을 계산하거나 비교할 때 주로 사용
		long current = System.currentTimeMillis();
		System.out.println("current = " + current);
		System.out.println("year = " + current/1000/60/60/24/365);
		
		//2. java.util.Date 사용
		//- 20세기에 등장한 전자기기에서 메모리 절감을 위해 날짜를 6자리로 사용하는 경우가 많았다
		//- 6자리일경우 연도를 2자리로 표기하며 앞에 19를 붙여서 사용하는 것이 일반적이었다
		//- 21세기가 되면서 2001년을 표기하려면 01이 아니라 101을 써야되는 문제가 발생
		//- 시대가 흘러가면서 버림받는 클래스가 되어가고 있다
		//- 월도 1~12가 아니라 0~11로 표기
		//- java.text.SimpleDateFormat 클래스를 이용하여 날짜의 표시 방식을 설정할 수 있다
		Date d1 = new Date();
		Date d2 = new Date(124, 10, 19);
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd H:mm:ss");
		System.out.println("fmt = " + fmt.format(d1));
		
		//(Q) 2024년 11월 19일 화 오후 8시 45분
		SimpleDateFormat fmt2 = new SimpleDateFormat("y년 M월 d일 E a h시 m분");
		System.out.println("fmt2 = " + fmt2.format(d1));
		
		//3. java.util.Calendar 사용
		//4. java.time 패키지 사용
	}
}









