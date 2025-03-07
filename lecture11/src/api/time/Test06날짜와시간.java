package api.time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test06날짜와시간 {
	public static void main(String[] args) {
		//LocalDateTime으로 날짜와 시간 모두 관리하기
		
		//인스턴스 생성
		LocalDateTime t1 = LocalDateTime.now();//현재시각
		LocalDateTime t2 = LocalDateTime.of(2025, 1, 1, 11, 30, 50);
		LocalDateTime t3 = LocalDateTime.parse("2025-01-01T11:45:50");
		
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
		
		//형식을 정해서 입력 또는 출력 (DateTimeFormatter , SimpleDateFormat의 진화형)
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y년 M월 d일 H시 m분 s초");
		System.out.println("t1 = " + t1.format(fmt));
		
		String timeStr = "2002년 6월 25일 16시 30분 25초";
		LocalDateTime t4 = LocalDateTime.parse(timeStr, fmt);//fmt 형식에 맞게 timeStr을 해석
		System.out.println("t4 = " + t4);
		System.out.println("t4 = " + t4.format(fmt));
		
		//특정 항목을 변경하거나 증가/감소
		LocalDateTime t5 = t4.withMonth(1).withDayOfMonth(1);//t4에서 1월 1일로 변경한 시간을 반환
		System.out.println("t5 = " + t5.format(fmt));
		
		//두 시간의 차이
		Duration duration = Duration.between(t4, t5);
		System.out.println("duration = " + duration);
		System.out.println(duration.toDays());//날짜로 차이 출력
		System.out.println(duration.toHours());//시간으로 차이 출력
		System.out.println(duration.toSeconds());	
	}
}









