package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04주말추첨 {
	public static void main(String[] args) {
		//(Q) 2017년부터 수능은 매년 11월 셋째주 목요일에 시행되었습니다.
		// - 2026년 수능 날짜를 구하여 출력하세요
		
		Calendar c = Calendar.getInstance();
		
		c.set(2026, 10, 1);//2026-11-01
		c.add(Calendar.DATE, 14);//2주 뒤로 이동
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		//System.out.println("week = " + week);
		int diff = Calendar.THURSDAY - week;
		//System.out.println("diff = " + diff);
		c.add(Calendar.DATE, diff);
		
		//출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E");
		System.out.println(fmt.format(d));
	}
}
