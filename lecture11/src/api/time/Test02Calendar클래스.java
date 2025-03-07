package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test02Calendar클래스 {
	public static void main(String[] args) {
		//Calendar 클래스
		//- Date보다 더 자세한 날짜 관련 설정 및 계산 기능을 제공
		//- Date와 다르게 1900년을 기준으로 하지 않음
		//- 추상클래스이므로 생성 명령을 통해서 생성
		
		//인스턴스를 생성명령을 통해서 생성
		Calendar c = Calendar.getInstance();
		
		//각각의 시간 정보(연/월/일/시/분/초)를 꺼내어 출력
		//.get(항목)
		//(주의) 월은 여전히 0~11로 관리된다
		int year = c.get(Calendar.YEAR);
		System.out.println("year = " + year);
		
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("month = " + month);
		
		int date = c.get(Calendar.DATE);
		System.out.println("date = " + date);
		
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("dayOfMonth = " + dayOfMonth);
		
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY);
		System.out.println("hourOfDay = " + hourOfDay);
		
		int hour = c.get(Calendar.HOUR);
		System.out.println("hour = " + hour);
		
		int minute = c.get(Calendar.MINUTE);
		System.out.println("minute = " + minute);
		
		int second = c.get(Calendar.SECOND);
		System.out.println("second = " + second);
		
		//만약 Date처럼 원하는 형식으로 출력하길 원한다면 Date로 변환하여 출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E a h시 m분 s초");
		System.out.println("현재시각 = " + fmt.format(d));
	}
}








