package oop.constructor1;

//게임 캐릭터 클래스
public class Player {
	//멤버 필드
	String nickname;
	String job;
	int level;
	int gold;
	
	//생성자(constructor)
	//- 클래스와 같은 이름을 가지는 영역
	//- 생성 시 해야할 작업을 명시
	//- 하나도 없다면 비어있는 생성자 자동생성
	//- 필요에 의해 여러개 만들 수 있다(오버로딩)
	Player(String nickname, String job) {
		this.nickname = nickname;
		this.job = job;
		this.level = 1;
		this.gold = 0;
	}
	Player(String nickname, String job, int level, int gold) {
		this.nickname = nickname;
		this.job = job;
		this.level = level;
		this.gold = gold;
	}
	
	//멤버 메소드
	void show() {
		System.out.println("[플레이어 정보]");
		System.out.println("닉네임 : " + this.nickname);
		System.out.println("직  업 : " + this.job);
		System.out.println("레  벨 : " + this.level);
		System.out.println("골  드 : " + this.gold);
	}
}







