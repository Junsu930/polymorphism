package edu.kh.poly.model.vo;

public class Car {
	
	// 자동차라면 가지고 있는 것
	private String engine; //엔진
	private String fuel; // 연료
	private int wheel; //바퀴 개수
	
	public Car() { // 기본 생성자; 
		super(); // 부모생성자(Object)
		// 안 적어도 컴파일러가 자동으로 만들어준다.
	}

	// 매개변수 생성자
	public Car(String engine, String fuel, int wheel) {
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	// getter / setter 
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	// Object.toString 오버라이딩 
	@Override
	public String toString() {
		// 엔진 / 연료 / 바퀴 개수
		return engine + " / " + fuel + " / " + wheel;
	}
	
	
}