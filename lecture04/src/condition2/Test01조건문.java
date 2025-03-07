package condition2;

public class Test01조건문 {
	public static void main(String[] args) {
		//switch-case 구문
		//- 값을 기준으로 하는 조건문
		//- if에서 순차적으로 검사하는 것이 문제가 될 경우 사용한다
		//- ex) 키보드, 마우스
		
		//(EX) 1학년 부터 6학년까지 있는 학교에서 학년별 구호를 출력
		
		int level = 2;
		
		switch(level) {//level의 값을 보고 시작지점을 찾으세요!
		case 1://level이 1일 경우 시작할 지점
		case 2://level이 2일 경우 시작할 지점
			System.out.println("병아리! 삐약삐약");
			break;
		case 3://level이 3일 경우 시작할 지점
		case 4://level이 4일 경우 시작할 지점
			System.out.println("강아지! 멍멍");
			break;
		case 5://level이 5일 경우 시작할 지점
//		case 6://level이 6일 경우 시작할 지점
		default://case에 해당되지 않을 경우 시작할 지점
			System.out.println("호랑이! 어흥");
			break;
		}
		
		
		if(level == 1) {
			System.out.println("병아리! 삐약삐약");
		}
		else if(level == 2) {
			System.out.println("고양이! 야옹야옹");
		}
		else if(level == 3) {
			System.out.println("강아지! 멍멍");
		}
		else if(level == 4) {
			System.out.println("송아지! 음메");
		}
		else if(level == 5) {
			System.out.println("늑대! 아우~");
		}
		else {
			System.out.println("호랑이! 어흥");
		}
	}
}









