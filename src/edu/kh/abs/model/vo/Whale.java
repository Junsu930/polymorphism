package edu.kh.abs.model.vo;

public class Whale extends TypeMammalia {

	@Override
	public void eat() {
		System.out.println("고래가 밥을 먹는다.");
		
	}

	@Override
	public void cry() {
		System.out.println("고래가 운다.");
		
	}

	@Override
	public void move() {
		System.out.println("고래가 움직인다.");
		
	}

	@Override
	public void breastfeed() {
		System.out.println("고래가 젖을 먹인다.");
		
	}

}
