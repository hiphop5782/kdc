package oop.modifier2;

public class Test01 {
	public static void main(String[] args) {
		
		Subject s1 = new Subject("자바기초", "온라인", 60, 100000);
		Subject s2 = new Subject("웹개발기초", "오프라인", 90, 150000);
		Subject s3 = new Subject("웹개발심화", "혼합", 90, 120000);
		
		s1.show();
		s2.show();
		s3.show();
	}
}
