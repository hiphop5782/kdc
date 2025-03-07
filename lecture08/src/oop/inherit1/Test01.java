package oop.inherit1;

public class Test01 {
	public static void main(String[] args) {
		//아이폰과 갤럭시 휴대폰을 각각 만들어보세요
		IPhone p1 = new IPhone();
		p1.call();//공용 기능
		p1.sms();//공용 기능
		p1.camera();//공용 기능
		p1.siri();//고유 기능
		p1.itunes();//고유 기능
		
		Galaxy p2 = new Galaxy();
		p2.call();//공용 기능
		p2.sms();//공용 기능
		p2.camera();//공용 기능
		p2.samsungPay();//고유 기능
		p2.bixby();//고유 기능
	}
}
