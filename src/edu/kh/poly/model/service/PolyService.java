package edu.kh.poly.model.service;
import edu.kh.poly.model.vo.Tesla;
import edu.kh.poly.model.vo.Car;
import edu.kh.poly.model.vo.Spark;

public class PolyService {
	
	
	// ====== 다형성 (업캐스팅) ======
	public void ex1() {
		// 다형성 확인 예제
		
		// Car 객체 생성
		Car car = new Car();
		// 부모타입 참조변수 = 부모객체
		
		Tesla tesla = new Tesla();
		// 자식타입 참조변수 = 자식객체
		
		// ========업캐스팅 구간========
		
		Car car2 = new Tesla();
		// Tesla 객체를 참조하는 변수 타입이 Car(부모)이기 때문에 
		// Tesla 객체가 Car(부모) 객체로 변화함 
		// 부모타입 참조면수 = 자식객체 
		
		Car car3 = new Spark();
		
		// 부모타입 참조변수 = 자식객체 
	
		
		
	}

}
