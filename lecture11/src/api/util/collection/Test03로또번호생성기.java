package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test03로또번호생성기 {
	public static void main(String[] args) {
		//(Q) 로또 번호 6개를 중복없이 생성하여 출력하는 프로그램을 구현하세요
		//- 로또는 1부터 45까지 적힌 공을 통에 담아서 랜덤으로 추첨하는 형식
		
		//(중요) generic type에는 참조형(클래스)만 작성이 가능하다
		List<Integer> numbers = new ArrayList<>();
		
		Random r = new Random();
		
		for(int i=0; i < 6; i++) {//6번
			int number = r.nextInt(45) + 1;//1부터 45사이의 숫자를 추첨해서
//			if(numbers.contains(numbers) == false) {//저장소에 없는 숫자라면
			if(!numbers.contains(number)) {//저장소에 없는 숫자라면
				numbers.add(number);//저장소에 추가한다
			}
			else {//다시 뽑아라!
				i--;//반복 1회 추가!
				System.out.println("중복 발생!");
			}
		}
		
		System.out.println(numbers);
	}
}












