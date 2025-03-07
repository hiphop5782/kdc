package data;

public class Test05시간계산 {
	public static void main(String[] args) {
		//[1] 750분은 몇 시간 몇 분일까요?
		//- 1시간은 60분
		//- 60분이 12번 (720분) 그리고 30분이 남는다
		
		int time = 750;
		
		int hour = time / 60;
		int minute = time % 60;
		
//		System.out.println(hour);
//		System.out.println(minute);
		System.out.println(hour+"시간"+minute+"분");
		
		
		//[2] 2시간 40분 + 3시간 25분은 몇 시간 몇 분일까요?
		//- 보통 사람들은 시간과 분을 따로 계산해서 넘김 처리
		//- 시간과 분을 분으로 변환하여 계산한 뒤 다시 원래대로 되돌리는 계산을 수행
		
		int a1 = 2, a2 = 40;
		int b1 = 3, b2 = 25;
		
		int aTotal = a1 * 60 + a2;//a의 총 시간(분)
		int bTotal = b1 * 60 + b2;//b의 총 시간(분)
		
		int total = aTotal + bTotal;
		//System.out.println("합계 = " + total);
		
		int resultHour = total / 60;
		int resultMinute = total % 60;
		System.out.println(resultHour+"시간"+resultMinute+"분");
	}
}











