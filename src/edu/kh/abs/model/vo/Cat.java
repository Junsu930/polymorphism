package edu.kh.abs.model.vo;

public class Cat extends TypeMammalia{
	
	@Override
	public void eat() {
	System.out.println("고양이가 냐미~옹 밥을 먹는다.");
	}

	@Override
	public void cry() {
		System.out.println("고양이가 미유~미유~ 운다.");
	}
	
	@Override
	public void move() {
		System.out.println("고양이가 사뿐사뿐 걷는다.");
	
	}

	@Override
	public void breastfeed() {
		System.out.println("고양이가 젖을 먹인다.");
		
	}
}
