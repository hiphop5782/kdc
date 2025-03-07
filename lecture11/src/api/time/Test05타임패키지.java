package api.time;

import java.time.LocalDate;
import java.time.Period;

public class Test05타임패키지 {
	public static void main(String[] args) {
		//Calendar의 문제점
		//- 시간 설정에 따라 오류가 있을 수 있다(그레고리안력, 불기, ...)
		//- 메소드의 이름으로 결과를 예상하기 어렵다(set, get)
		//- 윤년 여부를 알기 어렵다(계산은 되지만 확인하기가 어려움)
		//- 인스턴스의 시간이 변한다(가변객체)
		//- 시간차이를 구하기 어렵다
		//- 날짜만 필요하더라도 시간까지 같이 보관해야 한다
		
		//java.time 패키지
		//- 기존의 Date와 Calendar 시스템이 가진 문제점을 개선하기 위하여 Java 8에서 등장한 패키지
		//- LocalDate - 날짜만 필요할 때 사용하는 클래스
		//- LocalTime - 시간만 필요할 때 사용하는 클래스
		//- LocalDateTime - 날짜와 시간이 모두 필요할 때 사용하는 클래스
		//- ZoneDateTime - 지역에 따른 날짜와 시간이 모두 필요할 때 사용하는 클래스
		
		LocalDate d1 = LocalDate.now();//현재 날짜
		LocalDate d2 = LocalDate.of(2025, 1, 1);//지정된 날짜
		LocalDate d3 = LocalDate.parse("2026-01-01");//문자열 형식 날짜
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		
		//상세정보 추출
		//System.out.println("연도 = " + c.get(Calendar.YEAR));//기존 캘린더
		System.out.println("연도 = " + d2.getYear());//LocalDate
		System.out.println("월 = " + d2.getMonthValue());
		System.out.println("일 = " + d2.getDayOfMonth());
		
		System.out.println("윤년 = " + d2.isLeapYear());
		System.out.println("일주일 뒤 = " + d2.plusDays(7));
		
		//기간 차이는 Period라는 클래스로 구할 수 있도록 처리
		//(ex) d2와 d3의 기간 차이 계산
		Period period = Period.between(d2, d3);
		System.out.println("period = " + period);
		System.out.println("year = " + period.getYears());
		System.out.println("month = " + period.getMonths());
		System.out.println("day = " + period.getDays());
	}
}









