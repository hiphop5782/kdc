package com.example.spring05.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //개체 선언을 하면 데이터베이스에 저장 가능한 테이블이 생성된다
public class Pokemon {
	@Id
	private int no;
	@Column(length = 30)
	private String name;
	@Column(length = 9)
	private String type1;
	@Column(length = 9)
	private String type2;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}
	@Override
	public String toString() {
		return "Pokemon [no=" + no + ", name=" + name + ", type1=" + type1 + ", type2=" + type2 + "]";
	}
}
