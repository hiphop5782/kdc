package data3;

public class Test02성인판정기 {
	public static void main(String[] args) {
		//(Q) 2000년생이 성인인지 판정하여 출력하세요 
		//- 한국나이로 20세면 성인입니다
		//- 한국나이는 연도를 기준으로 하며 태어나면 1살입니다
		
		//(A) 2000년생은 2000부터 2024년까지의 숫자 개수 = 총 25개 = 2024-2000+1
		
		int birth = 2005;
		int year = 2024;//추후 시스템의 시간을 읽어 연도 부분을 설정하도록 변경(ChatGPT or 인터넷 검색 활용)
		
		int age = year - birth + 1;
		//System.out.println("age = " + age);
		boolean adult = age >= 20;
		
		System.out.println("adult = " + adult);
	}
}
