package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test03Calendar시간설정 {
	public static void main(String[] args) {
		//Calendar의 시간 설정 기능
		
		//인스턴스 생성
		Calendar c = Calendar.getInstance();
		
		//시간 설정
		//- set(항목, 값)
		//- set(연도, 2005)

		//c.set(Calendar.YEAR, 2005);//연도를 2005로 변경
		//c.set(2005, 0, 1);//2005-01-01로 변경(month는 0~11이므로 변환하여 처리)
		//c.set(2005, 0, 50);//2005-01-50로 변경? (자동으로 넘어간 날짜를 변환 처리)
		
		//(Q) 2020년 중에서 랜덤으로 날짜 한개를 추첨
		//- 2020-XX-YY 이니까 월(1~12)과 일(1~?)을 랜덤으로 추첨?
		//- 2020-01-01부터 2020-01-365 사이를 랜덤으로 추첨!
		//Random r = new Random();
		//int number = r.nextInt(366) + 1;
		//c.set(2020, 0, number);
		
		c.set(2000, 0, 1);//2000-01-01
		c.add(Calendar.DATE, 100);//+100일 (D-day 계산에 활용 가능)
		
		//출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		System.out.println(fmt.format(d));
	}
}
