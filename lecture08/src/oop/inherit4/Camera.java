package oop.inherit4;

//같은 종류끼리(class-class / interface-interface)는 extends라는 키워드로 상속을 받는다
public interface Camera extends Electronic {
	void photo();
	void video();
}
