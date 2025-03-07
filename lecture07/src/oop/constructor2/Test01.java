package oop.constructor2;

public class Test01 {
	public static void main(String[] args) {
		
		//인스턴스 생성
		Member a = new Member("study", "study123!");
		Member b = new Member("student", "student123!");
		Member c = new Member("manager", "manager123!");
		
		a.show();
		b.show();
		c.show();
		
	}
}
