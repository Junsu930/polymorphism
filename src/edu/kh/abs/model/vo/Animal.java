package edu.kh.abs.model.vo;

public abstract class Animal {
	// abstract 붙는 순간, 객체화(인스턴스화)가 안되는 클래스!
	// 단 타입으로서의 의미는 그대로!
	
	public abstract void eat();
	// 먹기라는 메소드는 있지만, 어떻게 동작할지 정의하지 않아야한다.
	// + 추상메소드가 있다면, 추상클래스여야 한다. 
	
	public abstract void cry();
	
	public abstract void move();

	
}
