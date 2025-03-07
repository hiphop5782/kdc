package com.example.spring04.vo;

//VO (Value Object)
public class MemberVO {
	private String id;
	private String pwd;
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pwd=" + pwd + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
