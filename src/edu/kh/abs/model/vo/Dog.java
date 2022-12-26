package edu.kh.abs.model.vo;

public class Dog extends TypeMammalia{
	
	@Override
	public void eat() {
		System.out.println("강아지가 쿠앙쿠앙 먹는다.");
	}
	
	@Override
	public void cry() {
		System.out.println("강아지가 왈왕! 먹는다.");
	}
	
	@Override
	public void move() {
		System.out.println("강아지가 쿵쿵 걷는다.");
	}

	@Override
	public void breastfeed() {
		System.out.println("강아지가 젖을 먹인다.");
		
	}

}
