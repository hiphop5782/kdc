package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test03로또번호생성기2 {
	public static void main(String[] args) {
		//(Q) 로또 번호 6개를 중복없이 생성하여 출력하는 프로그램을 구현하세요
		//- 로또는 1부터 45까지 적힌 공을 통에 담아서 랜덤으로 추첨하는 형식
		
		//(중요) generic type에는 참조형(클래스)만 작성이 가능하다
		List<Integer> numbers = new ArrayList<>();
		
		Random r = new Random();
		
		while(numbers.size() < 6) {//저장소에 6개가 채워지지 않았다면 계속 반복하세요
			int number = r.nextInt(45) + 1;
//			if(numbers.contains(number) == false) {
			if(!numbers.contains(number)) {
				numbers.add(number);
			}
		}
		
		//System.out.println(numbers);
		
		for(int i=0; i < numbers.size(); i++) {//개수만큼 반복
			System.out.println("번호 = " + numbers.get(i));
		}
	}
}












