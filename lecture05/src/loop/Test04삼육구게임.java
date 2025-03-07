package loop;

public class Test04삼육구게임 {
	public static void main(String[] args) {
		//(Q) 1부터 99까지 삼육구게임을 진행하면 어떻게 되는지 구하여 출력하세요
		//(A) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 .. 29 짝 짝 짝 짝짝 .. 짝짝
		
		for(int i=1; i <= 99; i++) {
			int number = i;
			
			int ten = number / 10;
			int one = number % 10;
			
			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			boolean one369 = one == 3 || one == 6 || one == 9;
			
			if(ten369 && one369) {
				System.out.println("짝짝");
			}
			else if(ten369 || one369) {
				System.out.println("짝");
			}
			else {
				System.out.println(number);
			}
		}
		
	}
}
